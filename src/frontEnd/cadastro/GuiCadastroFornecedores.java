package frontEnd.cadastro;

import dao.FornecedorDao;
import entidade.Fornecedor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import utilitarios.FornecedorTableModel;
import utilitarios.ValidaCNPJ;
import utilitarios.ValidaCPF;

public class GuiCadastroFornecedores extends JDialog {

    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
    public final FornecedorDao dao;
    public final FornecedorTableModel tabela;
    Fornecedor fornecedor = new Fornecedor();

    public GuiCadastroFornecedores(FornecedorDao dao, FornecedorTableModel tabela) {
        this.dao = dao;
        this.tabela = tabela;
        initComponents();
        definirEventos();

    }

    public void editar(int id) {
        btSalvar.setText("Editar");
        try {
            fornecedor = dao.getFornecedor(id);
            tfCnpjCpf.setText(fornecedor.getCpfcnpj());
            tfCodigo.setText(String.valueOf(fornecedor.getId()));
            tfNome.setText(fornecedor.getNome());
            tfContato.setText(fornecedor.getContato());
            tfCep.setText(fornecedor.getCep());
            cbTipo.setSelectedItem(fornecedor.getTipo());
            tfLogradouro.setText(fornecedor.getLogradouro());
            tfFone0800.setText(fornecedor.getFone0800());
            tfNumero.setText(fornecedor.getNumero());
            tfComplemento.setText(fornecedor.getComplemento());
            tfFoneComercial.setText(fornecedor.getFoneComercial());
            tfBairro.setText(fornecedor.getBairro());
            tfCelular.setText(fornecedor.getFoneCelular());
            cbUF.setSelectedItem(fornecedor.getUf());
            tfMunicipio.setText(fornecedor.getMunicipio());
            tfFax.setText(fornecedor.getFoneFax());
            cbPais.setSelectedItem(fornecedor.getPais());
            tfInscricaoEstadual.setText((fornecedor.getInscricaoEstadual()));
            tfInscricaoMunicipal.setText(fornecedor.getInscricaoMunicipal());
            tfSite.setText(fornecedor.getSite());
            tfEmail.setText(fornecedor.getEmail());
            tfObs.setText(fornecedor.getObservacoes());
            cbAtivo.setSelected(Boolean.parseBoolean(fornecedor.getAtivo()));
            verificaAtivo();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GuiCadastroFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        lbCnpjCpf = new javax.swing.JLabel();
        tfCnpjCpf = new javax.swing.JFormattedTextField();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbContato = new javax.swing.JLabel();
        tfContato = new javax.swing.JTextField();
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
        lbFone0800 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter mascara = null;
        try{
            mascara= new javax.swing.text.MaskFormatter("(##) ####-####");
            mascara.setPlaceholderCharacter('_');

        }
        catch (java.text.ParseException exc) {}
        tfFone0800 = new javax.swing.JFormattedTextField(mascara);
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbFoneComercial = new javax.swing.JLabel();
        tfFoneComercial = new javax.swing.JFormattedTextField(mascara);
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JFormattedTextField(mascara);
        lbUF = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox();
        lbMunicipio = new javax.swing.JLabel();
        tfMunicipio = new javax.swing.JTextField();
        lbFax = new javax.swing.JLabel();
        tfFax = new javax.swing.JFormattedTextField(mascara);
        lbPais = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfObs = new javax.swing.JTextArea();
        cbAtivo = new javax.swing.JCheckBox();
        lbSite = new javax.swing.JLabel();
        tfSite = new javax.swing.JTextField();
        lbInscricaoEstadual = new javax.swing.JLabel();
        tfInscricaoEstadual = new javax.swing.JTextField();
        lbInscricaoMunicipal = new javax.swing.JLabel();
        tfInscricaoMunicipal = new javax.swing.JTextField();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedores");
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModal(true);
        setName("guiCadastroClientes"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbCnpjCpf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbCnpjCpf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCnpjCpf.setText("CNPJ/CPF:");
        lbCnpjCpf.setFocusable(false);
        lbCnpjCpf.setName("lbCNPJCPF"); // NOI18N
        lbCnpjCpf.setPreferredSize(new java.awt.Dimension(100, 19));

        tfCnpjCpf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfCnpjCpf.setNextFocusableComponent(tfNome);
        tfCnpjCpf.addFocusListener(new java.awt.event.FocusAdapter() {
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
        lbNome.setText("Razao Social:");
        lbNome.setFocusable(false);
        lbNome.setPreferredSize(new java.awt.Dimension(100, 19));
        lbNome.setRequestFocusEnabled(false);

        tfNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfNome.setNextFocusableComponent(tfContato);

        lbContato.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbContato.setText("Contato:");
        lbContato.setFocusable(false);
        lbContato.setPreferredSize(new java.awt.Dimension(100, 19));
        lbContato.setRequestFocusEnabled(false);

        tfContato.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfContato.setNextFocusableComponent(tfCep);

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

        cbTipo.setEditable(true);
        cbTipo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aeroporto", "Alameda", "Avenida", "Campo", "Chácara", "Colônia", "Condomínio", "Conjunto", "Distrito", "Esplanada", "Estação", "Estrada", "Favela", "Fazenda", "Feira", "Jardim", "Ladeira", "Lago", "Lagoa", "Largo", "Loteamento", "Morro", "Núcleo", "Parque", "Passarela", "Pátio", "Praça", "Quadra", "Recanto", "Residencial", "Rodovia", "Rua", "Setor", "Sítio", "Travessa", "Trecho", "Trevo", "Vale", "Vereda", "Via", "Viaduto", "Viela", "Vila" }));
        cbTipo.setNextFocusableComponent(tfLogradouro);

        lbLogradouro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbLogradouro.setText("Logradouro:");
        lbLogradouro.setFocusable(false);
        lbLogradouro.setPreferredSize(new java.awt.Dimension(100, 19));
        lbLogradouro.setRequestFocusEnabled(false);

        tfLogradouro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfLogradouro.setNextFocusableComponent(tfFone0800);
        tfLogradouro.setPreferredSize(new java.awt.Dimension(70, 31));

        lbFone0800.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbFone0800.setText("Fone 0800:");
        lbFone0800.setFocusable(false);
        lbFone0800.setRequestFocusEnabled(false);

        tfFone0800.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfFone0800.setNextFocusableComponent(tfNumero);

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
        tfComplemento.setNextFocusableComponent(tfFoneComercial);

        lbFoneComercial.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbFoneComercial.setText("Fone Comercial:");
        lbFoneComercial.setFocusable(false);
        lbFoneComercial.setRequestFocusEnabled(false);

        tfFoneComercial.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfFoneComercial.setNextFocusableComponent(tfBairro);

        lbBairro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbBairro.setText("Bairro:");
        lbBairro.setFocusable(false);
        lbBairro.setPreferredSize(new java.awt.Dimension(100, 19));
        lbBairro.setRequestFocusEnabled(false);

        tfBairro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfBairro.setNextFocusableComponent(tfCelular);

        lbCelular.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbCelular.setText("Celular:");
        lbCelular.setFocusable(false);
        lbCelular.setRequestFocusEnabled(false);

        tfCelular.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfCelular.setNextFocusableComponent(cbUF);

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
        tfMunicipio.setNextFocusableComponent(tfFax);

        lbFax.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbFax.setText("Fax:");
        lbFax.setFocusable(false);
        lbFax.setRequestFocusEnabled(false);

        tfFax.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfFax.setNextFocusableComponent(cbPais);

        lbPais.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbPais.setText("País:");
        lbPais.setFocusable(false);
        lbPais.setPreferredSize(new java.awt.Dimension(100, 19));
        lbPais.setRequestFocusEnabled(false);

        cbPais.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Antilhas Neerlandesas", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "Mayotte", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Checa", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Cristóvão e Neves", "São Marinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
        cbPais.setNextFocusableComponent(tfInscricaoEstadual);

        lbEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbEmail.setText("e-mail:");
        lbEmail.setFocusable(false);
        lbEmail.setPreferredSize(new java.awt.Dimension(100, 19));
        lbEmail.setRequestFocusEnabled(false);

        tfEmail.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfEmail.setNextFocusableComponent(tfSite);

        lbObs.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbObs.setText("Obs:");
        lbObs.setFocusable(false);
        lbObs.setPreferredSize(new java.awt.Dimension(100, 19));
        lbObs.setRequestFocusEnabled(false);

        tfObs.setColumns(20);
        tfObs.setRows(3);
        tfObs.setNextFocusableComponent(cbAtivo);
        jScrollPane1.setViewportView(tfObs);

        cbAtivo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        cbAtivo.setText("Ativo");
        cbAtivo.setRequestFocusEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbAtivo, org.jdesktop.beansbinding.ELProperty.create("${selected}"), cbAtivo, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        lbSite.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbSite.setText("Site:");
        lbSite.setPreferredSize(new java.awt.Dimension(100, 19));

        tfSite.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfSite.setNextFocusableComponent(tfObs);

        lbInscricaoEstadual.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbInscricaoEstadual.setText("Insc. Estadual:");

        tfInscricaoEstadual.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfInscricaoEstadual.setNextFocusableComponent(tfInscricaoMunicipal);

        lbInscricaoMunicipal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbInscricaoMunicipal.setText("Insc. Municipal:");

        tfInscricaoMunicipal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfInscricaoMunicipal.setNextFocusableComponent(tfEmail);

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
                        .addComponent(tfCnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfContato))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMunicipio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMunicipio))
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
                                .addComponent(tfLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFoneComercial)
                            .addComponent(lbCelular)
                            .addComponent(lbFax)
                            .addComponent(lbFone0800))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFone0800)
                            .addComponent(tfFoneComercial, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(tfCelular)
                            .addComponent(tfFax)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbAtivo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInscricaoEstadual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInscricaoMunicipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfInscricaoMunicipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSite)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lbFone0800)
                    .addComponent(tfFone0800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbComplemento)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFoneComercial)
                    .addComponent(tfFoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCelular)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMunicipio)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFax)
                    .addComponent(tfFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInscricaoEstadual)
                    .addComponent(tfInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInscricaoMunicipal)
                    .addComponent(tfInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbAtivo))
        );

        btAnterior.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar 24x24.png"))); // NOI18N
        btAnterior.setText("Anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btProximo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Avançar 24x24.png"))); // NOI18N
        btProximo.setText("Próximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-614)/2, 800, 614);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        GuiCadastroFornecedores.this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if ("".equals(tfCodigo.getText())) {
            fornecedor.setCpfcnpj(tfCnpjCpf.getText());
            fornecedor.setNome(tfNome.getText().toUpperCase());
            fornecedor.setContato(tfContato.getText());
            fornecedor.setCep(tfCep.getText());
            fornecedor.setTipo((String) cbTipo.getSelectedItem());
            fornecedor.setLogradouro(tfLogradouro.getText());
            fornecedor.setFone0800(tfFone0800.getText());
            fornecedor.setNumero(tfNumero.getText());
            fornecedor.setComplemento(tfComplemento.getText());
            fornecedor.setFoneComercial(tfFoneComercial.getText());
            fornecedor.setBairro(tfBairro.getText());
            fornecedor.setFoneCelular(tfCelular.getText());
            fornecedor.setUf((String) cbUF.getSelectedItem());
            fornecedor.setMunicipio(tfMunicipio.getText());
            fornecedor.setFoneFax(tfFax.getText());
            fornecedor.setPais((String) cbPais.getSelectedItem());
            fornecedor.setInscricaoEstadual(tfInscricaoEstadual.getText());
            fornecedor.setInscricaoMunicipal(tfInscricaoMunicipal.getText());
            fornecedor.setSite(tfSite.getText());
            fornecedor.setEmail(tfEmail.getText());
            fornecedor.setObservacoes(tfObs.getText());
            fornecedor.setAtivo(String.valueOf(cbAtivo.isSelected()));
            verificaAtivo();
            Date hoje = new Date();
            fornecedor.setDataCadastro(hoje);
            try {
                dao.adicionaFornecedor(fornecedor);
                JOptionPane.showMessageDialog(this, "Fornecedor adicionado com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
                tfCodigo.setText(String.valueOf(fornecedor.getId()));
                tabela.adicionaFornecedor(fornecedor);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel adicionar o fornecedor." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroFornecedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!"".equals(tfCodigo.getText())) {
            fornecedor.setCpfcnpj(tfCnpjCpf.getText());
            fornecedor.setNome(tfNome.getText().toUpperCase());
            fornecedor.setContato(tfContato.getText());
            fornecedor.setCep(tfCep.getText());
            fornecedor.setTipo((String) cbTipo.getSelectedItem());
            fornecedor.setLogradouro(tfLogradouro.getText());
            fornecedor.setFone0800(tfFone0800.getText());
            fornecedor.setNumero(tfNumero.getText());
            fornecedor.setComplemento(tfComplemento.getText());
            fornecedor.setFoneComercial(tfFoneComercial.getText());
            fornecedor.setBairro(tfBairro.getText());
            fornecedor.setFoneCelular(tfCelular.getText());
            fornecedor.setUf((String) cbUF.getSelectedItem());
            fornecedor.setMunicipio(tfMunicipio.getText());
            fornecedor.setFoneFax(tfFax.getText());
            fornecedor.setPais((String) cbPais.getSelectedItem());
            fornecedor.setInscricaoEstadual(tfInscricaoEstadual.getText());
            fornecedor.setInscricaoMunicipal(tfInscricaoMunicipal.getText());
            fornecedor.setSite(tfSite.getText());
            fornecedor.setEmail(tfEmail.getText());
            fornecedor.setObservacoes(tfObs.getText());
            fornecedor.setAtivo(String.valueOf(cbAtivo.isSelected()));
            verificaAtivo();
            try {
                dao.atualizaCliente(fornecedor);
                JOptionPane.showMessageDialog(this, "Dados alterados com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
                tabela.editaFornecedor(dao.getTodosFornecedores());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel alterar os dados do cliente." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroFornecedores.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        if (!"".equals(tfCodigo.getText())) {
            int novoCodigo;
            novoCodigo = (Integer.parseInt(tfCodigo.getText()) - 1);
            if (novoCodigo > 0) {
                try {
                    fornecedor = dao.getFornecedor(novoCodigo);
                    tfCnpjCpf.setText(fornecedor.getCpfcnpj());
            tfCodigo.setText(String.valueOf(fornecedor.getId()));
            tfNome.setText(fornecedor.getNome());
            tfContato.setText(fornecedor.getContato());
            tfCep.setText(fornecedor.getCep());
            cbTipo.setSelectedItem(fornecedor.getTipo());
            tfLogradouro.setText(fornecedor.getLogradouro());
            tfFone0800.setText(fornecedor.getFone0800());
            tfNumero.setText(fornecedor.getNumero());
            tfComplemento.setText(fornecedor.getComplemento());
            tfFoneComercial.setText(fornecedor.getFoneComercial());
            tfBairro.setText(fornecedor.getBairro());
            tfCelular.setText(fornecedor.getFoneCelular());
            cbUF.setSelectedItem(fornecedor.getUf());
            tfMunicipio.setText(fornecedor.getMunicipio());
            tfFax.setText(fornecedor.getFoneFax());
            cbPais.setSelectedItem(fornecedor.getPais());
            tfInscricaoEstadual.setText((fornecedor.getInscricaoEstadual()));
            tfInscricaoMunicipal.setText(fornecedor.getInscricaoMunicipal());
            tfSite.setText(fornecedor.getSite());
            tfEmail.setText(fornecedor.getEmail());
            tfObs.setText(fornecedor.getObservacoes());
            cbAtivo.setSelected(Boolean.parseBoolean(fornecedor.getAtivo()));
                    verificaAtivo();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Não foi possivel encontrar o fornecedor." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GuiCadastroFornecedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        int quantidadeDeClientes = 0;
        if (!"".equals(tfCodigo.getText())) {
            int novoCodigo;
            novoCodigo = (Integer.parseInt(tfCodigo.getText()) + 1);
            try {
                quantidadeDeClientes = dao.getTodosFornecedores().size();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel buscar na base de dados" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroFornecedores.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (novoCodigo <= quantidadeDeClientes) {
                try {
                    fornecedor = dao.getFornecedor(novoCodigo);
                    tfCnpjCpf.setText(fornecedor.getCpfcnpj());
            tfCodigo.setText(String.valueOf(fornecedor.getId()));
            tfNome.setText(fornecedor.getNome());
            tfContato.setText(fornecedor.getContato());
            tfCep.setText(fornecedor.getCep());
            cbTipo.setSelectedItem(fornecedor.getTipo());
            tfLogradouro.setText(fornecedor.getLogradouro());
            tfFone0800.setText(fornecedor.getFone0800());
            tfNumero.setText(fornecedor.getNumero());
            tfComplemento.setText(fornecedor.getComplemento());
            tfFoneComercial.setText(fornecedor.getFoneComercial());
            tfBairro.setText(fornecedor.getBairro());
            tfCelular.setText(fornecedor.getFoneCelular());
            cbUF.setSelectedItem(fornecedor.getUf());
            tfMunicipio.setText(fornecedor.getMunicipio());
            tfFax.setText(fornecedor.getFoneFax());
            cbPais.setSelectedItem(fornecedor.getPais());
            tfInscricaoEstadual.setText((fornecedor.getInscricaoEstadual()));
            tfInscricaoMunicipal.setText(fornecedor.getInscricaoMunicipal());
            tfSite.setText(fornecedor.getSite());
            tfEmail.setText(fornecedor.getEmail());
            tfObs.setText(fornecedor.getObservacoes());
            cbAtivo.setSelected(Boolean.parseBoolean(fornecedor.getAtivo()));
                    verificaAtivo();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Não foi possivel localizar o fornecedor." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GuiCadastroFornecedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void verificaCnpjCpf(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificaCnpjCpf
        if (tfCnpjCpf.getText().length() == 11) {
            if (ValidaCPF.isCPF(tfCnpjCpf.getText()) == true) {
                tfCnpjCpf.setText(ValidaCPF.imprimeCPF(tfCnpjCpf.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "O CPF informado não é valido", "CNPJ/CPF invalido", JOptionPane.ERROR_MESSAGE);
            }
        } else if (tfCnpjCpf.getText().length() == 14) {
            if (ValidaCNPJ.isCNPJ(tfCnpjCpf.getText()) == true) {
                tfCnpjCpf.setText(ValidaCNPJ.imprimeCNPJ(tfCnpjCpf.getText()));
            } else {
                JOptionPane.showMessageDialog(this, "O CNPJ informado não é valido", "CNPJ/CPF invalido", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Informe um CNPJ ou CPF valido.", "CNPJ/CPF invalido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verificaCnpjCpf

    private void verificaAtivo() {
        if (cbAtivo.isSelected() == false) {
            tfCnpjCpf.setEditable(false);
            tfCnpjCpf.setFocusable(false);
            tfNome.setEditable(false);
            tfNome.setFocusable(false);
            tfContato.setEditable(false);
            tfContato.setFocusable(false);
            tfCep.setEditable(false);
            tfCep.setFocusable(false);
            cbTipo.setEditable(false);
            cbTipo.setFocusable(false);
            cbTipo.setEnabled(false);
            tfLogradouro.setEditable(false);
            tfLogradouro.setFocusable(false);
            tfFone0800.setEditable(false);
            tfFone0800.setFocusable(false);
            tfNumero.setEditable(false);
            tfNumero.setFocusable(false);
            tfComplemento.setEditable(false);
            tfComplemento.setFocusable(false);
            tfFoneComercial.setEditable(false);
            tfFoneComercial.setFocusable(false);
            tfBairro.setEditable(false);
            tfBairro.setFocusable(false);
            tfCelular.setEditable(false);
            tfCelular.setFocusable(false);
            cbUF.setEditable(false);
            cbUF.setFocusable(false);
            cbUF.setEnabled(false);
            tfMunicipio.setEditable(false);
            tfMunicipio.setFocusable(false);
            tfFax.setEditable(false);
            tfFax.setFocusable(false);
            cbPais.setEditable(false);
            cbPais.setFocusable(false);
            cbPais.setEnabled(false);
            tfInscricaoEstadual.setEditable(false);
            tfInscricaoEstadual.setFocusable(false);
            tfInscricaoMunicipal.setEditable(false);
            tfInscricaoMunicipal.setFocusable(false);
            tfSite.setEditable(false);
            tfSite.setFocusable(false);
            tfEmail.setEditable(false);
            tfEmail.setFocusable(false);
            tfObs.setEditable(false);
            tfObs.setFocusable(false);
        }
        if (cbAtivo.isSelected() == true) {
            tfCnpjCpf.setEditable(true);
            tfCnpjCpf.setFocusable(true);
            tfNome.setEditable(true);
            tfNome.setFocusable(true);
            tfContato.setEditable(true);
            tfContato.setFocusable(true);
            tfCep.setEditable(true);
            tfCep.setFocusable(true);
            cbTipo.setEditable(true);
            cbTipo.setFocusable(true);
            cbTipo.setEnabled(true);
            tfLogradouro.setEditable(true);
            tfLogradouro.setFocusable(true);
            tfFone0800.setEditable(true);
            tfFone0800.setFocusable(true);
            tfNumero.setEditable(true);
            tfNumero.setFocusable(true);
            tfComplemento.setEditable(true);
            tfComplemento.setFocusable(true);
            tfFoneComercial.setEditable(true);
            tfFoneComercial.setFocusable(true);
            tfBairro.setEditable(true);
            tfBairro.setFocusable(true);
            tfCelular.setEditable(true);
            tfCelular.setFocusable(true);
            cbUF.setEditable(true);
            cbUF.setFocusable(true);
            cbUF.setEnabled(true);
            tfMunicipio.setEditable(true);
            tfMunicipio.setFocusable(true);
            tfFax.setEditable(true);
            tfFax.setFocusable(true);
            cbPais.setEditable(true);
            cbPais.setFocusable(true);
            cbPais.setEnabled(true);
            tfInscricaoEstadual.setEditable(true);
            tfInscricaoEstadual.setFocusable(true);
            tfInscricaoMunicipal.setEditable(true);
            tfInscricaoMunicipal.setFocusable(true);
            tfSite.setEditable(true);
            tfSite.setFocusable(true);
            tfEmail.setEditable(true);
            tfEmail.setFocusable(true);
            tfObs.setEditable(true);
            tfObs.setFocusable(true);
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
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox cbAtivo;
    private javax.swing.JComboBox cbPais;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCnpjCpf;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFax;
    private javax.swing.JLabel lbFone0800;
    private javax.swing.JLabel lbFoneComercial;
    private javax.swing.JLabel lbInscricaoEstadual;
    private javax.swing.JLabel lbInscricaoMunicipal;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbPais;
    private javax.swing.JLabel lbSite;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JFormattedTextField tfCnpjCpf;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfContato;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JFormattedTextField tfFax;
    private javax.swing.JFormattedTextField tfFone0800;
    private javax.swing.JFormattedTextField tfFoneComercial;
    private javax.swing.JTextField tfInscricaoEstadual;
    private javax.swing.JTextField tfInscricaoMunicipal;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextArea tfObs;
    private javax.swing.JTextField tfSite;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
