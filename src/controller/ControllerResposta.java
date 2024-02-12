
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Resposta;

public class ControllerResposta implements ActionListener {
    
    Resposta respostaComando;
    public static int codigoFB;

    public ControllerResposta(Resposta respostaComando) {
        this.respostaComando = respostaComando;
        
        this.respostaComando.getjBConcluir().addActionListener(this);
        
    }
    
        public void cadastroClasse(){
        
        switch (this.codigoFB) {
            case 1:
                //this.respostaComando.setLresposta("Cadastro realizado com sucesso!");
                
                this.respostaComando.setjTFeedeback("Bairro cadastrado com sucesso!");           
                break;
            case 2:
                this.respostaComando.setjTFeedeback("Cidade cadastrada com sucesso!");
                break;
            case 3:
                this.respostaComando.setjTFeedeback("Endereço cadastrado com sucesso!");
                break;
            case 4:
                this.respostaComando.setjTFeedeback("Produto cadastrado com sucesso!");
                break;
            case 5: 
                this.respostaComando.setjTFeedeback("Carteirinha cadastrada com sucesso!");
                break;
            case 6:
                this.respostaComando.setjTFeedeback("Cliente cadastrado com sucesso!");
                break;
            case 7:
                this.respostaComando.setjTFeedeback("Funcionário cadastrado com sucesso!");
                break;
            case 8:
                this.respostaComando.setjTFeedeback("Fornecedor cadastrado com sucesso!");
        }
    }

    public void atualizacaoClasse(){
        switch (this.codigoFB) {
            case 1:
                this.respostaComando.setjTFeedeback("Bairro atualizado com sucesso!");           
                break;
            case 2:
                this.respostaComando.setjTFeedeback("Cidade atualizada com sucesso!");
                break;
            case 3:
                this.respostaComando.setjTFeedeback("Endereço atualizado com sucesso!");
                break;
            case 4:
                this.respostaComando.setjTFeedeback("Produto atualizado com sucesso!");
                break;
            case 5: 
                this.respostaComando.setjTFeedeback("Carteirinha atualizada com sucesso!");
                break;
            case 6:
                this.respostaComando.setjTFeedeback("Cliente atualizado com sucesso!");
                break;
            case 7:
                this.respostaComando.setjTFeedeback("Funcionário atualizado com sucesso!");
                break;
            case 8:
                this.respostaComando.setjTFeedeback("Fornecedor atualizado com sucesso!");
        }
    }

        
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
            if(e.getSource()==this.respostaComando.getjBConcluir()){
           
            codigoFB=0;
            
            this.respostaComando.dispose();
        }
    }
    
}
