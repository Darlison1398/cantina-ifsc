
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Cliente;
import service.ClienteService;
import view.ModalConnfirm;

public class ClienteModalController implements ActionListener{
    ModalConnfirm modalConfirm;
    int clienteId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public ClienteModalController(ModalConnfirm modalConfirm, int clienteId, DefaultTableModel tabelaReferencia, int rowReferencia) {
        this.modalConfirm = modalConfirm;
        this.clienteId = clienteId;
        this.tabelaReferencia = tabelaReferencia;
        this.rowReferencia = rowReferencia;
        
        this.modalConfirm.getjButtonNao().addActionListener(this);
        this.modalConfirm.getjButtonSim().addActionListener(this);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {
            
            Cliente cliente = ClienteService.carregar(clienteId); // Buscar o bairro pelo ID

            if (cliente != null) {
                ClienteService.remover(cliente);

                // Remover a linha do modelo da tabela
                tabelaReferencia.removeRow(rowReferencia);
            }

            this.modalConfirm.dispose();
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }


        
    }
    
}
