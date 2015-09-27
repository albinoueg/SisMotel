package entidade;

public class Login {
    private int id;
    private String usuario;
    private String senha;
    private int idFuncionario;

    public Login() {
    }

    public Login(int id) {
        this.id = id;
    }

    public Login(int id, String usuario, String senha, int idFuncionario) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.idFuncionario = idFuncionario;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
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
        final Login other = (Login) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
