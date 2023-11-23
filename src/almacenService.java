import java.util.Scanner;

public class almacenService {
    public static void crear_almacen(){
        Scanner hen = new Scanner(System.in);
        System.out.println("ingrese el nombre del almacen: ");
        String nombre = hen.nextLine();

        System.out.println("ingrese la direccion: ");
        String direccion = hen.nextLine();

        almacen pro= new almacen();
        pro.setNombre(nombre);
        pro.setDireccion(direccion);
        almacenDAO.crear_almacenDB(pro);


    }
    public static void listar_almacen(){
        almacenDAO.leer_almacen();
    }
    public static void borrar_almacen(){
        Scanner he1 =new Scanner(System.in);
        System.out.println("indica el ID del almacen a borrar: ");
        int id_almacen=he1.nextInt();
        almacenDAO.borrar_almacen(id_almacen);

    }



    public static void editar_almacen(){
        Scanner he =new Scanner(System.in);
        System.out.println("ingrese el nuevo nombre: ");
        String nombre =he.nextLine();
        System.out.println("ingrese la nueva direccion: ");
        String direccion =he.nextLine();
        System.out.println("indica el ID del almacen a editar ");
        int id_almacen =he.nextInt();
        almacen actualizar =new almacen();
        actualizar.setNombre(nombre);
        actualizar.setDireccion(direccion);
        actualizar.setId(id_almacen);
        almacenDAO.actualizar_almacen(actualizar);


    }

}
