package utilitarios;

import entidade.Cliente;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel{
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_CPF = 2;
    private static final int COL_FONE_RESIDENCIAL = 3;
    private static final int COL_FONE_CELULAR = 4;
    private static final int COL_FONE_COMERCIAL = 5;
    private static final int COL_EMAIL = 6;
    private static final int COL_DATA_CADASTRO = 7;
    
    private List<Cliente> valores;

    public ClienteTableModel(List<Cliente> valores) {
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
        Cliente cliente = valores.get(rowIndex);
        if(columnIndex == COL_ID){
            return cliente.getId();
        }else if(columnIndex == COL_NOME){
            return cliente.getNome();
        }else if(columnIndex == COL_CPF){
            return cliente.getCpfcnpj();
        }else if(columnIndex == COL_FONE_RESIDENCIAL){
            return cliente.getFoneResidencial();
        }else if(columnIndex == COL_FONE_CELULAR){
            return cliente.getFoneCelular();
        }else if(columnIndex == COL_FONE_COMERCIAL){
            return cliente.getFoneComercial();
        }else if(columnIndex == COL_EMAIL){
            return cliente.getEmail();
        }else if(columnIndex == COL_DATA_CADASTRO){
            return cliente.getDataCadastro();
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
                coluna = "CPF / CNPJ";
                break;
            case COL_FONE_RESIDENCIAL:
                coluna = "Fone Residencial";
                break;
            case COL_FONE_CELULAR:
                coluna = "Fone Celular";
                break;
            case COL_FONE_COMERCIAL:
                coluna = "Fone Comrecial";
                break;
            case COL_EMAIL:
                coluna = "e-mail";
                break;
            case COL_DATA_CADASTRO:
                coluna = "Data Cadastro";
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
        }else if(columnIndex == COL_FONE_COMERCIAL){
            return String.class;
        }else if(columnIndex == COL_EMAIL){
            return String.class;
        }else if(columnIndex == COL_DATA_CADASTRO){
            return Date.class;
        }
        return null;
    }
    
        public void adicionaCliente(Cliente cliente) {  
            this.valores.add(cliente);
            this.fireTableDataChanged();  
        }  
        
        public void editaCliente(List<Cliente> valores){
            
            this.valores = valores;
            this.fireTableDataChanged();
            
        }
        
    public Cliente get(int row){
        return valores.get(row);
    }
}
