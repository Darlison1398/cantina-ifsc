
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bo.Produto;
import service.ProdutoService;
import view.BuscaProduto;

public class ControllerBuscaProduto implements ActionListener {

    BuscaProduto buscaProduto;

    public ControllerBuscaProduto(BuscaProduto buscaProduto) {
        this.buscaProduto = buscaProduto;

        this.buscaProduto.getjButtonFiltrar().addActionListener(this);
        this.buscaProduto.getjButtonCarregar().addActionListener(this);
        this.buscaProduto.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativa(true, this.buscaProduto.getjPanelBotoes());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaProduto.getjButtonFiltrar()) {
  
            List<Produto> listaProdutos;

            int selectedIndex = this.buscaProduto.getjComboBoxFiltrar().getSelectedIndex();

            if (selectedIndex == 0) {
            // Filtro por todos os dados
               listaProdutos = ProdutoService.carregar();
           } else if (selectedIndex == 1) {
            // Filtro por ID
               String input = this.buscaProduto.getjTextFieldFiltrar().getText().trim();
           if (!input.isEmpty()) {
               int id = Integer.parseInt(input);
               listaProdutos = new ArrayList<>();
               listaProdutos.add(ProdutoService.carregar(id));
           } else {
               // Informar ao usuário que o campo está vazio
               JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
               return;
               }
          } else if (selectedIndex == 2) {
               // Filtro por descrição
               String descricao = this.buscaProduto.getjTextFieldFiltrar().getText().trim();
               listaProdutos = ProdutoService.carregar(descricao);
          } else {
               // Se não for nenhuma das opções acima, não fazer nada ou mostrar mensagem de erro
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
          }

            DefaultTableModel tabela = (DefaultTableModel) this.buscaProduto.getjTableDados().getModel();
            tabela.setRowCount(0);
            for (Produto produtoAtual : listaProdutos) {
                tabela.addRow(new Object[]{produtoAtual.getId(), 
                                           produtoAtual.getDescricao(), 
                                           produtoAtual.getCodigoBarra(), 
                                           produtoAtual.getStatus()});
                
            }
                    
            

        } else if (e.getSource() == this.buscaProduto.getjButtonCarregar()) {
            
            controller.ControllerCadastroProduto.codigo=(int) this.buscaProduto.
            getjTableDados().getValueAt(this.buscaProduto.getjTableDados().getSelectedRow(), 0);
            this.buscaProduto.dispose();

            
            
        } else if (e.getSource() == this.buscaProduto.getjButtonSair()) {
            this.buscaProduto.dispose();

        }
    }

}
