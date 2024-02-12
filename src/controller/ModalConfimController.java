package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Bairro;
import service.BairroService;
import view.ModalConnfirm;

public class ModalConfimController implements ActionListener {
    ModalConnfirm modalConfirm;
    int bairroId;
    DefaultTableModel tabelaReferencia;
    int rowReferencia;

    public ModalConfimController(ModalConnfirm modalConfirm, int bairroId, DefaultTableModel tabela, int row) {
        this.modalConfirm = modalConfirm;
        this.bairroId = bairroId;
        this.tabelaReferencia = tabela;
        this.rowReferencia = row;

        this.modalConfirm.getjButtonSim().addActionListener(this);
        this.modalConfirm.getjButtonNao().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.modalConfirm.getjButtonSim()) {
            
            Bairro bairro = BairroService.carregar(bairroId); // Buscar o bairro pelo ID

            if (bairro != null) {
                BairroService.remover(bairro);

                // Remover a linha do modelo da tabela
                tabelaReferencia.removeRow(rowReferencia);
            }

            this.modalConfirm.dispose();
        } else if (e.getSource() == this.modalConfirm.getjButtonNao()) {
            this.modalConfirm.dispose();
        }
        
    }

}
