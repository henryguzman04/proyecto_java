import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        System.out.println("henry eres Guapo....");
        Conexion conector =new Conexion();
        try{
            conector.get_conConnection();
        }catch (Exception x){
            System.out.println("x");

        }
    }
}
