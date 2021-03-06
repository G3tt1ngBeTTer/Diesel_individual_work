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
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author student
 */
public class TableUsers extends javax.swing.JFrame {

    /**
     * Creates new form InsertTableUsers
     */
    public TableUsers() {
        initComponents();
    }   
    
 public ResultSet getResultFromUsers() { 
       String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
       String username="root";
       String password="";   
       ResultSet rs=null;
             try{
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatment=connection.prepareStatement("Select * from users");
            rs=preparedStatment.executeQuery();
             }
        catch(SQLException e){}
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

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LoginField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        RoleBox = new javax.swing.JComboBox<>();
        FIOField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        SendButton = new javax.swing.JButton();
        ComLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        UTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TableUsers");
        setBackground(new java.awt.Color(0, 65, 101));

        jPanel4.setBackground(new java.awt.Color(0, 65, 101));

        jLabel2.setText("Login");

        jLabel3.setText("Password");

        jLabel4.setText("Role");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        RoleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        RoleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleBoxActionPerformed(evt);
            }
        });

        FIOField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIOFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("FIO in English");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FIOField)
                    .addComponent(LoginField)
                    .addComponent(PasswordField)
                    .addComponent(RoleBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FIOField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 65, 101));

        SendButton.setText("Add");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2))
                    .addComponent(ComLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SendButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(0, 65, 101));

        ResultSet rs=getResultFromUsers();
        UTable.setModel(new KTableModelUsers (rs));
        rs=null;
        jScrollPane2.setViewportView(UTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setBounds(350, 150, 574, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        ResultSet rs;
        String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String username="root";
        String password="";
        int loginCheck=0;
        String check1="";
        String Login=LoginField.getText().toString();
        if ((Login.length()<15)&&(Login.length()>6)){
        String Password=PasswordField.getText().toString();
        String Role=RoleBox.getSelectedItem().toString();
        String FIO=FIOField.getText().toString();
        try{
        String checkStr="select login from users";
        Connection connection=DriverManager.getConnection(url,username,password); 
        PreparedStatement preparedStatment=connection.prepareStatement(checkStr);
        rs=preparedStatment.executeQuery();
        while (rs.next()){
        check1=rs.getString("login");
        if (check1.equals(Login)) {
        ComLabel.setText("???????????????????????? ?? ?????????? ?????????????? ?????? ????????????????????");
        loginCheck=1;
        }
        }
        }
        catch (Exception e){
        ComLabel.setText("???????????? ?????????????????????? ?? ??????????????, ???????????????????? ?? ????????????????????????????");   
        }
       if (loginCheck==0){
           if ((Password.length()<15)&&(Password.length()>6)){
        try{
       Connection connection=DriverManager.getConnection(url,username,password); 
       System.out.println("?????? 1 ????????????");
            String insertStrUser="";         
            insertStrUser="insert INTO users (login, password, role, FIO) VALUES(?,?,?,?)";
       System.out.println("?????? 2 ????????????");
       PreparedStatement preparedStatment=connection.prepareStatement(insertStrUser);
       preparedStatment.setString(1,Login);
       System.out.println(Login);
       preparedStatment.setString(2,Password);
       System.out.println(Password);
       preparedStatment.setString(3,Role);
       System.out.println(quotate(Role));   
       preparedStatment.setString(4,FIO);
       System.out.println(FIO);   
       System.out.println("?????? 3 ????????????");
       int done=preparedStatment.executeUpdate();
       System.out.println("?????? 4 ????????????");
       getContentPane().removeAll();
       initComponents();
        }
        catch (Exception e){
       ComLabel.setText("???????????? ?????????????????????? ?? ??????????????, ???????????????????? ?? ????????????????????????????");   
        }
        } else {
        ComLabel.setText("???????????? ???????????? ???????? ???????????? 6 ???????????????? ?? ???????????? 15");   
        }
       }
        } else {
        ComLabel.setText("?????????? ???????????? ???????? ???????????? 6 ???????????????? ?? ???????????? 15");
        }
    }//GEN-LAST:event_SendButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ResultSet rs=null;
       String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
       String username="root";
       String password="";  
        String Login=LoginField.getText();        
        String DeleteStr="";       
        try{ 
            Connection connection=DriverManager.getConnection(url,username,password);
            DeleteStr="Delete from users Where login = ? ";
            PreparedStatement preparedStatment=connection.prepareStatement(DeleteStr);
            preparedStatment.setString(1,Login);
            int del=preparedStatment.executeUpdate();
            ComLabel.setText("1 row Delete");
            getContentPane().removeAll();
            initComponents();
        
        }
        catch(Exception e){
            ComLabel.setText("Error occurred in inserting data");
            e.printStackTrace();
        }     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Login=LoginField.getText();        
        String Password=PasswordField.getText();
        String Role=RoleBox.getSelectedItem().toString();
        String FIO=FIOField.getText().toString();      
        String url="jdbc:mysql://localhost:3306/el_ka_db_pp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String username="root"; 
        String password="";
        try{
            String EditStr="UPDATE users Set password = ?, role = ?, FIO=? Where login = ?";
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatment=connection.prepareStatement(EditStr);
            preparedStatment.setString(1,Password);
            preparedStatment.setString(2,Role);
            preparedStatment.setString(3,FIO);
            preparedStatment.setString(4,Login);
            int del=preparedStatment.executeUpdate();
            ComLabel.setText("1 row update");
            getContentPane().removeAll();
            initComponents();
        
        }
        catch(Exception e){
            ComLabel.setText("Error occurred in inserting data");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RoleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleBoxActionPerformed

    private void FIOFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIOFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIOFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TableUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TableUsers().setVisible(true);
            }
                catch(Exception e){                
                }
            }
        });
    }
    private java.sql.Statement stmt;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComLabel;
    private javax.swing.JTextField FIOField;
    private javax.swing.JTextField LoginField;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JComboBox<String> RoleBox;
    private javax.swing.JButton SendButton;
    private javax.swing.JTable UTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
