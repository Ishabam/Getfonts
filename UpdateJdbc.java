
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class UpdateJdbc {
    public static void main(String[] args) {
        try {
    //load the driver
    Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/you";
    String username="root";
    String password="Ib@09102001";
    Connection con = DriverManager.getConnection(url, username, password);
   
    String q = "update table1 set tName=?, tCity=? where tId=?";
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Enter new name: ");
            String name =br.readLine();
            System.out.println("Enter new city: ");
            String city =br.readLine();
            
            System.out.println("Enter student id: ");
            int id= Integer.parseInt(br.readLine());
            
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            
            pstmt.executeUpdate();
            
            System.out.println("Done");
            
            con.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }
        
}
