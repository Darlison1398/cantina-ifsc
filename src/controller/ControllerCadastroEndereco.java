
package controller;

import Dao.ClasseDados;
import static controller.ControllerCadastroBairro.codigo;
import static controller.ControllerCadastroCidade.codigoCidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Endereco;
import view.BuscaBairro;
import view.BuscaCidade;
import view.BuscaEndereco;
//import view.BuscaEndereco2;
import view.CadastroBairro;
import view.CadastroCidade;
import view.CadastroEndereco;
import view.Resposta;

public class ControllerCadastroEndereco implements ActionListener {
    
    
    CadastroEndereco cadastroEndereco;
    public static int codigoCidade, codigoBairro, codigoEndereco, codigo;
    
   
    
    public ControllerCadastroEndereco(CadastroEndereco cadastroEndereco) {
        
        this.cadastroEndereco = cadastroEndereco;
        
        this.cadastroEndereco.getjButtonNovo().addActionListener(this);
        this.cadastroEndereco.getjButtonSair().addActionListener(this);
        this.cadastroEndereco.getjButtonCancelar().addActionListener(this);
        this.cadastroEndereco.getjButtonSalvar().addActionListener(this);
        this.cadastroEndereco.getjButtonConsultar().addActionListener(this);
        this.cadastroEndereco.getjButtonAdicionarBairro().addActionListener(this);
        this.cadastroEndereco.getjButtonBuscaBairro().addActionListener(this);
        this.cadastroEndereco.getjButtonAdicionarCidade().addActionListener(this);
        this.cadastroEndereco.getjButtonBuscaCidade().addActionListener(this);

                
        List<Cidade> listaCidades = new ArrayList<Cidade>();
        List<Bairro> listaBairros = new ArrayList<Bairro>();
        
        listaCidades = service.CidadeService.carregar();
        listaBairros = service.BairroService.carregar();

        this.cadastroEndereco.getjTDescricaoBairro().removeAll();
        this.cadastroEndereco.getjTDescricaoCidade().removeAll();
        this.cadastroEndereco.getjCUf().removeAll();
        this.cadastroEndereco.getjTlogradouro().removeAll();

        for (Bairro bairroAtual : listaBairros) {
            this.cadastroEndereco.getjTDescricaoBairro().setText(bairroAtual.getDescricao());
        }

        for (Cidade cidadeAtual : listaCidades) {
            this.cadastroEndereco.getjTDescricaoCidade().setText(cidadeAtual.getDescricao());
            this.cadastroEndereco.getjCUf().addItem(cidadeAtual.getUf()); 
        }

        utilities.Utilities.ativa(true, this.cadastroEndereco.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getjPanelDados());
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroEndereco.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroEndereco.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroEndereco.getjPanelDados());
            this.cadastroEndereco.getjTId().setEnabled(false);
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonSair()) {
            this.cadastroEndereco.dispose();
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroEndereco.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getjPanelDados());
            
            this.cadastroEndereco.getjCheckBoxStatus().setSelected(false);
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonSalvar()) {
            
            Endereco endereco = new Endereco();
            endereco.setCep(this.cadastroEndereco.getjFCep().getText());
            endereco.setStatus(this.cadastroEndereco.getjCheckBoxStatus().isSelected());
            endereco.setLogradouro(this.cadastroEndereco.getjTlogradouro().getText());
            
            
            endereco.setBairro(service.BairroService.carregar(codigoBairro));
            endereco.setCidade(service.CidadeService.carregar(codigoCidade));
            
            if (codigoEndereco == 0 ) {
                service.EnderecoService.adicionar(endereco);        
                utilities.Utilities.ativa(true, cadastroEndereco.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(false, cadastroEndereco.getjPanelDados());
                
            } else {
                endereco.setId(codigoEndereco);
                service.EnderecoService.atualizar(endereco);                 
               utilities.Utilities.ativa(true, this.cadastroEndereco.getjPanelBotoes());
               utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getjPanelDados());
                
            }
          
         
        } else if (e.getSource() == this.cadastroEndereco.getjButtonConsultar()) {
            codigoEndereco = 0;
            
            BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.setVisible(true);
            
            if (codigoEndereco != 0){
                Endereco endereco = new Endereco();
                endereco = service.EnderecoService.carregar(codigoEndereco);
                
                utilities.Utilities.ativa(false, cadastroEndereco.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroEndereco.getjPanelDados());
                
                this.cadastroEndereco.getjTId().setText(endereco.getId() + "");
                this.cadastroEndereco.getjFCep().setText(endereco.getCep());
                this.cadastroEndereco.getjCheckBoxStatus().setSelected(true);
                this.cadastroEndereco.getjTlogradouro().setText(endereco.getLogradouro());
           
                this.cadastroEndereco.getjTBairro().setText(String.valueOf(endereco.getBairro().getId()));
                this.cadastroEndereco.getjTCodigoCidade().setText(String.valueOf(endereco.getCidade().getId()));

                this.cadastroEndereco.getjTDescricaoBairro().setText(endereco.getBairro().getDescricao());
                this.cadastroEndereco.getjTDescricaoCidade().setText(endereco.getCidade().getDescricao());
                this.cadastroEndereco.getjCUf().setSelectedItem(endereco.getCidade().getUf());
                
                
                cadastroEndereco.getjTId().setEnabled(false);
                cadastroEndereco.getjCheckBoxStatus().setEnabled(false);
                cadastroEndereco.getjTBairro().setEnabled(false);
                cadastroEndereco.getjTCodigoCidade().setEnabled(false);
                cadastroEndereco.getjTDescricaoBairro().setEditable(false);
                cadastroEndereco.getjTDescricaoCidade().setEditable(false);
                
            }
           
            
            
            
            
            
            
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonAdicionarBairro()) {
            CadastroBairro cadastroBairro = new CadastroBairro();
            ControllerCadastroBairro controllerCadastroBairro = new ControllerCadastroBairro(cadastroBairro);
            cadastroBairro.setVisible(true);
            
        } else if(e.getSource() == this.cadastroEndereco.getjButtonAdicionarCidade()){
            CadastroCidade cadastroCidade = new CadastroCidade();
            ControllerCadastroCidade controllerCadastroCidade = new ControllerCadastroCidade(cadastroCidade);
            cadastroCidade.setVisible(true);
        } 
        
        
        
        
        else if (e.getSource() == this.cadastroEndereco.getjButtonBuscaBairro()) {
            
            codigoBairro = 0; 
            BuscaBairro buscaBairro = new BuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            buscaBairro.setVisible(true);
            
            if(codigoBairro !=0){
                Bairro bairro = new Bairro();
                bairro = service.BairroService.carregar(codigoBairro);
                
                
                this.cadastroEndereco.getjTBairro().setText(bairro.getId()+ "");
                this.cadastroEndereco.getjTDescricaoBairro().setText(bairro.getDescricao());
                this.cadastroEndereco.getjTId().setEditable(false);
               
               
            
            }
            
            
                 
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonBuscaCidade()) {
            codigoCidade = 0; 
     
            BuscaCidade buscaCidade = new BuscaCidade(null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            buscaCidade.setVisible(true);
            
            if(codigoCidade !=0){
                
                Cidade cidade = new Cidade();
                cidade = service.CidadeService.carregar(codigoCidade);
                
                
                this.cadastroEndereco.getjTCodigoCidade().setText(cidade.getId()+"");
                this.cadastroEndereco.getjTDescricaoCidade().setText(cidade.getDescricao());
                this.cadastroEndereco.getjCUf().setSelectedItem(cidade.getUf());

                this.cadastroEndereco.getjTId().setEditable(false);
            
            }
           
            
            
            
        } 
        
    }
    
}
