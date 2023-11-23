import java.util.Scanner;

public class proveedorService {
    public static void crear_proveedor(){
        Scanner he = new Scanner(System.in);
        System.out.println("ingrese el nombre del proveedor: ");
        String nombre = he.nextLine();

        System.out.println("ingrese la direccion: ");
        String direccion = he.nextLine();

        System.out.println("ingrese el telefono: ");
        int telefono = he.nextInt();
        proveedor pr= new proveedor();
        pr.setNombre(nombre);
        pr.setDireccion(direccion);
        pr.setTelefono(telefono);
        proveedorDAO.crear_proveedorDB(pr);


    }
    public static void listar_proveedor(){
    }
    public static void borrar_proveedor(){
    }
    public static void editar_proveedor(){
    }





}
