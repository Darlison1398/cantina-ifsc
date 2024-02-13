
package controller;

import static Dao.ClasseDados.fornecedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.FornecedorModal;
import model.bo.Fornecedor;
import service.FornecedorService;
import view.BuscaFornecedor;
import view.ModalConnfirm;

public class ControllerBuscaFornecedor implements ActionListener {
    
    BuscaFornecedor buscaFornecedor;

    public ControllerBuscaFornecedor(BuscaFornecedor buscaFornecedor) {
        this.buscaFornecedor = buscaFornecedor;
        
        this.buscaFornecedor.getjButtonFiltrar().addActionListener(this);
        this.buscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.buscaFornecedor.getjButtonSair().addActionListener(this);
        this.buscaFornecedor.getjButtonApagar().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaFornecedor.getjPanelBotoes());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.buscaFornecedor.getjButtonFiltrar()){
            
            List<Fornecedor> listaFornecedor;

            int selectedIndex = this.buscaFornecedor.getjComboBoxFiltro().getSelectedIndex();

            if (selectedIndex == 0) {
            // Filtro por todos os dados
               listaFornecedor = FornecedorService.carregar();
               
           } else if (selectedIndex == 1) {
            // Filtro por ID
               String input = this.buscaFornecedor.getjTextFieldFiltrar().getText().trim();
           if (!input.isEmpty()) {
               int id = Integer.parseInt(input);
               listaFornecedor = new ArrayList<>();
               listaFornecedor.add(FornecedorService.carregar(id));
           } else {
               // Informar ao usuário que o campo está vazio
               JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
               return;
               }
            } else if (selectedIndex == 2) {
               // Filtro por descrição
               String descricao = this.buscaFornecedor.getjTextFieldFiltrar().getText().trim();
               listaFornecedor = FornecedorService.carregar(descricao);
            } else {
               // Se não for nenhuma das opções acima, não fazer nada ou mostrar mensagem de erro
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
            }
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFornecedor.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Fornecedor fornecedorAtual : listaFornecedor) {
                
                tabela.addRow(new Object[]{fornecedorAtual.getId(),
                                           fornecedorAtual.getRazaoSocial(),
                                           fornecedorAtual.getNome(),
                                           fornecedorAtual.getInscricaoEstadual(),
                                           fornecedorAtual.getCnpj(),
                                           fornecedorAtual.getEmail(),
                                           fornecedorAtual.getFone1(),
                                           fornecedorAtual.getFone2(),
                                           fornecedorAtual.getEndereco().getId(),
                                           fornecedorAtual.getEndereco().getCep(),
                                           fornecedorAtual.getEndereco().getCidade().getDescricao(),
                                           fornecedorAtual.getEndereco().getBairro().getDescricao(),
                                           fornecedorAtual.getEndereco().getLogradouro(),
                                           fornecedorAtual.getComplementoEndereco(),
                                           fornecedorAtual.getStatus(),
                                           
                                           
                                          
                
                });
            }
             
        
        }else if(e.getSource() == this.buscaFornecedor.getjButtonCarregar()){
        
            ControllerCadastroFornecedor.codigoFornecedor=(int) this.buscaFornecedor
            .getjTableDados().getValueAt(this.buscaFornecedor.getjTableDados().getSelectedRow(), 0);
            this.buscaFornecedor.dispose();
            
            
        }else if(e.getSource() == this.buscaFornecedor.getjButtonSair()){
            this.buscaFornecedor.dispose();
            
        } else if (e.getSource() == this.buscaFornecedor.getjButtonApagar()) {
                             
                int selectedRow = this.buscaFornecedor.getjTableDados().getSelectedRow();
                if (selectedRow != -1) {
                    int fornecedorId = (int) this.buscaFornecedor.getjTableDados().getValueAt(selectedRow, 0);

                    ModalConnfirm modalConnfirm = new ModalConnfirm(new JFrame(), true);
                    FornecedorModal fornecedorModal = new FornecedorModal(modalConnfirm, fornecedorId, (DefaultTableModel) this.buscaFornecedor.getjTableDados().getModel(), selectedRow);
                    modalConnfirm.setLocationRelativeTo(null);
                    modalConnfirm.setVisible(true);

                }
            
        }
        
    }
    
}
