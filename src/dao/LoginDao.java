package dao;

import DAO.GenericDao;
import entidade.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class LoginDao extends GenericDao{
    
    public LoginDao(){
        
    }
    
    public int adicionaLogin(Login login) throws SQLException, ClassNotFoundException{
        login.setId(getNextId("LOGIN"));
        String query = "INSERT INTO APP.LOGIN (ID,USUARIO,SENHA,ID_FUNCIONARIO) values(?,?,?,?)";
        executeComand(query, login.getId(),login.getUsuario(),login.getSenha(),login.getIdFuncionario());
        return login.getId();
    }
    
    public void removeLogin(int idLogin) throws SQLException, ClassNotFoundException{
        executeComand("DELETE FROM APP.LOGIN WHERE ID = ?", idLogin);
    }
    
    public void atualizaLogin(Login login) throws SQLException, ClassNotFoundException{
        String query = "UPDATE APP.LOGIN SET USUARIO=?,SENHA=?,ID_FUNCIONARIO=? WHERE ID=?";
        executeComand(query, login.getUsuario(),login.getSenha(),login.getIdFuncionario(),login.getId());
    }
    
    public Login getLogin(int idLogin) throws SQLException, ClassNotFoundException{
        ResultSet rs = executeQuery("SELECT * FROM APP.LOGIN WHERE ID=?", idLogin);
        Login login = null;
        if(rs.next()){
          login = populateLoginInfo(rs); 
        }
        rs.close();
        return login;
    }

    private Login populateLoginInfo(ResultSet rs) throws SQLException, ClassNotFoundException {
        Login toReturn = new Login();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setUsuario(rs.getString("USUARIO"));
        toReturn.setSenha(rs.getString("SENHA"));
        toReturn.setIdFuncionario(rs.getInt("ID_FUNCIONARIO"));
        return toReturn;
    }
    
    public List<Login> getTodosLogins() throws SQLException, ClassNotFoundException{
        List<Login> toReturn = new LinkedList<Login>();
        ResultSet rs = executeQuery("SELECT * FROM APP.LOGIN");
        while (rs.next()){
            toReturn.add(populateLoginInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Login> getIniciandoCom(String usuario) throws SQLException, ClassNotFoundException{
        List<Login> toReturn = new LinkedList<Login>();
        ResultSet rs = executeQuery("SELECT * FROM APP.LOGIN WHERE USUARIO LIKE ?", usuario+"%");
        while (rs.next()){
            toReturn.add(populateLoginInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public Login getLoginUsuario(String usuario) throws SQLException, ClassNotFoundException{
        ResultSet rs = executeQuery("SELECT * FROM APP.LOGIN WHERE USUARIO LIKE ?", usuario+"%");
        Login login = null;
        if(rs.next()){
          login = populateLoginInfo(rs); 
        }
        rs.close();
        return login;
    }
}
