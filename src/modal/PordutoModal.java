
package modal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Produto;
import service.ProdutoService;
import view.ModalConnfirm;

public class PordutoModal  implements ActionListener {
    ModalConnfirm modalConfirm;
    int produtoId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public PordutoModal(ModalConnfirm modalConfirm, int produtoId, DefaultTableModel tabelaReferencia, int rowReferencia) {
        this.modalConfirm = modalConfirm;
        this.produtoId = produtoId;
        this.tabelaReferencia = tabelaReferencia;
        this.rowReferencia = rowReferencia;
        
        this.modalConfirm.getjButtonNao().addActionListener(this);
        this.modalConfirm.getjButtonSim().addActionListener(this);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
                
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {                
            Produto produto = ProdutoService.carregar(produtoId); 

            if (produto != null) {
                ProdutoService.remover(produto);
                tabelaReferencia.removeRow(rowReferencia);
            }
            this.modalConfirm.dispose();
           
            
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }

        
        
        
    }
    
}
