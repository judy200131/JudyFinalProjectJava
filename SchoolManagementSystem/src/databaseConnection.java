
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2ndyrGroupB
 */
//FOR THE DATABASE CONNECTION
public class databaseConnection {
    static Connection connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/judyschool","root","");  
            return con;
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

   

    
}
