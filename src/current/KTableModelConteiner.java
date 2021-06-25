package current;
import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;
public class KTableModelConteiner extends AbstractTableModel {  
    public static int colnum=6;
    private int rownum;
    public static String[] colNames={
        "Id","Наименование","Обьем","Тип Север","Тип капот","Количество"
    };
    private  ArrayList<String[]> ResultSets;
    public KTableModelConteiner(ResultSet rs) {
      ResultSets=new ArrayList<String[]>();  
      try{
        while(rs.next()){
                    String[] row={
                rs.getString("id_container"), rs.getString("Name"), rs.getString("Volume"), rs.getString("type_Sever"), rs.getString("type_Kapot"), rs.getString("Kolvo")                    
                };
            ResultSets.add(row);
         }   
      }
      catch(Exception e){
          System.out.println("Exception in KTableModelConteiner");
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
