package frontEnd.cadastro;

import dao.FuncionarioDao;
import entidade.Funcionario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import utilitarios.FuncionarioTableModel;
import utilitarios.ValidaCNPJ;
import utilitarios.ValidaCPF;

public class GuiCadastroFuncionarios extends JDialog {

    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
    public final FuncionarioDao dao;
    public final FuncionarioTableModel tabela;
    Funcionario funcionario = new Funcionario();

    public GuiCadastroFuncionarios(FuncionarioDao dao, FuncionarioTableModel tabela) {
        this.dao = dao;
        this.tabela = tabela;
        initComponents();
        definirEventos();

    }

    public void editar(int id) {
        btSalvar.setText("Editar");
        try {
            funcionario = dao.getFuncionario(id);
            tfCpf.setText(funcionario.getCpf());
            tfRG.setText(funcionario.getRg());
            tfCodigo.setText(String.valueOf(funcionario.getId()));
            tfNome.setText(funcionario.getNome());
            tfEmail.setText(funcionario.getEmail());
            tfCep.setText(funcionario.getCep());
            cbTipo.setSelectedItem(funcionario.getTipo());
            tfLogradouro.setText(funcionario.getLogradouro());
            tfFoneResid.setText(funcionario.getFoneResidencial());
            tfNumero.setText(funcionario.getNumero());
            tfComplemento.setText(funcionario.getComplemento());
            tfFoneCelular.setText(funcionario.getFoneCelular());
            tfBairro.setText(funcionario.getBairro());
            cbUF.setSelectedItem(funcionario.getUf());
            tfMunicipio.setText(funcionario.getMunicipio());
            tfDataAdmissao.setText(String.valueOf(funcionario.getAdmissao()));
            tfDataDemissao.setText(String.valueOf(funcionario.getDemissao()));
            tfNumeroRegistro.setText(funcionario.getNumeroRegistro());
            tfSalario.setText(String.valueOf(funcionario.getSalario()));
            tfExtra.setText(String.valueOf(funcionario.getExtra()));
            tfApelido.setText(funcionario.getApelido());
            tfPis.setText(funcionario.getPis());
            tfDataNascimento.setText(String.valueOf(funcionario.getNascimento()));
            cbAtivo.setSelected(Boolean.parseBoolean(funcionario.getAtivo()));
            verificaAtivo();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GuiCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        lbCnpjCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbCep = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter mascaraCEP = null;
        try{
            mascaraCEP= new javax.swing.text.MaskFormatter("##.###-###");
            mascaraCEP.setPlaceholderCharacter('_');

        }
        catch (java.text.ParseException exc) {}
        tfCep = new javax.swing.JFormattedTextField(mascaraCEP);
        lbTipo = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        lbLogradouro = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        lbFoneResid = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter mascara = null;
        try{
            mascara= new javax.swing.text.MaskFormatter("(##) ####-####");
            mascara.setPlaceholderCharacter('_');

        }
        catch (java.text.ParseException exc) {}
        tfFoneResid = new javax.swing.JFormattedTextField(mascara);
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbFoneComercial = new javax.swing.JLabel();
        tfFoneCelular = new javax.swing.JFormattedTextField(mascara);
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbUF = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox();
        lbMunicipio = new javax.swing.JLabel();
        tfMunicipio = new javax.swing.JTextField();
        cbAtivo = new javax.swing.JCheckBox();
        lbRG = new javax.swing.JLabel();
        tfRG = new javax.swing.JTextField();
        lbDataAdmissao = new javax.swing.JLabel();
        tfDataAdmissao = new javax.swing.JFormattedTextField();
        lbDataDemissao = new javax.swing.JLabel();
        tfDataDemissao = new javax.swing.JFormattedTextField();
        lbNumeroRegistro = new javax.swing.JLabel();
        tfNumeroRegistro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        tfExtra = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        tfApelido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDataNascimento = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        cadastraLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionarios");
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModal(true);
        setName("guiCadastroClientes"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbCnpjCpf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbCnpjCpf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCnpjCpf.setText("CPF:");
        lbCnpjCpf.setFocusable(false);
        lbCnpjCpf.setName("lbCNPJCPF"); // NOI18N
        lbCnpjCpf.setPreferredSize(new java.awt.Dimension(100, 19));

        tfCpf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfCpf.setNextFocusableComponent(tfRG);
        tfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                verificaCnpjCpf(evt);
            }
        });

