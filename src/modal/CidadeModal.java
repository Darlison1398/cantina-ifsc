
package modal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Cidade;
import service.CidadeService;
import view.ModalConnfirm;

public class CidadeModal implements ActionListener {
    ModalConnfirm modalConfirm;
    int cidadeId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public CidadeModal(ModalConnfirm modalConfirm, int cidadeId, DefaultTableModel tabela, int row) {
        this.modalConfirm = modalConfirm;
        this.cidadeId = cidadeId;
        this.tabelaReferencia = tabela;
        this.rowReferencia = row;
        
        this.modalConfirm.getjButtonNao().addActionListener(this);
        this.modalConfirm.getjButtonSim().addActionListener(this);
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
                        
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {
            
            Cidade cidade = CidadeService.carregar(cidadeId); 
            if (cidade != null) {
                CidadeService.remover(cidade);
                tabelaReferencia.removeRow(rowReferencia);
            }
            this.modalConfirm.dispose();
            
            
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }


        
        
    }
    
}
