package frontEnd;

import frontEnd.cronometro.GuiCronometroQuarto01;
import frontEnd.cronometro.GuiCronometroQuarto02;
import frontEnd.cronometro.GuiCronometroQuarto03;
import frontEnd.cronometro.GuiCronometroQuarto04;
import frontEnd.cronometro.GuiCronometroQuarto05;
import frontEnd.cronometro.GuiCronometroQuarto06;
import frontEnd.cronometro.GuiCronometroQuarto07;
import frontEnd.cronometro.GuiCronometroQuarto08;
import frontEnd.cronometro.GuiCronometroQuarto09;
import frontEnd.cronometro.GuiCronometroQuarto10;
import frontEnd.cronometro.GuiCronometroQuarto11;
import frontEnd.cronometro.GuiCronometroQuarto12;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import relatorios.RelatorioVendas;

public class GuiVendas extends javax.swing.JFrame {
    
    GuiCronometroQuarto01 guiCronometroQuarto01 = new GuiCronometroQuarto01();
    GuiCronometroQuarto02 guiCronometroQuarto02 = new GuiCronometroQuarto02();
    GuiCronometroQuarto03 guiCronometroQuarto03 = new GuiCronometroQuarto03();
    GuiCronometroQuarto04 guiCronometroQuarto04 = new GuiCronometroQuarto04();
    GuiCronometroQuarto05 guiCronometroQuarto05 = new GuiCronometroQuarto05();
    GuiCronometroQuarto06 guiCronometroQuarto06 = new GuiCronometroQuarto06();
    GuiCronometroQuarto07 guiCronometroQuarto07 = new GuiCronometroQuarto07();
    GuiCronometroQuarto08 guiCronometroQuarto08 = new GuiCronometroQuarto08();
    GuiCronometroQuarto09 guiCronometroQuarto09 = new GuiCronometroQuarto09();
    GuiCronometroQuarto10 guiCronometroQuarto10 = new GuiCronometroQuarto10();
    GuiCronometroQuarto11 guiCronometroQuarto11 = new GuiCronometroQuarto11();
    GuiCronometroQuarto12 guiCronometroQuarto12 = new GuiCronometroQuarto12();
    
    public GuiVendas() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btQuarto01 = new javax.swing.JButton();
        btQuarto02 = new javax.swing.JButton();
        btQuarto03 = new javax.swing.JButton();
        btQuarto04 = new javax.swing.JButton();
        btQuarto05 = new javax.swing.JButton();
        btQuarto06 = new javax.swing.JButton();
        btQuarto07 = new javax.swing.JButton();
        btQuarto08 = new javax.swing.JButton();
        btQuarto09 = new javax.swing.JButton();
        btQuarto10 = new javax.swing.JButton();
        btQuarto11 = new javax.swing.JButton();
        btQuarto12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quartos Disponiveis");
        setResizable(false);