        lbCodigo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbCodigo.setText("Código:");
        lbCodigo.setFocusable(false);
        lbCodigo.setRequestFocusEnabled(false);

        tfCodigo.setEditable(false);
        tfCodigo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfCodigo.setFocusable(false);
        tfCodigo.setRequestFocusEnabled(false);

        lbNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbNome.setText("Nome:");
        lbNome.setFocusable(false);
        lbNome.setPreferredSize(new java.awt.Dimension(100, 19));
        lbNome.setRequestFocusEnabled(false);

        tfNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfNome.setNextFocusableComponent(tfEmail);

        lbEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbEmail.setText("e-mail:");
        lbEmail.setFocusable(false);
        lbEmail.setPreferredSize(new java.awt.Dimension(100, 19));
        lbEmail.setRequestFocusEnabled(false);

        tfEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfEmail.setNextFocusableComponent(tfCep);

        lbCep.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbCep.setText("CEP:");
        lbCep.setFocusable(false);
        lbCep.setPreferredSize(new java.awt.Dimension(100, 19));
        lbCep.setRequestFocusEnabled(false);

        tfCep.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfCep.setNextFocusableComponent(cbTipo);
        tfCep.setPreferredSize(new java.awt.Dimension(200, 31));

        lbTipo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbTipo.setText("Tipo:");
        lbTipo.setFocusable(false);
        lbTipo.setRequestFocusEnabled(false);

        cbTipo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aeroporto", "Alameda", "Avenida", "Campo", "Chácara", "Colônia", "Condomínio", "Conjunto", "Distrito", "Esplanada", "Estação", "Estrada", "Favela", "Fazenda", "Feira", "Jardim", "Ladeira", "Lago", "Lagoa", "Largo", "Loteamento", "Morro", "Núcleo", "Parque", "Passarela", "Pátio", "Praça", "Quadra", "Recanto", "Residencial", "Rodovia", "Rua", "Setor", "Sítio", "Travessa", "Trecho", "Trevo", "Vale", "Vereda", "Via", "Viaduto", "Viela", "Vila" }));
        cbTipo.setNextFocusableComponent(tfLogradouro);

        lbLogradouro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbLogradouro.setText("Logradouro:");
        lbLogradouro.setFocusable(false);
        lbLogradouro.setPreferredSize(new java.awt.Dimension(100, 19));
        lbLogradouro.setRequestFocusEnabled(false);

        tfLogradouro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfLogradouro.setNextFocusableComponent(tfFoneResid);
        tfLogradouro.setPreferredSize(new java.awt.Dimension(70, 31));

        lbFoneResid.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbFoneResid.setText("Fone Resid:");
        lbFoneResid.setFocusable(false);
        lbFoneResid.setRequestFocusEnabled(false);

        tfFoneResid.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfFoneResid.setNextFocusableComponent(tfNumero);

        lbNumero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbNumero.setText("Número:");
        lbNumero.setToolTipText("");
        lbNumero.setFocusable(false);
        lbNumero.setMaximumSize(new java.awt.Dimension(100, 19));
        lbNumero.setPreferredSize(new java.awt.Dimension(100, 19));
        lbNumero.setRequestFocusEnabled(false);

        tfNumero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfNumero.setNextFocusableComponent(tfComplemento);
        tfNumero.setPreferredSize(new java.awt.Dimension(70, 31));

        lbComplemento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbComplemento.setText("Complemento:");
        lbComplemento.setFocusable(false);
        lbComplemento.setRequestFocusEnabled(false);

        tfComplemento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfComplemento.setNextFocusableComponent(tfFoneCelular);

        lbFoneComercial.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbFoneComercial.setText("Fone Celular:");
        lbFoneComercial.setFocusable(false);
        lbFoneComercial.setRequestFocusEnabled(false);

        tfFoneCelular.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfFoneCelular.setNextFocusableComponent(tfBairro);

        lbBairro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbBairro.setText("Bairro:");
        lbBairro.setFocusable(false);
        lbBairro.setPreferredSize(new java.awt.Dimension(100, 19));
        lbBairro.setRequestFocusEnabled(false);

