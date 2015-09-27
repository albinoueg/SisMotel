package dao;

import DAO.GenericDao;
import entidade.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ProdutoDao extends GenericDao{

    public ProdutoDao() {
    }
    
    public int adicionaProduto(Produto produto) throws SQLException, ClassNotFoundException{
        produto.setId(getNextId("PRODUTOS"));
        String query = "INSERT INTO APP.PRODUTOS (ID,DESCRICAO,QUANTIDADE,PRECO_COMPRA,PRECO_VENDA) values(?,?,?,?,?)";
        executeComand(query, produto.getId(),produto.getDescricao(),produto.getQuantidade(),
                produto.getPrecoCompra(),produto.getPrecoVenda());
        return produto.getId();
    }
    public void atualizaProduto(Produto produto) throws SQLException, ClassNotFoundException{
        String query = "UPDATE APP.PRODUTOS SET DESCRICAO=?,QUANTIDADE=?,PRECO_COMPRA=?,PRECO_VENDA=? WHERE ID=?";
        executeComand(query, produto.getDescricao(),produto.getQuantidade(),produto.getPrecoCompra(),produto.getPrecoVenda(),produto.getId());
    }
    public Produto getProduto(int idProduto) throws SQLException, ClassNotFoundException{
        ResultSet rs = executeQuery("SELECT * FROM APP.PRODUTOS WHERE ID=?", idProduto);
        Produto produto = null;
        if(rs.next()){
          produto = populateProdutoInfo(rs); 
        }
        rs.close();
        return produto;
    }

    private Produto populateProdutoInfo(ResultSet rs) throws SQLException {
        Produto toReturn = new Produto();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setDescricao(rs.getString("DESCRICAO"));
        toReturn.setQuantidade(rs.getInt("QUANTIDADE"));
        toReturn.setPrecoCompra(rs.getString("PRECO_COMPRA"));
        toReturn.setPrecoVenda(rs.getString("PRECO_VENDA"));
        return toReturn;
    }
    public List<Produto> getTodosProdutos() throws SQLException, ClassNotFoundException{
        List<Produto> toReturn = new LinkedList<Produto>();
        ResultSet rs = executeQuery("SELECT * FROM APP.PRODUTOS");
        while (rs.next()){
            toReturn.add(populateProdutoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    public List<Produto> getProdutoIniciandoCom(String nome) throws SQLException, ClassNotFoundException{
        List<Produto> toReturn = new LinkedList<Produto>();
        ResultSet rs = executeQuery("SELECT * FROM APP.PRODUTOS WHERE DESCRICAO LIKE UPPER("+nome+")");
        while (rs.next()){
            toReturn.add(populateProdutoInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
