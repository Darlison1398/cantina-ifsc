
package controller;

import Dao.ClasseDados;
import static Dao.ClasseDados.fornecedores;
import static Dao.ClasseDados.funcionarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import view.BuscaFuncionario;

public class ControllerBuscaFuncionario implements ActionListener{
    
    BuscaFuncionario buscaFuncionario;

    public ControllerBuscaFuncionario(BuscaFuncionario buscaFuncionario) {
        this.buscaFuncionario = buscaFuncionario;
        
        this.buscaFuncionario.getjButtonFiltrar().addActionListener(this);
        this.buscaFuncionario.getjButtonCarregar().addActionListener(this);
        this.buscaFuncionario.getjButtonSair().addActionListener(this);
        
        //utilities.Utilities.ativa(true, this.buscaFuncionario.getjPanelBotoes());
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaFuncionario.getjButtonFiltrar()){
            
            /*Dao.ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFuncionario.getjTableDados().getModel();
            for (Funcionario funcionarioAtual : funcionarios) {
                
                tabela.addRow(new Object[]{funcionarioAtual.getId(),funcionarioAtual.getNome(),funcionarioAtual.getCpf()});
            }*/
            
            ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFuncionario.getjTableDados().getModel();
            int contador = tabela.getRowCount();
            for (int i = contador; i > 0; i--) {
                tabela.removeRow(i);
            }
            for (Funcionario funcionarioAtual : funcionarios) {
                tabela.addRow(new Object[]{funcionarioAtual.getId(),funcionarioAtual.getCpf(),funcionarioAtual.getNome()});
            }
            
            
            
        }else if(e.getSource() == this.buscaFuncionario.getjButtonCarregar()){
        
            ControllerCadastroFuncionario.codigoFuncionario=(int) this.buscaFuncionario.getjTableDados().getValueAt(this.buscaFuncionario.getjTableDados().getSelectedRow(), 0);
            this.buscaFuncionario.dispose();
            
            
        }else if(e.getSource() == this.buscaFuncionario.getjButtonSair()){
            this.buscaFuncionario.dispose();
        }
    }
    
    
}
