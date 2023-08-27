
package controller;

import static Dao.ClasseDados.enderecos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Endereco;
import view.BuscaEndereco;
import view.BuscaEndereco2;

public class ControllerBuscaEndereco2 implements ActionListener {

     BuscaEndereco2 buscaEndereco2;

    public ControllerBuscaEndereco2(BuscaEndereco2 buscaEndereco2) {
        this.buscaEndereco2 = buscaEndereco2;
        
        this.buscaEndereco2.getjButtonFiltrar().addActionListener(this);
        this.buscaEndereco2.getjButtonCarregar().addActionListener(this);
        this.buscaEndereco2.getjButtonSair().addActionListener(this);

    }
 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.buscaEndereco2.getjButtonFiltrar()){
            Dao.ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaEndereco2.getjTableDados().getModel();
           
            int contador=tabela.getRowCount();
            for(int i =contador; i>0;i--){
                tabela.removeRow(i);
            }
            for (Endereco enderecoAtual : enderecos) {
                tabela.addRow(new Object[]{enderecoAtual.getId(),enderecoAtual.getLogradouro(),enderecoAtual.getCidade().getDescricao(),enderecoAtual.getBairro().getDescricao()});
            }
    
        
        }else if(e.getSource() == this.buscaEndereco2.getjButtonCarregar()){
            
           ControllerCadastroCliente.codigoEndereco=(int) this.buscaEndereco2.getjTableDados().getValueAt(this.buscaEndereco2.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroEndereco.codigo=(int) this.buscaEndereco2.getjTableDados().getValueAt(this.buscaEndereco2.getjTableDados().getSelectedRow(), 0);
           this.buscaEndereco2.dispose();
           
           ControllerCadastroFornecedor.codigoEndereco=(int) this.buscaEndereco2.getjTableDados().getValueAt(this.buscaEndereco2.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroFuncionario.codigoEndereco=(int) this.buscaEndereco2.getjTableDados().getValueAt(this.buscaEndereco2.getjTableDados().getSelectedRow(), 0);
       
        
        }else if(e.getSource() == this.buscaEndereco2.getjButtonSair()){
            this.buscaEndereco2.dispose();
        }
        
        
        
    }
    
    
}
