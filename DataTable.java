import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataTable extends JPanel{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    String[] columns = {"Station", "Parameter", "Statistics", "Value", "Reporting Stations", "Date"}; 
    
    String [][] data; 
    
    DefaultTableModel Deftable = new DefaultTableModel(data, columns); 

    JTable table = new JTable(Deftable); 
    
    JScrollPane scroll = new JScrollPane(table); 
    
    int numRows = 0; 
    
    public DataTable()
    {
        super(); 
        
        table.setPreferredScrollableViewportSize(new Dimension(800,600));
        
        this.add(scroll); 
    }
    
    
    
}
