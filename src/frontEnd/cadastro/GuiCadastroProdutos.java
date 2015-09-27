package frontEnd.cadastro;

import dao.ProdutoDao;
import entidade.Produto;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import utilitarios.ProdutoTableModel;

public class GuiCadastroProdutos extends JDialog {
    
    public final ProdutoDao dao;
    public final ProdutoTableModel tabela;
    Produto produto = new Produto();
    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
    DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

    public GuiCadastroProdutos(ProdutoDao dao, ProdutoTableModel tabela) {
        this.dao = dao;
        this.tabela = tabela;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        tfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPrecoCompra = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPrecoVenda = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        radioCalcular = new javax.swing.JRadioButton();
        radioManual = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPorcentagem = new javax.swing.JList();
        btCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);

        tfCodigo.setEditable(false);
        tfCodigo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfCodigo.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        tfDescricao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Preço de Compra:");

        tfPrecoCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfPrecoCompra.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Preço Venda:");

        tfPrecoVenda.setEditable(false);
        tfPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        tfPrecoVenda.setFocusable(false);
        tfPrecoVenda.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        radioCalcular.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radioCalcular.setSelected(true);
        radioCalcular.setText("Calcular");
        radioCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCalcularActionPerformed(evt);
            }
        });

        radioManual.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        radioManual.setText("Manual");
        radioManual.setBorderPainted(true);
        radioManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioManualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioCalcular)
                    .addComponent(radioManual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioManual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaPorcentagem.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        listaPorcentagem.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPorcentagem);

        btCalcular.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/updated 24x24.png"))); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Quantidade:");

        tfQuantidade.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecoVenda)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btVoltar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Voltar 24x24.png"))); // NOI18N
        btVoltar.setText("Anterior");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btProximo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Avançar 24x24.png"))); // NOI18N
        btProximo.setText("Próximo");
        btProximo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
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

        btSalvar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add 24x24.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addComponent(btProximo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCancelar)
                        .addComponent(btSalvar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-475)/2, (screenSize.height-313)/2, 475, 313);
    }// </editor-fold>//GEN-END:initComponents

    private void radioCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCalcularActionPerformed
        if(radioCalcular.isSelected() == true){
            radioManual.setSelected(false);
            tfPrecoVenda.setEditable(false);
            tfPrecoVenda.setFocusable(false);
            listaPorcentagem.setEnabled(true);
            btCalcular.setEnabled(true);
            btCalcular.setFocusable(true);
        }
    }//GEN-LAST:event_radioCalcularActionPerformed

    private void radioManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioManualActionPerformed
        if(radioManual.isSelected() == true){
            radioCalcular.setSelected(false);
            listaPorcentagem.setEnabled(false);
            tfPrecoVenda.setEditable(true);
            tfPrecoVenda.setFocusable(true);
            btCalcular.setEnabled(false);
            btCalcular.setFocusable(false);
        }
    }//GEN-LAST:event_radioManualActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        if(tfDescricao.getText().equals("")){
            tfDescricao.requestFocus();
            return;
        }
        if(tfPrecoCompra.getText().equals("")){
            tfPrecoCompra.requestFocus();
            return;
        }
        try{
            
            double valor = Double.parseDouble(tfPrecoCompra.getText().replace(decimalFormatSymbols.getDecimalSeparator(),'.'));
            
            if(listaPorcentagem.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(null, "Selecione um item da lista");
                return;
            }
            double porcentagem = 0.5;
            if(listaPorcentagem.getSelectedIndex() == 0){
                porcentagem = 0.1;
            }else if(listaPorcentagem.getSelectedIndex() == 1){
                porcentagem = 0.2;
            }else if(listaPorcentagem.getSelectedIndex() == 2){
                porcentagem = 0.3;
            }else if(listaPorcentagem.getSelectedIndex() == 3){
                porcentagem = 0.4;
            }else if(listaPorcentagem.getSelectedIndex() == 4){
                porcentagem = 0.5;
            }else if(listaPorcentagem.getSelectedIndex() == 5){
                porcentagem = 0.6;
            }else if(listaPorcentagem.getSelectedIndex() == 6){
                porcentagem = 0.7;
            }else if(listaPorcentagem.getSelectedIndex() == 7){
                porcentagem = 0.8;
            }else if(listaPorcentagem.getSelectedIndex() == 8){
                porcentagem = 0.9;
            }else if(listaPorcentagem.getSelectedIndex() == 9){
                porcentagem = 1;
            }
            double valorComDesconto = (valor * porcentagem) + valor;
            tfPrecoVenda.setText("" + decimalFormat.format(valorComDesconto));
            
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Forneça apenas valores numéricos\n"+ erro.toString());
            tfPrecoCompra.requestFocus();
        }
    }//GEN-LAST:event_btCalcularActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        GuiCadastroProdutos.this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if ("".equals(tfCodigo.getText())) {
            produto.setDescricao(tfDescricao.getText().toUpperCase());
            produto.setQuantidade(Integer.parseInt(tfQuantidade.getText()));
            produto.setPrecoCompra(tfPrecoCompra.getText());
            produto.setPrecoVenda(tfPrecoVenda.getText());
            try {
                dao.adicionaProduto(produto);
                JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
                tfCodigo.setText(String.valueOf(produto.getId()));
                tabela.adicionaProduto(produto);
                GuiCadastroProdutos.this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel adicionar o produto." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!"".equals(tfCodigo.getText())) {
            produto.setDescricao(tfDescricao.getText().toUpperCase());
            produto.setQuantidade(Integer.parseInt(tfQuantidade.getText()));
            produto.setPrecoCompra(tfPrecoCompra.getText());
            produto.setPrecoVenda(tfPrecoVenda.getText());
            try {
                dao.atualizaProduto(produto);
                JOptionPane.showMessageDialog(this, "Dados alterados com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
                tabela.editaProduto(dao.getTodosProdutos());
                GuiCadastroProdutos.this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel alterar os dados do produto." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        if (!"".equals(tfCodigo.getText())) {
            int novoCodigo;
            novoCodigo = (Integer.parseInt(tfCodigo.getText()) - 1);
            if (novoCodigo > 0) {
                try {
                    produto = dao.getProduto(novoCodigo);
                    tfCodigo.setText(String.valueOf(produto.getId()));
                    tfDescricao.setText(produto.getDescricao());
                    tfQuantidade.setText(String.valueOf(produto.getQuantidade()));
                    tfPrecoCompra.setText(produto.getPrecoCompra());
                    tfPrecoVenda.setText(produto.getPrecoVenda());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Não foi possivel encontrar o produto." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GuiCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        int quantidadeDeProdutos = 0;
        if (!"".equals(tfCodigo.getText())) {
            int novoCodigo;
            novoCodigo = (Integer.parseInt(tfCodigo.getText()) + 1);
            try {
                quantidadeDeProdutos = dao.getTodosProdutos().size();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel buscar na base de dados" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (novoCodigo <= quantidadeDeProdutos) {
                try {
                    produto = dao.getProduto(novoCodigo);
                    tfCodigo.setText(String.valueOf(produto.getId()));
                    tfDescricao.setText(produto.getDescricao());
                    tfQuantidade.setText(String.valueOf(produto.getQuantidade()));
                    tfPrecoCompra.setText(produto.getPrecoCompra());
                    tfPrecoVenda.setText(produto.getPrecoVenda());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Não foi possivel localizar o produto." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GuiCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btProximoActionPerformed
public void editar(int id) {
        btSalvar.setText("Editar");
        try {
            produto = dao.getProduto(id);
            tfCodigo.setText(String.valueOf(produto.getId()));
            tfDescricao.setText(produto.getDescricao());
            tfQuantidade.setText(String.valueOf(produto.getQuantidade()));
            tfPrecoCompra.setText(produto.getPrecoCompra());
            tfPrecoVenda.setText(produto.getPrecoVenda());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GuiCadastroFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaPorcentagem;
    private javax.swing.JRadioButton radioCalcular;
    private javax.swing.JRadioButton radioManual;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JFormattedTextField tfPrecoCompra;
    private javax.swing.JFormattedTextField tfPrecoVenda;
    private javax.swing.JTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables
}
