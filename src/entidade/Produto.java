package entidade;

public class Produto {
    
    private int id;
    private String descricao;
    private int quantidade;
    private String precoCompra;
    private String precoVenda;

    public Produto() {
    }

    public Produto(int id) {
        this.id = id;
    }

    public Produto(int id, String descricao, int quantidade, String precoCompra, String precoVenda) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
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
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return descricao;
    }
}
