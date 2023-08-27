
package controller;

import static Dao.ClasseDados.enderecos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Endereco;
import view.BuscaEndereco;

public class ControllerBuscaEndereco implements ActionListener{
    
    BuscaEndereco buscaEndereco;

    public ControllerBuscaEndereco(BuscaEndereco buscaEndereco) {
        this.buscaEndereco = buscaEndereco;
        
        this.buscaEndereco.getjButtonFiltrar().addActionListener(this);
        this.buscaEndereco.getjButtonCarregar().addActionListener(this);
        this.buscaEndereco.getjButtonSair().addActionListener(this);
        
        //utilities.Utilities.ativa(true, this.buscaEndereco.getjPanelBotoes());
        
        

    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaEndereco.getjButtonFiltrar()){
            Dao.ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaEndereco.getjTableDados().getModel();
           
            int contador=tabela.getRowCount();
            for(int i =contador; i>0;i--){
                tabela.removeRow(i);
            }
            for (Endereco enderecoAtual : enderecos) {
                tabela.addRow(new Object[]{enderecoAtual.getId(),enderecoAtual.getLogradouro(),enderecoAtual.getCidade().getDescricao(),enderecoAtual.getBairro().getDescricao()});
            }
           
        }else if(e.getSource() == this.buscaEndereco.getjButtonCarregar()){
            
           ControllerCadastroCliente.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroEndereco.codigo=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           this.buscaEndereco.dispose();
           
           ControllerCadastroFornecedor.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroFuncionario.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
       
        
        }else if(e.getSource() == this.buscaEndereco.getjButtonSair()){
            this.buscaEndereco.dispose();
        }
    }
    
}
