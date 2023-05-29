
package controller;

import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//import view.CadastrarEndereco;
import view.Endereco;
import view.Endereco2; // cadastro de endereço


public class ControllerEndereco implements ActionListener{
    
        Endereco endereco;
    
    public ControllerEndereco(Endereco endereco){
        this.endereco = endereco;
        
        this.endereco.getjBNovoEnd().addActionListener(this);
        this.endereco.getjBPesquisarEnd().addActionListener(this);
        this.endereco.getjBSairEnd().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.endereco.getjPanBotoesEnd());
        Utilities.utilities.limpaComponentes(true, this.endereco.getjPanDadosEnd());
    }



    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == this.endereco.getjBNovoEnd()) {
                Endereco2 endereco2 = new Endereco2(null, true);
                endereco2.setVisible(true);

            } else if (e.getSource() == this.endereco.getjBPesquisarEnd()) {
            //utilities.ativaDesativa(true, this.endereco.getjPanBotoesEnd());
            //utilities.limpaComponentes(false, this.endereco.getjPanDadosEnd());
            //JOptionPane.showMessageDialog(null, "PROCURANDO ENDEREÇO");
            
            //Endereco2 endereco2 = new Endereco2(null, true);
            //endereco2.setVisible(true);

            } else if (e.getSource() == this.endereco.getjBSairEnd()) {
            this.endereco.dispose();

        }
    }
    
}
