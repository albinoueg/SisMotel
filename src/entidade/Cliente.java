package entidade;

import java.util.Date;

public class Cliente {
    
    private int id;
    private String cpfcnpj;
    private String nome;
    private String contato;
    private String cep;
    private String tipo;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String uf;
    private String municipio;
    private String foneResidencial;
    private String foneComercial;
    private String foneCelular;
    private String foneFax;
    private String pais;
    private String email;
    private String observacoes;
    private String ativo;
    private Date dataCadastro;
    
   public Cliente(){
       
   }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(int id, String cpfcnpj, String nome, String contato, String cep, String tipo, String logradouro, String numero, String complemento, String bairro, String uf, String municipio, String foneResidencial, String foneComercial, String foneCelular, String foneFax, String pais, String email, String observacoes, String ativo, Date dataCadastro) {
        this.id = id;
        this.cpfcnpj = cpfcnpj;
        this.nome = nome;
        this.contato = contato;
        this.cep = cep;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
        this.municipio = municipio;
        this.foneResidencial = foneResidencial;
        this.foneComercial = foneComercial;
        this.foneCelular = foneCelular;
        this.foneFax = foneFax;
        this.pais = pais;
        this.email = email;
        this.observacoes = observacoes;
        this.ativo = ativo;
        this.dataCadastro = dataCadastro;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getFoneResidencial() {
        return foneResidencial;
    }

    public void setFoneResidencial(String foneResidencial) {
        this.foneResidencial = foneResidencial;
    }

    public String getFoneComercial() {
        return foneComercial;
    }

    public void setFoneComercial(String foneComercial) {
        this.foneComercial = foneComercial;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getFoneFax() {
        return foneFax;
    }

    public void setFoneFax(String foneFax) {
        this.foneFax = foneFax;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
   
   
}
