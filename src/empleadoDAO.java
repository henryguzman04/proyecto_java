import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class empleadoDAO {
    public static void crear_empleadoDB(empleado empl) {

        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `farmacia_sql`.`empleado` (`nombre`,`apellido1`,`apellido2` ,`direccion`, `telefono_empleado`,`salario`) VALUES (?, ?, ?,?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, empl.getNombre());
                ps.setString(2,empl.getApellido1());
                ps.setString(3,empl.getApellido2());
                ps.setString(4,empl.getDireccion());
                ps.setInt(5, empl.getTelefono_empleado());
                ps.setFloat(6,empl.getSalario());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }


        } catch (SQLException he) {
            System.out.println(he);
        }
    }


    public static void leer_empleado() {
        Conexion Db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = Db_conexion.get_conConnection()) {
            String query = "SELECT * FROM empleado";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("-----------------------------------");
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("nombre: " + rs.getString("nombre"));
                System.out.println("apellido1: "+rs.getString("apellido1"));
                System.out.println("apellido2: "+rs.getString("apellido2"));
                System.out.println("direccion: " + rs.getString("direccion"));
                System.out.println("telefono_empleado: " + rs.getInt("telefono_empleado"));
                System.out.println("salario: "+rs.getFloat("salario"));

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public static void borrar_empleado(int id) {
        Conexion conexion_he = new Conexion();
        try (Connection conexion = conexion_he.get_conConnection()) {
            PreparedStatement ps =null;
            try{
                String query ="DELETE FROM empleado WHERE id= ?";
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

    public static void actualizar_empleado(empleado empl) {
        Conexion conexion_h = new Conexion();
        try (Connection conexion = conexion_h.get_conConnection()) {
            PreparedStatement pps;
            try{
                String query ="UPDATE empleado SET nombre= ? ,apellido1=?,apellido2=?,direccion=?,telefono_empleado=? ,salario=? where id=?";
                pps=conexion.prepareStatement(query);
                pps.setString(1, empl.getNombre());
                pps.setString(2,empl.getApellido1());
                pps.setString(3,empl.getApellido2());
                pps.setString(4,empl.getDireccion());
                pps.setInt(5,empl.getTelefono_empleado());
                pps.setFloat(6,empl.getSalario());
                pps.setInt(7,empl.getId());
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
