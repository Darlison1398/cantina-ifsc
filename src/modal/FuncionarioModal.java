
package modal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Funcionario;
import service.FuncionarioService;
import view.ModalConnfirm;

public class FuncionarioModal implements ActionListener {
    ModalConnfirm modalConfirm;
    int funcionarioId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public FuncionarioModal(ModalConnfirm modalConfirm, int funcionarioId, DefaultTableModel tabelaReferencia, int rowReferencia) {
        this.modalConfirm = modalConfirm;
        this.funcionarioId = funcionarioId;
        this.tabelaReferencia = tabelaReferencia;
        this.rowReferencia = rowReferencia;
        
        this.modalConfirm.getjButtonNao().addActionListener(this);
        this.modalConfirm.getjButtonSim().addActionListener(this);
    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {                
            Funcionario funcionario = FuncionarioService.carregar(funcionarioId); 

            if (funcionario != null) {
                FuncionarioService.remover(funcionario);
                tabelaReferencia.removeRow(rowReferencia);
            }
            this.modalConfirm.dispose();
           
            
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }

        
        
    }
    
}
