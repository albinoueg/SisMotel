package entidade;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String numeroRegistro;
    private String nascimento;
    private String pis;
    private String cep;
    private String tipo;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String uf;
    private String municipio;
    private String foneResidencial;
    private String foneCelular;
    private String email;
    private String admissao;
    private String demissao;
    private String apelido;
    private String salario;
    private String extra;
    private String ativo;
    private int id_Login;

    public Funcionario(int id) {
        this.id = id;
    }

    public Funcionario(int id, String nome, String cpf, String rg, String numeroRegistro, String nascimento, String pis, String cep, String tipo, String logradouro, String numero, String complemento, String bairro, String uf, String municipio, String foneResidencial, String foneCelular, String email, String admissao, String demissao, String apelido, String salario, String extra, String ativo, int id_Login) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.numeroRegistro = numeroRegistro;
        this.nascimento = nascimento;
        this.pis = pis;
        this.cep = cep;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
        this.municipio = municipio;
        this.foneResidencial = foneResidencial;
        this.foneCelular = foneCelular;
        this.email = email;
        this.admissao = admissao;
        this.demissao = demissao;
        this.apelido = apelido;
        this.salario = salario;
        this.extra = extra;
        this.ativo = ativo;
        this.id_Login = id_Login;
    }

    public Funcionario() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
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

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public String getDemissao() {
        return demissao;
    }

    public void setDemissao(String demissao) {
        this.demissao = demissao;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public int getId_Login() {
        return id_Login;
    }

    public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Funcionario other = (Funcionario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
