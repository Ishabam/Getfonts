
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class image {
  public  static void main(String args[]){
  try{
       //load the driver
     Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/you";
    String username="root";
    String password="Ib@09102001";
    Connection con = DriverManager.getConnection(url, username, password);

    String q = "insert into images(pic) values(?)";
    
    PreparedStatement pstmt = con.prepareStatement(q);
    //pstmt.setString(0, q);
    FileInputStream fis = new FileInputStream("C://Users//dell//Desktop/ishu.jpg");
    pstmt.setBinaryStream(1, fis, fis.available());
    
    pstmt.executeUpdate();
    
    System.out.println("Done!");
    
    
  }catch(Exception e){
    System.out.println("Error!!!!!");
  }
  }  
}
