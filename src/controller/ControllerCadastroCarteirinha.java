
package controller;

import static controller.ControllerCadastroCliente.codigoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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

        utilities.Utilities.ativa(true, this.cadastroCarteirinha.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getjPanelDados());

    }
    
    
     WindowListener disposeListener = new WindowAdapter() {
        
        @Override
        public void windowClosed(WindowEvent e){
            
            if(codigo!=0){
                Carteirinha carteirinha = new Carteirinha();
                carteirinha=Dao.ClasseDados.carteirinhas.get(codigo-1);
                utilities.Utilities.ativa(false, cadastroCarteirinha.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroCarteirinha.getjPanelDados());
                
                cadastroCarteirinha.getjTextFieldID().setText(carteirinha.getId()+"");
                cadastroCarteirinha.getjTextFieldCodBarra().setText(carteirinha.getCodigoBarra());
                cadastroCarteirinha.getjFormattedTextFieldDataGeracao().setText(carteirinha.getDataGeracao());
                cadastroCarteirinha.getjFormattedTextFieldDataCancelamento().setText(carteirinha.getDataCancelamento());
                cadastroCarteirinha.getjTextFieldID().setText(carteirinha.getCliente().getId()+"");
                cadastroCarteirinha.getjTextFieldNome().setText(carteirinha.getCliente().getNome());
                
                cadastroCarteirinha.getjTextFieldID().setEnabled(false);
                cadastroCarteirinha.getjTextFieldID().setEnabled(false);
                cadastroCarteirinha.getjTextFieldNome().setEnabled(false);
                
                
            }
        }
    };
    
    WindowListener disposeListenerCliente = new WindowAdapter() {
        
        @Override
        public void windowClosed(WindowEvent e){
            if(codigoCliente!=0){
            Cliente cliente = new Cliente();
            cliente=Dao.ClasseDados.clientes.get(codigoCliente-1);
            idCliente=cliente.getId()-1;
            
            cadastroCarteirinha.getjTextFieldID().setText(cliente.getId()+"");
            cadastroCarteirinha.getjTextFieldNome().setText(cliente.getNome());
            
            cadastroCarteirinha.getjTextFieldID().setEnabled(false);
            cadastroCarteirinha.getjTextFieldNome().setEnabled(false);
        }
        }
    };
    
    
    
    
    
    
    

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
            utilities.Utilities.ativa(true, cadastroCarteirinha.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroCarteirinha.getjPanelDados());

            Carteirinha carteirinha = new Carteirinha();
            
            carteirinha.setId(Dao.ClasseDados.carteirinhas.size()+1);
            carteirinha.setDataGeracao(this.cadastroCarteirinha.getjFormattedTextFieldDataGeracao().getText());
            carteirinha.setDataCancelamento(this.cadastroCarteirinha.getjFormattedTextFieldDataCancelamento().getText());
            carteirinha.setCodigoBarra(this.cadastroCarteirinha.getjTextFieldCodBarra().getText());
            carteirinha.setCliente(Dao.ClasseDados.clientes.get(idCliente));
            Resposta resposta=new Resposta(null, true);
            ControllerResposta controllerResposta= new ControllerResposta(resposta);
            
            if(this.cadastroCarteirinha.getjTextFieldID().getText().equalsIgnoreCase("")){
                Dao.ClasseDados.carteirinhas.add(carteirinha);
                controllerResposta.codigoFB=5;
                controllerResposta.cadastroClasse();            
            }else{
                 int index = Integer.parseInt(this.cadastroCarteirinha.getjTextFieldID().getText())-1;
                 
                 Dao.ClasseDados.carteirinhas.get(index).setCliente(Dao.ClasseDados.clientes.get(idCliente));
                 
                 Dao.ClasseDados.carteirinhas.get(index).setCodigoBarra(this.cadastroCarteirinha.getjTextFieldCodBarra().getText());
                 Dao.ClasseDados.carteirinhas.get(index).setDataCancelamento(this.cadastroCarteirinha.getjFormattedTextFieldDataCancelamento().getText());
                 Dao.ClasseDados.carteirinhas.get(index).setDataGeracao(this.cadastroCarteirinha.getjFormattedTextFieldDataGeracao().getText());
                 controllerResposta.codigoFB=5;
                 controllerResposta.atualizacaoClasse();
            }
            
            //resposta.setVisible(true);
            Dao.ClasseDados.carteirinhas.add(carteirinha);
            // para salvar os dados na outra interface
            
            
            
            
            
        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonConsultar()) {
            BuscaCarteirinha buscaCarteirinha = new BuscaCarteirinha(null, true);
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(buscaCarteirinha);
            buscaCarteirinha.addWindowListener(disposeListener);
            buscaCarteirinha.setVisible(true);

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonAdicionarCPF()) {
            CadastroCliente cadastroCliente = new CadastroCliente();
            ControllerCadastroCliente controllerCadastroCliente = new ControllerCadastroCliente(cadastroCliente);
            cadastroCliente.setVisible(true);

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonPesquisarCPF()) {
            BuscaCliente buscaCliente = new BuscaCliente(null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            buscaCliente.setVisible(true);
        }
    }

}
