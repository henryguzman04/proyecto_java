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
        proveedorDAO.leer_proveedor();
    }
    public static void borrar_proveedor(){
        Scanner he =new Scanner(System.in);
        System.out.println("indica el ID del proveedor a borrar: ");
        int id_proveedor=he.nextInt();
        proveedorDAO.borrar_proveedor(id_proveedor);
    }



    public static void editar_proveedor(){
        Scanner he =new Scanner(System.in);
        System.out.println("ingrese el nuevo nombre: ");
        String nombre =he.nextLine();
        System.out.println("ingrese la nueva direccion: ");
        String direccion =he.nextLine();
        System.out.println("ingrese el nuevo numero de telefono: ");
        int telefono =he.nextInt();
        System.out.println("indica el ID del proveedor a editar ");
        int id_proveedor =he.nextInt();
     proveedor actualizar =new proveedor();
     actualizar.setNombre(nombre);
     actualizar.setDireccion(direccion);
     actualizar.setTelefono(telefono);
     actualizar.setId(id_proveedor);
     proveedorDAO.actualizar_proveedor(actualizar);



    }

    }



