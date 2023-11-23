import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class almacenDAO {

     public static void crear_almacenDB(almacen alm) {

         Conexion DB_conect =new Conexion();
         try (Connection conexion = DB_conect.get_conConnection()) {
             PreparedStatement ps = null;
             try {
                 String query = "INSERT INTO `farmacia_sql`.`almacen` (`nombre`, `direccion`) VALUES (?, ?)";
                 ps = conexion.prepareStatement(query);
                 ps.setString(1, alm.getNombre());
                 ps.setString(2, alm.getDireccion());
                 ps.executeUpdate();
             } catch (SQLException ex) {
                 System.out.println(ex);
             }


         } catch (SQLException he) {
             System.out.println(he);
         }




    }


    public static void leer_almacen() {
        Conexion DB_conexion = new Conexion();
        PreparedStatement pst = null;
        ResultSet rst = null;
        try (Connection conexion = DB_conexion.get_conConnection()) {
            String query = "SELECT * FROM almacen";
            pst = conexion.prepareStatement(query);
            rst = pst.executeQuery();
            while (rst.next()) {
                System.out.println("-----------------------------------");
                System.out.println("id: " + rst.getInt("id"));
                System.out.println("nombre: " + rst.getString("nombre"));
                System.out.println("direccion: " + rst.getString("direccion"));

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public static void borrar_almacen(int id) {
        Conexion conexion_he = new Conexion();
        try (Connection conexion = conexion_he.get_conConnection()) {
            PreparedStatement ps =null;
            try{
                String query ="DELETE FROM almacen WHERE id= ?";
                ps= conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("el almacen a sido borrado");
            }catch (SQLException p){
                System.out.println(p);
                System.out.println("el proveedor no se pudo borrar: ");
            }
        } catch (SQLException h) {
            System.out.println(h);
        }


    }

    public static void actualizar_almacen(almacen alm) {
        Conexion conexion_he = new Conexion();
        try (Connection conexion = conexion_he.get_conConnection()) {
            PreparedStatement pps;
            try{
                String query ="UPDATE almacen SET nombre= ? ,direccion=? where id=?";
                pps=conexion.prepareStatement(query);
                pps.setString(1, alm.getNombre());
                pps.setString(2, alm.getDireccion());
                pps.setInt(3,alm.getId());
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
