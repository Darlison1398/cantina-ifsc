
package controller;

import Dao.ClasseDados;
import static Dao.ClasseDados.carteirinhas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Carteirinha;
import view.BuscaCarteirinha;

public class ControllerBuscaCarteirinha implements ActionListener{
    
    BuscaCarteirinha buscaCarteirinha;

    public ControllerBuscaCarteirinha(BuscaCarteirinha buscaCarteirinha) {
        
        this.buscaCarteirinha = buscaCarteirinha;
        
        this.buscaCarteirinha.getjButtonFiltrar().addActionListener(this);
        this.buscaCarteirinha.getjButtonCarregar().addActionListener(this);
        this.buscaCarteirinha.getjButtonSair().addActionListener(this);
        this.buscaCarteirinha.getjButtonApagar().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaCarteirinha.getjPanelBotoes());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaCarteirinha.getjButtonFiltrar()){
            
            ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCarteirinha.getjTableDados().getModel();
            for (Carteirinha carteirinha : carteirinhas) {
                tabela.addRow(new Object[]{carteirinha.getId(), carteirinha.getCliente().getId(), carteirinha.getCliente().getNome()});
            }
        
        }else if(e.getSource() == this.buscaCarteirinha.getjButtonCarregar()){
            
            ControllerCadastroCarteirinha.codigo=(int) this.buscaCarteirinha.getjTableDados().getValueAt(this.buscaCarteirinha.getjTableDados().getSelectedRow(), 0);
            this.buscaCarteirinha.dispose();
        
        }else if(e.getSource() == this.buscaCarteirinha.getjButtonSair()){
            this.buscaCarteirinha.dispose();
            
        } else if (e.getSource() == this.buscaCarteirinha.getjButtonApagar()) {
            
        }
    }
    
    
    
}
