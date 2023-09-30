
package controller;

import static controller.ControllerCadastroCidade.codigoCidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bo.Cidade;
import view.BuscaCidade;


public class ControllerBuscaCidade implements ActionListener {

    BuscaCidade buscaCidade;
  
    public ControllerBuscaCidade(BuscaCidade buscaCidade) {
        this.buscaCidade = buscaCidade;
        

        this.buscaCidade.getjButtonFiltrar().addActionListener(this);
        this.buscaCidade.getjButtonCarregar().addActionListener(this);
        this.buscaCidade.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativa(true, this.buscaCidade.getjPanelBotoes());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaCidade.getjButtonFiltrar()){            
       
            List<Cidade> listaCidade = new ArrayList<Cidade>();
            listaCidade = service.CidadeService.carregar();
 
            //Criando um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCidade.getjTableDados().getModel();
        
            tabela.setRowCount(0);
            for (Cidade cidadeAtual : listaCidade) {
                tabela.addRow(new Object[]{cidadeAtual.getId(), cidadeAtual.getDescricao(), cidadeAtual.getUf()});
                
            }
          
            
        
        }else if(e.getSource() == this.buscaCidade.getjButtonCarregar()){
           
           controller.ControllerCadastroCidade.codigoCidade = (int) this.buscaCidade.
            getjTableDados().getValueAt(this.buscaCidade.getjTableDados().getSelectedRow(), 0);
            this.buscaCidade.dispose();
            
            controller.ControllerCadastroEndereco.codigoCidade = (int) this.buscaCidade.
            getjTableDados().getValueAt(this.buscaCidade.getjTableDados().getSelectedRow(), 0);
            this.buscaCidade.dispose();


            
       
        }else if(e.getSource() == this.buscaCidade.getjButtonSair()){
            this.buscaCidade.dispose();
        }
    }

}
