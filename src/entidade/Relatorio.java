package entidade;

import java.util.Date;

public class Relatorio {
    
    private int id;
    private String valorTotal;
    private Date data;
    private String tempoEstadia;
    private String quarto;

    public Relatorio() {
    }

    public Relatorio(int id) {
        this.id = id;
    }

    public Relatorio(int id, String valorTotal, Date data, String tempoEstadia, String quarto) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.data = data;
        this.tempoEstadia = tempoEstadia;
        this.quarto = quarto;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTempoEstadia() {
        return tempoEstadia;
    }

    public void setTempoEstadia(String tempoEstadia) {
        this.tempoEstadia = tempoEstadia;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final Relatorio other = (Relatorio) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