        tfBairro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        lbUF.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbUF.setText("UF:");
        lbUF.setFocusable(false);
        lbUF.setPreferredSize(new java.awt.Dimension(100, 19));
        lbUF.setRequestFocusEnabled(false);

        cbUF.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cbUF.setNextFocusableComponent(tfMunicipio);

        lbMunicipio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbMunicipio.setText("Município:");
        lbMunicipio.setFocusable(false);
        lbMunicipio.setRequestFocusEnabled(false);

        tfMunicipio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        cbAtivo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbAtivo.setSelected(true);
        cbAtivo.setText("Ativo");
        cbAtivo.setRequestFocusEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbAtivo, org.jdesktop.beansbinding.ELProperty.create("${selected}"), cbAtivo, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        lbRG.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbRG.setText("RG:");

        tfRG.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfRG.setNextFocusableComponent(tfNome);

        lbDataAdmissao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDataAdmissao.setText("Data Admissão:");

        tfDataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tfDataAdmissao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        lbDataDemissao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDataDemissao.setText("Data Demissão:");

        tfDataDemissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tfDataDemissao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        lbNumeroRegistro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbNumeroRegistro.setText("Nº Registro:");

        tfNumeroRegistro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Salário:");

        tfSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        tfSalario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfSalario.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Extra:");

        tfExtra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        tfExtra.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfExtra.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Apelido:");

        tfApelido.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("PIS:");

        tfPis.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Nasc:");

        tfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tfDataNascimento.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(lbRG)
                        .addGap(18, 18, 18)
                        .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbAtivo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfBairro))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbComplemento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfComplemento))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(lbTipo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbDataAdmissao)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfDataAdmissao))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbMunicipio)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfMunicipio))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lbDataDemissao)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(tfDataDemissao))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tfExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel3))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPis, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNumeroRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumeroRegistro))
                            .addComponent(tfApelido)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFoneComercial)
                                    .addComponent(lbFoneResid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFoneResid)
                                    .addComponent(tfFoneCelular))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRG)
                    .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFoneResid)
                    .addComponent(tfFoneResid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbComplemento)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFoneComercial)
                    .addComponent(tfFoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMunicipio)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataAdmissao)
                    .addComponent(lbDataDemissao)
                    .addComponent(tfDataDemissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumeroRegistro)
                    .addComponent(tfNumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbAtivo))
        );

        btSalvar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add 24x24.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Close 24x24.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        cadastraLogin.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cadastraLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Chaves 24x24.png"))); // NOI18N
        cadastraLogin.setText("Usuario do Sistema");
        cadastraLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cadastraLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastraLogin))
                .addContainerGap())
        );

        bindingGroup.bind();

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-530)/2, 800, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        GuiCadastroFuncionarios.this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if ("".equals(tfCodigo.getText())) {
            funcionario.setCpf(tfCpf.getText());
            funcionario.setNome(tfNome.getText().toUpperCase());
            funcionario.setEmail(tfEmail.getText());
            funcionario.setCep(tfCep.getText());
            funcionario.setTipo((String) cbTipo.getSelectedItem());
            funcionario.setLogradouro(tfLogradouro.getText());
            funcionario.setFoneResidencial(tfFoneResid.getText());
            funcionario.setNumero(tfNumero.getText());
            funcionario.setComplemento(tfComplemento.getText());
            funcionario.setFoneCelular(tfFoneCelular.getText());
            funcionario.setBairro(tfBairro.getText());
            funcionario.setUf((String) cbUF.getSelectedItem());
            funcionario.setMunicipio(tfMunicipio.getText());
            funcionario.setAdmissao(tfDataAdmissao.getText());
            funcionario.setDemissao(tfDataDemissao.getText());
            funcionario.setNumeroRegistro(tfNumeroRegistro.getText());
            funcionario.setSalario(tfSalario.getText());
            funcionario.setExtra(tfExtra.getText());
            funcionario.setApelido(tfApelido.getText());
            funcionario.setPis(tfPis.getText());
            funcionario.setNascimento(tfDataNascimento.getText());
            funcionario.setAtivo(String.valueOf(cbAtivo.isSelected()));
            verificaAtivo();
            try {
                dao.adicionaFuncionario(funcionario);
                JOptionPane.showMessageDialog(this, "Funcionario adicionado com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
                tfCodigo.setText(String.valueOf(funcionario.getId()));
                tabela.adicionaFuncionario(funcionario);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel adicionar o funcionario." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!"".equals(tfCodigo.getText())) {
            funcionario.setCpf(tfCpf.getText());
            funcionario.setNome(tfNome.getText().toUpperCase());
            funcionario.setEmail(tfEmail.getText());
            funcionario.setCep(tfCep.getText());
            funcionario.setTipo((String) cbTipo.getSelectedItem());
            funcionario.setLogradouro(tfLogradouro.getText());
            funcionario.setFoneResidencial(tfFoneResid.getText());
            funcionario.setNumero(tfNumero.getText());
            funcionario.setComplemento(tfComplemento.getText());
            funcionario.setFoneCelular(tfFoneCelular.getText());
            funcionario.setBairro(tfBairro.getText());
            funcionario.setUf((String) cbUF.getSelectedItem());
            funcionario.setMunicipio(tfMunicipio.getText());
            funcionario.setAdmissao(tfDataAdmissao.getText());
            funcionario.setDemissao(tfDataDemissao.getText());
            funcionario.setNumeroRegistro(tfNumeroRegistro.getText());
            funcionario.setSalario(tfSalario.getText());
            funcionario.setExtra(tfExtra.getText());
            funcionario.setApelido(tfApelido.getText());
            funcionario.setPis(tfPis.getText());
            funcionario.setNascimento(tfDataNascimento.getText());
            funcionario.setAtivo(String.valueOf(cbAtivo.isSelected()));
            verificaAtivo();
            try {
                dao.atualizaFuncionario(funcionario);
                JOptionPane.showMessageDialog(this, "Dados alterados com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
                tabela.editaFuncionario(dao.getTodosFuncionarios());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel alterar os dados do cliente." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void verificaCnpjCpf(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificaCnpjCpf
        if (tfCpf.getText().length() == 11) {
            if (ValidaCPF.isCPF(tfCpf.getText()) == true) {
                tfCpf.setText(ValidaCPF.imprimeCPF(tfCpf.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "O CPF informado não é valido", "CNPJ/CPF invalido", JOptionPane.ERROR_MESSAGE);
            }
        } else if (tfCpf.getText().length() == 14) {
            if (ValidaCNPJ.isCNPJ(tfCpf.getText()) == true) {
                tfCpf.setText(ValidaCNPJ.imprimeCNPJ(tfCpf.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "O CNPJ informado não é valido", "CNPJ/CPF invalido", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Informe um CNPJ ou CPF valido.", "CNPJ/CPF invalido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verificaCnpjCpf

    private void cadastraLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraLoginActionPerformed
                if(!"".equals(tfCodigo.getText())){
                    int idFuncionario = funcionario.getId();
                    if(funcionario.getId_Login()== 0){
                        GuiCadastroLogin guiCadastroLogin = new GuiCadastroLogin(idFuncionario,dao);
                        guiCadastroLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                        guiCadastroLogin.setVisible(true);
                    }else{
                        int idLogin = funcionario.getId_Login();
                        GuiCadastroLogin guiCadastroLogin;
                        try {
                            guiCadastroLogin = new GuiCadastroLogin(idFuncionario,idLogin,dao);
                            guiCadastroLogin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                            guiCadastroLogin.setVisible(true);
                        } catch (SQLException ex) {
                            Logger.getLogger(GuiCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
    }//GEN-LAST:event_cadastraLoginActionPerformed

    private void verificaAtivo() {
        if (cbAtivo.isSelected() == false) {
            tfCpf.setEditable(false);
            tfCpf.setFocusable(false);
            tfRG.setEditable(false);
            tfRG.setFocusable(false);
            tfCodigo.setEditable(false);
            tfCodigo.setFocusable(false);
            tfNome.setEditable(false);
            tfNome.setFocusable(false);
            tfEmail.setEditable(false);
            tfEmail.setFocusable(false);
            tfCep.setEditable(false);
            tfCep.setFocusable(false);
            cbTipo.setEditable(false);
            cbTipo.setFocusable(false);
            tfLogradouro.setEditable(false);
            tfLogradouro.setFocusable(false);
            tfFoneResid.setEditable(false);
            tfFoneResid.setFocusable(false);
            tfNumero.setEditable(false);
            tfNumero.setFocusable(false);
            tfComplemento.setEditable(false);
            tfComplemento.setFocusable(false);
            tfFoneCelular.setEditable(false);
            tfFoneCelular.setFocusable(false);
            tfBairro.setEditable(false);
            tfBairro.setFocusable(false);
            cbUF.setEditable(false);
            cbUF.setFocusable(false);
            tfMunicipio.setEditable(false);
            tfMunicipio.setFocusable(false);
            tfDataAdmissao.setEditable(false);
            tfDataAdmissao.setFocusable(false);
            tfDataDemissao.setEditable(false);
            tfDataDemissao.setFocusable(false);
            tfNumeroRegistro.setEditable(false);
            tfNumeroRegistro.setFocusable(false);
            tfSalario.setEditable(false);
            tfSalario.setFocusable(false);
            tfExtra.setEditable(false);
            tfExtra.setFocusable(false);
            tfApelido.setEditable(false);
            tfApelido.setFocusable(false);
            tfPis.setEditable(false);
            tfPis.setFocusable(false);
            tfDataNascimento.setEditable(false);
            tfDataNascimento.setFocusable(false);
        }
        if (cbAtivo.isSelected() == true) {
            tfCpf.setEditable(true);
            tfCpf.setFocusable(true);
            tfRG.setEditable(true);
            tfRG.setFocusable(true);
            tfCodigo.setEditable(true);
            tfCodigo.setFocusable(true);
            tfNome.setEditable(true);
            tfNome.setFocusable(true);
            tfEmail.setEditable(true);
            tfEmail.setFocusable(true);
            tfCep.setEditable(true);
            tfCep.setFocusable(true);
            cbTipo.setEditable(true);
            cbTipo.setFocusable(true);
            tfLogradouro.setEditable(true);
            tfLogradouro.setFocusable(true);
            tfFoneResid.setEditable(true);
            tfFoneResid.setFocusable(true);
            tfNumero.setEditable(true);
            tfNumero.setFocusable(true);
            tfComplemento.setEditable(true);
            tfComplemento.setFocusable(true);
            tfFoneCelular.setEditable(true);
            tfFoneCelular.setFocusable(true);
            tfBairro.setEditable(true);
            tfBairro.setFocusable(true);
            cbUF.setEditable(true);
            cbUF.setFocusable(true);
            tfMunicipio.setEditable(true);
            tfMunicipio.setFocusable(true);
            tfDataAdmissao.setEditable(true);
            tfDataAdmissao.setFocusable(true);
            tfDataDemissao.setEditable(true);
            tfDataDemissao.setFocusable(true);
            tfNumeroRegistro.setEditable(true);
            tfNumeroRegistro.setFocusable(true);
            tfSalario.setEditable(true);
            tfSalario.setFocusable(true);
            tfExtra.setEditable(true);
            tfExtra.setFocusable(true);
            tfApelido.setEditable(true);
            tfApelido.setFocusable(true);
            tfPis.setEditable(true);
            tfPis.setFocusable(true);
            tfDataNascimento.setEditable(true);
            tfDataNascimento.setFocusable(true);
        }
    }

    public void definirEventos() {
        cbAtivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificaAtivo();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton cadastraLogin;
    private javax.swing.JCheckBox cbAtivo;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCnpjCpf;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbDataAdmissao;
    private javax.swing.JLabel lbDataDemissao;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFoneComercial;
    private javax.swing.JLabel lbFoneResid;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbNumeroRegistro;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfApelido;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JFormattedTextField tfDataAdmissao;
    private javax.swing.JFormattedTextField tfDataDemissao;
    private javax.swing.JFormattedTextField tfDataNascimento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JFormattedTextField tfExtra;
    private javax.swing.JFormattedTextField tfFoneCelular;
    private javax.swing.JFormattedTextField tfFoneResid;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfNumeroRegistro;
    private javax.swing.JTextField tfPis;
    private javax.swing.JTextField tfRG;
    private javax.swing.JFormattedTextField tfSalario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
