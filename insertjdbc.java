
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class inser {
 public static void main(String[] args){
 try{
    Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/you";
    String username="root";
    String password="Ib@09102001";
    Connection con = DriverManager.getConnection(url, username, password);
    
    
    //create a query
    
    String q = "create table table3(tId int(20) primary key auto_increment, tName varchar(20) not null, tCity varchar(400))";
    
    //create a statement

    Statement s =con.createStatement();
    
   int I = s.executeUpdate(q);
   System.out.println(I);
    
    System.out.println("table created");
    
    con.close();
    
    
    
 }catch(Exception e){
 e.printStackTrace();
 }
 }    
}
