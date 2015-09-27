package dao;

import DAO.GenericDao;
import entidade.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class FuncionarioDao extends GenericDao{
    
    public FuncionarioDao(){
        
    }
    
    public int adicionaFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException{
        funcionario.setId(getNextId("FUNCIONARIOS"));
        String query = "INSERT INTO APP.FUNCIONARIOS (ID,NOME,CPF,RG,NUMEROREGISTRO,NASCIMENTO,PIS,CEP,TIPO,LOGRADOURO,NUMERO,COMPLEMENTO,BAIRRO,UF,MUNICIPIO,FONERESIDENCIAL,FONECELULAR,EMAIL,ADMISSAO,DEMISSAO,APELIDO,SALARIO,EXTRA,ATIVO,ID_LOGIN) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeComand(query, funcionario.getId(), funcionario.getNome(),funcionario.getCpf(),funcionario.getRg(),
                funcionario.getNumeroRegistro(),funcionario.getNascimento(),funcionario.getPis(),funcionario.getCep(),
                funcionario.getTipo(),funcionario.getLogradouro(),funcionario.getNumero(),funcionario.getComplemento(),
                funcionario.getBairro(),funcionario.getUf(),funcionario.getMunicipio(),funcionario.getFoneResidencial(),
                funcionario.getFoneCelular(),funcionario.getEmail(),funcionario.getAdmissao(),funcionario.getDemissao(),
                funcionario.getApelido(),funcionario.getSalario(),funcionario.getExtra(),funcionario.getAtivo(),
                funcionario.getId_Login());
        return funcionario.getId();
    }
    
    public void removeFuncionario(int idFuncionario) throws SQLException, ClassNotFoundException{
        executeComand("DELETE FROM APP.FUNCIONARIOS WHERE ID = ?", idFuncionario);
    }
    
    public void atualizaFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException{
        String query = "UPDATE APP.FUNCIONARIOS SET NOME=?,CPF=?,RG=?,NUMEROREGISTRO=?,NASCIMENTO=?,PIS=?,CEP=?,TIPO=?,LOGRADOURO=?,NUMERO=?,COMPLEMENTO=?,BAIRRO=?,UF=?,MUNICIPIO=?,FONERESIDENCIAL=?,FONECELULAR=?,EMAIL=?,ADMISSAO=?,DEMISSAO=?,APELIDO=?,SALARIO=?,EXTRA=?,ATIVO=?,ID_LOGIN=? WHERE ID=?";
        executeComand(query, funcionario.getNome(),funcionario.getCpf(),funcionario.getRg(),
                funcionario.getNumeroRegistro(),funcionario.getNascimento(),funcionario.getPis(),funcionario.getCep(),
                funcionario.getTipo(),funcionario.getLogradouro(),funcionario.getNumero(),funcionario.getComplemento(),
                funcionario.getBairro(),funcionario.getUf(),funcionario.getMunicipio(),funcionario.getFoneResidencial(),
                funcionario.getFoneCelular(),funcionario.getEmail(),funcionario.getAdmissao(),funcionario.getDemissao(),
                funcionario.getApelido(),funcionario.getSalario(),funcionario.getExtra(),funcionario.getAtivo(),
                funcionario.getId_Login(),funcionario.getId());
    }
    
    public Funcionario getFuncionario(int idFuncionario) throws SQLException, ClassNotFoundException{
        ResultSet rs = executeQuery("SELECT * FROM APP.FUNCIONARIOS WHERE ID=?", idFuncionario);
        Funcionario funcionario = null;
        if(rs.next()){
          funcionario = populateFuncionarioInfo(rs); 
        }
        rs.close();
        return funcionario;
    }

    private Funcionario populateFuncionarioInfo(ResultSet rs) throws SQLException, ClassNotFoundException {
        final LoginDao loginDao = new LoginDao();
        Funcionario toReturn = new Funcionario();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setNome((rs.getString("NOME")));
        toReturn.setCpf(rs.getString("CPF"));
        toReturn.setRg(rs.getString("RG"));
        toReturn.setNumeroRegistro(rs.getString("NUMEROREGISTRO"));
        toReturn.setNascimento(rs.getString("NASCIMENTO"));
        toReturn.setPis(rs.getString("PIS"));
        toReturn.setCep(rs.getString("CEP"));
        toReturn.setTipo(rs.getString("TIPO"));
        toReturn.setLogradouro(rs.getString("LOGRADOURO"));
        toReturn.setNumero(rs.getString("NUMERO"));
        toReturn.setComplemento(rs.getString("COMPLEMENTO"));
        toReturn.setBairro(rs.getString("BAIRRO"));
        toReturn.setUf(rs.getString("UF"));
        toReturn.setMunicipio(rs.getString("MUNICIPIO"));
        toReturn.setFoneResidencial(rs.getString("FONERESIDENCIAL"));
        toReturn.setFoneCelular(rs.getString("FONECELULAR"));
        toReturn.setEmail(rs.getString("EMAIL"));
        toReturn.setAdmissao(rs.getString("ADMISSAO"));
        toReturn.setDemissao(rs.getString("DEMISSAO"));
        toReturn.setApelido(rs.getString("APELIDO"));
        toReturn.setSalario(rs.getString("SALARIO"));
        toReturn.setExtra(rs.getString("EXTRA"));
        toReturn.setAtivo(rs.getString("ATIVO"));
        toReturn.setId_Login(rs.getInt("ID_LOGIN"));
        return toReturn;
    }
    
    public List<Funcionario> getTodosFuncionarios() throws SQLException, ClassNotFoundException{
        List<Funcionario> toReturn = new LinkedList<Funcionario>();
        ResultSet rs = executeQuery("SELECT * FROM APP.FUNCIONARIOS");
        while (rs.next()){
            toReturn.add(populateFuncionarioInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public List<Funcionario> getFuncionariosIniciandoCom(String nome) throws SQLException, ClassNotFoundException{
        List<Funcionario> toReturn = new LinkedList<Funcionario>();
        ResultSet rs = executeQuery("SELECT * FROM APP.FUNCIONARIOS WHERE NOME LIKE UPPER("+nome+")");
        while (rs.next()){
            toReturn.add(populateFuncionarioInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    
    public void atualizaLoginFuncionario(int idFuncionario, int idLogin) throws SQLException, ClassNotFoundException{
        String query = "UPDATE APP.FUNCIONARIOS SET ID_LOGIN=? WHERE ID=?";
        executeComand(query, idLogin,idFuncionario);
    }
}
