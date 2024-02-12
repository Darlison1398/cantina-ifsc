
package view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TestejFrameForm
     */
    public CadastroCliente() {
        initComponents();
        
        
        
    }

    public JButton getjButtonAdicionarCep() {
        return jButtonAdicionarCep;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JButton getjButtonConsultar() {
        return jButtonConsultar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public JButton getjButtonPesquisarCep() {
        return jButtonPesquisarCep;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    public JCheckBox getjCheckBoxStatus() {
        return jCheckBoxStatus;
    }

    public void setjCheckBoxStatus(JCheckBox jCheckBoxStatus) {
        this.jCheckBoxStatus = jCheckBoxStatus;
    }

    public JFormattedTextField getjFormattedTextFieldCEP() {
        return jFormattedTextFieldCEP;
    }

    public void setjFormattedTextFieldCEP(JFormattedTextField jFormattedTextFieldCEP) {
        this.jFormattedTextFieldCEP = jFormattedTextFieldCEP;
    }

    public JFormattedTextField getjFormattedTextFieldCPF() {
        return jFormattedTextFieldCPF;
    }

    public void setjFormattedTextFieldCPF(JFormattedTextField jFormattedTextFieldCPF) {
        this.jFormattedTextFieldCPF = jFormattedTextFieldCPF;
    }

    public JFormattedTextField getjFormattedTextFieldDataNascimento() {
        return jFormattedTextFieldDataNascimento;
    }

    public void setjFormattedTextFieldDataNascimento(JFormattedTextField jFormattedTextFieldDataNascimento) {
        this.jFormattedTextFieldDataNascimento = jFormattedTextFieldDataNascimento;
    }

    public JFormattedTextField getjFormattedTextFieldFone1() {
        return jFormattedTextFieldFone1;
    }

    public void setjFormattedTextFieldFone1(JFormattedTextField jFormattedTextFieldFone1) {
        this.jFormattedTextFieldFone1 = jFormattedTextFieldFone1;
    }

    public JFormattedTextField getjFormattedTextFieldFone2() {
        return jFormattedTextFieldFone2;
    }

    public void setjFormattedTextFieldFone2(JFormattedTextField jFormattedTextFieldFone2) {
        this.jFormattedTextFieldFone2 = jFormattedTextFieldFone2;
    }

    public JFormattedTextField getjFormattedTextFieldRg() {
        return jFormattedTextFieldRg;
    }

    public void setjFormattedTextFieldRg(JFormattedTextField jFormattedTextFieldRg) {
        this.jFormattedTextFieldRg = jFormattedTextFieldRg;
    }

    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }

    public void setjTextFieldBairro(JTextField jTextFieldBairro) {
        this.jTextFieldBairro = jTextFieldBairro;
    }

    public JTextField getjTextFieldCidade() {
        return jTextFieldCidade;
    }

    public void setjTextFieldCidade(JTextField jTextFieldCidade) {
        this.jTextFieldCidade = jTextFieldCidade;
    }

    public JTextField getjTextFieldComplementoEndereco() {
        return jTextFieldComplementoEndereco;
    }

    public void setjTextFieldComplementoEndereco(JTextField jTextFieldComplementoEndereco) {
        this.jTextFieldComplementoEndereco = jTextFieldComplementoEndereco;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }



    public JTextField getjTextFieldMatricula() {
        return jTextFieldMatricula;
    }

    public void setjTextFieldMatricula(JTextField jTextFieldMatricula) {
        this.jTextFieldMatricula = jTextFieldMatricula;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }
    
    

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JComboBox<String> getjCUf() {
        return jCUf;
    }

    public void setjCUf(JComboBox<String> jCUf) {
        this.jCUf = jCUf;
    }

    public JTextField getjTlogradouro() {
        return jTlogradouro;
    }

    public void setjTlogradouro(JTextField jTlogradouro) {
        this.jTlogradouro = jTlogradouro;
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelDados = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabelRg = new javax.swing.JLabel();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jLabelNascimento = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jCheckBoxStatus = new javax.swing.JCheckBox();
        jLabelMatricula = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelFone1 = new javax.swing.JLabel();
        jFormattedTextFieldFone1 = new javax.swing.JFormattedTextField();
        jLabelFone2 = new javax.swing.JLabel();
        jFormattedTextFieldFone2 = new javax.swing.JFormattedTextField();
        jLabelCep = new javax.swing.JLabel();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jButtonPesquisarCep = new javax.swing.JButton();
        jButtonAdicionarCep = new javax.swing.JButton();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelComplementoEndereco = new javax.swing.JLabel();
        jTextFieldComplementoEndereco = new javax.swing.JTextField();
        jCUf = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTlogradouro = new javax.swing.JTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastroCliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(626, 376));
        setMinimumSize(new java.awt.Dimension(626, 376));
        setResizable(false);

        jPanelFundo.setBackground(new java.awt.Color(147, 216, 67));
        jPanelFundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(255, 204, 204)));
        jPanelFundo.setMaximumSize(new java.awt.Dimension(626, 413));
        jPanelFundo.setMinimumSize(new java.awt.Dimension(626, 413));

        jPanelDados.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelId.setText("ID");
        jLabelId.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelDados.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 12, -1, -1));

        jTextFieldID.setEditable(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jPanelDados.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 9, 53, -1));

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome.setText("Nome");
        jLabelNome.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelNome.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 46, -1, -1));
        jPanelDados.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 43, 248, -1));

        jLabelCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCPF.setText("CPF");
        jLabelCPF.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelCPF.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 80, -1, -1));

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###. ###. ###- ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });
        jPanelDados.add(jFormattedTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 77, 136, -1));

        jLabelRg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelRg.setText("RG");
        jPanelDados.add(jLabelRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 80, -1, -1));

        try {
            jFormattedTextFieldRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextFieldRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldRgActionPerformed(evt);
            }
        });
        jPanelDados.add(jFormattedTextFieldRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 77, 77, -1));

        jLabelNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNascimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNascimento.setText("DATA/NASCIMENTO");
        jLabelNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelNascimento.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelNascimento.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 46, -1, -1));
        jLabelNascimento.getAccessibleContext().setAccessibleDescription("Data Nascimento"); // NOI18N

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextFieldDataNascimento.setMinimumSize(new java.awt.Dimension(70, 22));
        jPanelDados.add(jFormattedTextFieldDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 43, 76, -1));

        jCheckBoxStatus.setBackground(new java.awt.Color(235, 235, 235));
        jCheckBoxStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxStatus.setText("Ativo");
        jCheckBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxStatusActionPerformed(evt);
            }
        });
        jPanelDados.add(jCheckBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 10, -1, -1));

        jLabelMatricula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMatricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMatricula.setText("Matrícula");
        jLabelMatricula.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelMatricula.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 80, -1, -1));

        jTextFieldMatricula.setMinimumSize(new java.awt.Dimension(70, 22));
        jPanelDados.add(jTextFieldMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 77, 114, -1));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmail.setText("Email");
        jLabelEmail.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelEmail.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 115, -1, -1));
        jPanelDados.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 115, 248, -1));

        jLabelFone1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFone1.setText("Fone 1");
        jLabelFone1.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelFone1.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelFone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 118, -1, -1));

        try {
            jFormattedTextFieldFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFone1.setMinimumSize(new java.awt.Dimension(70, 22));
        jPanelDados.add(jFormattedTextFieldFone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 115, 114, -1));

        jLabelFone2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFone2.setText("Fone 2");
        jLabelFone2.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelFone2.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelFone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 154, -1, -1));

        try {
            jFormattedTextFieldFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFone2.setMinimumSize(new java.awt.Dimension(70, 22));
        jPanelDados.add(jFormattedTextFieldFone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 149, 114, -1));

        jLabelCep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCep.setText("CEP");
        jLabelCep.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelCep.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 154, 29, -1));

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelDados.add(jFormattedTextFieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 149, 91, -1));

        jButtonPesquisarCep.setBackground(new java.awt.Color(153, 255, 153));
        jButtonPesquisarCep.setText("...");
        jButtonPesquisarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarCepActionPerformed(evt);
            }
        });
        jPanelDados.add(jButtonPesquisarCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jButtonAdicionarCep.setBackground(new java.awt.Color(153, 255, 153));
        jButtonAdicionarCep.setText("+");
        jPanelDados.add(jButtonAdicionarCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCidade.setText("Cidade");
        jLabelCidade.setMaximumSize(new java.awt.Dimension(13, 16));
        jLabelCidade.setMinimumSize(new java.awt.Dimension(13, 16));
        jPanelDados.add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jTextFieldCidade.setEditable(false);
        jTextFieldCidade.setMinimumSize(new java.awt.Dimension(70, 22));
        jPanelDados.add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 210, 170, -1));

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBairro.setText("Bairro");
        jPanelDados.add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jTextFieldBairro.setEditable(false);
        jTextFieldBairro.setMinimumSize(new java.awt.Dimension(70, 22));
        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });
        jPanelDados.add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 190, -1));

        jLabelComplementoEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelComplementoEndereco.setText("Complemento");
        jPanelDados.add(jLabelComplementoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));
        jPanelDados.add(jTextFieldComplementoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 527, -1));

        jCUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCUfActionPerformed(evt);
            }
        });
        jPanelDados.add(jCUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Uf");
        jLabel1.setToolTipText("");
        jPanelDados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 37, 16));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Logradouro");
        jPanelDados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 80, -1));
        jPanelDados.add(jTlogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 530, -1));

        jPanelBotoes.setBackground(new java.awt.Color(204, 255, 102));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonNovo.setBackground(new java.awt.Color(0, 153, 153));
        jButtonNovo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Create.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setActionCommand("0");
        jButtonNovo.setBorder(null);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(71, 28));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(71, 28));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(87, 28));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Down.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setActionCommand("1");
        jButtonSalvar.setBorder(null);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(87, 28));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setActionCommand("1");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(71, 28));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(71, 28));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setActionCommand("0");
        jButtonSair.setBorder(null);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonSair.setMaximumSize(new java.awt.Dimension(71, 28));
        jButtonSair.setMinimumSize(new java.awt.Dimension(71, 28));
        jButtonSair.setPreferredSize(new java.awt.Dimension(87, 28));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icones/Find.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setActionCommand("0");
        jButtonConsultar.setBorder(null);
        jButtonConsultar.setMaximumSize(new java.awt.Dimension(87, 28));
        jButtonConsultar.setMinimumSize(new java.awt.Dimension(87, 28));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelTitulo.setBackground(new java.awt.Color(204, 255, 102));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastro Cliente");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

    private void jFormattedTextFieldRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldRgActionPerformed

    private void jCheckBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxStatusActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarCepActionPerformed

    private void jCUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCUfActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarCep;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisarCep;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jCUf;
    private javax.swing.JCheckBox jCheckBoxStatus;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone1;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone2;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplementoEndereco;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFone1;
    private javax.swing.JLabel jLabelFone2;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplementoEndereco;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTlogradouro;
    // End of variables declaration//GEN-END:variables
}
