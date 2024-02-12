/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author darli
 */
public class TelaCompra extends javax.swing.JDialog {

    public TelaCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public TelaCompra() {
        initComponents();
    }

    public JButton getjBtnBuscarCliente() {
        return jBtnBuscarCliente;
    }

    public void setjBtnBuscarCliente(JButton jBtnBuscarCliente) {
        this.jBtnBuscarCliente = jBtnBuscarCliente;
    }

    public JButton getjBtnCANCELAR() {
        return jBtnCANCELAR;
    }

    public void setjBtnCANCELAR(JButton jBtnCANCELAR) {
        this.jBtnCANCELAR = jBtnCANCELAR;
    }

    public JComboBox<String> getjComboBoxDesconto() {
        return jComboBoxDesconto;
    }

    public void setjComboBoxDesconto(JComboBox<String> jComboBoxDesconto) {
        this.jComboBoxDesconto = jComboBoxDesconto;
    }

    public JFormattedTextField getjFcodBarras() {
        return jFcodBarras;
    }

    public void setjFcodBarras(JFormattedTextField jFcodBarras) {
        this.jFcodBarras = jFcodBarras;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
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

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
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

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanelbbtnsFim() {
        return jPanelbbtnsFim;
    }

    public void setjPanelbbtnsFim(JPanel jPanelbbtnsFim) {
        this.jPanelbbtnsFim = jPanelbbtnsFim;
    }

    public JPanel getjPanelcodBarras() {
        return jPanelcodBarras;
    }

    public void setjPanelcodBarras(JPanel jPanelcodBarras) {
        this.jPanelcodBarras = jPanelcodBarras;
    }

    public JPanel getjPaneldadosCliente() {
        return jPaneldadosCliente;
    }

    public void setjPaneldadosCliente(JPanel jPaneldadosCliente) {
        this.jPaneldadosCliente = jPaneldadosCliente;
    }

    public JPanel getjPanelddosProduto() {
        return jPanelddosProduto;
    }

    public void setjPanelddosProduto(JPanel jPanelddosProduto) {
        this.jPanelddosProduto = jPanelddosProduto;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JFormattedTextField getjFquantidade() {
        return jFquantidade;
    }

    public void setjFquantidade(JFormattedTextField jFquantidade) {
        this.jFquantidade = jFquantidade;
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

    public JTextField getjTobservacao() {
        return jTobservacao;
    }

    public void setjTobservacao(JTextField jTobservacao) {
        this.jTobservacao = jTobservacao;
    }

    public JTextField getjTvalorTotal() {
        return jTvalorTotal;
    }

    public void setjTvalorTotal(JTextField jTvalorTotal) {
        this.jTvalorTotal = jTvalorTotal;
    }

    public JButton getJbFinalizarCompra() {
        return jbFinalizarCompra;
    }

    public void setJbFinalizarCompra(JButton jbFinalizarCompra) {
        this.jbFinalizarCompra = jbFinalizarCompra;
    }

    public JFormattedTextField getjFcodCarteirinha() {
        return jFcodCarteirinha;
    }

    public void setjFcodCarteirinha(JFormattedTextField jFcodCarteirinha) {
        this.jFcodCarteirinha = jFcodCarteirinha;
    }
    
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelcodBarras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jFcodBarras = new javax.swing.JFormattedTextField();
        jPanelddosProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDadosProduto = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxDesconto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTvalorTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTobservacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFquantidade = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jBtnBuscarCliente = new javax.swing.JButton();
        jPaneldadosCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTnomeCliente = new javax.swing.JTextField();
        jFcodCarteirinha = new javax.swing.JFormattedTextField();
        jPanelbbtnsFim = new javax.swing.JPanel();
        jBtnCANCELAR = new javax.swing.JButton();
        jbFinalizarCompra = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(467, 467, 467))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Código de Barras");

        try {
            jFcodBarras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFcodBarras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelcodBarrasLayout = new javax.swing.GroupLayout(jPanelcodBarras);
        jPanelcodBarras.setLayout(jPanelcodBarrasLayout);
        jPanelcodBarrasLayout.setHorizontalGroup(
            jPanelcodBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcodBarrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFcodBarras)
                .addContainerGap())
        );
        jPanelcodBarrasLayout.setVerticalGroup(
            jPanelcodBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcodBarrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelcodBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFcodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanelddosProduto.setBackground(new java.awt.Color(255, 255, 255));

        jTableDadosProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Qtd.", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTableDadosProduto);
        if (jTableDadosProduto.getColumnModel().getColumnCount() > 0) {
            jTableDadosProduto.getColumnModel().getColumn(0).setMaxWidth(100);
            jTableDadosProduto.getColumnModel().getColumn(1).setMaxWidth(400);
            jTableDadosProduto.getColumnModel().getColumn(2).setMaxWidth(130);
            jTableDadosProduto.getColumnModel().getColumn(3).setMaxWidth(130);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Desconto");
        jLabel3.setToolTipText("");

        jComboBoxDesconto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBoxDesconto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem desconto", "Aluno", "Professor", "Funcionário" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Valor Total");

        jTvalorTotal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTvalorTotal.setText("R$ ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Observação");

        jTobservacao.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Quantidade");

        try {
            jFquantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFquantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFquantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ENTER(evt);
            }
        });

