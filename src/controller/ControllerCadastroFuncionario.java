
package controller;

import static Dao.ClasseDados.funcionarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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

        utilities.Utilities.ativa(true, this.cadastroFuncionario.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getjPanelDados());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == this.cadastroFuncionario.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getjPanelDados());
            
            this.cadastroFuncionario.getjTextFieldID().setEnabled(false);
            //this.cadastroFuncionario.getUf().setEnabled(false);
            this.cadastroFuncionario.getjTextFieldBairro().setEnabled(false);
            this.cadastroFuncionario.getjTextFieldCidade().setEnabled(false);

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonSair()) {
            this.cadastroFuncionario.dispose();

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getjPanelDados());

            
            
            
            
            
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
            funcionario.setSenha(this.cadastroFuncionario.getjPasswordFieldSenhaUsuario().getToolTipText());
            
            
            
            //funcionario.setEndereco(Dao.ClasseDados.enderecos.get(idEndereco));
            
            utilities.Utilities.ativa(true, cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getjPanelDados());
            
            if (this.cadastroFuncionario.getjTextFieldID().getText().equalsIgnoreCase("")){
                service.FuncionarioService.adicionar(funcionario);
            
            } else {
                funcionario.setId(Integer.parseInt(this.cadastroFuncionario.getjTextFieldID().getText()));
                service.FuncionarioService.atualizar(funcionario);
                
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
                
                
            
            }
            
           
            
             
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonPesquisarCep()){
             BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
             ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
             buscaEndereco.setVisible(true);
                
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonAdicionarCep()){
             CadastroEndereco cadastroEndereco = new CadastroEndereco();
             ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
             cadastroEndereco.setVisible(true);
        }
    }

}
