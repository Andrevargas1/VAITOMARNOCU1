import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class MyTableModel extends AbstractTableModel {
    private String [] col={"Empresa", "Usuário", "Problema", "Solução", "Produto", "Contato"};
    private DefaultTableModel tableModel = new DefaultTableModel(col, 6);
    private Object[][] data;
    public MyTableModel(ArrayList<CustomerProblem> customerProblems){

        this.data = new Object[][]{};

    }
    public void addData(CustomerProblem customerProblem){
        tableModel.addRow(customerProblem);
    }
    @Override
    public int getRowCount() {
        return this.data.length;
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public String getColumnName(int col){
        return this.col[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex){
        return tableModel.getValueAt(rowIndex, colIndex);
    }

    public boolean isCellEditable(int row, int col){
        return true;
    }

    public void setValueAt(Object value, int row, int col) {
        tableModel.setValueAt(value, row, col);
        fireTableCellUpdated(row, col);
    }
}

