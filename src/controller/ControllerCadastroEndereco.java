
package controller;

import Dao.ClasseDados;
import static controller.ControllerCadastroBairro.codigo;
import static controller.ControllerCadastroCidade.codigoCidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
    public static int codigoCidade, codigoBairro, codigoEndereco;
    public static int idCidade, idBairro;
    private Cidade cidadeSelecionada;
    private Bairro bairroSelecionado;
    
   
    
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
        this.cadastroEndereco.getjBCompletar().addActionListener(this); /* Nesse botão, devo puxar o ID da Cidade, e
        o ID do Bairro. Ao consultar eles, se houver cidade e bairro que tenham o mesmo cep que foi adicionado, devo
        adicionar automaticamente esses dados na parte id cidade e no id bairro;
        */
        
        cidadeSelecionada = new Cidade();
        bairroSelecionado = new Bairro();
        
        utilities.Utilities.ativa(true, this.cadastroEndereco.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getjPanelDados());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroEndereco.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroEndereco.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroEndereco.getjPanelDados());
            this.cadastroEndereco.getjTId().setEditable(false);
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonSair()) {
            this.cadastroEndereco.dispose();
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroEndereco.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getjPanelDados());
            
            
            
            
            
            
            
            
            
            
      
        } else if (e.getSource() == this.cadastroEndereco.getjButtonSalvar()) {
            
            Endereco endereco = new Endereco();
            endereco.setCep(this.cadastroEndereco.getjFCep().getText());
            endereco.setLogradouro(this.cadastroEndereco.getjTLogradouro().getText());
            endereco.setStatus(this.cadastroEndereco.getjCheckBoxStatus().isSelected());
            //.setBairro(service.BairroService.carregar(idBairro));
            //endereco.setCidade(service.CidadeService.carregar(idCidade));
            
            // Suponha que você tenha obtido os IDs de bairro e cidade em variáveis idBairro e idCidade
            // Vamos carregar os objetos de bairro e cidade usando os serviços apropriados

            Bairro bairro = service.BairroService.carregar(idBairro);
            Cidade cidade = service.CidadeService.carregar(idCidade);

            // Agora, associe os objetos de bairro e cidade ao objeto de endereço
            endereco.setBairro(this.bairroSelecionado);
            endereco.setCidade(this.cidadeSelecionada);
            
            
            if(this.cadastroEndereco.getjTId().getText().equalsIgnoreCase("")){
                
                service.EnderecoService.adicionar(endereco);
                
            }else{
                endereco.setId(Integer.parseInt(this.cadastroEndereco.getjTId().getText()));
                service.EnderecoService.atualizar(endereco); 
            }
            
            utilities.Utilities.ativa(true, cadastroEndereco.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroEndereco.getjPanelDados());
            
            
            
         
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
                this.cadastroEndereco.getjTLogradouro().setText(endereco.getLogradouro());
                this.cadastroEndereco.getjCheckBoxStatus().setSelected(true);
           
                this.cadastroEndereco.getjTBairro().setText(String.valueOf(endereco.getBairro().getId()));
                this.cadastroEndereco.getjTCodigoCidade().setText(String.valueOf(endereco.getCidade().getId()));

                this.cadastroEndereco.getjTDescricaoBairro().setText(endereco.getCidade().getDescricao());
                this.cadastroEndereco.getjTDescricaoCidade().setText(endereco.getBairro().getDescricao());
                
                
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
            
            codigo = 0; 
            BuscaBairro buscaBairro = new BuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            buscaBairro.setVisible(true);
            
            if(codigo !=0){
                Bairro bairro = new Bairro();
                bairro = service.BairroService.carregar(codigo);
                
                //utilities.Utilities.ativa(false, cadastroEndereco.getjPanelBotoes());
                //utilities.Utilities.limpaComponentes(true, cadastroEndereco.getjPanelDados());
                
                this.cadastroEndereco.getjTBairro().setText(bairro.getId()+ "");
                this.cadastroEndereco.getjTDescricaoBairro().setText(bairro.getDescricao());
                this.cadastroEndereco.getjTId().setEditable(false);
               
               
            
            }
            
            //System.out.println("Buscando dados do bairro: "   + codigo);
            
                 
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonBuscaCidade()) {
            codigoCidade = 0;
     
            BuscaCidade buscaCidade = new BuscaCidade(null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            buscaCidade.setVisible(true);
            
            if(codigoCidade !=0){
                
                Cidade cidade = new Cidade();
                cidade = service.CidadeService.carregar(codigoCidade);
                
                //utilities.Utilities.ativa(false, cadastroEndereco.getjPanelBotoes());
                //utilities.Utilities.limpaComponentes(true, cadastroEndereco.getjPanelDados());
                
                this.cadastroEndereco.getjTCodigoCidade().setText(cidade.getId()+"");
                this.cadastroEndereco.getjTDescricaoCidade().setText(cidade.getDescricao());
                //this.cadastroCidade.getjComboBoxUf().setText(cidade.getUf());
                this.cadastroEndereco.getjTId().setEditable(false);
            
            }
           
            
            
            
        } else if (e.getSource() == this.cadastroEndereco.getjBCompletar()){
            //JOptionPane.showMessageDialog(null, "BUSCAR CIDADE E BAIRRO, E ADICIONAR ELES NOS CAPOS CIDADE E BAIRRO");
            //System.out.println("DEU CERTO");
            
        }
        
    }
    
}
