package frontEnd.menuPrincipal;

import frontEnd.GuiClientes;
import frontEnd.GuiFornecedores;
import frontEnd.GuiFuncionarios;
import frontEnd.GuiProdutos;
import frontEnd.GuiVendas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

public class GuiMenuPrincipal extends JFrame {

    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnCadastros, mnComprasVendas, mnSair, mnSobre;
    private JMenuItem miClientes, miSair, miFornecedores, miEstoque, miFuncionarios,
            miVendas;

    public GuiMenuPrincipal() {
        nimbus();
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Gerenciador de Motéis");
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, tela.width, 200);
        setResizable(false);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnCadastros = new JMenu("Cadastros");
        mnComprasVendas = new JMenu("Vendas");
        mnSair = new JMenu("Sair");
        mnSobre = new JMenu("?");

        miClientes = new JMenuItem("Clientes...");
        miFornecedores = new JMenuItem("Fornecedores...");
        miEstoque = new JMenuItem("Estoque...");
        miFuncionarios = new JMenuItem("Funcionários...");
        miVendas = new JMenuItem("Vendas...");
        miSair = new JMenuItem("Sair");
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));

        mnCadastros.add(miClientes);
        mnCadastros.add(miFornecedores);
        mnCadastros.add(new JSeparator());
        mnCadastros.add(miEstoque);
        mnCadastros.add(new JSeparator());
        mnCadastros.add(miFuncionarios);
        mnSair.add(miSair);
        mnComprasVendas.add(miVendas);
        mnBarra.add(mnCadastros);
        mnBarra.add(mnComprasVendas);
        mnBarra.add(mnSair);
        mnBarra.add(mnSobre);
        setJMenuBar(mnBarra);

        GuiBotoesPrincipais botoes = new GuiBotoesPrincipais();
        contentPane.add(botoes);
        contentPane.validate();
    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        miClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                GuiClientes guiClientes = new GuiClientes();
                guiClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiClientes.setVisible(true);
            }
        });
        miFornecedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiFornecedores guiFornecedores = new GuiFornecedores();
                guiFornecedores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiFornecedores.setVisible(true);
            }
        });
        miFuncionarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiFuncionarios guiFuncionarios = new GuiFuncionarios();
                guiFuncionarios.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiFuncionarios.setVisible(true);
            }
        });
        miEstoque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProdutos guiProdutos = new GuiProdutos();
                guiProdutos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiProdutos.setVisible(true);
            }
        });
        miVendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiVendas guiVendas = new GuiVendas();
                guiVendas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiVendas.setVisible(true);
            }
        });
    }

    public static void abrir() {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(GuiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
