
package controller;

//import Dao.EnderecoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import model.bo.Cliente;
import model.bo.Endereco;
import service.EnderecoService;
import view.BuscaCliente;
import view.BuscaEndereco;
import view.CadastroCliente;
import view.CadastroEndereco;
import view.Resposta;

public class ControllerCadastroCliente implements ActionListener {

    CadastroCliente cadastroCliente;
    public static int codigoCliente, codigoEndereco, idEndereco;

    public ControllerCadastroCliente(CadastroCliente cadastroCliente) {
        this.cadastroCliente = cadastroCliente;

        this.cadastroCliente.getjButtonNovo().addActionListener(this);
        this.cadastroCliente.getjButtonSair().addActionListener(this);
        this.cadastroCliente.getjButtonCancelar().addActionListener(this);
        this.cadastroCliente.getjButtonSalvar().addActionListener(this);
        this.cadastroCliente.getjButtonConsultar().addActionListener(this);
        this.cadastroCliente.getjButtonPesquisarCep().addActionListener(this);
        this.cadastroCliente.getjButtonAdicionarCep().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroCliente.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getjPanelDados());

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCliente.getjButtonNovo()) {
            
            utilities.Utilities.ativa(false, this.cadastroCliente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroCliente.getjPanelDados());
            this.cadastroCliente.getjTextFieldID().setEditable(false);
            
        } else if (e.getSource() == this.cadastroCliente.getjButtonSair()) {
            this.cadastroCliente.dispose();

        } else if (e.getSource() == this.cadastroCliente.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroCliente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getjPanelDados());

            
            
            
        } else if (e.getSource() == this.cadastroCliente.getjButtonSalvar()) {
            
            Cliente cliente = new Cliente();
            
            cliente.setNome(this.cadastroCliente.getjTextFieldNome().getText());
            cliente.setCpf(this.cadastroCliente.getjFormattedTextFieldCPF().getText());
            cliente.setRg(this.cadastroCliente.getjFormattedTextFieldRg().getText());
            cliente.setMatricula(this.cadastroCliente.getjTextFieldMatricula().getText());
            cliente.setFone1(this.cadastroCliente.getjFormattedTextFieldFone1().getText());
            cliente.setFone2(this.cadastroCliente.getjFormattedTextFieldFone2().getText());
            cliente.setEmail(this.cadastroCliente.getjTextFieldEmail().getText());
            cliente.setComplementoEndereco(this.cadastroCliente.getjTextFieldComplementoEndereco().getText());
            cliente.setStatus(this.cadastroCliente.getjCheckBoxStatus().isSelected());
            cliente.setDataNascimento(this.cadastroCliente.getjFormattedTextFieldDataNascimento().getText());
            
            
            /*  IMPORTANTE  !!!  */
            //cliente.setEndereco(Dao.ClasseDados.enderecos.get(idEndereco));
            
            /*  Pra pegar o endereço da parte Endereço e setar no cliente */
            cliente.setEndereco(EnderecoService.carregar(idEndereco));
            
            if(this.cadastroCliente.getjTextFieldID().getText().equalsIgnoreCase("")){
                service.ClienteService.adicionar(cliente);
             
            }else {
                
                cliente.setId(Integer.parseInt(this.cadastroCliente.getjTextFieldID().getText()));
                service.ClienteService.atualizar(cliente);

            }
            
            utilities.Utilities.ativa(true, cadastroCliente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroCliente.getjPanelDados());
           
            
            
            
                     
            
        } else if (e.getSource() == this.cadastroCliente.getjButtonConsultar()) {
            codigoCliente = 0;
            BuscaCliente buscaCliente = new BuscaCliente(null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            buscaCliente.setVisible(true);
            
            if (codigoCliente != 0) {
                
                Cliente cliente = new Cliente();
                cliente = service.ClienteService.carregar(codigoCliente);
                
                utilities.Utilities.ativa(false, cadastroCliente.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroCliente.getjPanelDados());
           
                this.cadastroCliente.getjTextFieldID().setText(cliente.getId() + "");
                this.cadastroCliente.getjTextFieldNome().setText(cliente.getNome());
                this.cadastroCliente.getjTextFieldEmail().setText(cliente.getEmail());
                this.cadastroCliente.getjTextFieldLogradouro().setText(cliente.getComplementoEndereco());
                this.cadastroCliente.getjTextFieldMatricula().setText(cliente.getMatricula());
                this.cadastroCliente.getjFormattedTextFieldFone1().setText(cliente.getFone1());
                this.cadastroCliente.getjFormattedTextFieldFone2().setText(cliente.getFone2());
                this.cadastroCliente.getjCheckBoxStatus().setSelected(true);
                this.cadastroCliente.getjFormattedTextFieldDataNascimento().setText(cliente.getDataNascimento());
                //this.cadastroCliente.getjFormattedTextFieldCEP().setText(cliente.getEndereco());
                this.cadastroCliente.getjFormattedTextFieldCPF().setText(cliente.getCpf());
                this.cadastroCliente.getjFormattedTextFieldRg().setText(cliente.getRg());
                this.cadastroCliente.getjTextFieldID().setEditable(false);

                
            }
            
            
            
            

        } else if (e.getSource() == this.cadastroCliente.getjButtonPesquisarCep()) {
            BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
           // buscaEndereco.addWindowListener(disposeListenerEndereco);
            buscaEndereco.setVisible(true);
            
        } else if (e.getSource() == this.cadastroCliente.getjButtonAdicionarCep()) {
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            cadastroEndereco.setVisible(true);
            
        }
    }

}
