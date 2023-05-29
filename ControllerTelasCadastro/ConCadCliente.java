

package ControllerTelasCadastro;

import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.CadastrarCarteirinha;
import view.CadastrarCliente;

public class ConCadCliente implements ActionListener{

  
    CadastrarCliente cadCliente;

    public ConCadCliente(CadastrarCliente cadCliente) {
        this.cadCliente = cadCliente;
        
        this.cadCliente.getjBCancelarCadCliente().addActionListener(this);
        this.cadCliente.getjBSairCadCliente().addActionListener(this);
        this.cadCliente.getjBSalvarCadCliente().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.cadCliente.getjPanBotoesCadCliente());
        Utilities.utilities.limpaComponentes(true, this.cadCliente.getjPanDadosCadastro());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == this.cadCliente.getjBSalvarCadCliente()) {
                JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!");


            } else if (e.getSource() == this.cadCliente.getjBCancelarCadCliente()) {
            utilities.ativaDesativa(true, this.cadCliente.getjPanBotoesCadCliente());
            utilities.limpaComponentes(false, this.cadCliente.getjPanDadosCadastro());
            

            } else if (e.getSource() == this.cadCliente.getjBSairCadCliente()) {
            this.cadCliente.dispose();

        }
    }
    
    public static void sair(){
        System.exit(0);
    }
    
    public static void salvar(){
        JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!");
        System.exit(0);
    }
    
    
}
