
package controller;

import static Dao.ClasseDados.fornecedores;
import static controller.ControllerCadastroCliente.codigoCliente;
import static controller.ControllerCadastroCliente.codigoEndereco;
import static controller.ControllerCadastroCliente.idEndereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import model.bo.Cliente;
import model.bo.Endereco;
import model.bo.Fornecedor;
import view.BuscaEndereco;
import view.BuscaFornecedor;
import view.CadastroEndereco;
import view.CadastroFornecedor;
import view.Resposta;

public class ControllerCadastroFornecedor implements ActionListener {
    
    CadastroFornecedor cadastroFornecedor;
    public static int codigoFornecedor, idFornecedor, codigoEndereco;

    public ControllerCadastroFornecedor(CadastroFornecedor cadastroFornecedor) {
        this.cadastroFornecedor = cadastroFornecedor;
        
        this.cadastroFornecedor.getjButtonNovo().addActionListener(this);
        this.cadastroFornecedor.getjButtonSair().addActionListener(this);
        this.cadastroFornecedor.getjButtonCancelar().addActionListener(this);
        this.cadastroFornecedor.getjButtonSalvar().addActionListener(this);
        this.cadastroFornecedor.getjButtonConsultar().addActionListener(this);
        this.cadastroFornecedor.getjButtonPesquisarCep().addActionListener(this);
        this.cadastroFornecedor.getjButtonAdcionarCep().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.cadastroFornecedor.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());
    }

    WindowListener disposeListener = new WindowAdapter() {

        @Override
        public void windowClosed(WindowEvent e) {

            if (codigoFornecedor != 0) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor = Dao.ClasseDados.fornecedores.get(codigoFornecedor -1);
                utilities.Utilities.ativa(false, cadastroFornecedor.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroFornecedor.getjPanelDados());

                cadastroFornecedor.getjLabelId().setText(fornecedor.getId() + "");
                cadastroFornecedor.getjTNomeFantasia().setText(fornecedor.getNome());
                cadastroFornecedor.getjFCnpj().setText(fornecedor.getCnpj());
                cadastroFornecedor.getjFFone1().setText(fornecedor.getFone1());
                cadastroFornecedor.getjFFone2().setText(fornecedor.getFone2());
                cadastroFornecedor.getjTEmail().setText(fornecedor.getEmail());
                cadastroFornecedor.getjTInscricaoEstadual().setText(fornecedor.getInscricaoEstadual());

                
                cadastroFornecedor.getjFCep().setText(fornecedor.getEndereco().getCep());
                cadastroFornecedor.getjTLogradouro().setText(fornecedor.getEndereco().getLogradouro());
                cadastroFornecedor.getjTCidade().setText(fornecedor.getEndereco().getCidade().getDescricao());
                cadastroFornecedor.getjTBairro().setText(fornecedor.getEndereco().getBairro().getDescricao());
                cadastroFornecedor.getjTComplementoEndereco().setText(fornecedor.getEndereco().getLogradouro());

                cadastroFornecedor.getjLabelId().setEnabled(false);
                //cadastroFornecedor.getUf.setEnabled(false);
                cadastroFornecedor.getjLabelCidade().setEnabled(false);
                cadastroFornecedor.getjLabelBairro().setEnabled(false);
                cadastroFornecedor.getjLabelLograouro().setEnabled(false);
            }
        }

    };
    WindowListener disposeListenerEndereco = new WindowAdapter() {

        @Override
        public void windowClosed(WindowEvent e) {
            if (codigoEndereco != 0) {
                Endereco endereco = new Endereco();
                endereco = Dao.ClasseDados.enderecos.get(codigoEndereco - 1);
                idEndereco=endereco.getId()-1;
                utilities.Utilities.ativa(false, cadastroFornecedor.getjPanelBotoes());
                

                cadastroFornecedor.getjFCep().setText(endereco.getCep());
                cadastroFornecedor.getjTLogradouro().setText(endereco.getLogradouro());
                cadastroFornecedor.getjTCidade().setText(endereco.getCidade().getDescricao());
                cadastroFornecedor.getjTBairro().setText(endereco.getBairro().getDescricao());

            }

        }

    };
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroFornecedor.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroFornecedor.getjPanelDados());
            
            cadastroFornecedor.getjLabelId().setEnabled(false);
            //cadastroFornecedor.getUf.setEnabled(false);
            cadastroFornecedor.getjLabelCidade().setEnabled(false);
            cadastroFornecedor.getjLabelBairro().setEnabled(false);
            cadastroFornecedor.getjLabelLograouro().setEnabled(false);

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonSair()) {
            this.cadastroFornecedor.dispose();

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonSalvar()) {
            
            Fornecedor fornecedor = new Fornecedor();
            
            fornecedor.setId(Dao.ClasseDados.fornecedores.size()+1);
            fornecedor.setInscricaoEstadual(this.cadastroFornecedor.getjTInscricaoEstadual().getText());
            fornecedor.setNome(this.cadastroFornecedor.getjTNomeFantasia().getText());
            fornecedor.setEmail(this.cadastroFornecedor.getjTEmail().getText());
            fornecedor.setCnpj(this.cadastroFornecedor.getjFCnpj().getText());
            fornecedor.setFone1(this.cadastroFornecedor.getjFFone1().getText());
            fornecedor.setFone2(this.cadastroFornecedor.getjFFone2().getText());
            fornecedor.setComplementoEndereco(this.cadastroFornecedor.getjTComplementoEndereco().getText());
            
            fornecedor.setEndereco(Dao.ClasseDados.enderecos.get(idEndereco));
            Resposta resposta =new Resposta(null, true);
            ControllerResposta controllerResposta= new ControllerResposta(resposta);
            
            utilities.Utilities.ativa(true, this.cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());
            
            if(this.cadastroFornecedor.getjLabelId().getText().equalsIgnoreCase("")){
                Dao.ClasseDados.fornecedores.add(fornecedor);
                controllerResposta.codigoFB=8;
                controllerResposta.cadastroClasse();
            }else{
                int index=Integer.parseInt(this.cadastroFornecedor.getjTId().getText())-1;
                
                Dao.ClasseDados.fornecedores.get(index).setNome(this.cadastroFornecedor.getjTNomeFantasia().getText());
                Dao.ClasseDados.fornecedores.get(index).setInscricaoEstadual(this.cadastroFornecedor.getjTInscricaoEstadual().getText());
                Dao.ClasseDados.fornecedores.get(index).setEmail(this.cadastroFornecedor.getjTEmail().getText());
                Dao.ClasseDados.fornecedores.get(index).setCnpj(this.cadastroFornecedor.getjFCnpj().getText());
                Dao.ClasseDados.fornecedores.get(index).setFone1(this.cadastroFornecedor.getjFFone1().getText());
                Dao.ClasseDados.fornecedores.get(index).setFone2(this.cadastroFornecedor.getjFFone2().getText());
                Dao.ClasseDados.fornecedores.get(index).setEndereco(Dao.ClasseDados.enderecos.get(idEndereco));
                Dao.ClasseDados.fornecedores.get(index).setComplementoEndereco(this.cadastroFornecedor.getjTComplementoEndereco().getText());
                
                controllerResposta.codigoFB=8;
                controllerResposta.atualizacaoClasse();
            }
            Dao.ClasseDados.fornecedores.add(fornecedor);
            resposta.setVisible(true);
            utilities.Utilities.ativa(true, cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroFornecedor.getjPanelDados());

            
        } else if (e.getSource() == this.cadastroFornecedor.getjButtonConsultar()) {
            BuscaFornecedor buscaFornecedor= new BuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(buscaFornecedor);
            buscaFornecedor.addWindowListener(disposeListener);
            buscaFornecedor.setVisible(true);

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonPesquisarCep()){
            BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.addWindowListener(disposeListenerEndereco);
            buscaEndereco.setVisible(true);
            
        } else if(e.getSource() == this.cadastroFornecedor.getjButtonAdcionarCep()){
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            cadastroEndereco.setVisible(true);
        }
    }
    
    
    
}
