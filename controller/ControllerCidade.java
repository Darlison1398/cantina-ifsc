
package controller;

import view.Cidade;
import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarCidade;

public class ControllerCidade implements ActionListener {
    
    Cidade cidade;
    
    public ControllerCidade(Cidade cidade){
        this.cidade = cidade;
        
        this.cidade.getjBNovoCidade().addActionListener(this);
        this.cidade.getjBPesquisarCidade().addActionListener(this);
        this.cidade.getjBSairCidade().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.cidade.getjPanBotoesCidade());
        Utilities.utilities.limpaComponentes(true, this.cidade.getjPanDadosCidade());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == this.cidade.getjBNovoCidade()) {
                CadastrarCidade cadastrarCidade = new CadastrarCidade(null, true);
                cadastrarCidade.setVisible(true);
           // utilities.ativaDesativa(false, this.cidade.getjPanBotoesCidade());
           // utilities.limpaComponentes(true, this.cidade.getjPanDadosCidade());

            } else if (e.getSource() == this.cidade.getjBPesquisarCidade()) {
            utilities.ativaDesativa(true, this.cidade.getjPanBotoesCidade());
            utilities.limpaComponentes(false, this.cidade.getjPanDadosCidade());
            

            } else if (e.getSource() == this.cidade.getjBSairCidade()) {
            this.cidade.dispose();

        }
    }
    
    
}
