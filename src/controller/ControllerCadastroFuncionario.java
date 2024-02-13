
package controller;

import static Dao.ClasseDados.funcionarios;
import static controller.ControllerCadastroCliente.codigoEndereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import model.bo.Endereco;
import model.bo.Funcionario;
import view.BuscaEndereco;
import view.BuscaFuncionario;
import view.CadastroEndereco;
import view.CadastroFuncionario;
import view.Resposta;

public class ControllerCadastroFuncionario implements ActionListener {

    CadastroFuncionario cadastroFuncionario;
    public static int codigo, codigoFuncionario, codigoEndereco, idEndereco, idSenha, condicao, condicaoCadastro;


    public ControllerCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;

        this.cadastroFuncionario.getjButtonNovo().addActionListener(this);
        this.cadastroFuncionario.getjButtonSair().addActionListener(this);
        this.cadastroFuncionario.getjButtonCancelar().addActionListener(this);
        this.cadastroFuncionario.getjButtonSalvar().addActionListener(this);
        this.cadastroFuncionario.getjButtonConsultar().addActionListener(this);
        this.cadastroFuncionario.getjButtonAdicionarCep().addActionListener(this);
        this.cadastroFuncionario.getjButtonPesquisarCep().addActionListener(this);
        
        List<Endereco> listaEndereco = new ArrayList<Endereco>();
        listaEndereco = service.EnderecoService.carregar();
        
       
        this.cadastroFuncionario.getjTextFieldBairro().removeAll();
        this.cadastroFuncionario.getjTextFieldCidade().removeAll();
        this.cadastroFuncionario.getjFormattedTextFieldCEP().removeAll();
        this.cadastroFuncionario.getjCUf().removeAll();
        this.cadastroFuncionario.getjTlogradouro().removeAll();
        
        for (Endereco enderecoAtual: listaEndereco) {
            
            this.cadastroFuncionario.getjTextFieldBairro().setText(enderecoAtual.getBairro().getDescricao());
            this.cadastroFuncionario.getjTextFieldCidade().setText(enderecoAtual.getCidade().getDescricao());
            this.cadastroFuncionario.getjFormattedTextFieldCEP().setText(enderecoAtual.getCep());
            this.cadastroFuncionario.getjCUf().addItem(enderecoAtual.getCidade().getUf());
            this.cadastroFuncionario.getjTlogradouro().setText(enderecoAtual.getLogradouro());
        }
        
