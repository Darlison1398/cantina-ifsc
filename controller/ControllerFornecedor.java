
package controller;
import view.Fornecedor;
import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarFornecedor;

public class ControllerFornecedor implements ActionListener {
    
    Fornecedor fornecedor;
    
    public ControllerFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
        
        this.fornecedor.getjBNovoFor().addActionListener(this);
        this.fornecedor.getjBPesquisarFor().addActionListener(this);
        this.fornecedor.getjBSairFor().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.fornecedor.getjPanBotoesFor());
        Utilities.utilities.limpaComponentes(true, this.fornecedor.getjPanDadosFor());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
            if (e.getSource() == this.fornecedor.getjBNovoFor()) {
                CadastrarFornecedor cadastrarFornecedor = new CadastrarFornecedor(null, true);
                cadastrarFornecedor.setVisible(true);
            //utilities.ativaDesativa(false, this.fornecedor.getjPanBotoesFor());
            //utilities.limpaComponentes(true, this.fornecedor.getjPanDadosFor());

            } else if (e.getSource() == this.fornecedor.getjBPesquisarFor()) {
            utilities.ativaDesativa(true, this.fornecedor.getjPanBotoesFor());
            utilities.limpaComponentes(false, this.fornecedor.getjPanDadosFor());
            

            } else if (e.getSource() == this.fornecedor.getjBSairFor()) {
            this.fornecedor.dispose();

        }
    }
    
}
