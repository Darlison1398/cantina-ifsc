
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
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroProduto.getjButtonNovo()) {
            utilities.Utilities.ativa(false, this.cadastroProduto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(true, this.cadastroProduto.getjPanelDados());
            this.cadastroProduto.getjTId().setEditable(false);
            

        } else if (e.getSource() == this.cadastroProduto.getjButtonSair()) {
            this.cadastroProduto.dispose();
            
           

        } else if (e.getSource() == this.cadastroProduto.getjButtonCancelar()) {
            utilities.Utilities.ativa(true, this.cadastroProduto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, this.cadastroProduto.getjPanelDados());

            
            
            
                    
        } else if (e.getSource() == this.cadastroProduto.getjButtonSalvar()) {
            
            Produto produto = new Produto();
            produto.setDescricao(this.cadastroProduto.getjTDescricao().getText());
            produto.setCodigoBarra(this.cadastroProduto.getjTCodigoBarras().getText());            
            produto.setStatus(this.cadastroProduto.getjCheckBoxStatus().isSelected());
          
            if(this.cadastroProduto.getjTId().getText().equalsIgnoreCase("")){
            
                service.ProdutoService.adicionar(produto);
            }else{
                
                produto.setId(Integer.parseInt(this.cadastroProduto.getjTId().getText()));
                service.ProdutoService.atualizar(produto);
            }
            utilities.Utilities.ativa(true, cadastroProduto.getjPanelBotoes());
            utilities.Utilities.limpaComponentes(false, cadastroProduto.getjPanelDados());
         
            
            
            

        } else if (e.getSource() == this.cadastroProduto.getjButtonConsultar()) {
            codigo = 0;
            
            BuscaProduto buscaProduto = new BuscaProduto(null, true);
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(buscaProduto);
            buscaProduto.setVisible(true);
            
            if(codigo !=0){
                Produto produto = new Produto();
                produto = service.ProdutoService.carregar(codigo);
                
                utilities.Utilities.ativa(false, cadastroProduto.getjPanelBotoes());
                utilities.Utilities.limpaComponentes(true, cadastroProduto.getjPanelDados());
                
                this.cadastroProduto.getjTId().setText(produto.getId() + "");
                this.cadastroProduto.getjTDescricao().setText(produto.getDescricao());
                this.cadastroProduto.getjTCodigoBarras().setText(produto.getCodigoBarra());
                this.cadastroProduto.getjCheckBoxStatus().setSelected(true);
                this.cadastroProduto.getjTId().setEditable(false);
         
               
            }

        }
    }
    
    
}
