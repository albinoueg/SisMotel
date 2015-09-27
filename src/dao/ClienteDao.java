package dao;

import DAO.GenericDao;
import entidade.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ClienteDao extends GenericDao{
    
    public ClienteDao(){
        
    }
    
    public int adicionaCliente(Cliente cliente) throws SQLException, ClassNotFoundException{
        cliente.setId(getNextId("CLIENTES"));
        String query = "INSERT INTO APP.CLIENTES (ID,CPFCNPJ,NOME,CONTATO,CEP,TIPO,LOGRADOURO,NUMERO,COMPLEMENTO,BAIRRO,UF,MUNICIPIO,FONERESIDENCIAL,FONECOMERCIAL,FONECELULAR,FONEFAX,PAIS,EMAIL,OBSERVACOES,ATIVO,DATACADASTRO) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        executeComand(query, cliente.getId(), cliente.getCpfcnpj(), cliente.getNome(), cliente.getContato(),
                cliente.getCep(), cliente.getTipo(), cliente.getLogradouro(), cliente.getNumero(),
                cliente.getComplemento(), cliente.getBairro(), cliente.getUf(), cliente.getMunicipio(),
                cliente.getFoneResidencial(), cliente.getFoneComercial(), cliente.getFoneCelular(),
                cliente.getFoneFax(), cliente.getPais(), cliente.getEmail(), cliente.getObservacoes(),
                cliente.getAtivo(),cliente.getDataCadastro());
        return cliente.getId();
    }
    
    public void removeCliente(int idCliente) throws SQLException, ClassNotFoundException{
        executeComand("DELETE FROM APP.CLIENTES WHERE ID = ?", idCliente);
    }
    
    public void atualizaCliente(Cliente cliente) throws SQLException, ClassNotFoundException{
        String query = "UPDATE APP.CLIENTES SET CPFCNPJ=?,NOME=?,CONTATO=?,CEP=?,TIPO=?,LOGRADOURO=?,NUMERO=?,COMPLEMENTO=?,BAIRRO=?,UF=?,MUNICIPIO=?,FONERESIDENCIAL=?,FONECOMERCIAL=?,FONECELULAR=?,FONEFAX=?,PAIS=?,EMAIL=?,OBSERVACOES=?,ATIVO=?,DATACADASTRO=? WHERE ID=?";
        executeComand(query, cliente.getCpfcnpj(), cliente.getNome(), cliente.getContato(),
                cliente.getCep(), cliente.getTipo(), cliente.getLogradouro(), cliente.getNumero(),
                cliente.getComplemento(), cliente.getBairro(), cliente.getUf(), cliente.getMunicipio(),
                cliente.getFoneResidencial(), cliente.getFoneComercial(), cliente.getFoneCelular(),
                cliente.getFoneFax(), cliente.getPais(), cliente.getEmail(), cliente.getObservacoes(),
                cliente.getAtivo(),cliente.getDataCadastro(), cliente.getId());
    }
    
    public Cliente getCliente(int idCliente) throws SQLException, ClassNotFoundException{
        Cliente cliente;
        try (ResultSet rs = executeQuery("SELECT * FROM APP.CLIENTES WHERE ID=?", idCliente)) {
            cliente = null;
            if(rs.next()){ 
              cliente = populateClienteInfo(rs); 
            }
        }
        return cliente;
    }

    private Cliente populateClienteInfo(ResultSet rs) throws SQLException {
        Cliente toReturn = new Cliente();
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
        toReturn.setFoneResidencial(rs.getString("FONERESIDENCIAL"));
        toReturn.setFoneComercial(rs.getString("FONECOMERCIAL"));
        toReturn.setFoneCelular(rs.getString("FONECELULAR"));
        toReturn.setFoneFax(rs.getString("FONEFAX"));
        toReturn.setPais(rs.getString("PAIS"));
        toReturn.setEmail(rs.getString("EMAIL"));
        toReturn.setObservacoes(rs.getString("OBSERVACOES"));
        toReturn.setAtivo(rs.getString("ATIVO"));
        toReturn.setDataCadastro(rs.getDate("DATACADASTRO"));
        return toReturn;
    }
    
    public List<Cliente> getTodosClientes() throws SQLException, ClassNotFoundException{
        List<Cliente> toReturn = new LinkedList<>();
        try (ResultSet rs = executeQuery("SELECT * FROM APP.CLIENTES")) {
            while (rs.next()){
                toReturn.add(populateClienteInfo(rs));
            }
        }
        return toReturn;
    }
    
    public List<Cliente> getClientesIniciandoCom(String nome) throws SQLException, ClassNotFoundException{
        List<Cliente> toReturn = new LinkedList<>();
        try (ResultSet rs = executeQuery("SELECT * FROM APP.CLIENTES WHERE NOME LIKE UPPER("+nome+")")) {
            while (rs.next()){
                toReturn.add(populateClienteInfo(rs));
            }
        }
        return toReturn;
    }
}
