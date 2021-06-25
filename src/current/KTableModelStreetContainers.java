package current;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 778902
 */
public class KTableModelStreetContainers extends AbstractTableModel {
    
    public static int colnum=7;
    private int rownum;
    public static String[] colNames={
        "Id","Название","Обьем","Тип Капот","Тип Кожух","Тип Евро-кожух","Количество"
    };
    private  ArrayList<String[]> ResultSets;
    
    /** Creates a new instance of FoodTableModel */
    public KTableModelStreetContainers(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
                    String[] row={
                rs.getString("id_containers_street"), rs.getString("Name"), rs.getString("Volume"), rs.getString("type_kapot"), rs.getString("type_koshyx"),rs.getString("type_evro_koshyx"), rs.getString("Kolvo")                    
                };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in KTableModelStreetConteiners");
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
