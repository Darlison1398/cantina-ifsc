
package controller;

import Dao.ClasseDados;
import static Dao.ClasseDados.clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bo.Cliente;
import service.ClienteService;
import view.BuscaCliente;
import view.ModalConnfirm;

public class ControllerBuscaCliente implements ActionListener {

    BuscaCliente buscaCliente;

    public ControllerBuscaCliente(BuscaCliente buscaCliente) {
        this.buscaCliente = buscaCliente;

        this.buscaCliente.getjButtonFiltrar().addActionListener(this);
        this.buscaCliente.getjButtonCarregar().addActionListener(this);
        this.buscaCliente.getjButtonSair().addActionListener(this);
        this.buscaCliente.getjButtonApagar().addActionListener(this);

        utilities.Utilities.ativa(true, this.buscaCliente.getjPanelBotoes());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaCliente.getjButtonFiltrar()) {
        
            List<Cliente> listaClientes;

            int selectedIndex = this.buscaCliente.getjComboBoxFiltro().getSelectedIndex();

            if (selectedIndex == 0) {
            // Filtro por todos os dados
               listaClientes = ClienteService.carregar();
               
           } else if (selectedIndex == 1) {
            // Filtro por ID
               String input = this.buscaCliente.getjTextFieldFiltrar().getText().trim();
           if (!input.isEmpty()) {
               int id = Integer.parseInt(input);
               listaClientes = new ArrayList<>();
               listaClientes.add(ClienteService.carregar(id));
           } else {
               // Informar ao usuário que o campo está vazio
               JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
               return;
               }
          } else if (selectedIndex == 2) {
               // Filtro por descrição
               String descricao = this.buscaCliente.getjTextFieldFiltrar().getText().trim();
               listaClientes = ClienteService.carregar(descricao);
          } else {
               // Se não for nenhuma das opções acima, não fazer nada ou mostrar mensagem de erro
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
          }

          // Atualizar a tabela com os resultados
           DefaultTableModel tabela = (DefaultTableModel) this.buscaCliente.getjTableDados().getModel();
           tabela.setRowCount(0); // Limpar a tabela antes de adicionar os dados

           for (Cliente clienteAtual : listaClientes) {
                tabela.addRow(new Object[]{clienteAtual.getId(), 
                                           clienteAtual.getNome(),
                                           clienteAtual.getFone1(),
                                           clienteAtual.getFone2(),
                                           clienteAtual.getEmail(),
                                           clienteAtual.getStatus(),
                                           clienteAtual.getRg(),
                                           clienteAtual.getCpf(),
                                           clienteAtual.getMatricula(),
                                           clienteAtual.getDataNascimento(),
                                           clienteAtual.getEndereco().getCep(),
                                           clienteAtual.getEndereco().getCidade().getUf(),
                                           clienteAtual.getEndereco().getCidade(),
                                           clienteAtual.getEndereco().getBairro(),
                                           clienteAtual.getEndereco().getLogradouro(),
                                           clienteAtual.getComplementoEndereco()
                                           
                                       
                
                });
            }
                
               
            
            
        } else if (e.getSource() == this.buscaCliente.getjButtonCarregar()) {
            
            ControllerCadastroCliente.codigoCliente =(int) this.buscaCliente.
            getjTableDados().getValueAt(this.buscaCliente.getjTableDados().getSelectedRow(), 0);
            this.buscaCliente.dispose();
            
            
            //ControllerCadastroCarteirinha.codigoCarteirinha = (int) this.buscaCliente.getjTableDados().getValueAt(this.buscaCliente.getjTableDados().getSelectedRow(), 0);
            //this.buscaCliente.dispose();
            

        } else if (e.getSource() == this.buscaCliente.getjButtonSair()) {
            this.buscaCliente.dispose();

        } else if (e.getSource() == this.buscaCliente.getjButtonApagar()){
                      
                int selectedRow = this.buscaCliente.getjTableDados().getSelectedRow();
                if (selectedRow != -1) {
                    int clienteId = (int) this.buscaCliente.getjTableDados().getValueAt(selectedRow, 0);

                    ModalConnfirm modalConnfirm = new ModalConnfirm(new JFrame(), true);
                    ClienteModalController clienteModalController = new ClienteModalController(modalConnfirm, clienteId, (DefaultTableModel) this.buscaCliente.getjTableDados().getModel(), selectedRow);
                    modalConnfirm.setLocationRelativeTo(null);
                    modalConnfirm.setVisible(true);

                }
            
            
            
            
        }

    }

}
