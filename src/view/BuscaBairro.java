
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class BuscaBairro extends javax.swing.JDialog {

    public BuscaBairro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        return jPanelDados2;
    }

    public JTextField getjTextFieldFiltrar() {
        return jTextFieldFiltrar;
    }

    public void setjTextFieldFiltrar(JTextField jTextFieldFiltrar) {
        this.jTextFieldFiltrar = jTextFieldFiltrar;
    }

    public JTable getjTableDados() {
        return jTableDados;
    }

    public JComboBox<String> getjComboBoxFiltro() {
        return jComboBoxFiltro;
    }

    public void setjComboBoxFiltro(JComboBox<String> jComboBoxFiltro) {
        this.jComboBoxFiltro = jComboBoxFiltro;
    }

    public JButton getjBtnApagar() {
        return jBtnApagar;
    }

    public void setjBtnApagar(JButton jBtnApagar) {
        this.jBtnApagar = jBtnApagar;
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanelFundo = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonCarregar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jBtnApagar = new javax.swing.JButton();
        jPanelFiltro = new javax.swing.JPanel();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jPanelDados2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BuscaBairro");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanelFundo.setBackground(new java.awt.Color(147, 216, 67));

        jPanelTitulo.setBackground(new java.awt.Color(204, 255, 102));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitulo.setBackground(new java.awt.Color(0, 204, 0));
        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Bairros");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jBtnApagar.setBackground(new java.awt.Color(255, 51, 0));
        jBtnApagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnApagar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icones/iconeDelete.png"))); // NOI18N
        jBtnApagar.setText("Apagar");
        jBtnApagar.setActionCommand("0");
        jBtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jBtnApagar)
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
                    .addComponent(jBtnApagar))
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
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jComboBoxFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ID", "DESCRICAO" }));

        javax.swing.GroupLayout jPanelFiltroLayout = new javax.swing.GroupLayout(jPanelFiltro);
        jPanelFiltro.setLayout(jPanelFiltroLayout);
        jPanelFiltroLayout.setHorizontalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDados2.setBackground(new java.awt.Color(228, 228, 228));
        jPanelDados2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
        }

        javax.swing.GroupLayout jPanelDados2Layout = new javax.swing.GroupLayout(jPanelDados2);
        jPanelDados2.setLayout(jPanelDados2Layout);
        jPanelDados2Layout.setHorizontalGroup(
            jPanelDados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelDados2Layout.setVerticalGroup(
            jPanelDados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jPanelDados2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCarregarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jBtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnApagarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaBairro dialog = new BuscaBairro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnApagar;
    private javax.swing.JButton jButtonCarregar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados2;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
