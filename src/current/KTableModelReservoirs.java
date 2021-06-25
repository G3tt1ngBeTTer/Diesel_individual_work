package current;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 778902
 */
public class KTableModelReservoirs extends AbstractTableModel {
    
    public static int colnum=8;
    private int rownum;
    public static String[] colNames={
        "Id","Название","Обьем","Подача топлива","Отопление","Утеплитель","Аварийный слив","Количество"
    };
    private  ArrayList<String[]> ResultSets;
    
    /** Creates a new instance of FoodTableModel */
    public KTableModelReservoirs(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
                    String[] row={
                rs.getString("id_reservoirs"), rs.getString("Name"), rs.getString("Volume"), rs.getString("Pump"), rs.getString("Heat"),rs.getString("Heater"),rs.getString("Emergency_drain"), rs.getString("Kolvo")                    
                };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in KTableModelReserovoirs");
            }
        
    }
   
    public Object getValueAt(int rowindex, int columnindex) {
        
       String[] row=ResultSets.get(rowindex);
       return row[columnindex];
        
    }

    public int getRowCount() {
        return ResultSets.size();
    }

    public int getColumnCount() {
        return colnum;
    }

    public String getColumnName(int param) {

       return colNames[param];
    }
    
}
