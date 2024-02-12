
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaVenda;

public class ControllerBuscaVenda implements ActionListener{
    
    BuscaVenda buscaVenda;

    public ControllerBuscaVenda(BuscaVenda buscaVenda) {
        this.buscaVenda = buscaVenda;
        
        this.buscaVenda.getjButtonFiltrar().addActionListener(this);
        this.buscaVenda.getjButtonCarregar().addActionListener(this);
        this.buscaVenda.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaVenda.getjPanelBotoes());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaVenda.getjButtonFiltrar()){
        
        }else if(e.getSource() == this.buscaVenda.getjButtonCarregar()){
        
        }else if(e.getSource() == this.buscaVenda.getjButtonSair()){
            this.buscaVenda.dispose();
            
        }
        
    }
    
    
    
}
