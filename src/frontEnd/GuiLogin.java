package frontEnd;

import frontEnd.cadastro.GuiCadastroClientes;
import frontEnd.menuPrincipal.GuiMenuPrincipal;
import dao.LoginDao;
import entidade.Login;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GuiLogin extends JFrame {

    private JTextField tfLogin;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GuiLogin frame;
    private JLabel iconeCadeado;
    LoginDao loginDao = new LoginDao();
    Login login = new Login();

    public GuiLogin() {
        nimbus();
        inicializaComponentes();
        definirEventos();
    }

    private void inicializaComponentes() {
        setTitle("SisMotel");
        setBounds(0, 0, 367, 200);
        getContentPane().setLayout(null);
        tfLogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        lbSenha = new JLabel("Senha");
        lbLogin = new JLabel("Login");
        btLogar = new JButton("Entrar");
        btCancelar = new JButton("Cancelar");
        iconeCadeado = new JLabel();
        iconeCadeado.setIcon(new ImageIcon(GuiLogin.class.getResource("/imagens/Cadeado 96x96.png")));
        tfLogin.setBounds(100, 30, 120, 25);
        lbLogin.setBounds(30, 30, 80, 25);
        lbSenha.setBounds(30, 75, 80, 25);
        pfSenha.setBounds(100, 75, 120, 25);
        btLogar.setBounds(75, 119, 100, 25);
        btCancelar.setBounds(180, 119, 100, 25);
        iconeCadeado.setBounds(241, 11, 96, 96);
        getContentPane().add(tfLogin);
        getContentPane().add(lbSenha);
        getContentPane().add(lbLogin);
        getContentPane().add(btLogar);
        getContentPane().add(btCancelar);
        getContentPane().add(pfSenha);
        getContentPane().add(iconeCadeado);
    }

    private void definirEventos() {
        btLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    login = loginDao.getLoginUsuario(tfLogin.getText());
                    String senha = String.valueOf(pfSenha.getPassword());
                    String testaSenha = login.getSenha();
                    String testaUsuario = login.getUsuario();
                    if (tfLogin.getText().equals(testaUsuario) && senha.equals(testaSenha)) {
                        frame.setVisible(false);
                        GuiMenuPrincipal.abrir();
                    } else {
                        JOptionPane.showMessageDialog(null, "Login ou Senha incorretos!");
                }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GuiLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new GuiLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
    }

    private void nimbus() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}