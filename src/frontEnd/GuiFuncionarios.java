package frontEnd;

import frontEnd.pesquisa.GuiPesquisaFuncionarios;
import frontEnd.cadastro.GuiCadastroFuncionarios;
import frontEnd.cadastro.GuiCadastroClientes;
import dao.FuncionarioDao;
import entidade.Funcionario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import utilitarios.FuncionarioTableModel;

public class GuiFuncionarios extends JDialog {

    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnEditar, mnProcurar;
    private JMenuItem miNovo, miSair, miEditar, miProcurar;
    private JTable tabela;
    private List<Funcionario> funcionario;
    private final FuncionarioDao dao = new FuncionarioDao();
    FuncionarioTableModel modeloTabela;

    public GuiFuncionarios() {
        nimbus();
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Funcionários");
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 200, tela.width, tela.height - 232);
        setModal(true);
        setResizable(false);
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnEditar = new JMenu("Editar");
        mnProcurar = new JMenu("Procurar");
        miEditar = new JMenuItem("Editar");
        miNovo = new JMenuItem("Novo");
        miProcurar = new JMenuItem("Procurar");
        mnArquivo.add(miNovo);
        mnEditar.add(miEditar);
        mnProcurar.add(miProcurar);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnEditar);
        mnBarra.add(mnProcurar);
        setJMenuBar(mnBarra);
        getContentPane().add(new JScrollPane(getTabela()));
    }

    private JTable getTabela() {
        if (tabela == null) {
            tabela = new JTable();
            try {
                funcionario = dao.getTodosFuncionarios();
                modeloTabela = new FuncionarioTableModel(funcionario);
                tabela.setModel(modeloTabela);
                tabela.getColumnModel().getColumn(0).setPreferredWidth(30);
                tabela.getColumnModel().getColumn(1).setPreferredWidth(300);
                tabela.getColumnModel().getColumn(2).setPreferredWidth(150);
                tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
                tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
                tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
                tabela.getColumnModel().getColumn(6).setPreferredWidth(300);
                tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
                tabela.getTableHeader().setResizingAllowed(false);
                tabela.getTableHeader().setReorderingAllowed(false);
                tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                tabela.setShowGrid(true);
                tabela.updateUI();

            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Erro ao carregar a tabela");
            }
        }
        return tabela;
    }

    private void definirEventos() {

        miProcurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiPesquisaFuncionarios pesquisaFuncionarios = new GuiPesquisaFuncionarios(dao, modeloTabela);
                pesquisaFuncionarios.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                pesquisaFuncionarios.setVisible(true);
            }
        });

        miEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiCadastroFuncionarios cadastroFuncionarios = new GuiCadastroFuncionarios(dao, modeloTabela);
                try {
                    cadastroFuncionarios.editar(dao.getTodosFuncionarios().size());
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(GuiFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                cadastroFuncionarios.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                cadastroFuncionarios.setVisible(true);
            }
        });

        miNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiCadastroFuncionarios cadastroFuncionarios = new GuiCadastroFuncionarios(dao, modeloTabela);
                cadastroFuncionarios.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                cadastroFuncionarios.setVisible(true);
            }
        });

        tabela.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable marca = (JTable) e.getSource();
                    int linha = marca.getSelectedRow();

                    int id = (int) tabela.getValueAt(linha, 0);
                    GuiCadastroFuncionarios cadastroFuncionarios = new GuiCadastroFuncionarios(dao, modeloTabela);
                    cadastroFuncionarios.editar(id);
                    cadastroFuncionarios.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    cadastroFuncionarios.setVisible(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
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
