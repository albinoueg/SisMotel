package utilitarios;

import entidade.Fornecedor;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FornecedorTableModel extends AbstractTableModel{
    
    private static final int COL_ID = 0;
    private static final int COL_DATA_CADASTRO = 1;
    private static final int COL_NOME = 2;
    private static final int COL_CONTATO = 3;
    private static final int COL_CPF = 4;
    private static final int COL_FONE_COMERCIAL = 5;
    private static final int COL_FONE_FAX = 6;
    private static final int COL_FONE_CELULAR = 7;
    private static final int COL_FONE_0800 = 8;
    private static final int COL_EMAIL = 9;
    
    private List<Fornecedor> valores;

    public FornecedorTableModel(List<Fornecedor> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = valores.get(rowIndex);
        if(columnIndex == COL_ID){
            return fornecedor.getId();
        }else if(columnIndex == COL_DATA_CADASTRO){
            return fornecedor.getDataCadastro();
        }else if(columnIndex == COL_NOME){
            return fornecedor.getNome();
        }else if(columnIndex == COL_CONTATO){
            return fornecedor.getContato();
        }else if(columnIndex == COL_CPF){
            return fornecedor.getCpfcnpj();
        }else if(columnIndex == COL_FONE_COMERCIAL){
            return fornecedor.getFoneComercial();
        }else if(columnIndex == COL_FONE_FAX){
            return fornecedor.getFoneFax();
        }else if(columnIndex == COL_FONE_CELULAR){
            return fornecedor.getFoneCelular();
        }else if(columnIndex == COL_FONE_0800){
            return fornecedor.getFone0800();
        }else if(columnIndex == COL_EMAIL){
            return fornecedor.getEmail();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        
        String coluna = "";
        
        switch(column){
            
            case COL_ID:
                coluna = "Cód";
                break;
            case COL_DATA_CADASTRO:
                coluna = "Data Cadastro";
                break;
            case COL_NOME:
                coluna = "Nome";
                break;
            case COL_CONTATO:
                coluna = "CONTATO";
                break;
            case COL_CPF:
                coluna = "CNPJ / CPF";
                break;
            case COL_FONE_COMERCIAL:
                coluna = "Fone Comercial";
                break;
            case COL_FONE_FAX:
                coluna = "Fone Fax";
                break;
            case COL_FONE_CELULAR:
                coluna = "Fone Celular";
                break;
            case COL_FONE_0800:
                coluna = "Fone 0800";
                break;    
            case COL_EMAIL:
                coluna = "e-mail";
                break;
            default:
                throw new IllegalArgumentException("Coluna invalida!");         
        }
        return coluna;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(columnIndex == COL_ID){
            return String.class;
        }else if(columnIndex == COL_DATA_CADASTRO){
            return Date.class;
        }else if(columnIndex == COL_NOME){
            return String.class;
        }else if(columnIndex == COL_CONTATO){
            return String.class;
        }else if(columnIndex == COL_CPF){
            return String.class;
        }else if(columnIndex == COL_FONE_COMERCIAL){
            return String.class;
        }else if(columnIndex == COL_FONE_FAX){
            return String.class;
        }else if(columnIndex == COL_FONE_CELULAR){
            return String.class;
        }else if(columnIndex == COL_FONE_0800){
            return String.class;
        }else if(columnIndex == COL_EMAIL){
            return String.class;
        }
        return null;
    }
    
        public void adicionaFornecedor(Fornecedor fornecedor) {  
            this.valores.add(fornecedor);
            this.fireTableDataChanged();  
        }  
        
        public void editaFornecedor(List<Fornecedor> valores){
            
            this.valores = valores;
            this.fireTableDataChanged();
            
        }
        
    public Fornecedor get(int row){
        return valores.get(row);
    }
}
