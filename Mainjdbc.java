
package com.jdbc.practice;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        try {
                //load the driver
     Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/you";
    String username="root";
    String password="Ib@09102001";
    Connection con = DriverManager.getConnection(url, username, password);

            
            String q = "insert into image(pic) value(?)";
            
          PreparedStatement pstmt =  con.prepareStatement(q);
           JFileChooser jfc = new JFileChooser();
           jfc.showOpenDialog(null);
           File file=jfc.getSelectedFile();
           FileInputStream fis = new FileInputStream(file);
          pstmt.setBinaryStream(1, fis, fis.available());
          pstmt.executeUpdate();
            //System.out.println("Done");
            
            JOptionPane.showMessageDialog(null, "success");
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
