package frontEnd.menuPrincipal;

import frontEnd.GuiClientes;
import frontEnd.GuiFornecedores;
import frontEnd.GuiProdutos;
import frontEnd.GuiVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiBotoesPrincipais extends JPanel {

    private JButton btClientes, btFornecedores, btEstoque, btVendas;
    private ImageIcon imgClientes, imgFornecedores, imgEstoque, imgVendas;

    public GuiBotoesPrincipais() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        imgClientes = new ImageIcon(GuiBotoesPrincipais.class.getResource("/imagens/Clientes 128x128.png"));
        imgFornecedores = new ImageIcon(GuiBotoesPrincipais.class.getResource("/imagens/Industria 128x128.png"));
        imgEstoque = new ImageIcon(GuiBotoesPrincipais.class.getResource("/imagens/Caixa 128x128.png"));
        imgVendas = new ImageIcon(GuiBotoesPrincipais.class.getResource("/imagens/Vendas 128x128.png"));

        btClientes = new JButton("", imgClientes);
        btClientes.setBounds(20, 5, 128, 128);
        btClientes.setToolTipText("Clientes");

        btFornecedores = new JButton("", imgFornecedores);
        btFornecedores.setBounds(168, 5, 128, 128);
        btFornecedores.setToolTipText("Fornecedores");

        btEstoque = new JButton("", imgEstoque);
        btEstoque.setBounds(316, 5, 128, 128);
        btEstoque.setToolTipText("Estoque");

        btVendas = new JButton("", imgVendas);
        btVendas.setBounds(464, 5, 128, 128);
        btVendas.setToolTipText("Vendas");

        add(btClientes);
        add(btFornecedores);
        add(btEstoque);
        add(btVendas);
    }

    private void definirEventos() {
        btClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiClientes guiClientes = new GuiClientes();
                guiClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiClientes.setVisible(true);
            }
        });
        btFornecedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiFornecedores guiFornecedores = new GuiFornecedores();
                guiFornecedores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiFornecedores.setVisible(true);
            }
        });
        btEstoque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProdutos guiProdutos = new GuiProdutos();
                guiProdutos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiProdutos.setVisible(true);
            }
        });
        btVendas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiVendas guiVendas = new GuiVendas();
                guiVendas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guiVendas.setVisible(true);
            }
        });
    }
}
