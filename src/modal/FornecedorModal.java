
package modal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Fornecedor;
import service.FornecedorService;
import view.ModalConnfirm;


public class FornecedorModal implements ActionListener {
    ModalConnfirm modalConfirm;
    int fornecedorId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public FornecedorModal(ModalConnfirm modalConfirm, int fornecedorId, DefaultTableModel tabelaReferencia, int rowReferencia) {
        this.modalConfirm = modalConfirm;
        this.fornecedorId = fornecedorId;
        this.tabelaReferencia = tabelaReferencia;
        this.rowReferencia = rowReferencia;
        
        this.modalConfirm.getjButtonNao().addActionListener(this);
        this.modalConfirm.getjButtonSim().addActionListener(this);
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
                
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {
            
            Fornecedor fornecedor = FornecedorService.carregar(fornecedorId); 
            if (fornecedor != null) {
                FornecedorService.remover(fornecedor);
                tabelaReferencia.removeRow(rowReferencia);
            }
            this.modalConfirm.dispose();
            
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }


        
        
        
    }
    
}
