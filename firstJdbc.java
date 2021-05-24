import java.sql.Connection;
import java.sql.DriverManager;

public class first {
public static void main(String[] args) {
   try{
     //load the driver
     Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/you";
    String username="root";
    String password="Ib@09102001";
    Connection con = DriverManager.getConnection(url, username, password);

    if(con.isClosed()){
      System.out.println("Still closed");
    }
     else{
       System.out.println("Created");
     }
   } catch(Exception e){
     e.printStackTrace();
   }
  }    
}