
package controller;
import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.CadastrarCliente;
import view.TelaBuscaBairro;

public class ControllerCadastroCliente implements ActionListener {
    
    CadastrarCliente cadastrarCliente;

    public ControllerCadastroCliente(CadastrarCliente cadastrarCliente) {
        this.cadastrarCliente = cadastrarCliente;
        
        this.cadastrarCliente.getjBCancelarCadCliente().addActionListener(this);
        this.cadastrarCliente.getjBSairCadCliente().addActionListener(this);
        this.cadastrarCliente.getjBSalvarCadCliente().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.cadastrarCliente.getjPanBotoesCadCliente());
        Utilities.utilities.limpaComponentes(true, this.cadastrarCliente.getjPanDadosCadastro());
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
                
            if (e.getSource() == this.cadastrarCliente.getjBSalvarCadCliente()) {
            utilities.ativaDesativa(false, this.cadastrarCliente.getjPanBotoesCadCliente());
            utilities.limpaComponentes(true, this.cadastrarCliente.getjPanDadosCadastro());
            JOptionPane.showMessageDialog(null, "CLIENTE CADASTRADO COM SUCESSO!!!");

            } else if (e.getSource() == this.cadastrarCliente.getjBCancelarCadCliente()) {
            utilities.ativaDesativa(true, this.cadastrarCliente.getjPanBotoesCadCliente());
            utilities.limpaComponentes(false, this.cadastrarCliente.getjPanDadosCadastro());        

        } else if (e.getSource() == this.cadastrarCliente.getjBSairCadCliente()) {
            this.cadastrarCliente.dispose();

        }
    }
    
    
}
