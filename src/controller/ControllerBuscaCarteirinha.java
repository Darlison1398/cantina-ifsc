
package controller;

import Dao.ClasseDados;
import static Dao.ClasseDados.carteirinhas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modal.CarteirinhaModal;
import model.bo.Carteirinha;
import view.BuscaCarteirinha;
import view.ModalConnfirm;

public class ControllerBuscaCarteirinha implements ActionListener{
    
    BuscaCarteirinha buscaCarteirinha;

    public ControllerBuscaCarteirinha(BuscaCarteirinha buscaCarteirinha) {
        
        this.buscaCarteirinha = buscaCarteirinha;
        
        this.buscaCarteirinha.getjButtonFiltrar().addActionListener(this);
        this.buscaCarteirinha.getjButtonCarregar().addActionListener(this);
        this.buscaCarteirinha.getjButtonSair().addActionListener(this);
        this.buscaCarteirinha.getjButtonApagar().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaCarteirinha.getjPanelBotoes());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaCarteirinha.getjButtonFiltrar()){
                        
            List<Carteirinha> listaCarteirinha;

            int selectedIndex = this.buscaCarteirinha.getjComboBoxFiltrar().getSelectedIndex();

            if (selectedIndex == 0) {
               listaCarteirinha = service.CarteirinhaService.carregar();
           } else if (selectedIndex == 1) {
               String input = this.buscaCarteirinha.getjTextFieldFiltrar().getText().trim();
           if (!input.isEmpty()) {
               int id = Integer.parseInt(input);
               listaCarteirinha = new ArrayList<>();
               listaCarteirinha.add(service.CarteirinhaService.carregar(id));
           } else {
               JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
               return;
               }
          } else if (selectedIndex == 2) {
               String descricao = this.buscaCarteirinha.getjTextFieldFiltrar().getText().trim();
               listaCarteirinha = service.CarteirinhaService.carregar(descricao);
          } else {
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
          }

            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCarteirinha.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Carteirinha carteirinhaAtual : listaCarteirinha) {
                tabela.addRow(new Object[]{carteirinhaAtual.getId(),
                                           carteirinhaAtual.getCliente().getNome(),
                                           carteirinhaAtual.getCliente().getCpf(),
                                           carteirinhaAtual.getDataGeracao(),
                                           carteirinhaAtual.getDataCancelamento(),
                                           carteirinhaAtual.getCodigoBarra()
                });
            }
        
            
            
            
        }else if(e.getSource() == this.buscaCarteirinha.getjButtonCarregar()){
            
            ControllerCadastroCarteirinha.codigoCarteirinha=(int) this.buscaCarteirinha.getjTableDados().getValueAt(this.buscaCarteirinha.getjTableDados().getSelectedRow(), 0);
            this.buscaCarteirinha.dispose();
        
        }else if(e.getSource() == this.buscaCarteirinha.getjButtonSair()){
            this.buscaCarteirinha.dispose();
            
        } else if (e.getSource() == this.buscaCarteirinha.getjButtonApagar()) {
                        
                int selectedRow = this.buscaCarteirinha.getjTableDados().getSelectedRow();
                if (selectedRow != -1) {
                    int carteirinhaId = (int) this.buscaCarteirinha.getjTableDados().getValueAt(selectedRow, 0);

                    ModalConnfirm modalConnfirm = new ModalConnfirm(new JFrame(), true);
                    CarteirinhaModal carteirinhaModal = new CarteirinhaModal(modalConnfirm, carteirinhaId, (DefaultTableModel) this.buscaCarteirinha.getjTableDados().getModel(), selectedRow);
                    modalConnfirm.setLocationRelativeTo(null);
                    modalConnfirm.setVisible(true);

                }
            
            
        }
    }
    
    
    
}
