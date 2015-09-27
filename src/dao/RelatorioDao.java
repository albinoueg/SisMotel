package dao;

import DAO.GenericDao;
import entidade.Relatorio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class RelatorioDao extends GenericDao{

    public RelatorioDao() {
    }
    
    public int adicionaRelatorio(Relatorio relatorio) throws SQLException, ClassNotFoundException{
        relatorio.setId(getNextId("RELATORIO"));
        String query = "INSERT INTO APP.RELATORIO (ID,VALOR_TOTAL,DATA,TEMPO_ESTADIA,QUARTO) values(?,?,?,?,?)";
        executeComand(query, relatorio.getId(),relatorio.getValorTotal(),relatorio.getData(),
                relatorio.getTempoEstadia(),relatorio.getQuarto());
        return relatorio.getId();
    }
    public void atualizaRelatorio(Relatorio relatorio) throws SQLException, ClassNotFoundException{
        String query = "UPDATE APP.RELATORIO SET VALOR_TOTAL=?,DATA=?,TEMPO_ESTADIA=?,QUARTO=? WHERE ID=?";
        executeComand(query, relatorio.getValorTotal(),relatorio.getData(),
                relatorio.getTempoEstadia(),relatorio.getQuarto(),relatorio.getId());
    }
    public Relatorio getRelatorio(int idRelatorio) throws SQLException, ClassNotFoundException{
        ResultSet rs = executeQuery("SELECT * FROM APP.RELATORIO WHERE ID=?", idRelatorio);
        Relatorio relatorio = null;
        if(rs.next()){
          relatorio = populateRelatorioInfo(rs); 
        }
        rs.close();
        return relatorio;
    }

    private Relatorio populateRelatorioInfo(ResultSet rs) throws SQLException {
        Relatorio toReturn = new Relatorio();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setValorTotal(rs.getString("VALOR_TOTAL"));
        toReturn.setData(rs.getDate("DATA"));
        toReturn.setTempoEstadia(rs.getString("TEMPO_ESTADIA"));
        toReturn.setQuarto(rs.getString("QUARTO"));
        return toReturn;
    }
    public List<Relatorio> getTodosRelatorios() throws SQLException, ClassNotFoundException{
        List<Relatorio> toReturn = new LinkedList<Relatorio>();
        ResultSet rs = executeQuery("SELECT * FROM APP.RELATORIO");
        while (rs.next()){
            toReturn.add(populateRelatorioInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    public List<Relatorio> getRelatorioIniciandoCom(Date data) throws SQLException, ClassNotFoundException{
        List<Relatorio> toReturn = new LinkedList<Relatorio>();
        ResultSet rs = executeQuery("SELECT * FROM APP.RELATORIO WHERE DATA LIKE "+data);
        while (rs.next()){
            toReturn.add(populateRelatorioInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
