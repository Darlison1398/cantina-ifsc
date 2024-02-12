
package view;

import controllerMovimento.EndVendaController;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Faturamento extends javax.swing.JDialog {

    public Faturamento(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
    }

    Faturamento() {
        initComponents();
    }

    public JButton getjBtnAdicionar() {
        return jBtnAdicionar;
    }

    public void setjBtnAdicionar(JButton jBtnAdicionar) {
        this.jBtnAdicionar = jBtnAdicionar;
    }

    public JButton getjBtnBuscarCliente() {
        return jBtnBuscarCliente;
    }

    public void setjBtnBuscarCliente(JButton jBtnBuscarCliente) {
        this.jBtnBuscarCliente = jBtnBuscarCliente;
    }

    public JButton getjBtnCancelar() {
        return jBtnCancelar;
    }

    public void setjBtnCancelar(JButton jBtnCancelar) {
        this.jBtnCancelar = jBtnCancelar;
    }

    public JButton getjBtnEndVenda() {
        return jBtnEndVenda;
    }

    public void setjBtnEndVenda(JButton jBtnEndVenda) {
        this.jBtnEndVenda = jBtnEndVenda;
    }

    public JFormattedTextField getjFvalorTotProduto() {
        return jFvalorTotProduto;
    }

    public void setjFvalorTotProduto(JFormattedTextField jFvalorTotProduto) {
        this.jFvalorTotProduto = jFvalorTotProduto;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JPanel getjPanConfirmCompra() {
        return jPanConfirmCompra;
    }

    public void setjPanConfirmCompra(JPanel jPanConfirmCompra) {
        this.jPanConfirmCompra = jPanConfirmCompra;
    }

    public JPanel getjPanDadosCliente() {
        return jPanDadosCliente;
    }

    public void setjPanDadosCliente(JPanel jPanDadosCliente) {
        this.jPanDadosCliente = jPanDadosCliente;
    }

    public JPanel getjPanDadosProduto() {
        return jPanDadosProduto;
    }

    public void setjPanDadosProduto(JPanel jPanDadosProduto) {
        this.jPanDadosProduto = jPanDadosProduto;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel12() {
        return jPanel12;
    }

    public void setjPanel12(JPanel jPanel12) {
        this.jPanel12 = jPanel12;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanelBtnAdicionar() {
        return jPanelBtnAdicionar;
    }

    public void setjPanelBtnAdicionar(JPanel jPanelBtnAdicionar) {
        this.jPanelBtnAdicionar = jPanelBtnAdicionar;
    }

    public JPanel getjPanelCodigoBarras() {
        return jPanelCodigoBarras;
    }

    public void setjPanelCodigoBarras(JPanel jPanelCodigoBarras) {
        this.jPanelCodigoBarras = jPanelCodigoBarras;
    }

    public JPanel getjPdadosFinalProduto() {
        return jPdadosFinalProduto;
    }

    public void setjPdadosFinalProduto(JPanel jPdadosFinalProduto) {
        this.jPdadosFinalProduto = jPdadosFinalProduto;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JFormattedTextField getjTCodBarrasProduto() {
        return jFormattedTextField2;
    }

    public void setjTCodBarrasProduto(JFormattedTextField jTCodBarrasProduto) {
        this.jFormattedTextField2 = jTCodBarrasProduto;
    }

    public JTextField getjTCodCliente() {
        return jTCodCliente;
    }

    public void setjTCodCliente(JTextField jTCodCliente) {
        this.jTCodCliente = jTCodCliente;
    }

    public JTextField getjTNomeProduto() {
        return jTNomeProduto;
    }

    public void setjTNomeProduto(JTextField jTNomeProduto) {
        this.jTNomeProduto = jTNomeProduto;
    }

    public JTextField getjTQtdProduto() {
        return jTQtdProduto;
    }

    public void setjTQtdProduto(JTextField jTQtdProduto) {
        this.jTQtdProduto = jTQtdProduto;
    }

    public JTextField getjTVlorProduto() {
        return jTVlorProduto;
    }

    public void setjTVlorProduto(JTextField jTVlorProduto) {
        this.jTVlorProduto = jTVlorProduto;
    }

    public JTable getjTableDadosProduto() {
        return jTableDadosProduto;
    }

    public void setjTableDadosProduto(JTable jTableDadosProduto) {
        this.jTableDadosProduto = jTableDadosProduto;
    }

    public JTextField getjTnomeCliente() {
        return jTnomeCliente;
    }

    public void setjTnomeCliente(JTextField jTnomeCliente) {
        this.jTnomeCliente = jTnomeCliente;
    }

 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanelBtnAdicionar = new javax.swing.JPanel();
        jBtnAdicionar = new javax.swing.JButton();
        jPanelCodigoBarras = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jPanDadosProduto = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTNomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTQtdProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTVlorProduto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanDadosCliente = new javax.swing.JPanel();
        jTCodCliente = new javax.swing.JTextField();
        jBtnBuscarCliente = new javax.swing.JButton();
        jTnomeCliente = new javax.swing.JTextField();
        jPdadosFinalProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDadosProduto = new javax.swing.JTable();
        jPanConfirmCompra = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jFvalorTotProduto = new javax.swing.JFormattedTextField();
        jBtnCancelar = new javax.swing.JButton();
        jBtnEndVenda = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Venda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(416, 416, 416))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 980, 50);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jPanelBtnAdicionar.setBackground(new java.awt.Color(204, 204, 204));

        jBtnAdicionar.setBackground(new java.awt.Color(0, 153, 153));
        jBtnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jBtnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAdicionar.setText("Adicionar Produto");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnAdicionarLayout = new javax.swing.GroupLayout(jPanelBtnAdicionar);
        jPanelBtnAdicionar.setLayout(jPanelBtnAdicionarLayout);
        jPanelBtnAdicionarLayout.setHorizontalGroup(
            jPanelBtnAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnAdicionarLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBtnAdicionarLayout.setVerticalGroup(
            jPanelBtnAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnAdicionarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setText("Código ");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCodigoBarrasLayout = new javax.swing.GroupLayout(jPanelCodigoBarras);
        jPanelCodigoBarras.setLayout(jPanelCodigoBarrasLayout);
        jPanelCodigoBarrasLayout.setHorizontalGroup(
            jPanelCodigoBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCodigoBarrasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelCodigoBarrasLayout.setVerticalGroup(
            jPanelCodigoBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCodigoBarrasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelCodigoBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/burger.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Produto");

        jTNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Quantidade");

        jTQtdProduto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTQtdProduto.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Valor");

        jTVlorProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanDadosProdutoLayout = new javax.swing.GroupLayout(jPanDadosProduto);
        jPanDadosProduto.setLayout(jPanDadosProdutoLayout);
        jPanDadosProdutoLayout.setHorizontalGroup(
            jPanDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNomeProduto)
                    .addComponent(jTQtdProduto)
                    .addGroup(jPanDadosProdutoLayout.createSequentialGroup()
                        .addGroup(jPanDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTVlorProduto))
                .addContainerGap())
        );
        jPanDadosProdutoLayout.setVerticalGroup(
            jPanDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanDadosProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTVlorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanDadosProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBtnAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCodigoBarras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanDadosProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 60, 510, 440);

        jPanel5.setBackground(new java.awt.Color(204, 255, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 510, 980, 60);

        jPanDadosCliente.setBackground(new java.awt.Color(204, 204, 204));

        jTCodCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jBtnBuscarCliente.setBackground(new java.awt.Color(0, 153, 153));
        jBtnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBtnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBuscarCliente.setText("Buscar Estudante");

        jTnomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanDadosClienteLayout = new javax.swing.GroupLayout(jPanDadosCliente);
        jPanDadosCliente.setLayout(jPanDadosClienteLayout);
        jPanDadosClienteLayout.setHorizontalGroup(
            jPanDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanDadosClienteLayout.createSequentialGroup()
                        .addComponent(jTCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTnomeCliente))
                    .addComponent(jBtnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanDadosClienteLayout.setVerticalGroup(
            jPanDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanDadosCliente);
        jPanDadosCliente.setBounds(530, 60, 440, 80);

        jPdadosFinalProduto.setBackground(new java.awt.Color(255, 255, 255));

        jTableDadosProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Qtd.", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTableDadosProduto);
        if (jTableDadosProduto.getColumnModel().getColumnCount() > 0) {
            jTableDadosProduto.getColumnModel().getColumn(0).setMaxWidth(500);
            jTableDadosProduto.getColumnModel().getColumn(1).setMaxWidth(100);
            jTableDadosProduto.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel6.setText("Total do Pedido");

        try {
            jFvalorTotProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFvalorTotProduto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jBtnCancelar.setBackground(new java.awt.Color(255, 51, 0));
        jBtnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancelar.setText("Cancelar");

        jBtnEndVenda.setBackground(new java.awt.Color(0, 204, 102));
        jBtnEndVenda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jBtnEndVenda.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEndVenda.setText("Finalizar venda");
        jBtnEndVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEndVendaActionPerformed(evt);
            }
        });
        jBtnEndVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ENTER(evt);
            }
        });

        javax.swing.GroupLayout jPanConfirmCompraLayout = new javax.swing.GroupLayout(jPanConfirmCompra);
        jPanConfirmCompra.setLayout(jPanConfirmCompraLayout);
        jPanConfirmCompraLayout.setHorizontalGroup(
            jPanConfirmCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanConfirmCompraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanConfirmCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jFvalorTotProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanConfirmCompraLayout.createSequentialGroup()
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnEndVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanConfirmCompraLayout.setVerticalGroup(
            jPanConfirmCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanConfirmCompraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFvalorTotProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanConfirmCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnEndVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPdadosFinalProdutoLayout = new javax.swing.GroupLayout(jPdadosFinalProduto);
        jPdadosFinalProduto.setLayout(jPdadosFinalProdutoLayout);
        jPdadosFinalProdutoLayout.setHorizontalGroup(
            jPdadosFinalProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosFinalProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPdadosFinalProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanConfirmCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPdadosFinalProdutoLayout.setVerticalGroup(
            jPdadosFinalProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdadosFinalProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanConfirmCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jPanel1.add(jPdadosFinalProduto);
        jPdadosFinalProduto.setBounds(530, 150, 440, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEndVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEndVendaActionPerformed

        
    }//GEN-LAST:event_jBtnEndVendaActionPerformed

    private void ENTER(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ENTER
         FinalizarVenda endVenda = new FinalizarVenda();
        EndVendaController controllerVenda = new  EndVendaController(endVenda);
        endVenda.setVisible(true);       
        
        
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        // Chama o método do botão diretamente
        ENTER(new java.awt.event.ActionEvent(this, 0));
        
        // Adicione o restante da lógica aqui, se necessário
        FinalizarVenda endVenda = new FinalizarVenda();
        EndVendaController controllerVenda = new EndVendaController(endVenda);
        endVenda.setVisible(true); 
    }*/
    }//GEN-LAST:event_ENTER

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Faturamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faturamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faturamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faturamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Faturamento dialog = new Faturamento(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnBuscarCliente;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEndVenda;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFvalorTotProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanConfirmCompra;
    private javax.swing.JPanel jPanDadosCliente;
    private javax.swing.JPanel jPanDadosProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBtnAdicionar;
    private javax.swing.JPanel jPanelCodigoBarras;
    private javax.swing.JPanel jPdadosFinalProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodCliente;
    private javax.swing.JTextField jTNomeProduto;
    private javax.swing.JTextField jTQtdProduto;
    private javax.swing.JTextField jTVlorProduto;
    private javax.swing.JTable jTableDadosProduto;
    private javax.swing.JTextField jTnomeCliente;
    // End of variables declaration//GEN-END:variables

 
}
