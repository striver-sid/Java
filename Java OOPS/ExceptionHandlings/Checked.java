package ExceptionHandlings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Checked {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom", "root","Siddu@cit012*");
        }
        catch(SQLException e){//If i dont write this catch block it gives me the checked exception that it is not handled
            System.out.println("error  : " + e.getMessage());

        }
        finally{
            System.out.println("End");
        }
    }
}