        utilities.Utilities.ativa(true, this.cadastroFuncionario.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getjPanelDados());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == this.cadastroFuncionario.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getjPanelDados());
            
            this.cadastroFuncionario.getjTextFieldID().setEnabled(false);
            this.cadastroFuncionario.getjTextFieldBairro().setEnabled(false);
            this.cadastroFuncionario.getjTextFieldCidade().setEnabled(false);

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonSair()) {
            this.cadastroFuncionario.dispose();

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getjPanelDados());

            this.cadastroFuncionario.getjCheckBoxStatus().setSelected(false);
            
            
            
            
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonSalvar()) {

            Funcionario funcionario = new Funcionario();
            
            funcionario.setNome(this.cadastroFuncionario.getjTextFieldNome().getText());
            funcionario.setCpf(this.cadastroFuncionario.getjFormattedTextFieldCPF().getText());
            funcionario.setRg(this.cadastroFuncionario.getjFormattedTextFieldRg().getText());
            funcionario.setFone1(this.cadastroFuncionario.getjFormattedTextFieldFone1().getText());
            funcionario.setFone2(this.cadastroFuncionario.getjFormattedTextFieldFone2().getText());
            funcionario.setEmail(this.cadastroFuncionario.getjTextFieldUsuario().getText());
            funcionario.setComplementoEndereco(this.cadastroFuncionario.getjTextFieldComplementoEndereco().getText());
            funcionario.setStatus(this.cadastroFuncionario.getjCheckBoxStatus().isSelected());
            funcionario.setUsuario(this.cadastroFuncionario.getjTextFieldUsuario().getText());
            funcionario.setSenha(this.cadastroFuncionario.getjPasswordFieldSenhaUsuario().getText());
            
            funcionario.setEndereco(service.EnderecoService.carregar(codigoEndereco));
            
            utilities.Utilities.ativa(true, cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getjPanelDados());
            
            if (codigoFuncionario ==0){
                service.FuncionarioService.adicionar(funcionario);
               utilities.Utilities.ativa(true, cadastroFuncionario.getjPanelBotoes());
               utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getjPanelDados());
            
            } else {
                funcionario.setId(codigoFuncionario);
                service.FuncionarioService.atualizar(funcionario);
                utilities.Utilities.ativa(true, cadastroFuncionario.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getjPanelDados());
                
            }
            
            utilities.Utilities.ativa(true, cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getjPanelDados());
            
                        
            
            
            
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonConsultar()) {
            codigoFuncionario = 0;
            BuscaFuncionario buscaFuncionario = new BuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(buscaFuncionario);
            buscaFuncionario.setVisible(true);
            
            
            if (codigoFuncionario != 0) {
                
                Funcionario funcionario = new Funcionario();
                funcionario = service.FuncionarioService.carregar(codigoFuncionario);
                
                utilities.Utilities.ativa(false, cadastroFuncionario.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroFuncionario.getjPanelDados());
                
                this.cadastroFuncionario.getjTextFieldID().setText(funcionario.getId() + "");
                this.cadastroFuncionario.getjTextFieldNome().setText(funcionario.getNome());
                this.cadastroFuncionario.getjTextFieldUsuario().setText(funcionario.getUsuario());
                this.cadastroFuncionario.getjPasswordFieldSenhaUsuario().setText(funcionario.getSenha());
                this.cadastroFuncionario.getjFormattedTextFieldFone1().setText(funcionario.getFone1());
                this.cadastroFuncionario.getjFormattedTextFieldFone2().setText(funcionario.getFone2());
                this.cadastroFuncionario.getjCheckBoxStatus().setSelected(true);
                this.cadastroFuncionario.getjFormattedTextFieldCPF().setText(funcionario.getCpf());
                this.cadastroFuncionario.getjFormattedTextFieldRg().setText(funcionario.getRg());
                this.cadastroFuncionario.getjFormattedTextFieldCEP().setText(funcionario.getEndereco().getCep());
                this.cadastroFuncionario.getjTextFieldCidade().setText(funcionario.getEndereco().getCidade().getDescricao());
                this.cadastroFuncionario.getjTextFieldBairro().setText(funcionario.getEndereco().getBairro().getDescricao());
                this.cadastroFuncionario.getjTextFieldComplementoEndereco().setText(funcionario.getComplementoEndereco());
                this.cadastroFuncionario.getjCUf().setSelectedItem(funcionario.getEndereco().getCidade().getUf());
                this.cadastroFuncionario.getjTlogradouro().setText(funcionario.getEndereco().getLogradouro());
                
                cadastroFuncionario.getjTextFieldID().setEnabled(false);
                cadastroFuncionario.getjTextFieldBairro().setEnabled(false);
                cadastroFuncionario.getjTextFieldCidade().setEnabled(false);
                cadastroFuncionario.getjFormattedTextFieldCEP().setEnabled(false);
                cadastroFuncionario.getjCheckBoxStatus().setEnabled(false);
            
            }
            
           
            
             
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonPesquisarCep()){
            codigoEndereco = 0;
             BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
             ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
             buscaEndereco.setVisible(true);
                  
            if (codigoEndereco !=0) {
                Endereco endereco = new Endereco();
                endereco = service.EnderecoService.carregar(codigoEndereco);
                
                this.cadastroFuncionario.getjTextFieldBairro().setText(endereco.getBairro().getDescricao());
                this.cadastroFuncionario.getjTextFieldCidade().setText(endereco.getCidade().getDescricao());
                this.cadastroFuncionario.getjFormattedTextFieldCEP().setText(endereco.getCep());
                this.cadastroFuncionario.getjCUf().setSelectedItem(endereco.getCidade().getUf());
                this.cadastroFuncionario.getjTlogradouro().setText(endereco.getLogradouro());

                
            }
            
            
             
             
                
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonAdicionarCep()){
             CadastroEndereco cadastroEndereco = new CadastroEndereco();
             ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
             cadastroEndereco.setVisible(true);
        }
    }

}
