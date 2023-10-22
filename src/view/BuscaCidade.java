
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BuscaCidade extends javax.swing.JDialog {

    public BuscaCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JTable getjTableDados() {
        return jTableDados;
    }
    

    public JButton getjButtonCarregar() {
        return jButtonCarregar;
    }

    public JButton getjButtonFiltrar() {
        return jButtonFiltrar;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public JPanel getjPanelDados2() {
        return jPanelDados;
    }

    public JTextField getjTextFieldFiltrar() {
        return jTextFieldFiltrar;
    }

    public void setjTextFieldFiltrar(JTextField jTextFieldFiltrar) {
        this.jTextFieldFiltrar = jTextFieldFiltrar;
    }

    public JComboBox<String> getjComboBoxFiltroCidade() {
        return jComboBoxFiltroCidade;
    }

    public void setjComboBoxFiltroCidade(JComboBox<String> jComboBoxFiltroCidade) {
        this.jComboBoxFiltroCidade = jComboBoxFiltroCidade;
    }

    public JButton getjButtonApagar() {
        return jButtonApagar;
    }

    public void setjButtonApagar(JButton jButtonApagar) {
        this.jButtonApagar = jButtonApagar;
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelBairro = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonCarregar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jPanelFiltro = new javax.swing.JPanel();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jComboBoxFiltroCidade = new javax.swing.JComboBox<>();
        jPanelDados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BuscaCidade");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanelFundo.setBackground(new java.awt.Color(147, 216, 67));

        jPanelTitulo.setBackground(new java.awt.Color(204, 255, 102));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelBairro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBairro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(0, 102, 102));
        jLabelBairro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBairro.setText("Cidades");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBairro)
                .addContainerGap())
        );

        jPanelBotoes.setBackground(new java.awt.Color(204, 255, 102));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonCarregar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonCarregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCarregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icones/iconeCarregar.png"))); // NOI18N
        jButtonCarregar.setText("Carregar");
        jButtonCarregar.setActionCommand("0");
        jButtonCarregar.setBorder(null);
        jButtonCarregar.setMaximumSize(new java.awt.Dimension(99, 26));
        jButtonCarregar.setMinimumSize(new java.awt.Dimension(99, 26));
        jButtonCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setActionCommand("0");
        jButtonSair.setBorder(null);
        jButtonSair.setMaximumSize(new java.awt.Dimension(99, 26));
        jButtonSair.setMinimumSize(new java.awt.Dimension(99, 26));

        jButtonApagar.setBackground(new java.awt.Color(255, 51, 0));
        jButtonApagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonApagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icones/iconeDelete.png"))); // NOI18N
        jButtonApagar.setText("Apagar");
        jButtonApagar.setActionCommand("0");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(jButtonApagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFiltro.setBackground(new java.awt.Color(228, 228, 228));
        jPanelFiltro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonFiltrar.setBackground(new java.awt.Color(152, 211, 255));
        jButtonFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonFiltrar.setForeground(new java.awt.Color(0, 71, 162));
        jButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icones/IconeFiltrar.png"))); // NOI18N
        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.setBorder(null);
        jButtonFiltrar.setMaximumSize(new java.awt.Dimension(99, 26));
        jButtonFiltrar.setMinimumSize(new java.awt.Dimension(99, 26));

        jComboBoxFiltroCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxFiltroCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ID", "DESCRIÇÃO" }));

        javax.swing.GroupLayout jPanelFiltroLayout = new javax.swing.GroupLayout(jPanelFiltro);
        jPanelFiltro.setLayout(jPanelFiltroLayout);
        jPanelFiltroLayout.setHorizontalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxFiltroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFiltroLayout.setVerticalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFiltroCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDados.setBackground(new java.awt.Color(228, 228, 228));
        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setResizable(false);
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(45);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(45);
        }

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCarregarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonApagarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaCidade dialog = new BuscaCidade(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCarregar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxFiltroCidade;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables

    public Object getjComboBoxUf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
