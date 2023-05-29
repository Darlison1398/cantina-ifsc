
package controller;

import view.Produtos;
import Utilities.utilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastrarProduto;

public class ControllerProdutos implements ActionListener {
    
    Produtos produtos;

    public ControllerProdutos(Produtos produtos) {
        this.produtos = produtos;
        
        this.produtos.getjBExcluirProduto().addActionListener(this);
        this.produtos.getjBNovoProduto().addActionListener(this);
        this.produtos.getjBPesquisarProduto().addActionListener(this);
        this.produtos.getjBSairProduto().addActionListener(this);
        
        Utilities.utilities.ativaDesativa(true, this.produtos.getjPanBotoesProdutos());
        Utilities.utilities.limpaComponentes(true, this.produtos.getjPanDadosProdutos());
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == this.produtos.getjBNovoProduto()) {
                CadastrarProduto cadastrarProduto = new CadastrarProduto(null, true);
                cadastrarProduto.setVisible(true);
            //utilities.ativaDesativa(false, this.produtos.getjPanBotoesProdutos());
           // utilities.limpaComponentes(true, this.produtos.getjPanDadosProdutos());

            } else if (e.getSource() == this.produtos.getjBPesquisarProduto()) {
            utilities.ativaDesativa(true, this.produtos.getjPanBotoesProdutos());
            utilities.limpaComponentes(false, this.produtos.getjPanDadosProdutos());
            

            } else if (e.getSource() == this.produtos.getjBSairProduto()) {
            this.produtos.dispose();

        }
    }
    
}
