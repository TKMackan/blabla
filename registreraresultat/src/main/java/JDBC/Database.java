package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    
    private Connection conn;
    private Statement statement;
    
    
    public static Connection getConnection(){
        
        Connection conn = null;
        
        if(conn==null){
            
            try {
            String url       = "jdbc:mysql://localhost:3306/sakila?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
            String user      = "root";
            String password  = "Marcusar1997";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            
            System.out.println("du är nu uppkopplad");
         	
            } catch(SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("inte uppkopplad");
          
            }
            
        } return conn;

        
    }
    
}