
package controller;

import static Dao.ClasseDados.enderecos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.EnderecoModal;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Endereco;
import service.EnderecoService;
import view.BuscaEndereco;
import view.ModalConnfirm;

public class ControllerBuscaEndereco implements ActionListener{
    
    BuscaEndereco buscaEndereco;

    public ControllerBuscaEndereco(BuscaEndereco buscaEndereco) {
        this.buscaEndereco = buscaEndereco;
        
        this.buscaEndereco.getjButtonFiltrar().addActionListener(this);
        this.buscaEndereco.getjButtonCarregar().addActionListener(this);
        this.buscaEndereco.getjButtonSair().addActionListener(this);
        this.buscaEndereco.getjButtonApagar().addActionListener(this);
        this.buscaEndereco.getjComboBoxFiltro().addActionListener(this);
        this.buscaEndereco.getjTextFieldFiltrar().addActionListener(this);
        

    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaEndereco.getjButtonFiltrar()){
        
                        
            List<Endereco> listaEnderecos;

            int selectedIndex = this.buscaEndereco.getjComboBoxFiltro().getSelectedIndex();

            if (selectedIndex == 0) {
            // Filtro por todos os dados
               listaEnderecos = EnderecoService.carregar();
           } else if (selectedIndex == 1) {
            // Filtro por ID
               String input = this.buscaEndereco.getjTextFieldFiltrar().getText().trim();
               if (!input.isEmpty()) {
                   int id = Integer.parseInt(input);
                   listaEnderecos = new ArrayList<>();
                   listaEnderecos.add(EnderecoService.carregar(id));
               } else {
                   // Informar ao usuário que o campo está vazio
                   JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
                   return;
               }
          } else if (selectedIndex == 2) {
                  // Filtro por cidade
                  String cidade = this.buscaEndereco.getjTextFieldFiltrar().getText().trim();
                  listaEnderecos = EnderecoService.carregar("cidade", cidade);
         } else if (selectedIndex == 3) {
                  // Filtro por bairro
                  String bairro = this.buscaEndereco.getjTextFieldFiltrar().getText().trim();
                  listaEnderecos = EnderecoService.carregar("bairro", bairro);
         } else if (selectedIndex == 4) {
                   // Filtro por logradouro
                  String logradouro = this.buscaEndereco.getjTextFieldFiltrar().getText().trim();
                  listaEnderecos = EnderecoService.carregar("logradouro", logradouro);
         }
 
     
          else {
               // Se não for nenhuma das opções acima, não fazer nada ou mostrar mensagem de erro
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
          }
                  
            DefaultTableModel tabela =(DefaultTableModel) this.buscaEndereco.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Endereco enderecoAtual : listaEnderecos) {
                tabela.addRow(new Object[]{enderecoAtual.getId(),
                                           enderecoAtual.getCep(),
                                           enderecoAtual.getCidade().getUf(),
                                           enderecoAtual.getCidade().getDescricao(),
                                           enderecoAtual.getBairro().getDescricao(),
                                           enderecoAtual.getLogradouro(),
                                           enderecoAtual.getStatus()
                
                });
                
            }
            
            
            
            
          
         
            
            
        }else if(e.getSource() == this.buscaEndereco.getjButtonCarregar()){
            
           ControllerCadastroCliente.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroEndereco.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           this.buscaEndereco.dispose();
           
           ControllerCadastroFornecedor.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroFuncionario.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
       
        
        }else if(e.getSource() == this.buscaEndereco.getjButtonSair()){
            this.buscaEndereco.dispose();
            
            
        } else if( e.getSource() == this.buscaEndereco.getjButtonApagar()) {
                         
                int selectedRow = this.buscaEndereco.getjTableDados().getSelectedRow();
                if (selectedRow != -1) {
                    int enderecoId = (int) this.buscaEndereco.getjTableDados().getValueAt(selectedRow, 0);

                    ModalConnfirm modalConnfirm = new ModalConnfirm(new JFrame(), true);
                    EnderecoModal enderecoModal = new EnderecoModal(modalConnfirm, enderecoId, (DefaultTableModel) this.buscaEndereco.getjTableDados().getModel(), selectedRow);
                    modalConnfirm.setLocationRelativeTo(null);
                    modalConnfirm.setVisible(true);

                }
            
            
        }
    }
    
}
