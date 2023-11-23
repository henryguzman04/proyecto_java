import java.util.Scanner;

public class empleadoService {
    public static void crear_empleado(){
        Scanner he = new Scanner(System.in);
        System.out.println("ingrese el nombre del empleado: ");
        String nombre = he.nextLine();
        System.out.println("ingrese el primer apellido del empleado");
        String apellido1= he.nextLine();
        System.out.println("ingrese el segundo apellido del empleado");
        String apellido2= he.nextLine();
        System.out.println("ingrese la direccion: ");
        String direccion = he.nextLine();
        System.out.println("ingrese el telefono del empleado: ");
        int telefono_empleado = he.nextInt();
        System.out.println("ingrese el salario del empleado");
        float salario= he.nextFloat();
        empleado pr= new empleado();
        pr.setNombre(nombre);
        pr.setApellido1(apellido1);
        pr.setApellido2(apellido2);
        pr.setDireccion(direccion);
        pr.setTelefono_empleado(telefono_empleado);
        pr.setSalario(salario);
       empleadoDAO.crear_empleadoDB(pr);


    }
    public static void listar_empleado(){
        empleadoDAO.leer_empleado();
    }
    public static void borrar_empleado(){
        Scanner he =new Scanner(System.in);
        System.out.println("indica el ID del empleado a borrar: ");
        int id_empleado=he.nextInt();
        proveedorDAO.borrar_proveedor(id_empleado);
    }



    public static void editar_empleado(){
        Scanner he =new Scanner(System.in);
        System.out.println("ingrese el nuevo nombre: ");
        String nombre =he.nextLine();
        System.out.println("ingrese el nuevo apellido1");
        String apellido1 = he.nextLine();
        System.out.println("ingrese el nuevo apellido2");
        String apellido2 = he.nextLine();
        System.out.println("ingrese la nueva direccion: ");
        String direccion =he.nextLine();
        System.out.println("ingrese el nuevo numero de telefono: ");
        int telefono_empleado =he.nextInt();
        System.out.println("ingrese su salario del empleado");
        float salario =he.nextFloat();
        System.out.println("indica el ID del proveedor a editar ");
        int id_empleado =he.nextInt();
        empleado actualizar =new empleado();
        actualizar.setNombre(nombre);
        actualizar.setApellido1(apellido1);
        actualizar.setApellido2(apellido2);
        actualizar.setDireccion(direccion);
        actualizar.setTelefono_empleado(telefono_empleado);
        actualizar.setId(id_empleado);
        empleadoDAO.actualizar_empleado(actualizar);



    }

}
