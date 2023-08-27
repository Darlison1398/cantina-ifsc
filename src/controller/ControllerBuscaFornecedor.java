
package controller;

import static Dao.ClasseDados.fornecedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Fornecedor;
import view.BuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener {
    
    BuscaFornecedor buscaFornecedor;

    public ControllerBuscaFornecedor(BuscaFornecedor buscaFornecedor) {
        this.buscaFornecedor = buscaFornecedor;
        
        this.buscaFornecedor.getjButtonFiltrar().addActionListener(this);
        this.buscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.buscaFornecedor.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaFornecedor.getjPanelBotoes());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.buscaFornecedor.getjButtonFiltrar()){
            
            Dao.ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFornecedor.getjTableDados().getModel();
            for (Fornecedor fornecedorAtual : fornecedores) {
                
                tabela.addRow(new Object[]{fornecedorAtual.getId(),fornecedorAtual.getCnpj(),fornecedorAtual.getNome()});
            }
            
        
        }else if(e.getSource() == this.buscaFornecedor.getjButtonCarregar()){
        
            ControllerCadastroFornecedor.codigoFornecedor=(int) this.buscaFornecedor.getjTableDados().getValueAt(this.buscaFornecedor.getjTableDados().getSelectedRow(), 0);
            this.buscaFornecedor.dispose();
            
            
        }else if(e.getSource() == this.buscaFornecedor.getjButtonSair()){
            this.buscaFornecedor.dispose();
        }
        
    }
    
}
