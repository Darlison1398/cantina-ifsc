
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

    
    
        WindowListener disposeListener = new WindowAdapter() {

        @Override
        public void windowClosed(WindowEvent e) {
            if (codigoFuncionario != 0) {
                Funcionario funcionario = new Funcionario();
                funcionario = Dao.ClasseDados.funcionarios.get(codigoFuncionario -1); // prestar atenção aqui
                
               
                utilities.Utilities.ativa(false, cadastroFuncionario.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroFuncionario.getjPanelDados());

                cadastroFuncionario.getjTextFieldID().setText(funcionario.getId()+"");
                cadastroFuncionario.getjTextFieldNome().setText(funcionario.getNome());
                //cadastroFuncionario.getj.setText(funcionario.getDataNascimento());
                cadastroFuncionario.getjFormattedTextFieldCPF().setText(funcionario.getCpf());
                cadastroFuncionario.getjFormattedTextFieldRg().setText(funcionario.getRg());
                cadastroFuncionario.getjFormattedTextFieldFone1().setText(funcionario.getFone1());
                cadastroFuncionario.getjFormattedTextFieldFone2().setText(funcionario.getFone2());
                cadastroFuncionario.getjTextFieldUsuario().setText(funcionario.getUsuario());

                cadastroFuncionario.getjFormattedTextFieldCEP().setText(funcionario.getEndereco().getCep());
                //cadastroFuncionario.getUf().setText(funcionario.getEndereco().getCidade().getUf());
                cadastroFuncionario.getjTextFieldCidade().setText(funcionario.getEndereco().getCidade().getDescricao());
                cadastroFuncionario.getjTextFieldBairro().setText(funcionario.getEndereco().getBairro().getDescricao());
                cadastroFuncionario.getjTextFieldLogradouro().setText(funcionario.getEndereco().getLogradouro());
                cadastroFuncionario.getjTextFieldComplementoEndereco().setText(funcionario.getComplementoEndereco());

                cadastroFuncionario.getjTextFieldID().setEnabled(false);
                //cadastroFuncionario.getUf().setEnabled(false);
                cadastroFuncionario.getjTextFieldBairro().setEnabled(false);
                cadastroFuncionario.getjTextFieldCidade().setEnabled(false);
                cadastroFuncionario.getjTextFieldLogradouro().setEnabled(false);
            }
        }
    };

    WindowListener disposeListenerEndereco = new WindowAdapter() {

        @Override
        public void windowClosed(WindowEvent e) {
            if (codigoEndereco != 0) {
                Endereco endereco = new Endereco();
                endereco = Dao.ClasseDados.enderecos.get(codigoEndereco -1); // qualquer coisa, tirar esse -1;
                idEndereco = endereco.getId() - 1;
                utilities.Utilities.ativa(false, cadastroFuncionario.getjPanelBotoes());

                cadastroFuncionario.getjFormattedTextFieldCEP().setText(endereco.getCep());
                cadastroFuncionario.getjTextFieldBairro().setText(endereco.getBairro().getDescricao());
                cadastroFuncionario.getjTextFieldCidade().setText(endereco.getCidade().getDescricao());
                cadastroFuncionario.getjTextFieldLogradouro().setText(endereco.getLogradouro());
                //cadastroFuncionario.getUf().setText(endereco.getCidade().getDescricao());

            }
        }

    };
    /*WindowListener disposeListenerSenha = new WindowAdapter() {
        
        @Override
        public void windowClosed(WindowEvent e){
           if (condicaoCadastro!=0){
            Dao.ClasseDados.funcionarios.get(idSenha).setSenha(senha);
            DAO.Persiste.funcionarios.get(idSenha).setUsuario(usuario);
            
            Feedback feedback=new Feedback();
            FeedbackController feedbackController= new FeedbackController(feedback);
            
            if(condicao==1){
                feedbackController.codigoFB=7;
                feedbackController.cadastroClasse();
            }else if(condicao==2){
                feedbackController.codigoFB=7;
                feedbackController.atualizacaoClasse();
            }
            feedback.setVisible(true);
            Utilities.active(true, funcionarioRegistro.getPainelBotoes());
            Utilities.limpaComponentes(false, funcionarioRegistro.getPainelDados());
            }
            
            
           // JOptionPane.showMessageDialog(null, "Seu usuário foi criado com sucesso, seus dados de login são, Login: "+DAO.Persiste.funcionarios.get(idSenha).getUsuario()+", Senha: "+DAO.Persiste.funcionarios.get(idSenha).getSenha());
        }
    };*/

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == this.cadastroFuncionario.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getjPanelDados());
            
            this.cadastroFuncionario.getjTextFieldID().setEnabled(false);
            //this.cadastroFuncionario.getUf().setEnabled(false);
            this.cadastroFuncionario.getjTextFieldBairro().setEnabled(false);
            this.cadastroFuncionario.getjTextFieldCidade().setEnabled(false);
            this.cadastroFuncionario.getjTextFieldLogradouro().setEnabled(false);
            

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonSair()) {
            this.cadastroFuncionario.dispose();

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getjPanelDados());

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonSalvar()) {

            Funcionario funcionario = new Funcionario();
            
            funcionario.setId(Dao.ClasseDados.funcionarios.size()+1);
            funcionario.setNome(this.cadastroFuncionario.getjTextFieldNome().getText());
            funcionario.setCpf(this.cadastroFuncionario.getjFormattedTextFieldCPF().getText());
            funcionario.setRg(this.cadastroFuncionario.getjFormattedTextFieldRg().getText());
            funcionario.setFone1(this.cadastroFuncionario.getjFormattedTextFieldFone1().getText());
            funcionario.setFone2(this.cadastroFuncionario.getjFormattedTextFieldFone2().getText());
            funcionario.setEmail(this.cadastroFuncionario.getjTextFieldUsuario().getText());
            funcionario.setEndereco(Dao.ClasseDados.enderecos.get(idEndereco));
            
            Resposta resposta = new Resposta(null ,true);
            ControllerResposta controllerResposta = new ControllerResposta(resposta);
            
            utilities.Utilities.ativa(true, cadastroFuncionario.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getjPanelDados());
            
            if (this.cadastroFuncionario.getjTextFieldID().getText().equalsIgnoreCase("")){
                Dao.ClasseDados.funcionarios.add(funcionario);
                controllerResposta.codigoFB=9;
                controllerResposta.cadastroClasse();
            
            } else {
                
                int index = Integer.parseInt(this.cadastroFuncionario.getjTextFieldID().getText())-1;
                
                Dao.ClasseDados.funcionarios.get(index).setNome(this.cadastroFuncionario.getjTextFieldNome().getText());
                Dao.ClasseDados.funcionarios.get(index).setCpf(this.cadastroFuncionario.getjFormattedTextFieldCPF().getText());
                Dao.ClasseDados.funcionarios.get(index).setRg(this.cadastroFuncionario.getjFormattedTextFieldRg().getText());
                Dao.ClasseDados.funcionarios.get(index).setFone1(this.cadastroFuncionario.getjFormattedTextFieldFone1().getText());
                Dao.ClasseDados.funcionarios.get(index).setFone2(this.cadastroFuncionario.getjFormattedTextFieldFone2().getText());
                Dao.ClasseDados.funcionarios.get(index).setUsuario(this.cadastroFuncionario.getjTextFieldUsuario().getText());
                Dao.ClasseDados.funcionarios.get(index).setEndereco(Dao.ClasseDados.enderecos.get(idEndereco));
                
                controllerResposta.codigoFB=9;
                controllerResposta.atualizacaoClasse();
                
            }
            //resposta.setVisible(true);
            //utilities.Utilities.ativa(true, cadastroFuncionario.getjPanelBotoes());
            //utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getjPanelDados());
            
                        
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonConsultar()) {
            BuscaFuncionario buscaFuncionario = new BuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(buscaFuncionario);
            buscaFuncionario.addWindowListener(disposeListener);
            buscaFuncionario.setVisible(true);
             
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonPesquisarCep()){
             BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
             ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
             buscaEndereco.addWindowListener(disposeListenerEndereco);
             buscaEndereco.setVisible(true);
                
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonAdicionarCep()){
             CadastroEndereco cadastroEndereco = new CadastroEndereco();
             ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
             cadastroEndereco.setVisible(true);
        }
    }

}
