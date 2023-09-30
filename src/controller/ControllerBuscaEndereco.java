
package controller;

import static Dao.ClasseDados.enderecos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
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
            List<Endereco> listaEnderecos = new ArrayList<Endereco>();
            listaEnderecos = service.EnderecoService.carregar();
            //System.out.println(listaEnderecos);
      
            DefaultTableModel tabela =(DefaultTableModel) this.buscaEndereco.getjTableDados().getModel();
            for (Endereco enderecoAtual : listaEnderecos) {
                tabela.addRow(new Object[]{enderecoAtual.getId(),
                                           enderecoAtual.getCep(),
                                           enderecoAtual.getLogradouro(),
                                           enderecoAtual.getCidade().getId(),
                                           enderecoAtual.getCidade().getDescricao(),
                                           enderecoAtual.getBairro().getId(),
                                           enderecoAtual.getBairro().getDescricao()});
                
            }
            
         
            
            
        }else if(e.getSource() == this.buscaEndereco.getjButtonCarregar()){
            
           ControllerCadastroCliente.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroEndereco.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           this.buscaEndereco.dispose();
           
           ControllerCadastroFornecedor.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
           
           ControllerCadastroFuncionario.codigoEndereco=(int) this.buscaEndereco.getjTableDados().getValueAt(this.buscaEndereco.getjTableDados().getSelectedRow(), 0);
       
        
        }else if(e.getSource() == this.buscaEndereco.getjButtonSair()){
            this.buscaEndereco.dispose();
        }
    }
    
}
