
package controllerMovimento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import view.TelaComproFiscal;


 
public class ComprovanteFiscalController implements ActionListener {

    TelaComproFiscal tlComproFiscal;
        //private String valorTotalCompra;
    //private DefaultTableModel modeloTabelaCompra;

    public ComprovanteFiscalController(TelaComproFiscal tlComproFiscal) {
        this.tlComproFiscal = tlComproFiscal;
        
        this.tlComproFiscal.getjBtnCANCELAR().addActionListener(this);
        this.tlComproFiscal.getjBtnRECEBER().addActionListener(this);
        
        /* desativando os campos que não podem ser editados*/
        this.tlComproFiscal.getjTValorDesconto().setEditable(false);
        this.tlComproFiscal.getjTableDadosProduto().setEnabled(false);
        this.tlComproFiscal.getjTcodCarteirinha().setEditable(false);
        this.tlComproFiscal.getjTdataHora().setEditable(false);
        this.tlComproFiscal.getjTextField1().setEnabled(false);
        this.tlComproFiscal.getjTnomeCarteirinha().setEditable(false);
        this.tlComproFiscal.getjTobservacao().setEditable(false);
        this.tlComproFiscal.getjTvalorTotalProduto().setEditable(false);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.tlComproFiscal.getjBtnRECEBER()){
            
            
        } else if (e.getSource() == this.tlComproFiscal.getjBtnCANCELAR()) {
            
            
        }
        
    }
    
}
