
package controller;

//import Dao.EnderecoDAO;
import static controller.ControllerCadastroEndereco.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
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
        
        
        List<Endereco> listaEndereco = new ArrayList<Endereco>();
        listaEndereco = service.EnderecoService.carregar();
        
       
        this.cadastroCliente.getjTextFieldBairro().removeAll();
        this.cadastroCliente.getjTextFieldCidade().removeAll();
        this.cadastroCliente.getjFormattedTextFieldCEP().removeAll();
        this.cadastroCliente.getjTlogradouro().removeAll();
        this.cadastroCliente.getjCUf().removeAll();
     
        
        for (Endereco enderecoAtual : listaEndereco) {
            this.cadastroCliente.getjTextFieldBairro().setText(enderecoAtual.getBairro().getDescricao());
            this.cadastroCliente.getjTextFieldCidade().setText(enderecoAtual.getCidade().getDescricao());
            this.cadastroCliente.getjFormattedTextFieldCEP().setText(enderecoAtual.getCep());
            this.cadastroCliente.getjCUf().addItem(enderecoAtual.getCidade().getUf());
            this.cadastroCliente.getjTlogradouro().setText(enderecoAtual.getLogradouro());
        }

        utilities.Utilities.ativa(true, this.cadastroCliente.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getjPanelDados());

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCliente.getjButtonNovo()) {
            
            utilities.Utilities.ativa(false, this.cadastroCliente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroCliente.getjPanelDados());
            this.cadastroCliente.getjTextFieldID().setEnabled(false);
            //cadastroCliente.getjTIdEndereco().setEnabled(false);
            cadastroCliente.getjTextFieldBairro().setEnabled(false);
            cadastroCliente.getjTextFieldCidade().setEnabled(false);
            cadastroCliente.getjTlogradouro().setEditable(false);
            
        } else if (e.getSource() == this.cadastroCliente.getjButtonSair()) {
            this.cadastroCliente.dispose();

        } else if (e.getSource() == this.cadastroCliente.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroCliente.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getjPanelDados());
            
            this.cadastroCliente.getjCheckBoxStatus().setSelected(false);

            
            
            
            
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
       
            cliente.setEndereco(service.EnderecoService.carregar(codigoEndereco));
             
            if(codigoCliente == 0) {
                service.ClienteService.adicionar(cliente);      
                utilities.Utilities.ativa(true, cadastroCliente.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, cadastroCliente.getjPanelDados());
            } else {
                cliente.setId(codigoCliente);
                service.ClienteService.atualizar(cliente);
                utilities.Utilities.ativa(true, cadastroCliente.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, cadastroCliente.getjPanelDados());
            }
            
            
            
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
                this.cadastroCliente.getjFormattedTextFieldFone1().setText(cliente.getFone1());
                this.cadastroCliente.getjFormattedTextFieldFone2().setText(cliente.getFone2());
                this.cadastroCliente.getjTextFieldEmail().setText(cliente.getEmail());
                this.cadastroCliente.getjCheckBoxStatus().setSelected(true);
                this.cadastroCliente.getjFormattedTextFieldRg().setText(cliente.getRg());
                this.cadastroCliente.getjFormattedTextFieldCPF().setText(cliente.getCpf());
                this.cadastroCliente.getjTextFieldMatricula().setText(cliente.getMatricula());
                this.cadastroCliente.getjFormattedTextFieldDataNascimento().setText(cliente.getDataNascimento());
                this.cadastroCliente.getjFormattedTextFieldCEP().setText(cliente.getEndereco().getCep());
                this.cadastroCliente.getjTextFieldBairro().setText(cliente.getEndereco().getBairro().getDescricao());
                this.cadastroCliente.getjTextFieldCidade().setText(cliente.getEndereco().getCidade().getDescricao());
                this.cadastroCliente.getjTextFieldComplementoEndereco().setText(cliente.getComplementoEndereco());
                this.cadastroCliente.getjCUf().setSelectedItem(cliente.getEndereco().getCidade().getUf());
                this.cadastroCliente.getjTlogradouro().setText(cliente.getEndereco().getLogradouro());
                
                cadastroCliente.getjTextFieldID().setEnabled(false);
                cadastroCliente.getjCheckBoxStatus().setEnabled(false);
                cadastroCliente.getjTextFieldBairro().setEnabled(false);
                cadastroCliente.getjTextFieldCidade().setEnabled(false);
                cadastroCliente.getjFormattedTextFieldCEP().setEnabled(false);
                cadastroCliente.getjTlogradouro().setEditable(false);

                
            }
            
            
            
            

        } else if (e.getSource() == this.cadastroCliente.getjButtonPesquisarCep()) {
            codigoEndereco = 0;
            BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.setVisible(true);
            
            if (codigoEndereco !=0) {
                Endereco endereco = new Endereco();
                endereco = service.EnderecoService.carregar(codigoEndereco);
                
                this.cadastroCliente.getjTextFieldBairro().setText(endereco.getBairro().getDescricao());
                this.cadastroCliente.getjTextFieldCidade().setText(endereco.getCidade().getDescricao());
                this.cadastroCliente.getjFormattedTextFieldCEP().setText(endereco.getCep());
                this.cadastroCliente.getjCUf().setSelectedItem(endereco.getCidade().getUf());
                this.cadastroCliente.getjTlogradouro().setText(endereco.getLogradouro());

                
            }
            
            
            
            
        } else if (e.getSource() == this.cadastroCliente.getjButtonAdicionarCep()) {
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            cadastroEndereco.setVisible(true);
            
        }
    }

}


