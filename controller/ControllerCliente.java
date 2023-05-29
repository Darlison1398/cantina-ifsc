
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Cliente;
import Utilities.utilities;
import javax.swing.JPanel;
import view.CadastrarCliente;
import view.TelaBuscaBairro;
//import ControllerTelasCadastro.ConCadCliente;

public class ControllerCliente implements ActionListener{
    
    Cliente cliente;
    
    public ControllerCliente(Cliente cliente){
        this.cliente = cliente;
        
        this.cliente.getjBNovo().addActionListener(this);
        this.cliente.getjBPesquisar().addActionListener(this);
        this.cliente.getjBSair().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.cliente.getjPanBotoes());
        Utilities.utilities.ativaDesativa(true, this.cliente.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
                
            if (e.getSource() == this.cliente.getjBNovo()) {
                CadastrarCliente cadastrarCliente = new CadastrarCliente(null, true);
                cadastrarCliente.setVisible(true);
                
                
           

            } else if (e.getSource() == this.cliente.getjBPesquisar()) {
            utilities.ativaDesativa(true, this.cliente.getjPanBotoes());
            utilities.limpaComponentes(false, this.cliente.getjPanDados());
            

            } else if (e.getSource() == this.cliente.getjBSair()) {
            this.cliente.dispose();

        }
    }


    
}
