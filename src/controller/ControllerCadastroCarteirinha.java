
package controller;

import static controller.ControllerCadastroCliente.codigoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import model.bo.Carteirinha;
import model.bo.Cliente;
import view.BuscaCarteirinha;
import view.BuscaCliente;
import view.CadastroCarteirinha;
import view.CadastroCliente;
import view.Resposta;

public class ControllerCadastroCarteirinha implements ActionListener {

    CadastroCarteirinha cadastroCarteirinha;
    public static int codigoCarteirinha, codigo, idCliente;

    public ControllerCadastroCarteirinha(CadastroCarteirinha cadastroCarteirinha) {
        this.cadastroCarteirinha = cadastroCarteirinha;

        this.cadastroCarteirinha.getjButtonNovo().addActionListener(this);
        this.cadastroCarteirinha.getjButtonSalvar().addActionListener(this);
        this.cadastroCarteirinha.getjButtonCancelar().addActionListener(this);
        this.cadastroCarteirinha.getjButtonConsultar().addActionListener(this);
        this.cadastroCarteirinha.getjButtonSair().addActionListener(this);
        this.cadastroCarteirinha.getjButtonPesquisarCPF().addActionListener(this);
        this.cadastroCarteirinha.getjButtonAdicionarCPF().addActionListener(this);

        
        List<Carteirinha> listaCarteirinha = new ArrayList<>();
        listaCarteirinha = service.CarteirinhaService.carregar();
        
        this.cadastroCarteirinha.getjFormattedTextFieldCPF().removeAll();
        this.cadastroCarteirinha.getjTextFieldNome().removeAll();
        
        for (Carteirinha carteirinhaAtual: listaCarteirinha) {
            this.cadastroCarteirinha.getjFormattedTextFieldCPF().setText(carteirinhaAtual.getCliente().getCpf());
            this.cadastroCarteirinha.getjTextFieldNome().setText(carteirinhaAtual.getCliente().getNome());
            
        }
        
        utilities.Utilities.ativa(true, this.cadastroCarteirinha.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getjPanelDados());

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCarteirinha.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroCarteirinha.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroCarteirinha.getjPanelDados());
            
            this.cadastroCarteirinha.getjTextFieldID().setEnabled(false);
            this.cadastroCarteirinha.getjTextFieldNome().setEnabled(false);
            
            

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonSair()) {
            this.cadastroCarteirinha.dispose();

            
            
        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroCarteirinha.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getjPanelDados());

            
            
            
            
        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonSalvar()) {

            Carteirinha carteirinha = new Carteirinha();
            
            carteirinha.setDataGeracao(this.cadastroCarteirinha.getjFormattedTextFieldDataGeracao().getText());
            carteirinha.setDataCancelamento(this.cadastroCarteirinha.getjFormattedTextFieldDataCancelamento().getText());
            carteirinha.setCodigoBarra(this.cadastroCarteirinha.getjTextFieldCodBarra().getText());
            carteirinha.setCliente(service.ClienteService.carregar(codigoCliente));
            
            if(codigoCarteirinha == 0){
                service.CarteirinhaService.adicionar(carteirinha);
                utilities.Utilities.ativa(true, this.cadastroCarteirinha.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getjPanelDados());
            }else{
                 carteirinha.setId(codigoCarteirinha);
                 service.CarteirinhaService.atualizar(carteirinha);
                utilities.Utilities.ativa(true, this.cadastroCarteirinha.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getjPanelDados());
            }
            
            
            
            
        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonConsultar()) {
            codigoCarteirinha = 0;
            BuscaCarteirinha buscaCarteirinha = new BuscaCarteirinha(null, true);
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(buscaCarteirinha);
            buscaCarteirinha.setVisible(true);
            
            if (codigoCarteirinha != 0) {
                Carteirinha carteirinha = new Carteirinha();
                carteirinha = service.CarteirinhaService.carregar(codigoCarteirinha);
                
                utilities.Utilities.ativa(false, this.cadastroCarteirinha.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, this.cadastroCarteirinha.getjPanelDados());
                
                this.cadastroCarteirinha.getjTextFieldID().setText(carteirinha.getId() + "");
                this.cadastroCarteirinha.getjTextFieldNome().setText(carteirinha.getCliente().getNome());
                this.cadastroCarteirinha.getjTextFieldCodBarra().setText(carteirinha.getCodigoBarra());
                this.cadastroCarteirinha.getjFormattedTextFieldCPF().setText(carteirinha.getCliente().getCpf());
                this.cadastroCarteirinha.getjFormattedTextFieldDataGeracao().setText(carteirinha.getDataGeracao());
                this.cadastroCarteirinha.getjFormattedTextFieldDataCancelamento().setText(carteirinha.getDataCancelamento());
                
                cadastroCarteirinha.getjTextFieldID().setEnabled(false);
                cadastroCarteirinha.getjTextFieldNome().setEnabled(false);
                cadastroCarteirinha.getjFormattedTextFieldCPF().setEnabled(false);
                
                
                
            }

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonAdicionarCPF()) {
            CadastroCliente cadastroCliente = new CadastroCliente();
            ControllerCadastroCliente controllerCadastroCliente = new ControllerCadastroCliente(cadastroCliente);
            cadastroCliente.setVisible(true);

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonPesquisarCPF()) {
            codigoCliente = 0;
            BuscaCliente buscaCliente = new BuscaCliente(null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            buscaCliente.setVisible(true);
            
            if (codigoCliente != 0) {
                Cliente cliente = new Cliente();
                cliente = service.ClienteService.carregar(codigoCliente);
                
                this.cadastroCarteirinha.getjFormattedTextFieldCPF().setText(cliente.getCpf());
                this.cadastroCarteirinha.getjTextFieldNome().setText(cliente.getNome());
            }
        }
    }

}
