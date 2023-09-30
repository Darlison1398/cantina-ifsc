
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bo.Produto;
import service.ProdutoService;
import view.BuscaProduto;

public class ControllerBuscaProduto implements ActionListener {

    BuscaProduto buscaProduto;

    public ControllerBuscaProduto(BuscaProduto buscaProduto) {
        this.buscaProduto = buscaProduto;

        this.buscaProduto.getjButtonFiltrar().addActionListener(this);
        this.buscaProduto.getjButtonCarregar().addActionListener(this);
        this.buscaProduto.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativa(true, this.buscaProduto.getjPanelBotoes());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaProduto.getjButtonFiltrar()) {
            
            List<Produto> listaProduto = new ArrayList<Produto> ();
            listaProduto = ProdutoService.carregar();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaProduto.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Produto produtoAtual : listaProduto) {
                tabela.addRow(new Object[]{produtoAtual.getId(), 
                                           produtoAtual.getDescricao(), 
                                           produtoAtual.getCodigoBarra(), 
                                           produtoAtual.getStatus()});
                
            }
            
            
            

        } else if (e.getSource() == this.buscaProduto.getjButtonCarregar()) {
            
            controller.ControllerCadastroProduto.codigo=(int) this.buscaProduto.
            getjTableDados().getValueAt(this.buscaProduto.getjTableDados().getSelectedRow(), 0);
            this.buscaProduto.dispose();

            
            
        } else if (e.getSource() == this.buscaProduto.getjButtonSair()) {
            this.buscaProduto.dispose();

        }
    }

}
