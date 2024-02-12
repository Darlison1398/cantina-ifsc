
package controller;

import view.Carteirinha;
import  Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarCarteirinha;

public class ControllerCarteirinha implements ActionListener {
    
    Carteirinha carteirinha;

    public ControllerCarteirinha(Carteirinha carteirinha) {
        
        this.carteirinha = carteirinha;
        
        this.carteirinha.getjBNovoCart().addActionListener(this);
        this.carteirinha.getjBPesquisarCart().addActionListener(this);
        this.carteirinha.getjBSairCart().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.carteirinha.getjPanBotoesCarteira());
        Utilities.utilities.limpaComponentes(true, this.carteirinha.getjPanDadosCarteira());
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == this.carteirinha.getjBNovoCart()) {
                CadastrarCarteirinha cadastrarCarteirinha = new CadastrarCarteirinha(null, true);
                cadastrarCarteirinha.setVisible(true);
           // utilities.ativaDesativa(false, this.carteirinha.getjPanBotoesCarteira());
           // utilities.limpaComponentes(true, this.carteirinha.getjPanDadosCarteira());

            } else if (e.getSource() == this.carteirinha.getjBPesquisarCart()) {
            utilities.ativaDesativa(true, this.carteirinha.getjPanBotoesCarteira());
            utilities.limpaComponentes(false, this.carteirinha.getjPanDadosCarteira());
            

            } else if (e.getSource() == this.carteirinha.getjBSairCart()) {
            this.carteirinha.dispose();

        }
    }
    
}
