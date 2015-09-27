package utilitarios;

import entidade.Relatorio;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class RelatorioTableModel extends AbstractTableModel{
    
    private static final int COL_QUARTO = 0;
    private static final int COL_TEMPO_ESTADIA = 1;
    private static final int COL_VALOR_TOTAL = 2;
    private static final int COL_DATA = 3;
    
    private List<Relatorio> valores;

    public RelatorioTableModel(List<Relatorio> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Relatorio relatorio = valores.get(rowIndex);
        if(columnIndex == COL_QUARTO){
            return relatorio.getQuarto();
        }else if(columnIndex == COL_TEMPO_ESTADIA){
            return relatorio.getTempoEstadia();
        }else if(columnIndex == COL_VALOR_TOTAL){
            return relatorio.getValorTotal();
        }else if(columnIndex == COL_DATA){
            return relatorio.getData();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        
        String coluna = "";
        
        switch(column){
            
            case COL_QUARTO:
                coluna = "Quarto";
                break;
            case COL_TEMPO_ESTADIA:
                coluna = "Tempo de Estadia";
                break;
            case COL_VALOR_TOTAL:
                coluna = "Valor Total";
                break;
            case COL_DATA:
                coluna = "Data";
                break;
            default:
                throw new IllegalArgumentException("Coluna invalida!");         
        }
        return coluna;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(columnIndex == COL_QUARTO){
            return String.class;
        }else if(columnIndex == COL_TEMPO_ESTADIA){
            return String.class;
        }else if(columnIndex == COL_VALOR_TOTAL){
            return String.class;
        }else if(columnIndex == COL_DATA){
            return Date.class;
        }
        return null;
    }
    
        public void adicionaRelatorio(Relatorio relatorio) {  
            this.valores.add(relatorio);
            this.fireTableDataChanged();  
        }  
        
        public void editaRelatorio(List<Relatorio> valores){
            
            this.valores = valores;
            this.fireTableDataChanged();
            
        }
        
    public Relatorio get(int row){
        return valores.get(row);
    }
}
