
package controllerMovimento;

import controller.ControllerBuscaCarteirinha;
import static controller.ControllerCadastroCarteirinha.codigoCarteirinha;
import static controller.ControllerCadastroCliente.codigoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bo.Carteirinha;
import model.bo.Cliente;
import model.bo.Produto;
import service.ProdutoService;
import view.BuscaCarteirinha;
import view.Faturamento;
import view.FinalizarVenda;

public class FaturamentoController implements ActionListener {
    
    Faturamento faturamento;
    
    public static int codigoEndVenda;
    

    public FaturamentoController(Faturamento faturamento) {
        this.faturamento = faturamento;
        
        this.faturamento.getjBtnAdicionar().addActionListener(this);
        this.faturamento.getjBtnBuscarCliente().addActionListener(this);
        this.faturamento.getjBtnCancelar().addActionListener(this);
        this.faturamento.getjBtnEndVenda().addActionListener(this);
        
        // parte que vai receber o código de barras
        this.faturamento.getjTCodBarrasProduto().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.faturamento.getjPanDadosProduto());
        this.faturamento.getjTNomeProduto().setEditable(false);
        this.faturamento.getjTVlorProduto().setEditable(false);
        this.faturamento.getjTCodCliente().setEditable(false);
        this.faturamento.getjTnomeCliente().setEditable(false);
        
        List<Produto> listaProduto = new ArrayList<Produto>();
        listaProduto = service.ProdutoService.carregar();
        
        DefaultTableModel modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Descrição");
        modeloTabela.addColumn("Valor");
        this.faturamento.getjTableDadosProduto().setModel(modeloTabela);
        
        this.faturamento.getjBtnAdicionar().setEnabled(false);
        
     
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.faturamento.getjTCodBarrasProduto()){
            
            String codigoBarras = this.faturamento.getjTCodBarrasProduto().getText();
            

            if (!codigoBarras.isEmpty()  && codigoBarras.matches(".*\\d.*")) {
                this.faturamento.getjBtnAdicionar().setEnabled(true);

                List<Produto> produtos = service.ProdutoService.carregarPorCodigoBarras(codigoBarras);

                if (!produtos.isEmpty()) {
                    Produto produto = produtos.get(0); // Pega o primeiro produto da lista
                    
                    if (codigoBarras.equals("") ) {
                       this.faturamento.getjTNomeProduto().removeAll();
                       this.faturamento.getjTQtdProduto().removeAll();
                       this.faturamento.getjTVlorProduto().removeAll();
       
                    }
                    
                    this.faturamento.getjTNomeProduto().setText(produto.getDescricao());
                    this.faturamento.getjTVlorProduto().setText(Float.toString(produto.getValor()));
                } else {
                    JOptionPane.showMessageDialog(null, "Código de barras não encontrado");
                    this.faturamento.getjTNomeProduto().setText("");
                    this.faturamento.getjTVlorProduto().setText("");
                    this.faturamento.getjTCodBarrasProduto().setText("");
                }
            } else {
                this.faturamento.getjBtnAdicionar().setEnabled(false);
                JOptionPane.showMessageDialog(null, "Digite o código de barras");
            }
            
            
            
            
        } else if(e.getSource() == this.faturamento.getjBtnAdicionar()){
            
            if (this.faturamento.getjTCodBarrasProduto().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Código de barras não encontrado");
            }
            
            Produto produto = new Produto();
            
            String descricaoProduto = this.faturamento.getjTNomeProduto().getText().trim();
            String valorProduto = this.faturamento.getjTVlorProduto().getText().trim();
            
            if (descricaoProduto.isEmpty() || valorProduto.isEmpty()) {
                descricaoProduto = produto.getDescricao();
            }
            
            DefaultTableModel modeloTabela = (DefaultTableModel) this.faturamento.getjTableDadosProduto().getModel();
            modeloTabela.addRow(new Object[]{descricaoProduto, valorProduto});
            
            
            /* Lógica que vai somar todos os valores do produto e adicionar no valor total */
            float valorTotal = 0.0f;

              // Verifica se a tabela tem pelo menos uma linha
            if (modeloTabela.getRowCount() > 0) {
                for (int i = 0; i < modeloTabela.getRowCount(); i++) {
                     // Obtém o valor da coluna "Valor" para a linha atual
                     Object valorDaLinhaObj = modeloTabela.getValueAt(i, 1);

                     // Verifica se o valor não é nulo e não é uma string vazia antes de converter para float
                     if (valorDaLinhaObj != null && !valorDaLinhaObj.toString().isEmpty()) {
                         valorTotal += Float.parseFloat(valorDaLinhaObj.toString());
                     }
               }
            }

            this.faturamento.getjFvalorTotProduto().setText(String.format("%.0f", valorTotal));
            this.faturamento.getjFvalorTotProduto().setEditable(false);
            
            utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanDadosProduto());
            utilities.Utilities.ativa(false, this.faturamento.getjPanDadosProduto());
            utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanelCodigoBarras());
            utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanDadosCliente());
            
            this.faturamento.getjTCodBarrasProduto().requestFocus(); 
            this.faturamento.getjBtnAdicionar().setEnabled(false);
    
    
         } else if (e.getSource() == this.faturamento.getjBtnBuscarCliente()){
             codigoCarteirinha = 0;
             BuscaCarteirinha buscarCarteirinha = new BuscaCarteirinha(null, true);
             ControllerBuscaCarteirinha conBusCarteirinha = new ControllerBuscaCarteirinha(buscarCarteirinha);
             buscarCarteirinha.setVisible(true);
             this.faturamento.getjTCodBarrasProduto().setText("");
             
             if (codigoCarteirinha != 0) {
                 Carteirinha carteirinha = new Carteirinha();
                // Cliente cliente = new Cliente();
                 carteirinha = service.CarteirinhaService.carregar(codigoCarteirinha);
                 
                 this.faturamento.getjTCodCliente().setText(carteirinha.getCodigoBarra());
                 this.faturamento.getjTnomeCliente().setText(carteirinha.getCliente().getNome());
                 
                
             }
             
             
             
         } else if (e.getSource() == this.faturamento.getjBtnCancelar()) {
             DefaultTableModel modeloTabela = (DefaultTableModel) this.faturamento.getjTableDadosProduto().getModel();
             modeloTabela.setRowCount(0); 

             this.faturamento.getjFvalorTotProduto().setText("");

             utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanDadosProduto());
             utilities.Utilities.ativa(true, this.faturamento.getjPanDadosProduto());
             utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanelCodigoBarras());
             utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanDadosCliente());
             
             this.faturamento.getjTCodBarrasProduto().requestFocus();
             
             
             
             
         } else if (e.getSource() == this.faturamento.getjBtnEndVenda()) {
             FinalizarVenda endVenda = new FinalizarVenda(null, true);
             EndVendaController controllerVenda = new  EndVendaController(endVenda);
             endVenda.setVisible(true);
             
             
             
             
                         
            utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanDadosProduto());
            utilities.Utilities.ativa(false, this.faturamento.getjPanDadosProduto());
            utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanelCodigoBarras());
            utilities.Utilities.limpaComponentes(true, this.faturamento.getjPanDadosCliente());
            utilities.Utilities.limpaComponentes(true, this.faturamento.getjPdadosFinalProduto());
            
            
             
         }
        
        
    }
    
}
