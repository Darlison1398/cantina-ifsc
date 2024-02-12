
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bo.Bairro;
import service.BairroService;
import view.BuscaBairro;
import view.ModalConnfirm;

public class ControllerBuscaBairro implements ActionListener{
    
    BuscaBairro buscaBairro;

    public ControllerBuscaBairro(BuscaBairro buscaBairro) {
        
        this.buscaBairro = buscaBairro;
        
        this.buscaBairro.getjButtonFiltrar().addActionListener(this);
        this.buscaBairro.getjButtonCarregar().addActionListener(this);
        this.buscaBairro.getjButtonSair().addActionListener(this);  
        this.buscaBairro.getjBtnApagar().addActionListener(this);
        
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaBairro.getjButtonFiltrar()){
            
            List<Bairro> listaBairros;

            int selectedIndex = this.buscaBairro.getjComboBoxFiltro().getSelectedIndex();

            if (selectedIndex == 0) {
            // Filtro por todos os dados
               listaBairros = BairroService.carregar();
           } else if (selectedIndex == 1) {
            // Filtro por ID
               String input = this.buscaBairro.getjTextFieldFiltrar().getText().trim();
           if (!input.isEmpty()) {
               int id = Integer.parseInt(input);
               listaBairros = new ArrayList<>();
               listaBairros.add(BairroService.carregar(id));
           } else {
               // Informar ao usuário que o campo está vazio
               JOptionPane.showMessageDialog(null, "Informe o ID para filtrar.");
               return;
               }
          } else if (selectedIndex == 2) {
               // Filtro por descrição
               String descricao = this.buscaBairro.getjTextFieldFiltrar().getText().trim();
               listaBairros = BairroService.carregar(descricao);
          } else {
               // Se não for nenhuma das opções acima, não fazer nada ou mostrar mensagem de erro
               JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");
               return;
          }

          // Atualizar a tabela com os resultados
           DefaultTableModel tabela = (DefaultTableModel) this.buscaBairro.getjTableDados().getModel();
           tabela.setRowCount(0); // Limpar a tabela antes de adicionar os dados

           for (Bairro bairroAtual : listaBairros) {
                tabela.addRow(new Object[]{bairroAtual.getId(), bairroAtual.getDescricao()});
            }
                
                
            
           
           
            
        }else if(e.getSource() == this.buscaBairro.getjButtonCarregar()){
            
            controller.ControllerCadastroBairro.codigo = (int) this.buscaBairro.
            getjTableDados().getValueAt(this.buscaBairro.getjTableDados().getSelectedRow(), 0);
            this.buscaBairro.dispose();
            
            controller.ControllerCadastroEndereco.codigoBairro = (int) this.buscaBairro.
                    getjTableDados().getValueAt(this.buscaBairro.getjTableDados().getSelectedRow(), 0);
            this.buscaBairro.dispose();
            
            
        
            
        }else if(e.getSource() == this.buscaBairro.getjButtonSair()){
            this.buscaBairro.dispose();
            
            
            
            
        } else if(e.getSource() == this.buscaBairro.getjBtnApagar()) {
            
                int selectedRow = this.buscaBairro.getjTableDados().getSelectedRow();
                if (selectedRow != -1) {
                    int bairroId = (int) this.buscaBairro.getjTableDados().getValueAt(selectedRow, 0);

                    // Chama o modal de confirmação passando o ID do bairro
                    ModalConnfirm modalConnfirm = new ModalConnfirm(new JFrame(), true);
                    ModalConfimController modalConfimController = new ModalConfimController(modalConnfirm, bairroId, (DefaultTableModel) this.buscaBairro.getjTableDados().getModel(), selectedRow);
                    modalConnfirm.setLocationRelativeTo(null);
                    modalConnfirm.setVisible(true);

                }
            
        }
    }
    
}
