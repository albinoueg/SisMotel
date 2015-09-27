package frontEnd.cadastro;

import dao.FuncionarioDao;
import dao.LoginDao;
import entidade.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class GuiCadastroLogin extends JDialog {
    Login login = new Login();
    int codigoFuncionario;
    int codigoLogin;
    LoginDao dao = new LoginDao();
    FuncionarioDao funcionarioDao;
    
    public GuiCadastroLogin(int codigoFuncionario, FuncionarioDao funcionarioDao) {
        this.codigoFuncionario = codigoFuncionario;
        this.funcionarioDao = funcionarioDao;
        initComponents();
    }
    
    public GuiCadastroLogin(int codigoFuncionario, int codigoLogin, FuncionarioDao funcionarioDao) throws SQLException {
        this.codigoFuncionario = codigoFuncionario;
        this.codigoLogin = codigoLogin;
        this.funcionarioDao = funcionarioDao;
        initComponents();
        GuiCadastroLogin.this.preencherLogin();
    }
    
    private void preencherLogin() throws SQLException{
        try {
            login = dao.getLogin(codigoLogin);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuiCadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfUsuario.setText(login.getUsuario());
        tfSenha.setText(login.getSenha());
        tfConfirmarSenha.setText(login.getSenha());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbConfirmarSenha = new javax.swing.JLabel();
        tfConfirmarSenha = new javax.swing.JPasswordField();
        tfSenha = new javax.swing.JPasswordField();
        tfUsuario = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuarios");
        setModal(true);

        lbUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbUsuario.setText("Usuario:");

        lbSenha.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbSenha.setText("Senha:");

        lbConfirmarSenha.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbConfirmarSenha.setText("Confirmar senha:");

        tfConfirmarSenha.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfConfirmarSenha.setNextFocusableComponent(btSalvar);

        tfSenha.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfSenha.setNextFocusableComponent(tfConfirmarSenha);

        tfUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tfUsuario.setNextFocusableComponent(tfSenha);

        btCancelar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Close 24x24.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setPreferredSize(new java.awt.Dimension(150, 40));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add 24x24.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setPreferredSize(new java.awt.Dimension(150, 40));
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbConfirmarSenha)
                            .addComponent(lbUsuario)
                            .addComponent(lbSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfConfirmarSenha)
                            .addComponent(tfSenha)
                            .addComponent(tfUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirmarSenha)
                    .addComponent(tfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-352)/2, (screenSize.height-259)/2, 352, 259);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        GuiCadastroLogin.this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(!"".equals(tfUsuario.getText())){
           if(tfSenha.getText().equals(tfConfirmarSenha.getText())){
               login.setUsuario(tfUsuario.getText());
               login.setSenha(tfSenha.getText());
               login.setIdFuncionario(codigoFuncionario);
               
                try {
                    dao.adicionaLogin(login);
                    funcionarioDao.atualizaLoginFuncionario(codigoFuncionario, login.getId());
                    JOptionPane.showMessageDialog(this, "Usuario e senha adicionado com sucesso", "Salvo", JOptionPane.INFORMATION_MESSAGE);
                    GuiCadastroLogin.this.dispose();
                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possivel adicionar o usuario e senha." + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GuiCadastroFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
           }else{
               JOptionPane.showMessageDialog(this, "Senhas não conferem.", "Erro", JOptionPane.ERROR_MESSAGE);
           }
           
        }else{
            JOptionPane.showMessageDialog(this, "Favor informar um usuario valido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lbConfirmarSenha;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField tfConfirmarSenha;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
