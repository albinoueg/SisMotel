package utilitarios;

import entidade.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel{
    
    private static final int COL_ID = 0;
    private static final int COL_DESCRICAO = 1;
    private static final int COL_QUANTIDADE = 2;
    private static final int COL_PRECO_COMPRA = 3;
    private static final int COL_PRECO_VENDA = 4;
    
    private List<Produto> valores;

    public ProdutoTableModel(List<Produto> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = valores.get(rowIndex);
        if(columnIndex == COL_ID){
            return produto.getId();
        }else if(columnIndex == COL_DESCRICAO){
            return produto.getDescricao();
        }else if(columnIndex == COL_QUANTIDADE){
            return produto.getQuantidade();
        }else if(columnIndex == COL_PRECO_COMPRA){
            return produto.getPrecoCompra();
        }else if(columnIndex == COL_PRECO_VENDA){
            return produto.getPrecoVenda();
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
            case COL_DESCRICAO:
                coluna = "Descrição";
                break;
            case COL_QUANTIDADE:
                coluna = "Quantidade";
                break;
            case COL_PRECO_COMPRA:
                coluna = "Preço Compra";
                break;
            case COL_PRECO_VENDA:
                coluna = "Preço Venda";
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
        }else if(columnIndex == COL_DESCRICAO){
            return String.class;
        }else if(columnIndex == COL_QUANTIDADE){
            return Integer.class;
        }else if(columnIndex == COL_PRECO_COMPRA){
            return String.class;
        }else if(columnIndex == COL_PRECO_VENDA){
            return String.class;
        }
        return null;
    }
    
        public void adicionaProduto(Produto produto) {  
            this.valores.add(produto);
            this.fireTableDataChanged();  
        }  
        
        public void editaProduto(List<Produto> valores){
            
            this.valores = valores;
            this.fireTableDataChanged();
            
        }
        
    public Produto get(int row){
        return valores.get(row);
    }
}
