/*
 * CarTableModel.java
 *
 * Created on 2005/01/17, 15:31
 */

package current;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author wfenics
 */
public class KTableModelUsers extends AbstractTableModel {
    
    private int colnum=5;
    private int rownum;
    private String[] colNames={
        "ID","Login","Password","Role","FIO",
    };
    private  ArrayList<String[]> ResultSets;
    
    /** Creates a new instance of FoodTableModel */
    public KTableModelUsers(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
                    String[] row={
                rs.getString("id_users"),rs.getString("login"), rs.getString("password"), rs.getString("role"), rs.getString("FIO")                   
                };
                    System.out.println(row);
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in KTableModel");
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
