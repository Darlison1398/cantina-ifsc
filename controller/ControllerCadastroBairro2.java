
package controller;
import view.TelaCadastroBairro2;
import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarBairro2;
import view.TelaBuscaBairro;



public class ControllerCadastroBairro2 implements ActionListener{
    
    TelaCadastroBairro2 telaCadastroBairro2;

    public ControllerCadastroBairro2(TelaCadastroBairro2 telaCadastroBairro2) {
        this.telaCadastroBairro2 = telaCadastroBairro2;
        
        this.telaCadastroBairro2.getjBBuscar().addActionListener(this);
        this.telaCadastroBairro2.getjBSalvar().addActionListener(this);
        this.telaCadastroBairro2.getjBCancelar().addActionListener(this);
        this.telaCadastroBairro2.getjBNovo().addActionListener(this);
        this.telaCadastroBairro2.getjBSair().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.telaCadastroBairro2.getjPanBotoes());
        Utilities.utilities.limpaComponentes(true, this.telaCadastroBairro2.getjPanDados());
        
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
            if (e.getSource() == this.telaCadastroBairro2.getjBNovo()) {
           // TelaBuscaBairro telaBuscaBairro = new TelaBuscaBairro(null, true);
            //Inserir o controller da busca d bairros
           // telaBuscaBairro.setVisible(true);
           CadastrarBairro2 cadastrarBairro2 = new CadastrarBairro2(null, true);
           cadastrarBairro2.setVisible(true);
           
                
            
            } else if (e.getSource() == this.telaCadastroBairro2.getjBCancelar()) {
            utilities.ativaDesativa(true, this.telaCadastroBairro2.getjPanBotoes());
            utilities.limpaComponentes(false, this.telaCadastroBairro2.getjPanDados());

           } else if (e.getSource() == this.telaCadastroBairro2.getjBSalvar()) {
            utilities.ativaDesativa(true, this.telaCadastroBairro2.getjPanBotoes());
            utilities.limpaComponentes(false, this.telaCadastroBairro2.getjPanDados());

           } else if (e.getSource() == this.telaCadastroBairro2.getjBBuscar()) {
            utilities.ativaDesativa(false, this.telaCadastroBairro2.getjPanBotoes());
            utilities.limpaComponentes(true, this.telaCadastroBairro2.getjPanDados());    

        } else if (e.getSource() == this.telaCadastroBairro2.getjBSair()) {
            this.telaCadastroBairro2.dispose();

        }
    }
    
    
}
