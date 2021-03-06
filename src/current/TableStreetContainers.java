/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package current;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import current.KTableModelUsers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
/*
 *
 * @author White Fenics
 */
public class TableStreetContainers extends javax.swing.JFrame {

    /**
     * Creates new form TableCustomer
     */
    public TableStreetContainers() throws Exception {
        initComponents();
    }
        //Функция формирования данных в таблицу
        public ResultSet getResultFromCustomer() {
        //Переменная для заполнения данных из таблицы
        ResultSet rs=null;
        //Выполения подключения и запроса, с последующей записью данных в переменную    
        String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String username="root";
        String password="";  
        try{
 
             Connection connection=DriverManager.getConnection(url,username,password);
             PreparedStatement preparedStatment=connection.prepareStatement("SELECT * FROM `containers_street`");
             rs=preparedStatment.executeQuery();
        }catch(SQLException e){
            ComLabel.setText("Ошибка запроса данных от сервера");
        }
        //Возвращаем данные из перменной для записи в таблицы 
        return rs;

    }
     public String quotate(String content){

        return "'"+content+"'";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        FIOField = new javax.swing.JTextField();
        ComLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        KolvoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
        ImportButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TableContainers");

        jPanel1.setBackground(new java.awt.Color(0, 65, 101));

        jLabel1.setText("ID");

        jLabel2.setText("Объем");

        jLabel3.setText("Тип");

        FIOField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIOFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("м3");

        jCheckBox1.setText("Капот");

        jCheckBox2.setText("Кожух");

        jLabel5.setText("Id, используется для изменения или добавления");

        jLabel6.setText("Количество");

        KolvoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolvoFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Название");

        jCheckBox3.setText("Евро-кожух");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NameField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5)))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(FIOField, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4)
                                    .addGap(330, 330, 330)))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(KolvoField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComLabel))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(FIOField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(KolvoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 65, 101));

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ExportButton.setText("Export");
        ExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportButtonActionPerformed(evt);
            }
        });

        ImportButton.setText("Import");
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImportButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(EditButton)
                    .addComponent(DeleteButton)
                    .addComponent(ExportButton)
                    .addComponent(ImportButton)))
        );

        ResultSet rs=getResultFromCustomer();
        CTable.setModel(new current.KTableModelStreetContainers(rs));
        rs=null;
        jScrollPane1.setViewportView(CTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(450, 180, 516, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        //Выполени подключения    
        String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String username="root";
        String password="";  
        try{
        Connection connection=DriverManager.getConnection(url,username,password);  
        String Name=NameField.getText();
        String ID=IDField.getText();
        String Volume=FIOField.getText();
        Boolean TypeCheck1=jCheckBox1.isSelected();
        Boolean TypeCheck2=jCheckBox2.isSelected();
        Boolean TypeCheck3=jCheckBox3.isSelected();
        int Kolvo=Integer.parseInt(KolvoField.getText());
        int i=0;

        
        if (((TypeCheck1==true)&&(TypeCheck2==true)&&(TypeCheck3==true))||((TypeCheck1==false)&&(TypeCheck2==true)&&(TypeCheck3==true))||((TypeCheck1==true)&&(TypeCheck2==false)&&(TypeCheck3==true))||((TypeCheck1==true)&&(TypeCheck2==true)&&(TypeCheck3==false))){
        ComLabel.setText("Вы можете выбрать только один из трёх типов");
        i=1;
        }
        if ((TypeCheck1==false)&&(TypeCheck2==false)&&(TypeCheck3==false)){
        ComLabel.setText("Выберите один из трёх типов контейнера");
        i=1;
        }
       if (i==0){
       try{
            PreparedStatement preparedStatment=connection.prepareStatement("INSERT INTO `el_ka_db_pp`.`containers_street` (`Name`,`Volume`, `type_kapot`, `type_koshyx`,`type_evro_koshyx`,`Kolvo`) VALUES (?,?,?,?,?,?)");
//            preparedStatment.setString(1,ID);
//            System.out.println(ID);
            preparedStatment.setString(1,Name);
            System.out.println(Name);
            preparedStatment.setString(2,Volume);
            System.out.println(Volume);
            preparedStatment.setBoolean(3,TypeCheck1);
            System.out.println(TypeCheck1);
            preparedStatment.setBoolean(4,TypeCheck2);
            System.out.println(TypeCheck2);
            preparedStatment.setBoolean(5,TypeCheck3);
            System.out.println(TypeCheck3);
            preparedStatment.setInt(6,Kolvo);
            System.out.println(Kolvo);
            int done=preparedStatment.executeUpdate();
            getContentPane().removeAll();
            initComponents();
         }
        catch(Exception e){
            System.out.println(e);
            ComLabel.setText("Ошибка добавления, проверьте правильность введенных данных");
        }
       }
        }catch(SQLException e){
            ComLabel.setText("Ошибка подключения к серверу");
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        //Выполени подключения    
        String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String username="root";
        String password="";  
        try{
        Connection connection=DriverManager.getConnection(url,username,password);  
        String Name=NameField.getText();
        String ID=IDField.getText();
        String Volume=FIOField.getText();
        Boolean TypeCheck1=jCheckBox1.isSelected();
        Boolean TypeCheck2=jCheckBox2.isSelected();
        Boolean TypeCheck3=jCheckBox3.isSelected();
        int Kolvo=Integer.parseInt(KolvoField.getText());
        int i=0;
      if (((TypeCheck1==true)&&(TypeCheck2==true)&&(TypeCheck3==true))||((TypeCheck1==false)&&(TypeCheck2==true)&&(TypeCheck3==true))||((TypeCheck1==true)&&(TypeCheck2==false)&&(TypeCheck3==true))||((TypeCheck1==true)&&(TypeCheck2==true)&&(TypeCheck3==false))){
        ComLabel.setText("Вы можете выбрать только один из трёх типов");
        i=1;
        }
        if ((TypeCheck1==false)&&(TypeCheck2==false)&&(TypeCheck3==false)){
        ComLabel.setText("Выберите один из трёх типов контейнера");
        i=1;
        }
       if (i==0){
       try{
            PreparedStatement preparedStatment=connection.prepareStatement("UPDATE `el_ka_db_pp`.`containers_street` SET `Name` = ?, `Volume` = ?, `type_kapot` = ?, `type_koshyx` = ?,`type_evro_koshyx` = ?, `Kolvo` = ? WHERE `id_containers_street` = ?");
            preparedStatment.setString(1,Name);
            System.out.println(Name);
            preparedStatment.setString(2,Volume);
            System.out.println(Volume);
            preparedStatment.setBoolean(3,TypeCheck1);
            System.out.println(TypeCheck1);
            preparedStatment.setBoolean(4,TypeCheck2);
            System.out.println(TypeCheck2);
            preparedStatment.setBoolean(5,TypeCheck3);
            System.out.println(TypeCheck3);
            preparedStatment.setInt(6,Kolvo);
            System.out.println(Kolvo);
            preparedStatment.setString(7,ID);
            System.out.println(ID);
            int done=preparedStatment.executeUpdate();
            getContentPane().removeAll();
            initComponents();
         }
        catch(Exception e){
            System.out.println(e);
            ComLabel.setText("Ошибка изменения, проверьте правильность введенных данных");
        }
       }
        }catch(SQLException e){
            ComLabel.setText("Ошибка подключения к серверу");
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String username="root";
        String password="";
        String ID=IDField.getText();
        try{
        Connection connection=DriverManager.getConnection(url,username,password);
         try{
            PreparedStatement preparedStatment=connection.prepareStatement("DELETE FROM `el_ka_db_pp`.`containers_street` WHERE `id_containers_street` = ?");
            preparedStatment.setString(1,ID);
            System.out.println(ID);
            int done=preparedStatment.executeUpdate();
            getContentPane().removeAll();
            initComponents();
         }catch(Exception e){
            System.out.println(e);
            ComLabel.setText("Ошибка удаления, проверьте правильность введенных данных");
        }
         }catch(SQLException e){
            ComLabel.setText("Ошибка подключения к серверу");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void FIOFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIOFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIOFieldActionPerformed

    private void KolvoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolvoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KolvoFieldActionPerformed

    private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
        JFileChooser filesave = new JFileChooser();
        filesave.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        filesave.setAcceptAllFileFilterUsed(false);
        int ret = filesave.showDialog(null, "Сохранить файл");
        String path = filesave.getSelectedFile().getPath();
        System.out.println(path);
        Calendar calendar = Calendar.getInstance();
        int Day = calendar.get(Calendar.DAY_OF_MONTH);
        int Month = calendar.get(Calendar.MONTH)+1;
        int Year = calendar.get(Calendar.YEAR);
        String DATA = " "+String.valueOf(Day)+'-'+String.valueOf(Month)+'-'+String.valueOf(Year);
        File file = new File(path+"/StreetContainers"+DATA+".csv");
        PrintWriter w = null;
        String write="";
        try{
            w = new PrintWriter(file, "CP1251");
            //Zagolovki
            for (int i=0;i<6;i++){
                write=write+current.KTableModelStreetContainers.colNames[i]+";";
            }
            w.println(write);
            write="";
            System.out.println("Ввожу заголовки");
            System.out.println(write+"ZZZZZ");
            for (int j=0;j<CTable.getRowCount();j++){
                for (int i=0;i<current.KTableModelStreetContainers.colnum;i++){
                    write = write + CTable.getValueAt(j, i).toString()+";";
                }
                System.out.println(write+"ZZZZZ"+j);
                w.println(write);
                write="";
                System.out.println("Ввожу данные"+j);
            }
            w.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_ExportButtonActionPerformed

    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButtonActionPerformed
        try {
            Boolean TypeCheck1=false;
            Boolean TypeCheck2=false;
            Boolean TypeCheck3=false;
            String line="";
            JFileChooser fileload = new JFileChooser();
            FileFilter filter = new FileNameExtensionFilter("CSV","CSV");
            fileload.addChoosableFileFilter(filter);
            fileload.setFileFilter(filter);
            int ret = fileload.showDialog(null, "Выбрать Файл");
            String path = fileload.getSelectedFile().getPath();
            File file = new File(path);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            reader.readLine();
            line=reader.readLine();
            while (line != null) {
                String[] data = line.split(";");
                String Name=data[1];
                String Volume=data[2];
                if (data[3].equals("1")){
                    TypeCheck1=true;
                    TypeCheck2=false;
                    TypeCheck3=false;
                }
                if (data[4].equals("1")){
                    TypeCheck1=false;
                    TypeCheck2=true;
                    TypeCheck3=false;
                }
                if (data[5].equals("1")){
                    TypeCheck1=false;
                    TypeCheck2=false;
                    TypeCheck3=true;
                }
                int Kolvo=Integer.parseInt(data[6]);
                // считываем остальные строки в цикле
                line = reader.readLine();

                String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
                String username="root";
                String password="";
                try {
                    Connection connection=DriverManager.getConnection(url,username,password);
                    //       String query1="INSERT INTO `el_ka_db_pp`.`container` (`Name`,`Volume`, `type_Sever`, `type_Kapot`,`Kolvo`) VALUES OF (?,?,?,?,?)";
                    PreparedStatement preparedStatment=connection.prepareStatement("INSERT INTO `el_ka_db_pp`.`containers_street` (`Name`,`Volume`, `type_kapot`, `type_koshyx`,`type_evro_koshyx`,`Kolvo`) VALUES (?,?,?,?,?,?)");
                    preparedStatment.setString(1,Name);
                    System.out.println(Name);
                    preparedStatment.setString(2,Volume);
                    System.out.println(Volume);
                    preparedStatment.setBoolean(3,TypeCheck1);
                    System.out.println(TypeCheck1);
                    preparedStatment.setBoolean(4,TypeCheck2);
                    System.out.println(TypeCheck2);
                    preparedStatment.setBoolean(5,TypeCheck3);
                    System.out.println(TypeCheck3);
                    preparedStatment.setInt(6,Kolvo);
                    System.out.println(Kolvo);
                    int rows = preparedStatment.executeUpdate();
                    getContentPane().removeAll();
                    initComponents();
                }
                catch(Exception e)
                {e.printStackTrace();}

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_ImportButtonActionPerformed

//Завершаем функцию
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableStreetContainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableStreetContainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableStreetContainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableStreetContainers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new TableStreetContainers().setVisible(true);
            }
                catch(Exception e){}
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTable CTable;
    private javax.swing.JLabel ComLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton ExportButton;
    private javax.swing.JTextField FIOField;
    private javax.swing.JTextField IDField;
    private javax.swing.JButton ImportButton;
    private javax.swing.JTextField KolvoField;
    private javax.swing.JTextField NameField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
