
package controller;

import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarFuncionario;
import view.Funcionario;

public class ControllerFuncionario implements ActionListener {
    Funcionario funcionario;
    
    public ControllerFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
        
        this.funcionario.getJBNovoF().addActionListener(this);
        this.funcionario.getJBPesquisarF().addActionListener(this);
        this.funcionario.getjBSairF().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.funcionario.getjPanBotoesF());
        Utilities.utilities.ativaDesativa(true, this.funcionario.getjPanDadosF());
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
                        
            if (e.getSource() == this.funcionario.getJBNovoF()) {
             CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario(null, true);
             cadastrarFuncionario.setVisible(true);
            //utilities.ativaDesativa(false, this.funcionario.getjPanBotoesF());
            //utilities.limpaComponentes(true, this.funcionario.getjPanDadosF());

            } else if (e.getSource() == this.funcionario.getJBPesquisarF()) {
            utilities.ativaDesativa(true, this.funcionario.getjPanBotoesF());
            utilities.limpaComponentes(false, this.funcionario.getjPanDadosF());
            

            } else if (e.getSource() == this.funcionario.getjBSairF()) {
            this.funcionario.dispose();

        }
    }
    
}
