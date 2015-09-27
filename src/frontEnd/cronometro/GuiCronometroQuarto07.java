package frontEnd.cronometro;

import dao.ProdutoDao;
import dao.RelatorioDao;
import entidade.Produto;
import entidade.Relatorio;
import frontEnd.GuiVendas;
import frontEnd.contador.ContadorQuarto07;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuiCronometroQuarto07 extends javax.swing.JFrame {
    
    private static boolean ativo = false;
    private static boolean contador = false;  
    private static boolean zerado = false;
    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
    DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
    Produto produto = new Produto();
    ProdutoDao produtoDao = new ProdutoDao();
    List<Produto> listaProdutos;
    private int contadorDeLinhas = 0;
    private String tempoValor;
    Relatorio relatorio = new Relatorio();
    RelatorioDao dao = new RelatorioDao();

    public GuiCronometroQuarto07() {
        initComponents();
        ContadorQuarto07 cont = new ContadorQuarto07(lConta);  
        cont.start(); 
        try {
            geraLista();
        } catch (SQLException ex) {
            Logger.getLogger(GuiCronometroQuarto07.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuiCronometroQuarto07.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void geraLista() throws SQLException, ClassNotFoundException{
        listaProdutos = produtoDao.getTodosProdutos();
        for(int i = 0; i < listaProdutos.size();i++){
            produto = listaProdutos.get(i);
            listaDeProdutos.addItem(produto);  
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar = new javax.swing.JButton();
        pausar = new javax.swing.JButton();
        zerar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lConta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listaDeProdutos = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfValorQuarto = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfDescricao1 = new javax.swing.JTextField();
        tfQuantidade1 = new javax.swing.JTextField();
        tfValorUni1 = new javax.swing.JFormattedTextField();
        tfValorTotal1 = new javax.swing.JFormattedTextField();
        tfDescricao2 = new javax.swing.JTextField();
        tfQuantidade2 = new javax.swing.JTextField();
        tfValorUni2 = new javax.swing.JFormattedTextField();
        tfValorTotal2 = new javax.swing.JFormattedTextField();
        tfDescricao3 = new javax.swing.JTextField();
        tfQuantidade3 = new javax.swing.JTextField();
        tfValorUni3 = new javax.swing.JFormattedTextField();
        tfValorTotal3 = new javax.swing.JFormattedTextField();
        tfDescricao4 = new javax.swing.JTextField();
        tfQuantidade4 = new javax.swing.JTextField();
        tfValorUni4 = new javax.swing.JFormattedTextField();
        tfValorTotal4 = new javax.swing.JFormattedTextField();
        tfDescricao5 = new javax.swing.JTextField();
        tfQuantidade5 = new javax.swing.JTextField();
        tfValorUni5 = new javax.swing.JFormattedTextField();
        tfValorTotal5 = new javax.swing.JFormattedTextField();
        tfValorUni6 = new javax.swing.JFormattedTextField();
        tfValorTotal6 = new javax.swing.JFormattedTextField();
        tfQuantidade6 = new javax.swing.JTextField();
        tfDescricao6 = new javax.swing.JTextField();

        setTitle("Quarto 07");

        iniciar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Play 48x48.png"))); // NOI18N
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        pausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pause 48x48.png"))); // NOI18N
        pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarActionPerformed(evt);
            }
        });

        zerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Stop 48x48.png"))); // NOI18N
        zerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zerarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lConta.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lConta.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lConta, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Produtos:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade:");

        tfQuantidade.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfQuantidade.setText("0");

        btAdicionar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add 24x24.png"))); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Borracha 24x24.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Valor do Quarto:");

        tfValorQuarto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorQuarto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValorQuarto.setText("25,00");
        tfValorQuarto.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Descrição");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Quantidade");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Valor Uni.");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Valor Total");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tfDescricao1.setEditable(false);
        tfDescricao1.setFocusable(false);
        tfDescricao1.setRequestFocusEnabled(false);

        tfQuantidade1.setEditable(false);
        tfQuantidade1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuantidade1.setFocusable(false);
        tfQuantidade1.setRequestFocusEnabled(false);

        tfValorUni1.setEditable(false);
        tfValorUni1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorUni1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfValorTotal1.setEditable(false);
        tfValorTotal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorTotal1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValorTotal1.setFocusable(false);
        tfValorTotal1.setRequestFocusEnabled(false);

        tfDescricao2.setEditable(false);

        tfQuantidade2.setEditable(false);
        tfQuantidade2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfValorUni2.setEditable(false);
        tfValorUni2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorUni2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfValorTotal2.setEditable(false);
        tfValorTotal2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorTotal2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfDescricao3.setEditable(false);

        tfQuantidade3.setEditable(false);
        tfQuantidade3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfValorUni3.setEditable(false);
        tfValorUni3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorUni3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfValorTotal3.setEditable(false);
        tfValorTotal3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorTotal3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfDescricao4.setEditable(false);

        tfQuantidade4.setEditable(false);
        tfQuantidade4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfValorUni4.setEditable(false);
        tfValorUni4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorUni4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfValorTotal4.setEditable(false);
        tfValorTotal4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorTotal4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfDescricao5.setEditable(false);

        tfQuantidade5.setEditable(false);
        tfQuantidade5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfValorUni5.setEditable(false);
        tfValorUni5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorUni5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfValorTotal5.setEditable(false);
        tfValorTotal5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorTotal5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfValorUni6.setEditable(false);
        tfValorUni6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorUni6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfValorTotal6.setEditable(false);
        tfValorTotal6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfValorTotal6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfQuantidade6.setEditable(false);
        tfQuantidade6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfDescricao6.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfDescricao3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(tfDescricao4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfQuantidade1)
                            .addComponent(tfQuantidade2)
                            .addComponent(tfQuantidade3)
                            .addComponent(tfQuantidade4)
                            .addComponent(tfQuantidade5)
                            .addComponent(tfQuantidade6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfValorUni1)
                            .addComponent(tfValorUni2)
                            .addComponent(tfValorUni3)
                            .addComponent(tfValorUni4)
                            .addComponent(tfValorUni5)
                            .addComponent(tfValorUni6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfValorTotal1)
                            .addComponent(tfValorTotal2)
                            .addComponent(tfValorTotal3)
                            .addComponent(tfValorTotal4)
                            .addComponent(tfValorTotal5)
                            .addComponent(tfValorTotal6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValorQuarto)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(listaDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUni2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUni3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUni4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUni5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUni6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btRemover)
                    .addComponent(jLabel3)
                    .addComponent(tfValorQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pausar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zerar)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-528)/2, (screenSize.height-440)/2, 528, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        contador = true;  
        iniciar.setEnabled(false);  
        pausar.setEnabled(true);  
        zerar.setEnabled(false); 
        GuiVendas.btQuarto07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa vermelha.png")));
        
    }//GEN-LAST:event_iniciarActionPerformed

    private void pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarActionPerformed
        contador = false;  
        iniciar.setEnabled(true);  
        pausar.setEnabled(false);  
        zerar.setEnabled(true); 
        GuiVendas.btQuarto07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa amarela.png")));
        tempoValor = calculaValorHora(lConta.getText());
    }//GEN-LAST:event_pausarActionPerformed

    private void zerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zerarActionPerformed
        contador = false;  
        relatorio.setTempoEstadia(lConta.getText());
        lConta.setText("00:00:00");  
        zerado = true;  
        lConta.revalidate();  
        iniciar.setEnabled(true);  
        pausar.setEnabled(false); 
        GuiVendas.btQuarto07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png")));
        JOptionPane.showMessageDialog(this, "Valor total a ser cobrado: "+ valorFinal(), "Valor Final", JOptionPane.INFORMATION_MESSAGE);
        relatorio.setValorTotal(valorFinal());
        relatorio.setQuarto("Quarto 07");
        Date hoje = new Date();
        relatorio.setData(hoje);
        try {
            dao.adicionaRelatorio(relatorio);
        } catch (SQLException ex) {
            Logger.getLogger(GuiCronometroQuarto07.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuiCronometroQuarto07.class.getName()).log(Level.SEVERE, null, ex);
        }
        GuiCronometroQuarto07.this.dispose();
    }//GEN-LAST:event_zerarActionPerformed
    private String valorFinal(){
        
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        double valor4 = 0;
        double valor5 = 0;
        double valor6 = 0;
        double valorTempo;
        double valorTotal;
        
        if(!"".equals(tfValorTotal1.getText())){
            valor1 = Double.parseDouble(tfValorTotal1.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                if(!"".equals(tfValorTotal2.getText())){
                    valor2 = Double.parseDouble(tfValorTotal2.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                        if(!"".equals(tfValorTotal3.getText())){
                            valor3 = Double.parseDouble(tfValorTotal3.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                                if(!"".equals(tfValorTotal4.getText())){
                                    valor4 = Double.parseDouble(tfValorTotal4.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                                        if(!"".equals(tfValorTotal5.getText())){
                                            valor5 = Double.parseDouble(tfValorTotal5.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                                                if(!"".equals(tfValorTotal6.getText())){
                                                    valor6 = Double.parseDouble(tfValorTotal6.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                                                }
                                        }
                                }
                        }
                }
        }
        
        valorTempo = Double.parseDouble(tempoValor.replace(decimalFormatSymbols.getDecimalSeparator(), '.'));
        valorTotal = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valorTempo;
        
        return decimalFormat.format(valorTotal);
    }
    private String calculaValorHora(String tempo){
        int hora;
        String h;
        String m;
        int minuto;
        int horasParaMinutos;
        int totalMinutos;
        h = tempo.substring(0,1);
        m = tempo.substring(3, 4);
        hora = Integer.parseInt(h);
        minuto = Integer.parseInt(m);
        horasParaMinutos = hora * 60;
        totalMinutos = horasParaMinutos + minuto;
        if(totalMinutos > 120){
            double valorQuarto = Double.parseDouble(tfValorQuarto.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
            double valorMinuto = valorQuarto / 120;
            double valorTotal = totalMinutos * valorMinuto;
            return ""+valorTotal;
        }else{
            return tfValorQuarto.getText();
        }
    }
    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        contadorDeLinhas++;
        Produto item = (Produto)listaDeProdutos.getSelectedItem();
        switch(contadorDeLinhas){
            case 1: 
                tfDescricao1.setText(item.getDescricao());
                tfQuantidade1.setText(tfQuantidade.getText());
                tfValorUni1.setText(item.getPrecoVenda());
                double quantidade1 = Double.parseDouble(tfQuantidade1.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double precoUnitario1 = Double.parseDouble(tfValorUni1.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double subTotal1 = (quantidade1 * precoUnitario1);
                tfValorTotal1.setText("" + decimalFormat.format(subTotal1));
            break;
            case 2: 
                tfDescricao2.setText(item.getDescricao());
                tfQuantidade2.setText(tfQuantidade.getText());
                tfValorUni2.setText(item.getPrecoVenda());
                double quantidade2 = Double.parseDouble(tfQuantidade2.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double precoUnitario2 = Double.parseDouble(tfValorUni2.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double subTotal2 = (quantidade2 * precoUnitario2);
                tfValorTotal2.setText("" + decimalFormat.format(subTotal2));
            break;    
            case 3: 
                tfDescricao3.setText(item.getDescricao());
                tfQuantidade3.setText(tfQuantidade.getText());
                tfValorUni3.setText(item.getPrecoVenda());
                double quantidade3 = Double.parseDouble(tfQuantidade3.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double precoUnitario3 = Double.parseDouble(tfValorUni3.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double subTotal3 = (quantidade3 * precoUnitario3);
                tfValorTotal3.setText("" + decimalFormat.format(subTotal3));
            break; 
            case 4: 
                tfDescricao4.setText(item.getDescricao());
                tfQuantidade4.setText(tfQuantidade.getText());
                tfValorUni4.setText(item.getPrecoVenda());
                double quantidade4 = Double.parseDouble(tfQuantidade4.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double precoUnitario4 = Double.parseDouble(tfValorUni4.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double subTotal4 = (quantidade4 * precoUnitario4);
                tfValorTotal4.setText("" + decimalFormat.format(subTotal4));
            break;    
            case 5: 
                tfDescricao5.setText(item.getDescricao());
                tfQuantidade5.setText(tfQuantidade.getText());
                tfValorUni5.setText(item.getPrecoVenda());
                double quantidade5 = Double.parseDouble(tfQuantidade5.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double precoUnitario5 = Double.parseDouble(tfValorUni5.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double subTotal5 = (quantidade5 * precoUnitario5);
                tfValorTotal5.setText("" + decimalFormat.format(subTotal5));
            break;
            case 6: 
                tfDescricao6.setText(item.getDescricao());
                tfQuantidade6.setText(tfQuantidade.getText());
                tfValorUni6.setText(item.getPrecoVenda());
                double quantidade6 = Double.parseDouble(tfQuantidade6.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double precoUnitario6 = Double.parseDouble(tfValorUni6.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
                double subTotal6 = (quantidade6 * precoUnitario6);
                tfValorTotal6.setText("" + decimalFormat.format(subTotal6));
            break;     
        }
        
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        switch(contadorDeLinhas){
            case 1: 
                tfDescricao1.setText("");
                tfQuantidade1.setText("");
                tfValorUni1.setText("");
                tfValorTotal1.setText("");
                contadorDeLinhas--;
            break;
            case 2: 
                tfDescricao2.setText("");
                tfQuantidade2.setText("");
                tfValorUni2.setText("");
                tfValorTotal2.setText("");
                contadorDeLinhas--;
            break;    
            case 3: 
                tfDescricao3.setText("");
                tfQuantidade3.setText("");
                tfValorUni3.setText("");
                tfValorTotal3.setText("");
                contadorDeLinhas--;
            break; 
            case 4: 
                tfDescricao4.setText("");
                tfQuantidade4.setText("");
                tfValorUni4.setText("");
                tfValorTotal4.setText("");
                contadorDeLinhas--;
            break;    
            case 5: 
                tfDescricao5.setText("");
                tfQuantidade5.setText("");
                tfValorUni5.setText("");
                tfValorTotal5.setText("");
                contadorDeLinhas--;
            break;
            case 6: 
                tfDescricao6.setText("");
                tfQuantidade6.setText("");
                tfValorUni6.setText("");
                tfValorTotal6.setText("");
                contadorDeLinhas--;
            break;     
        }
    }//GEN-LAST:event_btRemoverActionPerformed

        public static boolean isContador(){  
            return contador;  
        }  
      
        public static boolean isZerado(){  
            return zerado;  
        }  
          
        public static void setZerado(boolean zero){  
            zerado = zero;  
        } 
        
        public static boolean isAtivo(){  
            return ativo;  
        } 
        public static void setAtivo(boolean ativado){
            ativado = ativo;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JLabel lConta;
    private javax.swing.JComboBox listaDeProdutos;
    private javax.swing.JButton pausar;
    private javax.swing.JTextField tfDescricao1;
    private javax.swing.JTextField tfDescricao2;
    private javax.swing.JTextField tfDescricao3;
    private javax.swing.JTextField tfDescricao4;
    private javax.swing.JTextField tfDescricao5;
    private javax.swing.JTextField tfDescricao6;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfQuantidade1;
    private javax.swing.JTextField tfQuantidade2;
    private javax.swing.JTextField tfQuantidade3;
    private javax.swing.JTextField tfQuantidade4;
    private javax.swing.JTextField tfQuantidade5;
    private javax.swing.JTextField tfQuantidade6;
    private javax.swing.JFormattedTextField tfValorQuarto;
    private javax.swing.JFormattedTextField tfValorTotal1;
    private javax.swing.JFormattedTextField tfValorTotal2;
    private javax.swing.JFormattedTextField tfValorTotal3;
    private javax.swing.JFormattedTextField tfValorTotal4;
    private javax.swing.JFormattedTextField tfValorTotal5;
    private javax.swing.JFormattedTextField tfValorTotal6;
    private javax.swing.JFormattedTextField tfValorUni1;
    private javax.swing.JFormattedTextField tfValorUni2;
    private javax.swing.JFormattedTextField tfValorUni3;
    private javax.swing.JFormattedTextField tfValorUni4;
    private javax.swing.JFormattedTextField tfValorUni5;
    private javax.swing.JFormattedTextField tfValorUni6;
    private javax.swing.JButton zerar;
    // End of variables declaration//GEN-END:variables
}
