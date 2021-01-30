
package HomePage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Register = new java.awt.Label();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        pw = new javax.swing.JPasswordField();
        cpw = new javax.swing.JPasswordField();
        label6 = new java.awt.Label();
        age = new java.awt.TextField();
        lval = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Register.setBackground(new java.awt.Color(0, 0, 102));
        Register.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("       Register");

        label1.setBackground(new java.awt.Color(0, 0, 255));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("       First Name");

        label2.setBackground(new java.awt.Color(0, 0, 255));
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("       Last Name");

        label3.setBackground(new java.awt.Color(0, 0, 255));
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("          E-Mail");

        label4.setBackground(new java.awt.Color(0, 0, 255));
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("        Password");

        jButton1.setText("Continue Login Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        label5.setBackground(new java.awt.Color(0, 0, 255));
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("      Confirm Password");

        label6.setBackground(new java.awt.Color(0, 0, 255));
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("                   Age");

        lval.setBackground(new java.awt.Color(255, 255, 255));
        lval.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(lname)
                                    .addComponent(fname)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lval, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lname, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pw, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lval, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        label5.getAccessibleContext().setAccessibleName("     Confirm Password");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        page1 fourth = new page1() ;
        fourth.setVisible(true) ;
        dispose() ;
    }//GEN-LAST:event_jButton1ActionPerformed

    public int m1(int found)
    {
       if(fname.getText().trim().equals("") || lname.getText().trim().equals("") 
           || pw.getText().trim().equals("") || cpw.getText().trim().equals("")
                 || email.getText().trim().equals("") )
        {
            JOptionPane.showConfirmDialog(this, "One Or More Fields Are Empty","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            found = 1 ;
            return found ;
        }
        
        // check if the two password are equals or not
        else if(!pw.equals(cpw))
        {
                       JOptionPane.showConfirmDialog(this, "Not Same","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
                      return found ;
        } 
       else
        {
            return found ;
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        if(fname.getText().trim().equals("") || lname.getText().trim().equals("") 
           || pw.getText().trim().equals("") || cpw.getText().trim().equals("")
                 || email.getText().trim().equals("") )
        {
           lval.setText("Field(s) are empty !!");
            
        }
        else if(!pw.getText().trim().equals(cpw.getText().trim()))
        {
            lval.setText("Please enter the same password !!");
        } 
        else
        {
             
       

        try{
         String m = fname.getText().trim() ;
         String n = lname.getText().trim() ;
         String x = age.getText().trim() ;
         String q = pw.getText().trim() ;
         String r = email.getText().trim() ;
         int ab =  Integer.valueOf(q) ;
         int cd =  Integer.valueOf(x) ;
         
         
        
         
         String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=mini";
         Connection con = DriverManager.getConnection(connectionUrl);
         
         Statement st = con.createStatement();
         Statement st2 = con.createStatement();
          st2.execute("select max(C_ID) from Customer ") ;
         
         Statement stmt = con.createStatement();
          String s2 = "" ;
            String SQL = "select max(C_ID) as maxID from Customer";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                s2 = rs.getString("maxID");
                
            }
       int idmaximum =  Integer.valueOf(s2) ;
       idmaximum+=1 ;
        // Handle any errors that may have occurred.
        System.out.println(idmaximum) ;
        
         
         
         
        st.execute("insert into Customer values("+idmaximum+","+ab+",'"+m+"','"+n+"',"+cd+",'"+r+"')") ;
         JOptionPane.showMessageDialog(this , "Record Inserted") ;
        }
        catch(Exception e){
           System.out.println("adkfb") ;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

  /*  public boolean verifyFields()
    {
        String fname = a.getText();
        String uname = b.getText();
       
        String pass1 = String.valueOf(d.getPassword());
        String pass2 = String.valueOf(e.getPassword());
        
        // check empty fields
        if(fname.trim().equals("") || uname.trim().equals("") 
           || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showConfirmDialog(this, "One Or More Fields Are Empty","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            return false;
        }
        
        // check if the two password are equals or not
        else if(!pass1.equals(pass2))
        {
                       JOptionPane.showConfirmDialog(this, "Not Same","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
           return false;
        }
        
        // if everything is ok
        else{
            return true;
        }
    }
    
    */
    }
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Register;
    private java.awt.TextField age;
    private javax.swing.JPasswordField cpw;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel lval;
    private javax.swing.JPasswordField pw;
    // End of variables declaration//GEN-END:variables
}
