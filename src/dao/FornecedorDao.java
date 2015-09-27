package dao;

import DAO.GenericDao;
import entidade.Fornecedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class FornecedorDao extends GenericDao{

    public FornecedorDao() {
    }
    
    public int adicionaFornecedor(Fornecedor fornecedor) throws SQLException, ClassNotFoundException{
        fornecedor.setId(getNextId("FORNECEDORES"));
        String query = "INSERT INTO APP.FORNECEDORES (ID,CPFCNPJ,NOME,CONTATO,CEP,TIPO,LOGRADOURO,NUMERO,COMPLEMENTO,BAIRRO,UF,MUNICIPIO,FONECOMERCIAL,FONEFAX,FONECELULAR,FONE0800,PAIS,INSCRICAOESTADUAL,INSCRICAOMUNICIPAL,EMAIL,SITE,OBSERVACOES,ATIVO,DATACADASTRO) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeComand(query, fornecedor.getId(),fornecedor.getCpfcnpj(),fornecedor.getNome(),fornecedor.getContato(),
                fornecedor.getCep(),fornecedor.getTipo(),fornecedor.getLogradouro(),fornecedor.getNumero(),
                fornecedor.getComplemento(),fornecedor.getBairro(),fornecedor.getUf(),fornecedor.getMunicipio(),
                fornecedor.getFoneComercial(), fornecedor.getFoneFax(),fornecedor.getFoneCelular(),fornecedor.getFone0800(),
                fornecedor.getPais(),fornecedor.getInscricaoEstadual(),fornecedor.getInscricaoMunicipal(),fornecedor.getEmail(),
                fornecedor.getSite(),fornecedor.getObservacoes(),fornecedor.getAtivo(),fornecedor.getDataCadastro());
        return fornecedor.getId();
    }
    public void atualizaCliente(Fornecedor fornecedor) throws SQLException, ClassNotFoundException{
        String query = "UPDATE APP.FORNECEDORES SET CPFCNPJ=?,NOME=?,CONTATO=?,CEP=?,TIPO=?,LOGRADOURO=?,NUMERO=?,COMPLEMENTO=?,BAIRRO=?,UF=?,MUNICIPIO=?,FONECOMERCIAL=?,FONEFAX=?,FONECELULAR=?,FONE0800=?,PAIS=?,INSCRICAOESTADUAL=?,INSCRICAOMUNICIPAL=?,EMAIL=?,SITE=?,OBSERVACOES=?,ATIVO=?,DATACADASTRO=? WHERE ID=?";
        executeComand(query, fornecedor.getCpfcnpj(),fornecedor.getNome(),fornecedor.getContato(),
                fornecedor.getCep(),fornecedor.getTipo(),fornecedor.getLogradouro(),fornecedor.getNumero(),
                fornecedor.getComplemento(),fornecedor.getBairro(),fornecedor.getUf(),fornecedor.getMunicipio(),
                fornecedor.getFoneComercial(), fornecedor.getFoneFax(),fornecedor.getFoneCelular(),fornecedor.getFone0800(),
                fornecedor.getPais(),fornecedor.getInscricaoEstadual(),fornecedor.getInscricaoMunicipal(),fornecedor.getEmail(),
                fornecedor.getSite(),fornecedor.getObservacoes(),fornecedor.getAtivo(),fornecedor.getDataCadastro(),fornecedor.getId());
    }
    public Fornecedor getFornecedor(int idFornecedor) throws SQLException, ClassNotFoundException{
        ResultSet rs = executeQuery("SELECT * FROM APP.FORNECEDORES WHERE ID=?", idFornecedor);
        Fornecedor fornecedor = null;
        if(rs.next()){
          fornecedor = populateFornecedorInfo(rs); 
        }
        rs.close();
        return fornecedor;
    }

    private Fornecedor populateFornecedorInfo(ResultSet rs) throws SQLException {
        Fornecedor toReturn = new Fornecedor();
        toReturn.setId(rs.getInt("ID"));
        toReturn.setCpfcnpj(rs.getString("CPFCNPJ"));
        toReturn.setNome(rs.getString("NOME"));
        toReturn.setContato(rs.getString("CONTATO"));
        toReturn.setCep(rs.getString("CEP"));
        toReturn.setTipo(rs.getString("TIPO"));
        toReturn.setLogradouro(rs.getString("LOGRADOURO"));
        toReturn.setNumero(rs.getString("NUMERO"));
        toReturn.setComplemento(rs.getString("COMPLEMENTO"));
        toReturn.setBairro(rs.getString("BAIRRO"));
        toReturn.setUf(rs.getString("UF"));
        toReturn.setMunicipio(rs.getString("MUNICIPIO"));
        toReturn.setFoneComercial(rs.getString("FONECOMERCIAL"));
        toReturn.setFoneFax(rs.getString("FONEFAX"));
        toReturn.setFoneCelular(rs.getString("FONECELULAR"));
        toReturn.setFone0800(rs.getString("FONE0800"));
        toReturn.setPais(rs.getString("PAIS"));
        toReturn.setInscricaoEstadual(rs.getString("INSCRICAOMUNICIPAL"));
        toReturn.setInscricaoMunicipal(rs.getString("INSCRICAOMUNICIPAL"));
        toReturn.setEmail(rs.getString("EMAIL"));
        toReturn.setSite(rs.getString("EMAIL"));
        toReturn.setObservacoes(rs.getString("OBSERVACOES"));
        toReturn.setAtivo(rs.getString("ATIVO"));
        toReturn.setDataCadastro(rs.getDate("DATACADASTRO"));
        return toReturn;
    }
    public List<Fornecedor> getTodosFornecedores() throws SQLException, ClassNotFoundException{
        List<Fornecedor> toReturn = new LinkedList<Fornecedor>();
        ResultSet rs = executeQuery("SELECT * FROM APP.FORNECEDORES");
        while (rs.next()){
            toReturn.add(populateFornecedorInfo(rs));
        }
        rs.close();
        return toReturn;
    }
    public List<Fornecedor> getFornecedorIniciandoCom(String nome) throws SQLException, ClassNotFoundException{
        List<Fornecedor> toReturn = new LinkedList<Fornecedor>();
        ResultSet rs = executeQuery("SELECT * FROM APP.FORNECEDORES WHERE NOME LIKE UPPER("+nome+")");
        while (rs.next()){
            toReturn.add(populateFornecedorInfo(rs));
        }
        rs.close();
        return toReturn;
    }
}
