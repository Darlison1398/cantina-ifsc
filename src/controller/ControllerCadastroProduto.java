
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import model.bo.Produto;
import utilities.Utilities;
import view.BuscaProduto;
import view.CadastroProduto;
import view.Resposta;

public class ControllerCadastroProduto implements ActionListener{
    
    CadastroProduto cadastroProduto;
    public static int codigo;
    
    public ControllerCadastroProduto(CadastroProduto cadastroProduto) {
        this.cadastroProduto = cadastroProduto;
        
        this.cadastroProduto.getjButtonNovo().addActionListener(this);
        this.cadastroProduto.getjButtonSair().addActionListener(this);
        this.cadastroProduto.getjButtonCancelar().addActionListener(this);
        this.cadastroProduto.getjButtonSalvar().addActionListener(this);
        this.cadastroProduto.getjButtonConsultar().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.cadastroProduto.getjPanelBotoes());
        utilities.Utilities.limpaComponentes(false, this.cadastroProduto.getjPanelDados());

    }
    
    WindowListener disposeListener = new WindowAdapter() {
        
        public void windowClosed(WindowEvent e){
            if(codigo!=0){
            Produto produto = new Produto();
            produto=Dao.ClasseDados.produtos.get(codigo-1);
            Utilities.ativa(false, cadastroProduto.getjPanelBotoes());
            Utilities.limpaComponentes(true, cadastroProduto.getjPanelDados());
            
            cadastroProduto.getjTId().setText(produto.getId()+"");
            cadastroProduto.getjTId().setEnabled(false);
            cadastroProduto.getjTDescricao().setText(produto.getDescricao());
            cadastroProduto.getjTCodigoBarras().setText(produto.getCodigoBarra());
        }
        }
    };
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroProduto.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroProduto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroProduto.getjPanelDados());
            this.cadastroProduto.getjTId().setEnabled(false);
            

        } else if (e.getSource() == this.cadastroProduto.getjButtonSair()) {
            this.cadastroProduto.dispose();
            
           

        } else if (e.getSource() == this.cadastroProduto.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroProduto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroProduto.getjPanelDados());

                    
        } else if (e.getSource() == this.cadastroProduto.getjButtonSalvar()) {
            
            Produto produto = new Produto();
            produto.setId(Dao.ClasseDados.produtos.size()+1);
            produto.setDescricao(this.cadastroProduto.getjTDescricao().getText());
            produto.setCodigoBarra(this.cadastroProduto.getjTCodigoBarras().getText());            
            produto.setStatus(this.cadastroProduto.getjCheckBoxStatus().isSelected());
            
            Resposta resposta = new Resposta(null, true);
            ControllerResposta controllerResposta = new ControllerResposta(resposta);
            
            utilities.Utilities.ativa(true, cadastroProduto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroProduto.getjPanelDados());
            
            if(this.cadastroProduto.getjTId().getText().equalsIgnoreCase("")){
                Dao.ClasseDados.produtos.add(produto);
                controllerResposta.codigoFB=4;
                controllerResposta.cadastroClasse();
            }else{
                int index= Integer.parseInt(this.cadastroProduto.getjTId().getText())-1;
                Dao.ClasseDados.produtos.get(index).setCodigoBarra(this.cadastroProduto.getjTCodigoBarras().getText()+"");
                Dao.ClasseDados.produtos.get(index).setDescricao(this.cadastroProduto.getjTDescricao().getText());
                //Dao.ClasseDados.produtos.get(index).setPreco(Float.valueOf(this.cadastroProduto.getPreco().getText()));
                controllerResposta.codigoFB=4;
                controllerResposta.atualizacaoClasse();
            }
            
            //resposta.setVisible(true);
            Dao.ClasseDados.produtos.add(produto); // prestar atênção nisso;
            
            //utilities.Utilities.ativa(true, cadastroProduto.getjPanelBotoes());
            //utilities.Utilities.limpaComponentes(false, cadastroProduto.getjPanelDados());

        } else if (e.getSource() == this.cadastroProduto.getjButtonConsultar()) {
            BuscaProduto buscaProduto = new BuscaProduto(null, true);
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(buscaProduto);
            buscaProduto.addWindowListener(disposeListener);
            buscaProduto.setVisible(true);

        }
    }
    
    
}
