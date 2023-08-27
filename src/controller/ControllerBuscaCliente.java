
package controller;

import Dao.ClasseDados;
import static Dao.ClasseDados.clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Cliente;
import view.BuscaCliente;

public class ControllerBuscaCliente implements ActionListener {

    BuscaCliente buscaCliente;

    public ControllerBuscaCliente(BuscaCliente buscaCliente) {
        this.buscaCliente = buscaCliente;

        this.buscaCliente.getjButtonFiltrar().addActionListener(this);
        this.buscaCliente.getjButtonCarregar().addActionListener(this);
        this.buscaCliente.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativa(true, this.buscaCliente.getjPanelBotoes());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaCliente.getjButtonFiltrar()) {
            
            ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCliente.getjTableDados().getModel();
            for (Cliente cliente : clientes) {
                tabela.addRow(new Object[]{cliente.getId(),cliente.getCpf(),cliente.getNome()});
            }
            
        } else if (e.getSource() == this.buscaCliente.getjButtonCarregar()) {
            ControllerCadastroCliente.codigoCliente =(int) this.buscaCliente.getjTableDados().getValueAt(this.buscaCliente.getjTableDados().getSelectedRow(), 0);
            this.buscaCliente.dispose();
            ControllerCadastroCarteirinha.codigoCarteirinha = (int) this.buscaCliente.getjTableDados().getValueAt(this.buscaCliente.getjTableDados().getSelectedRow(), 0);
            this.buscaCliente.dispose();
            

        } else if (e.getSource() == this.buscaCliente.getjButtonSair()) {
            this.buscaCliente.dispose();

        }

    }

}