        btQuarto01.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto01.setText("Quarto 01");
        btQuarto01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btQuarto01.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btQuarto01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto01ActionPerformed(evt);
            }
        });

        btQuarto02.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto02.setText("Quarto 02");
        btQuarto02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto02ActionPerformed(evt);
            }
        });

        btQuarto03.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto03.setText("Quarto 03");
        btQuarto03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto03ActionPerformed(evt);
            }
        });

        btQuarto04.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto04.setText("Quarto 04");
        btQuarto04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto04ActionPerformed(evt);
            }
        });

        btQuarto05.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto05.setText("Quarto 05");
        btQuarto05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto05ActionPerformed(evt);
            }
        });

        btQuarto06.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto06.setText("Quarto 06");
        btQuarto06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto06ActionPerformed(evt);
            }
        });

        btQuarto07.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto07.setText("Quarto 07");
        btQuarto07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto07ActionPerformed(evt);
            }
        });

        btQuarto08.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto08.setText("Quarto 08");
        btQuarto08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto08ActionPerformed(evt);
            }
        });

        btQuarto09.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto09.setText("Quarto 09");
        btQuarto09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto09ActionPerformed(evt);
            }
        });

        btQuarto10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto10.setText("Quarto 10");
        btQuarto10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto10ActionPerformed(evt);
            }
        });

        btQuarto11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto11.setText("Quarto 11");
        btQuarto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto11ActionPerformed(evt);
            }
        });

        btQuarto12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btQuarto12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa verde.png"))); // NOI18N
        btQuarto12.setText("Quarto 12");
        btQuarto12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuarto12ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Close 24x24.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/updated 24x24.png"))); // NOI18N
        jButton2.setText("Relatorio de Vendas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btQuarto01)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto05)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto09))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btQuarto02)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto06)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto10))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btQuarto03)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto07)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto11))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btQuarto04)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto08)
                            .addGap(18, 18, 18)
                            .addComponent(btQuarto12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQuarto01)
                    .addComponent(btQuarto05)
                    .addComponent(btQuarto09))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQuarto02)
                    .addComponent(btQuarto06)
                    .addComponent(btQuarto10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQuarto03)
                    .addComponent(btQuarto07)
                    .addComponent(btQuarto11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQuarto04)
                    .addComponent(btQuarto08)
                    .addComponent(btQuarto12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-728)/2, (screenSize.height-707)/2, 728, 707);
    }// </editor-fold>//GEN-END:initComponents

    private void btQuarto01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto01ActionPerformed
        if(GuiCronometroQuarto01.isAtivo() == false){
        guiCronometroQuarto01.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto01.setVisible(true);
        }else{
           guiCronometroQuarto01.setVisible(true); 
        }
    }//GEN-LAST:event_btQuarto01ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GuiVendas.this.dispose();
        guiCronometroQuarto01.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btQuarto02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto02ActionPerformed
        if(GuiCronometroQuarto03.isAtivo() == false){
        guiCronometroQuarto02.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto02.setVisible(true);
        }else{
           guiCronometroQuarto02.setVisible(true); 
        }      
    }//GEN-LAST:event_btQuarto02ActionPerformed

    private void btQuarto03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto03ActionPerformed
        if(GuiCronometroQuarto03.isAtivo() == false){
        guiCronometroQuarto03.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto03.setVisible(true);
        }else{
           guiCronometroQuarto03.setVisible(true); 
        }  
    }//GEN-LAST:event_btQuarto03ActionPerformed

    private void btQuarto04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto04ActionPerformed
        if(GuiCronometroQuarto04.isAtivo() == false){
        guiCronometroQuarto04.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto04.setVisible(true);
        }else{
           guiCronometroQuarto04.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto04ActionPerformed

    private void btQuarto05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto05ActionPerformed
        if(GuiCronometroQuarto05.isAtivo() == false){
        guiCronometroQuarto05.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto05.setVisible(true);
        }else{
           guiCronometroQuarto05.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto05ActionPerformed

    private void btQuarto06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto06ActionPerformed
        if(GuiCronometroQuarto06.isAtivo() == false){
        guiCronometroQuarto06.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto06.setVisible(true);
        }else{
           guiCronometroQuarto06.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto06ActionPerformed

    private void btQuarto07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto07ActionPerformed
        if(GuiCronometroQuarto07.isAtivo() == false){
        guiCronometroQuarto07.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto07.setVisible(true);
        }else{
           guiCronometroQuarto07.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto07ActionPerformed

    private void btQuarto08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto08ActionPerformed
        if(GuiCronometroQuarto08.isAtivo() == false){
        guiCronometroQuarto08.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto08.setVisible(true);
        }else{
           guiCronometroQuarto08.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto08ActionPerformed

    private void btQuarto09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto09ActionPerformed
        if(GuiCronometroQuarto09.isAtivo() == false){
        guiCronometroQuarto09.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto09.setVisible(true);
        }else{
           guiCronometroQuarto09.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto09ActionPerformed

    private void btQuarto10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto10ActionPerformed
        if(GuiCronometroQuarto10.isAtivo() == false){
        guiCronometroQuarto10.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto10.setVisible(true);
        }else{
           guiCronometroQuarto10.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto10ActionPerformed

    private void btQuarto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto11ActionPerformed
        if(GuiCronometroQuarto11.isAtivo() == false){
        guiCronometroQuarto11.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto11.setVisible(true);
        }else{
           guiCronometroQuarto11.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto11ActionPerformed

    private void btQuarto12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuarto12ActionPerformed
        if(GuiCronometroQuarto12.isAtivo() == false){
        guiCronometroQuarto12.setDefaultCloseOperation(HIDE_ON_CLOSE);
        guiCronometroQuarto12.setVisible(true);
        }else{
           guiCronometroQuarto12.setVisible(true); 
        } 
    }//GEN-LAST:event_btQuarto12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            RelatorioVendas relatorioVendas = new RelatorioVendas();
            relatorioVendas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            relatorioVendas.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GuiVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuiVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btQuarto01;
    public static javax.swing.JButton btQuarto02;
    public static javax.swing.JButton btQuarto03;
    public static javax.swing.JButton btQuarto04;
    public static javax.swing.JButton btQuarto05;
    public static javax.swing.JButton btQuarto06;
    public static javax.swing.JButton btQuarto07;
    public static javax.swing.JButton btQuarto08;
    public static javax.swing.JButton btQuarto09;
    public static javax.swing.JButton btQuarto10;
    public static javax.swing.JButton btQuarto11;
    public static javax.swing.JButton btQuarto12;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
