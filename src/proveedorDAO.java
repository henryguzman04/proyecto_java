import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class proveedorDAO {
    public static void crear_proveedorDB(proveedor proveedores) {

        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `farmacia_sql`.`proveedor` (`nombre`, `direccion`, `telefono`) VALUES (?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, proveedores.getNombre());
                ps.setString(2, proveedores.getDireccion());
                ps.setInt(3, proveedores.getTelefono());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }


        } catch (SQLException he) {
            System.out.println(he);
        }
    }


    public static void leer_proveedor() {
        Conexion Db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = Db_conexion.get_conConnection()) {
            String query = "SELECT * FROM proveedor";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("-----------------------------------");
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("nombre: " + rs.getString("nombre"));
                System.out.println("direccion: " + rs.getString("direccion"));
                System.out.println("telefono: " + rs.getInt("telefono"));

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public static void borrar_proveedor(int id) {
        Conexion conexion_he = new Conexion();
        try (Connection conexion = conexion_he.get_conConnection()) {
            PreparedStatement ps =null;
            try{
                String query ="DELETE FROM proveedor WHERE id= ?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("el proveedor a sido borrado");
            }catch (SQLException p){
                System.out.println(p);
                System.out.println("el proveedor no se pudo borrar: ");
            }
        } catch (SQLException h) {
            System.out.println(h);
        }


    }

    public static void actualizar_proveedor(proveedor proveedores) {
        Conexion conexion_h = new Conexion();
        try (Connection conexion = conexion_h.get_conConnection()) {
            PreparedStatement pps;
            try{
                String query ="UPDATE proveedor SET nombre= ? ,direccion=?,telefono=? where id=?";
                pps=conexion.prepareStatement(query);
                pps.setString(1, proveedores.getNombre());
                pps.setString(2, proveedores.getDireccion());
                pps.setInt(3,proveedores.getTelefono());
                pps.setInt(4,proveedores.getId());
                pps.executeUpdate();
                System.out.println("los datos se actualizaron correctamente....");

            }catch (SQLException a){
                System.out.println(a);
            }
        }catch (SQLException s){
            System.out.println(s);
        }

    }


}
