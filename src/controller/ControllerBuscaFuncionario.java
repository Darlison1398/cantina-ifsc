
package controller;

import Dao.ClasseDados;
import static Dao.ClasseDados.fornecedores;
import static Dao.ClasseDados.funcionarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.FuncionarioModal;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import service.FuncionarioService;
import view.BuscaFuncionario;
import view.ModalConnfirm;

public class ControllerBuscaFuncionario implements ActionListener{
    
    BuscaFuncionario buscaFuncionario;

    public ControllerBuscaFuncionario(BuscaFuncionario buscaFuncionario) {
        this.buscaFuncionario = buscaFuncionario;
        
        this.buscaFuncionario.getjButtonFiltrar().addActionListener(this);
        this.buscaFuncionario.getjButtonCarregar().addActionListener(this);
        this.buscaFuncionario.getjButtonSair().addActionListener(this);
        this.buscaFuncionario.getjButtonApagar().addActionListener(this);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaFuncionario.getjButtonFiltrar()){
            
        
            List<Funcionario> listaFuncionario;

            int selectedIndex = this.buscaFuncionario.getjComboBoxFiltrar().getSelectedIndex();

            if (selectedIndex == 0) {
            // Filtro por todos os dados
               listaFuncionario = FuncionarioService.carregar();
               
           } else if (selectedIndex == 1) {
            // Filtro por ID
               String input = this.buscaFuncionario.getjTextFieldFiltrar().getText().trim();
           if (!input.isEmpty()) {
               int id = Integer.parseInt(input);
               listaFuncionario = new ArrayList<>();
               listaFuncionario.add(FuncionarioService.carregar(id));
           } else {
               // Informar ao usuário que o campo está vazio
               JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
               return;
               }
          } else if (selectedIndex == 2) {
               // Filtro por descrição
               String descricao = this.buscaFuncionario.getjTextFieldFiltrar().getText().trim();
               listaFuncionario = FuncionarioService.carregar(descricao);
          } else {
               // Se não for nenhuma das opções acima, não fazer nada ou mostrar mensagem de erro
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
          }

          // Atualizar a tabela com os resultados
           DefaultTableModel tabela = (DefaultTableModel) this.buscaFuncionario.getjTableDados().getModel();
           tabela.setRowCount(0); // Limpar a tabela antes de adicionar os dados

           for (Funcionario funcionarioAtual : listaFuncionario) {
                tabela.addRow(new Object[]{funcionarioAtual.getId(), 
                                           funcionarioAtual.getNome(),
                                           funcionarioAtual.getCpf(),
                                           funcionarioAtual.getRg(),
                                           funcionarioAtual.getFone1(),
                                           funcionarioAtual.getFone2(),
                                           funcionarioAtual.getEmail(),
                                           funcionarioAtual.getUsuario(),
                                           funcionarioAtual.getSenha(),
                                           funcionarioAtual.getEndereco().getCep(),
                                           funcionarioAtual.getEndereco().getCidade().getDescricao(),
                                           funcionarioAtual.getEndereco().getBairro().getDescricao(),
                                           funcionarioAtual.getEndereco().getLogradouro(),
                                           funcionarioAtual.getComplementoEndereco(),
                                           funcionarioAtual.getStatus()
                                       
                
                });
            }
            
            
            
            
            
            
            
            
            
            
            
        }else if(e.getSource() == this.buscaFuncionario.getjButtonCarregar()){
        
            ControllerCadastroFuncionario.codigoFuncionario=(int) this.buscaFuncionario.getjTableDados().getValueAt(this.buscaFuncionario.getjTableDados().getSelectedRow(), 0);
            this.buscaFuncionario.dispose();
            
            
        }else if(e.getSource() == this.buscaFuncionario.getjButtonSair()){
            this.buscaFuncionario.dispose();
            
        } else if (e.getSource() == this.buscaFuncionario.getjButtonApagar()) {
                       
                int selectedRow = this.buscaFuncionario.getjTableDados().getSelectedRow();
                if (selectedRow != -1) {
                    int funcionarioId = (int) this.buscaFuncionario.getjTableDados().getValueAt(selectedRow, 0);

                    ModalConnfirm modalConnfirm = new ModalConnfirm(new JFrame(), true);
                    FuncionarioModal funcionarioModal = new FuncionarioModal(modalConnfirm, funcionarioId, (DefaultTableModel) this.buscaFuncionario.getjTableDados().getModel(), selectedRow);
                    modalConnfirm.setLocationRelativeTo(null);
                    modalConnfirm.setVisible(true);

                }
            
            
        }
    }
    
    
}