        javax.swing.GroupLayout jPanelddosProdutoLayout = new javax.swing.GroupLayout(jPanelddosProduto);
        jPanelddosProduto.setLayout(jPanelddosProdutoLayout);
        jPanelddosProdutoLayout.setHorizontalGroup(
            jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTobservacao)
            .addGroup(jPanelddosProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(jPanelddosProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(119, 119, 119)
                        .addGroup(jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelddosProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTvalorTotal)))
                    .addGroup(jPanelddosProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelddosProdutoLayout.setVerticalGroup(
            jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelddosProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelddosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTobservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jBtnBuscarCliente.setBackground(new java.awt.Color(0, 153, 153));
        jBtnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jBtnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBuscarCliente.setText("Buscar Cliente");
        jBtnBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                F2(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Carteirinha");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Nome");

        jTnomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        try {
            jFcodCarteirinha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFcodCarteirinha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFcodCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFcodCarteirinhaActionPerformed(evt);
            }
        });
        jFcodCarteirinha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ENTER(evt);
            }
        });

        javax.swing.GroupLayout jPaneldadosClienteLayout = new javax.swing.GroupLayout(jPaneldadosCliente);
        jPaneldadosCliente.setLayout(jPaneldadosClienteLayout);
        jPaneldadosClienteLayout.setHorizontalGroup(
            jPaneldadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneldadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTnomeCliente)
                    .addGroup(jPaneldadosClienteLayout.createSequentialGroup()
                        .addGroup(jPaneldadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFcodCarteirinha))
                .addContainerGap())
        );
        jPaneldadosClienteLayout.setVerticalGroup(
            jPaneldadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFcodCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPaneldadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneldadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelbbtnsFim.setBackground(new java.awt.Color(204, 255, 102));

        jBtnCANCELAR.setBackground(new java.awt.Color(255, 51, 0));
        jBtnCANCELAR.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jBtnCANCELAR.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCANCELAR.setText("Cancelar");
        jBtnCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCANCELARActionPerformed(evt);
            }
        });
        jBtnCANCELAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                C(evt);
            }
        });

        jbFinalizarCompra.setBackground(new java.awt.Color(0, 153, 153));
        jbFinalizarCompra.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jbFinalizarCompra.setText("Finalizar Venda");

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setText("F2: Buscar Cliente");

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel14.setText("ENTER: busar código barras");

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setText("C: Cancelar produto");

        javax.swing.GroupLayout jPanelbbtnsFimLayout = new javax.swing.GroupLayout(jPanelbbtnsFim);
        jPanelbbtnsFim.setLayout(jPanelbbtnsFimLayout);
        jPanelbbtnsFimLayout.setHorizontalGroup(
            jPanelbbtnsFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbbtnsFimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelbbtnsFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jBtnCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jbFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanelbbtnsFimLayout.setVerticalGroup(
            jPanelbbtnsFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbbtnsFimLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGroup(jPanelbbtnsFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelbbtnsFimLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanelbbtnsFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnCANCELAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbbtnsFimLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel14))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelcodBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelddosProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelbbtnsFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelcodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelddosProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelbbtnsFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void F2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F2
        // TODO add your handling code here:
    }//GEN-LAST:event_F2

    private void C(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_C
        // TODO add your handling code here:
    }//GEN-LAST:event_C

    private void jBtnCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCANCELARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCANCELARActionPerformed

    private void jFcodCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFcodCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFcodCarteirinhaActionPerformed

    private void ENTER(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ENTER
        // TODO add your handling code here:
    }//GEN-LAST:event_ENTER

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
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCompra dialog = new TelaCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnBuscarCliente;
    private javax.swing.JButton jBtnCANCELAR;
    private javax.swing.JComboBox<String> jComboBoxDesconto;
    private javax.swing.JFormattedTextField jFcodBarras;
    private javax.swing.JFormattedTextField jFcodCarteirinha;
    private javax.swing.JFormattedTextField jFquantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelbbtnsFim;
    private javax.swing.JPanel jPanelcodBarras;
    private javax.swing.JPanel jPaneldadosCliente;
    private javax.swing.JPanel jPanelddosProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDadosProduto;
    private javax.swing.JTextField jTnomeCliente;
    private javax.swing.JTextField jTobservacao;
    private javax.swing.JTextField jTvalorTotal;
    private javax.swing.JButton jbFinalizarCompra;
    // End of variables declaration//GEN-END:variables
}
