
package modal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Carteirinha;
import service.CarteirinhaService;
import view.ModalConnfirm;


public class CarteirinhaModal implements ActionListener {
    ModalConnfirm modalConfirm;
    int carteirinhaId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public CarteirinhaModal(ModalConnfirm modalConfirm, int carteirinhaId, DefaultTableModel tabelaReferencia, int rowReferencia) {
        this.modalConfirm = modalConfirm;
        this.carteirinhaId = carteirinhaId;
        this.tabelaReferencia = tabelaReferencia;
        this.rowReferencia = rowReferencia;
        
        this.modalConfirm.getjButtonNao().addActionListener(this);
        this.modalConfirm.getjButtonSim().addActionListener(this);
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
              
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {                
            Carteirinha carteirinha = CarteirinhaService.carregar(carteirinhaId); 

            if (carteirinha != null) {
                CarteirinhaService.remover(carteirinha);
                tabelaReferencia.removeRow(rowReferencia);
            }
            this.modalConfirm.dispose();
           
            
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }

        
        
    }
    
}
