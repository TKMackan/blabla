/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.util.List;
import javax.ws.rs.core.Response;





import entities.StudentitsDAO;
public class Connectortest {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Database db = new Database();
        db.getConnection();
        
        StudentitsDAO student = new StudentitsDAO();
        student.getStudents();
        
       // List<ActorsDTO> actor = new ActorsDAO().getActors();
      
    
       
        
    }
    
}