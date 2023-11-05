
package modal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Endereco;
import service.EnderecoService;
import view.ModalConnfirm;

public class EnderecoModal implements ActionListener {
    ModalConnfirm modalConfirm;
    int enderecoId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public EnderecoModal(ModalConnfirm modalConfirm, int enderecoId, DefaultTableModel tabelaReferencia, int rowReferencia) {
        this.modalConfirm = modalConfirm;
        this.enderecoId = enderecoId;
        this.tabelaReferencia = tabelaReferencia;
        this.rowReferencia = rowReferencia;
        
        this.modalConfirm.getjButtonNao().addActionListener(this);
        this.modalConfirm.getjButtonSim().addActionListener(this);
        
    }
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
                        
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {
            
            Endereco endereco = EnderecoService.carregar(enderecoId); 
            if (endereco != null) {
                EnderecoService.remover(endereco);
                tabelaReferencia.removeRow(rowReferencia);
            }
            this.modalConfirm.dispose();
            
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }


        
    }
    
}
