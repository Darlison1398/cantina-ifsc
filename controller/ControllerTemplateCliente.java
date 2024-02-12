
package controller;
import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarCliente;
import view.TestandoTemplate;
import javax.swing.JPanel;

public class ControllerTemplateCliente implements ActionListener{
    
    TestandoTemplate cliente;
    
    public ControllerTemplateCliente(TestandoTemplate cliente){
        cliente.getjBFiltrar().addActionListener(this);
        cliente.getjBCarregar().addActionListener(this);
        cliente.getjBSair().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.cliente.getjPBotoes());
        Utilities.utilities.limpaComponentes(true, this.cliente.getjPPesquisa());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
                        
            if (e.getSource() == this.cliente.getjBFiltrar()) {
                CadastrarCliente cadastrarCliente = new CadastrarCliente(null, true);
                cadastrarCliente.setVisible(true);
                
                
           

            } else if (e.getSource() == this.cliente.getjBCarregar()) {
            utilities.ativaDesativa(true, this.cliente.getjPBotoes());
            utilities.limpaComponentes(false, this.cliente.getjPPesquisa());
            

            } else if (e.getSource() == this.cliente.getjBSair()) {
            this.cliente.dispose();

        }
    }
    
}
