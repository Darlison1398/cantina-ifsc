
package controller;

import Dao.ClasseDados;
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
import view.BuscaEndereco2;
import view.CadastroBairro;
import view.CadastroCidade;
import view.CadastroEndereco;
import view.Resposta;

public class ControllerCadastroEndereco implements ActionListener {
    
    CadastroEndereco cadastroEndereco;
    
    public static int codigoCidade, codigoBairro, codigo;
    public static int idCidade, idBairro;
    
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
        
        utilities.Utilities.ativa(true, this.cadastroEndereco.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getjPanelDados());
    }
    
    WindowListener disposeListener = new WindowAdapter() {
        
        public void windowClosed(WindowEvent e){
            if (codigo != 0){
                Endereco endereco = new Endereco();
                endereco = Dao.ClasseDados.enderecos.get(codigo-1);
                utilities.Utilities.ativa(false, cadastroEndereco.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroEndereco.getjPanelDados());
                
                cadastroEndereco.getjTId().setText(endereco.getId() + "");
                cadastroEndereco.getjFCep().setText(endereco.getCep());
                cadastroEndereco.getjTLogradouro().setText(endereco.getLogradouro());
                cadastroEndereco.getjTDescricaoBairro().setText(endereco.getBairro().getDescricao()); // esse é a parte da descrição da cidade
                cadastroEndereco.getjTDescricaoCidade().setText(endereco.getCidade().getDescricao()); // descrição do bairro
                
                cadastroEndereco.getjTId().setEnabled(false);           
            }
        }
    };
    
        WindowListener disposeListenerBairro = new WindowAdapter() {

        @Override
        public void windowClosed(WindowEvent e) {
            if(codigoBairro!= -2){
                Bairro bairro = new Bairro();
                bairro=Dao.ClasseDados.bairros.get(codigoBairro); // tirei o -1
                utilities.Utilities.ativa(false, cadastroEndereco.getjPanelBotoes());
                idBairro=bairro.getId()-1;
                
                cadastroEndereco.getjTDescricaoBairro().setText(bairro.getDescricao());
                
            }
        }
    };
    WindowListener disposeListenerCidade = new WindowAdapter() {
         @Override
         public void windowClosed(WindowEvent e){
            if(codigoCidade!= -2){
                Cidade cidade = new Cidade();
                cidade=Dao.ClasseDados.cidades.get(codigoCidade); // tirei o -1
                utilities.Utilities.ativa(false, cadastroEndereco.getjPanelBotoes());
                idCidade=cidade.getId()-1;
                
                cadastroEndereco.getjTDescricaoCidade().setText(cidade.getDescricao());
            }
         }
    };
    
    
  
    
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
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonSalvar()) {
            
            Endereco endereco = new Endereco();
            endereco.setId(Dao.ClasseDados.enderecos.size()+1);
            endereco.setCep(this.cadastroEndereco.getjLabelCep().getText());
            endereco.setLogradouro(this.cadastroEndereco.getjTLogradouro().getText());
            endereco.setStatus(this.cadastroEndereco.getjCheckBoxStatus().isSelected());
            endereco.setCidade(Dao.ClasseDados.cidades.get(idCidade));
            endereco.setBairro(Dao.ClasseDados.bairros.get(idBairro));
            
            //Dao.ClasseDados.enderecos.add(endereco);
            
            //Status Cidade e bairro
            
            // invocando a view.Resposta
            Resposta resposta = new Resposta(null, true);
            ControllerResposta controllerResposta = new ControllerResposta(resposta);
            
            utilities.Utilities.ativa(true, cadastroEndereco.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroEndereco.getjPanelDados());
            
            
            if(this.cadastroEndereco.getjLabelId().getText().equalsIgnoreCase("")){
                Dao.ClasseDados.enderecos.add(endereco);
                controllerResposta.codigoFB=3;
                controllerResposta.cadastroClasse();
                
                
            }else{
                int index = Integer.parseInt(this.cadastroEndereco.getjLabelId().getText())-1;
                Dao.ClasseDados.enderecos.get(index).setLogradouro(this.cadastroEndereco.getjLabelLogradouro().getText());
                Dao.ClasseDados.enderecos.get(index).setCep(this.cadastroEndereco.getjFCep().getText());
                Dao.ClasseDados.enderecos.get(index).setBairro(Dao.ClasseDados.bairros.get(idBairro));
                Dao.ClasseDados.enderecos.get(index).setCidade(Dao.ClasseDados.cidades.get(idCidade));
                controllerResposta.codigoFB=3;
                controllerResposta.atualizacaoClasse();
            }
            
            //resposta.setVisible(true);
            
            //utilities.Utilities.ativa(true, cadastroEndereco.getjPanelBotoes());
            //utilities.Utilities.limpaComponentes(false, cadastroEndereco.getjPanelDados());
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonConsultar()) {
            //BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
            //ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            BuscaEndereco2 buscaEndereco2 = new BuscaEndereco2(null, true);
            ControllerBuscaEndereco2 controllerBuscaEndereco2 = new ControllerBuscaEndereco2(buscaEndereco2);
            buscaEndereco2.addWindowListener(disposeListener);
            buscaEndereco2.setVisible(true);
            
                
            
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
            codigoBairro=0;
            BuscaBairro buscaBairro = new BuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            buscaBairro.addWindowListener(disposeListenerBairro);
            buscaBairro.setVisible(true); 
            
        } else if (e.getSource() == this.cadastroEndereco.getjButtonBuscaCidade()) {
            codigoCidade = 0;
            BuscaCidade buscaCidade = new BuscaCidade(null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            buscaCidade.addWindowListener(disposeListenerBairro);
            buscaCidade.setVisible(true);
            
            
            /*buscaCidade.getjButtonCarregar().addActionListener(this);
            Cidade city = new Cidade();    
            
            if (buscaCidade.getjTableDados() == city.)*/
           
            
            
            
        } else if (e.getSource() == this.cadastroEndereco.getjBCompletar()){
            //JOptionPane.showMessageDialog(null, "BUSCAR CIDADE E BAIRRO, E ADICIONAR ELES NOS CAPOS CIDADE E BAIRRO");
            //System.out.println("DEU CERTO");
            
        }
        
    }
    
}
