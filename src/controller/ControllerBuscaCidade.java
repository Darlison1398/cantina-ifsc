
package controller;

import static controller.ControllerCadastroCidade.codigoCidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bo.Cidade;
import service.CidadeService;
import view.BuscaCidade;


public class ControllerBuscaCidade implements ActionListener {

    BuscaCidade buscaCidade;
  
    public ControllerBuscaCidade(BuscaCidade buscaCidade) {
        this.buscaCidade = buscaCidade;
        

        this.buscaCidade.getjButtonFiltrar().addActionListener(this);
        this.buscaCidade.getjButtonCarregar().addActionListener(this);
        this.buscaCidade.getjButtonSair().addActionListener(this);
        this.buscaCidade.getjButtonApagar().addActionListener(this);

        utilities.Utilities.ativa(true, this.buscaCidade.getjPanelBotoes());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaCidade.getjButtonFiltrar()){            
       
            /*List<Cidade> listaCidade = new ArrayList<Cidade>();
            listaCidade = service.CidadeService.carregar();
 
            //Criando um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCidade.getjTableDados().getModel();
        
            tabela.setRowCount(0);
            for (Cidade cidadeAtual : listaCidade) {
                tabela.addRow(new Object[]{cidadeAtual.getId(), cidadeAtual.getDescricao(), cidadeAtual.getUf()});
                
            }*/
            List<Cidade> listaCidade;

            int selectedIndex = this.buscaCidade.getjComboBoxFiltroCidade().getSelectedIndex();

            if (selectedIndex == 0) {
            // Filtro por todos os dados
               listaCidade = CidadeService.carregar();
           } else if (selectedIndex == 1) {
            // Filtro por ID
               String input = this.buscaCidade.getjTextFieldFiltrar().getText().trim();
           if (!input.isEmpty()) {
               int id = Integer.parseInt(input);
               listaCidade = new ArrayList<>();
               listaCidade.add(CidadeService.carregar(id));
           } else {
               // Informar ao usuário que o campo está vazio
               JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
               return;
               }
          } else if (selectedIndex == 2) {
               // Filtro por descrição
               String descricao = this.buscaCidade.getjTextFieldFiltrar().getText().trim();
               listaCidade = CidadeService.carregar(descricao);
          } else {
               // Se não for nenhuma das opções acima, não fazer nada ou mostrar mensagem de erro
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
          }

                      //Criando um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCidade.getjTableDados().getModel();
        
            tabela.setRowCount(0);
            for (Cidade cidadeAtual : listaCidade) {
                tabela.addRow(new Object[]{cidadeAtual.getId(), cidadeAtual.getDescricao(), cidadeAtual.getUf()});
                
            }
            
            
            
            
            
            
            
            
            
        
        }else if(e.getSource() == this.buscaCidade.getjButtonCarregar()){
           
           controller.ControllerCadastroCidade.codigoCidade = (int) this.buscaCidade.
            getjTableDados().getValueAt(this.buscaCidade.getjTableDados().getSelectedRow(), 0);
            this.buscaCidade.dispose();
            
            controller.ControllerCadastroEndereco.codigoCidade = (int) this.buscaCidade.
            getjTableDados().getValueAt(this.buscaCidade.getjTableDados().getSelectedRow(), 0);
            this.buscaCidade.dispose();


            
       
        }else if(e.getSource() == this.buscaCidade.getjButtonSair()){
            this.buscaCidade.dispose();
            
        } else if (e.getSource() == this.buscaCidade.getjButtonApagar()) {
            int selectedRow = this.buscaCidade.getjTableDados().getSelectedRow();
            if (selectedRow != -1) { // Verifica se algum item está selecionado
                int cidadeId = (int) this.buscaCidade.getjTableDados().getValueAt(selectedRow, 0);
                Cidade cidade = CidadeService.carregar(cidadeId);
                if (cidade != null) {
                    DefaultTableModel tabela = (DefaultTableModel) this.buscaCidade.getjTableDados().getModel();
                    CidadeService.remover(cidade); // Chama o serviço para excluir o bairro
                    tabela.removeRow(selectedRow);
                }
            }
            
        }
    }

}
