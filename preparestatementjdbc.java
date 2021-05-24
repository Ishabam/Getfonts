
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preparestatement {
    public static void main(String[] args){
    try{
    
        //load the driver
     Class.forName("com.mysql.cj.jdbc.Driver");

     //create a connection
    String url = "jdbc:mysql://localhost:3306/you";
    String username="root";
    String password="Ib@09102001";
    Connection con = DriverManager.getConnection(url, username, password);
    
    //creating query
    
    String q = "insert into table1(tName,tCity) values(?,?)";
    
    PreparedStatement pstmt = con.prepareStatement(q);
    
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Name:");
    String name = br.readLine();
    
    System.out.println("Enter City: ");
    String city = br.readLine();
    
    //seting values
    
   // pstmt.setString(1,"Isha Bam");
    //pstmt.setString(1,"Indore");
    pstmt.setString(1,name);
    pstmt.setString(2,city);
    
    pstmt.executeUpdate();
    
    System.out.println("Inserted!");
    
    con.close();
    }catch(Exception e){
    e.printStackTrace();
    }
    }
}
