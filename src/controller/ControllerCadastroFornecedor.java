
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
import java.util.ArrayList;
import java.util.List;
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
        
         
        List<Endereco> listaEndereco = new ArrayList<Endereco>();
        listaEndereco = service.EnderecoService.carregar();
        
        
        this.cadastroFornecedor.getjTBairro().removeAll();
        this.cadastroFornecedor.getjTCidade().removeAll();
        this.cadastroFornecedor.getjTComplementoEndereco().removeAll();
        this.cadastroFornecedor.getjFCep().removeAll();
        this.cadastroFornecedor.getjCUf().removeAll();
        this.cadastroFornecedor.getjTlogradouro().removeAll();
        
        for (Endereco enderecoAtual : listaEndereco) {
            this.cadastroFornecedor.getjFCep().setText(enderecoAtual.getCep());
            this.cadastroFornecedor.getjTCidade().setText(enderecoAtual.getCidade().getDescricao());
            this.cadastroFornecedor.getjTBairro().setText(enderecoAtual.getBairro().getDescricao());
            this.cadastroFornecedor.getjCUf().addItem(enderecoAtual.getCidade().getUf());
            this.cadastroFornecedor.getjTlogradouro().setText(enderecoAtual.getLogradouro());
        }
        
        
        
        utilities.Utilities.ativa(true, this.cadastroFornecedor.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroFornecedor.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroFornecedor.getjPanelDados());
            
            cadastroFornecedor.getjTId().setEnabled(false);
            cadastroFornecedor.getjTCidade().setEnabled(false);
            cadastroFornecedor.getjTBairro().setEnabled(false);

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonSair()) {
            this.cadastroFornecedor.dispose();

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());
            
            this.cadastroFornecedor.getjCheckBoxInativo().setSelected(false);
            
            
            
        } else if (e.getSource() == this.cadastroFornecedor.getjButtonSalvar()) {
            
            Fornecedor fornecedor = new Fornecedor();
            
            
            
            fornecedor.setInscricaoEstadual(this.cadastroFornecedor.getjTInscricaoEstadual().getText());
            fornecedor.setNome(this.cadastroFornecedor.getjTNomeFantasia().getText());
            fornecedor.setEmail(this.cadastroFornecedor.getjTEmail().getText());
            fornecedor.setCnpj(this.cadastroFornecedor.getjFCnpj().getText());
            fornecedor.setFone1(this.cadastroFornecedor.getjFFone1().getText());
            fornecedor.setFone2(this.cadastroFornecedor.getjFFone2().getText());
            fornecedor.setComplementoEndereco(this.cadastroFornecedor.getjTComplementoEndereco().getText());
            fornecedor.setStatus(this.cadastroFornecedor.getjCheckBoxInativo().isSelected());
            fornecedor.setRazaoSocial(this.cadastroFornecedor.getjTRazaoSocial().getText());
            
            fornecedor.setEndereco(service.EnderecoService.carregar(codigoEndereco));
            
            if(codigoFornecedor == 0){
                service.FornecedorService.adicionar(fornecedor);
                utilities.Utilities.ativa(true, this.cadastroFornecedor.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());
                
            }else{
                fornecedor.setId(codigoFornecedor);
                service.FornecedorService.atualizar(fornecedor);
                utilities.Utilities.ativa(true, this.cadastroFornecedor.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getjPanelDados());
            }
            
            utilities.Utilities.ativa(true, cadastroFornecedor.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroFornecedor.getjPanelDados());

            
            
            
            
            
            
            
        } else if (e.getSource() == this.cadastroFornecedor.getjButtonConsultar()) {
            codigoFornecedor = 0;
            BuscaFornecedor buscaFornecedor= new BuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(buscaFornecedor);
            buscaFornecedor.setVisible(true);
            
            if (codigoFornecedor != 0) {
                
                Fornecedor fornecedor = new Fornecedor();
                fornecedor = service.FornecedorService.carregar(codigoFornecedor);
                
                utilities.Utilities.ativa(false, cadastroFornecedor.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroFornecedor.getjPanelDados());
                
                this.cadastroFornecedor.getjTId().setText(fornecedor.getId() + "");
                this.cadastroFornecedor.getjTNomeFantasia().setText(fornecedor.getNome());
                this.cadastroFornecedor.getjTEmail().setText(fornecedor.getEmail());
                this.cadastroFornecedor.getjFFone1().setText(fornecedor.getFone1());
                this.cadastroFornecedor.getjFFone2().setText(fornecedor.getFone2());
                this.cadastroFornecedor.getjTInscricaoEstadual().setText(fornecedor.getInscricaoEstadual());
                this.cadastroFornecedor.getjTRazaoSocial().setText(fornecedor.getRazaoSocial());
                this.cadastroFornecedor.getjFCnpj().setText(fornecedor.getCnpj());
                this.cadastroFornecedor.getjFCep().setText(fornecedor.getEndereco().getCep());
                this.cadastroFornecedor.getjTCidade().setText(fornecedor.getEndereco().getCidade().getDescricao());
                this.cadastroFornecedor.getjTBairro().setText(fornecedor.getEndereco().getBairro().getDescricao());
                this.cadastroFornecedor.getjTComplementoEndereco().setText(fornecedor.getComplementoEndereco());
                this.cadastroFornecedor.getjCUf().setSelectedItem(fornecedor.getEndereco().getCidade().getUf());
                this.cadastroFornecedor.getjTlogradouro().setText(fornecedor.getEndereco().getLogradouro());
                
                this.cadastroFornecedor.getjCheckBoxInativo().setSelected(true);
                
                cadastroFornecedor.getjTId().setEnabled(false);
                cadastroFornecedor.getjCheckBoxInativo().setEnabled(false);
                cadastroFornecedor.getjTCidade().setEnabled(false);
                cadastroFornecedor.getjTBairro().setEnabled(false);
                cadastroFornecedor.getjFCep().setEnabled(false);
                        
                
             
                
            }
            
            
            
            
            
            
            

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonPesquisarCep()){
            codigoEndereco = 0;
            BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.setVisible(true);
            
            if (codigoEndereco != 0) {
                Endereco endereco = new Endereco();
                endereco = service.EnderecoService.carregar(codigoEndereco);
                
                this.cadastroFornecedor.getjFCep().setText(endereco.getCep());
                this.cadastroFornecedor.getjTCidade().setText(endereco.getCidade().getDescricao());
                this.cadastroFornecedor.getjTBairro().setText(endereco.getBairro().getDescricao());
                this.cadastroFornecedor.getjCUf().setSelectedItem(endereco.getCidade().getUf());
                this.cadastroFornecedor.getjTlogradouro().setText(endereco.getLogradouro());

                
                
            }
            
            
            
        }
    }
    
    
    
}
