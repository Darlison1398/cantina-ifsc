
package controllerMovimento;

import controller.ControllerBuscaCarteirinha;
import controller.ControllerBuscaCliente;
import static controller.ControllerCadastroCarteirinha.codigoCarteirinha;
import static controller.ControllerCadastroCliente.codigoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.bo.Carteirinha;
import model.bo.Cliente;
import model.bo.Compra;
import model.bo.Produto;
import view.BuscaCarteirinha;
import view.BuscaCliente;
import view.TelaCompra;
import view.TelaComproFiscal;


public class CompraController implements ActionListener{

    TelaCompra telaCompra;
    
    public CompraController(TelaCompra telaCompra) {
        this.telaCompra = telaCompra;
        
       this.telaCompra.getjBtnBuscarCliente().addActionListener(this);
       this.telaCompra.getjBtnCANCELAR().addActionListener(this);
       this.telaCompra.getJbFinalizarCompra().addActionListener(this);
       this.telaCompra.getjFcodBarras().addActionListener(this);
       this.telaCompra.getjComboBoxDesconto().addActionListener(this);
       this.telaCompra.getjFcodCarteirinha().addActionListener(this);
       this.telaCompra.getjFquantidade().addActionListener(this);
       
       
       /* desativando campos de textos */
       this.telaCompra.getjTnomeCliente().setEditable(false);
       this.telaCompra.getjTvalorTotal().setEditable(false);
       
      // this.telaCompra.getjTableDadosProduto().setEditingRow(false);
       
       
        List<Produto> listaProduto = new ArrayList<Produto>();
        listaProduto = service.ProdutoService.carregar();
        
        DefaultTableModel modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Descrição");
        //modeloTabela.addColumn("Qtd");
        modeloTabela.addColumn("Valor");
        this.telaCompra.getjTableDadosProduto().setModel(modeloTabela);
        
        // desativando o botão cancelar
        this.telaCompra.getjBtnCANCELAR().setEnabled(false);
        
        
        this.telaCompra.getjTableDadosProduto().getSelectionModel().addListSelectionListener(e -> {
         // Chame um método para atualizar o estado do botão Cancelar com base na seleção da tabela
        atualizarEstadoBotaoCancelar();
        });

        
       
       
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.telaCompra.getjFcodBarras()) {
                                    
            String codigoBarras = this.telaCompra.getjFcodBarras().getText();
            
            if (!codigoBarras.isEmpty()  && codigoBarras.matches(".*\\d.*")) {
                List<Produto> produtos = service.ProdutoService.carregarPorCodigoBarras(codigoBarras);

                if (!produtos.isEmpty()) {
                    Produto produto = produtos.get(0); 
                    
                    if (codigoBarras.equals("") ) {
                       this.telaCompra.getjFcodBarras().removeAll();
                       //this..removeAll();
                       //this.faturamento.getjTVlorProduto().removeAll();
       
                    }
                    
                    this.telaCompra.getjTvalorTotal().setText(Float.toString(produto.getValor()));
                    DefaultTableModel modeloTabela = (DefaultTableModel) this.telaCompra.getjTableDadosProduto().getModel();
                    modeloTabela.addRow(new Object[]{produto.getDescricao(), produto.getValor()});
                    
                    // Lógica que vai somar todos os valores do produto e adicionar no valor total 
                    float valorTotal = 0.0f;

                   // Verifica se a tabela tem pelo menos uma linha
                   if (modeloTabela.getRowCount() > 0) {
                       for (int i = 0; i < modeloTabela.getRowCount(); i++) {
                           Object valorDaLinhaObj = modeloTabela.getValueAt(i, 1);
                           if (valorDaLinhaObj != null && !valorDaLinhaObj.toString().isEmpty()) {
                               valorTotal += Float.parseFloat(valorDaLinhaObj.toString());
                           }
                       }
                   }
                   
                   this.telaCompra.getjTvalorTotal().setText(String.format("%.0f", valorTotal));
                   this.telaCompra.getjFcodBarras().setText("");
                   this.telaCompra.getjFcodBarras().requestFocus();

                } else {
                    JOptionPane.showMessageDialog(null, "Código de barras não encontrado");
                    this.telaCompra.getjFcodBarras().setText("");
                }
            } else {
                this.telaCompra.getJbFinalizarCompra().setEnabled(false);
                JOptionPane.showMessageDialog(null, "Digite o código de barras");
            }
            
            
            
            
            
            
           
            
        } else if (e.getSource() == this.telaCompra.getjFcodCarteirinha()){
            
                String codBarras = this.telaCompra.getjFcodCarteirinha().getText();
                if (!codBarras.isEmpty() && codBarras.matches(".*\\d.*")) {
                    List<Carteirinha> carteirinhas = service.CarteirinhaService.retrieveByCodBarras(codBarras);
                    if (!carteirinhas.isEmpty()) {
                        Carteirinha carteirinha = carteirinhas.get(0);
                        this.telaCompra.getjTnomeCliente().setText(carteirinha.getCliente().getNome());

                    }
                }
            
            
            
                
                
                
            
            
            
        } else if(e.getSource() == this.telaCompra.getjBtnBuscarCliente()){
            codigoCarteirinha = 0;
             BuscaCarteirinha buscarCarteirinha = new BuscaCarteirinha(null, true);
             ControllerBuscaCarteirinha conBusCarteirinha = new ControllerBuscaCarteirinha(buscarCarteirinha);
             buscarCarteirinha.setVisible(true);
             this.telaCompra.getjFcodBarras().setText("");
             
             if (codigoCarteirinha != 0) {
                 Carteirinha carteirinha = new Carteirinha();
                // Cliente cliente = new Cliente();
                 carteirinha = service.CarteirinhaService.carregar(codigoCarteirinha);
                 
                 this.telaCompra.getjFcodCarteirinha().setText(carteirinha.getCodigoBarra());
                 this.telaCompra.getjTnomeCliente().setText(carteirinha.getCliente().getNome());
                 
                
             }
             
             
             
             
             
             
             
            
        } else if (e.getSource() == this.telaCompra.getjFquantidade()){
                String valorTotalStr = this.telaCompra.getjTvalorTotal().getText();
    
    if (!valorTotalStr.isEmpty() && valorTotalStr.matches(".*\\d.*")) {
        float valorTotal = Float.parseFloat(valorTotalStr);
        
        JTextField quantidadeField = this.telaCompra.getjFquantidade();
        
        if (!quantidadeField.getText().isEmpty() && quantidadeField.getText().matches("\\d+")) {
            int quantidade = Integer.parseInt(quantidadeField.getText());
            
            float novoValorTotal = valorTotal * quantidade;
            
            this.telaCompra.getjTvalorTotal().setText(String.format("%.0f", novoValorTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Digite uma quantidade válida.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Digite um valor total válido antes de inserir a quantidade.");
    }
            
            
            
            
            
            
            
            
            
            
        } else if (e.getSource() == this.telaCompra.getjBtnCANCELAR()) {
            
              int linhaSelecionada = this.telaCompra.getjTableDadosProduto().getSelectedRow();
              
              if (linhaSelecionada != -1) {
                  DefaultTableModel modeloTabela = (DefaultTableModel) this.telaCompra.getjTableDadosProduto().getModel();
                  modeloTabela.removeRow(linhaSelecionada);
              }
              
              atualizarValorTotal();
              
              this.telaCompra.getjBtnCANCELAR().setEnabled(false);
              this.telaCompra.getjFcodBarras().setText("");
              this.telaCompra.getjFcodBarras().requestFocus();
              
              
            
        } else if (e.getSource() == this.telaCompra.getJbFinalizarCompra()) {
            
            if (this.telaCompra.getjTableDadosProduto().getRowCount() > 0 && !this.telaCompra.getjTvalorTotal().getText().isEmpty()) {
                TelaComproFiscal tlcFiscal = new TelaComproFiscal(null, true);
                ComprovanteFiscalController comproFiscControl = new ComprovanteFiscalController(tlcFiscal);
                tlcFiscal.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Adicione produtos para realizar a venda.");
            }
            
            
          
            
        } else if (e.getSource() == this.telaCompra.getjComboBoxDesconto()){
            float semDesc = 0.1f;
            float descAluno = 0.03f;  // 3% de desconto
            float descProf = 0.04f;   // 4% de desconto
            float descFunc = 0.06f;   // 6% de desconto

            String valorOriginalStr = this.telaCompra.getjTvalorTotal().getText();
    
            // Substituir vírgula por ponto (caso haja vírgula)
            valorOriginalStr = valorOriginalStr.replace(",", ".");
    
            float valorOriginal = Float.parseFloat(valorOriginalStr);
            float novoValor = valorOriginal;

            int selectedIndex = this.telaCompra.getjComboBoxDesconto().getSelectedIndex();

            if (selectedIndex == 0) {
                System.out.println("Sem descontos");
                 novoValor = (1 - semDesc) * valorOriginal;
            } else if (selectedIndex == 1) {
                novoValor = (1 - descAluno) * valorOriginal;
            } else if (selectedIndex == 2) {
                novoValor = (1 - descProf) * valorOriginal;
            } else if (selectedIndex == 3) {
                novoValor = (1 - descFunc) * valorOriginal;
            }
            
            this.telaCompra.getjTvalorTotal().setText(String.format("%.2f", novoValor));
        }
        
    }
    
    
    // método usado no botão cancelar
    private void atualizarEstadoBotaoCancelar() {
        int linhaSelecionada = this.telaCompra.getjTableDadosProduto().getSelectedRow();
        this.telaCompra.getjBtnCANCELAR().setEnabled(linhaSelecionada != -1);
    }
    
    
    // atualiza o valor total do produto, após um produto ser cancelado na tabela
    private void atualizarValorTotal() {
        DefaultTableModel modeloTabela = (DefaultTableModel) this.telaCompra.getjTableDadosProduto().getModel();
        float valorTotal = 0.0f;

        // Verifica se a tabela tem pelo menos uma linha
        if (modeloTabela.getRowCount() > 0) {
            for (int i = 0; i < modeloTabela.getRowCount(); i++) {
                Object valorDaLinhaObj = modeloTabela.getValueAt(i, 1);
                if (valorDaLinhaObj != null && !valorDaLinhaObj.toString().isEmpty()) {
                    valorTotal += Float.parseFloat(valorDaLinhaObj.toString());
                }
            }
            
            this.telaCompra.getjTvalorTotal().setText(String.format("%.0f", valorTotal));
        }
    }


    
    
}