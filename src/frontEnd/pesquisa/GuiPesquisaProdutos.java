package frontEnd.pesquisa;

import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import utilitarios.ProdutoTableModel;

public class GuiPesquisaProdutos extends JDialog {
    
    public final ProdutoDao dao;
    public final ProdutoTableModel tabela;
    
    public GuiPesquisaProdutos(ProdutoDao dao, ProdutoTableModel tabela) {
        this.dao = dao;
        this.tabela = tabela;
        nimbus();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbCampoInteiro = new javax.swing.JCheckBox();
        cbComecandoCom = new javax.swing.JCheckBox();
        cbContendo = new javax.swing.JCheckBox();
        btPesquisar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Assistente de Procura");
        setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lupa 128x128.png"))); // NOI18N
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Digite a informação a ser pesquisada");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        tfNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbCampoInteiro.setText("Campo inteiro");
        cbCampoInteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCampoInteiroActionPerformed(evt);
            }
        });

        cbComecandoCom.setSelected(true);
        cbComecandoCom.setText("Começando com");
        cbComecandoCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbComecandoComActionPerformed(evt);
            }
        });

        cbContendo.setText("Contendo");
        cbContendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContendoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCampoInteiro)
                    .addComponent(cbComecandoCom)
                    .addComponent(cbContendo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCampoInteiro)
                .addGap(18, 18, 18)
                .addComponent(cbComecandoCom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(cbContendo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btPesquisar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lupa 24x24.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
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

        btLimpar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Borracha 24x24.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-508)/2, (screenSize.height-334)/2, 508, 334);
    }// </editor-fold>//GEN-END:initComponents

    private void cbComecandoComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbComecandoComActionPerformed
        if(cbComecandoCom.isSelected() == true){
            cbCampoInteiro.setSelected(false);
            cbContendo.setSelected(false);
        }
    }//GEN-LAST:event_cbComecandoComActionPerformed

    private void cbCampoInteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCampoInteiroActionPerformed
        if(cbCampoInteiro.isSelected() == true){
            cbComecandoCom.setSelected(false);
            cbContendo.setSelected(false);
        }
    }//GEN-LAST:event_cbCampoInteiroActionPerformed

    private void cbContendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContendoActionPerformed
        if(cbContendo.isSelected() == true){
            cbCampoInteiro.setSelected(false);
            cbComecandoCom.setSelected(false);
        }
    }//GEN-LAST:event_cbContendoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String nomeEditado = tfNome.getText();
        
        if(cbCampoInteiro.isSelected() == true){
            nomeEditado = "'"+nomeEditado+"'";
        }if(cbComecandoCom.isSelected() == true){
            nomeEditado = "'"+nomeEditado+"%'";
        }if(cbContendo.isSelected() == true){
            nomeEditado = "'%"+nomeEditado+"%'";
        }
        
        try {
            tabela.editaProduto(dao.getProdutoIniciandoCom(nomeEditado));
            GuiPesquisaProdutos.this.dispose();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GuiPesquisaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfNome.setText("");
        try {
            tabela.editaProduto(dao.getTodosProdutos());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GuiPesquisaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        GuiPesquisaProdutos.this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JCheckBox cbCampoInteiro;
    private javax.swing.JCheckBox cbComecandoCom;
    private javax.swing.JCheckBox cbContendo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void nimbus() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPesquisaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
