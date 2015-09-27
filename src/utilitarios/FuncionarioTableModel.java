package utilitarios;

import entidade.Funcionario;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTableModel extends AbstractTableModel{
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_CPF = 2;
    private static final int COL_FONE_RESIDENCIAL = 3;
    private static final int COL_FONE_CELULAR = 4;
    private static final int COL_APELIDO = 5;
    private static final int COL_EMAIL = 6;
    private static final int COL_DATA_NASCIMENTO = 7;
    
    private List<Funcionario> valores;

    public FuncionarioTableModel(List<Funcionario> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario funcionario = valores.get(rowIndex);
        if(columnIndex == COL_ID){
            return funcionario.getId();
        }else if(columnIndex == COL_NOME){
            return funcionario.getNome();
        }else if(columnIndex == COL_CPF){
            return funcionario.getCpf();
        }else if(columnIndex == COL_FONE_RESIDENCIAL){
            return funcionario.getFoneResidencial();
        }else if(columnIndex == COL_FONE_CELULAR){
            return funcionario.getFoneCelular();
        }else if(columnIndex == COL_APELIDO){
            return funcionario.getApelido();
        }else if(columnIndex == COL_EMAIL){
            return funcionario.getEmail();
        }else if(columnIndex == COL_DATA_NASCIMENTO){
            return funcionario.getNascimento();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        
        String coluna = "";
        
        switch(column){
            
            case COL_ID:
                coluna = "Código";
                break;
            case COL_NOME:
                coluna = "Nome";
                break;
            case COL_CPF:
                coluna = "CPF";
                break;
            case COL_FONE_RESIDENCIAL:
                coluna = "Fone Residencial";
                break;
            case COL_FONE_CELULAR:
                coluna = "Fone Celular";
                break;
            case COL_APELIDO:
                coluna = "Apelido";
                break;
            case COL_EMAIL:
                coluna = "e-mail";
                break;
            case COL_DATA_NASCIMENTO:
                coluna = "Aniversario";
                break;
            default:
                throw new IllegalArgumentException("Coluna invalida!");         
        }
        return coluna;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(columnIndex == COL_ID){
            return int.class;
        }else if(columnIndex == COL_NOME){
            return String.class;
        }else if(columnIndex == COL_CPF){
            return String.class;
        }else if(columnIndex == COL_FONE_RESIDENCIAL){
            return String.class;
        }else if(columnIndex == COL_FONE_CELULAR){
            return String.class;
        }else if(columnIndex == COL_APELIDO){
            return String.class;
        }else if(columnIndex == COL_EMAIL){
            return String.class;
        }else if(columnIndex == COL_DATA_NASCIMENTO){
            return String.class;
        }
        return null;
    }
    
        public void adicionaFuncionario(Funcionario funcionario) {  
            this.valores.add(funcionario);
            this.fireTableDataChanged();  
        }  
        
        public void editaFuncionario(List<Funcionario> valores){
            
            this.valores = valores;
            this.fireTableDataChanged();
            
        }
        
    public Funcionario get(int row){
        return valores.get(row);
    }
}
