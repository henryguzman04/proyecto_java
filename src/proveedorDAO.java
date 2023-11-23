import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class proveedorDAO {
    public static void crear_proveedorDB(proveedor proveedores){

        Conexion db_connect =new Conexion();
        try(Connection conexion = db_connect.get_conConnection()){
            PreparedStatement ps =null;
            try {
                String query ="INSERT INTO `farmacia_sql`.`proveedor` (`nombre`, `direccion`, `telefono`) VALUES (?, ?, ?)";
                ps= conexion.prepareStatement(query);
                ps.setString(1, proveedores.getNombre());
                ps.setString(2, proveedores.getDireccion());
                ps.setInt(3,proveedores.getTelefono());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }



        }catch (SQLException he){
            System.out.println(he);
        }



    }
    public static void leer_proveedor(){
    }
    public static void borrar_proveedor(int id){
    }
    public static void actualizar_proveedor(proveedor proveedores){
    }



}
