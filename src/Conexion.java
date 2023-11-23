import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_conConnection(){
        Connection conection =null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/farmacia_sql","root","");
            if(conection!=null){
                System.out.println("conexion exitosa.....");
            }
        }catch (SQLException e){
            System.out.println("error: "+e);
        }


        return conection;
    }
}
