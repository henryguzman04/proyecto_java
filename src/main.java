import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner he= new Scanner(System.in);
        int opcion ;
        do {
            System.out.println("1.aplicacion del proveedor");
            System.out.println("2.aplicacion del almacen");
            System.out.println("3. aplicacion del empleado");
            System.out.println("4.salir");
            System.out.println(" ---------------ingrese una opcion---------------------");
            System.out.println(">>");
            opcion=he .nextInt();
            switch (opcion){
                case 1:
                    Scanner he2= new Scanner(System.in);
                    int opcion2 ;
                    do {System.out.println("--------------------------------");
                        System.out.println("-----APLICACION DEL PROVEEDOR-----");
                        System.out.println("1. crear proveedor");
                        System.out.println("2. listar proveedor");
                        System.out.println("3. editar proveedor ");
                        System.out.println("4. eliminar proveedor ");
                        System.out.println("5. salir ");
                        opcion2=he2.nextInt();
                        switch (opcion2){
                            case 1:
                                proveedorService.crear_proveedor();
                                break;
                            case 2:
                                proveedorService.listar_proveedor();
                                break;
                            case 3:
                                proveedorService.editar_proveedor();
                                break;
                            case 4:
                                proveedorService.borrar_proveedor();
                                break;
                            case 5:
                                System.out.println("saliendo del programa ....grasias por su visita....");
                            default:opcion2=5;

                        }

                    }while (opcion2 !=5);
                    break;
                case 2:
                    Scanner he3= new Scanner(System.in);
                    int opcion3 ;
                    do {
                        System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   ");
                        System.out.println("-----APLICACION DEL ALMACEN----------");
                        System.out.println("1. crear almacen");
                        System.out.println("2. listar almacen");
                        System.out.println("3. editar almacen ");
                        System.out.println("4. eliminar almacen ");
                        System.out.println("5. salir ");
                         opcion3=he3.nextInt();
                         switch (opcion3){

                             case 1:
                                 almacenService.crear_almacen();
                                 break;
                             case 2:
                                 almacenService.listar_almacen();
                                 break;
                             case 3:
                               almacenService.editar_almacen();
                                 break;
                             case 4:
                                 almacenService.borrar_almacen();
                                break;
                             case 5:
                                 System.out.println("saliendo del programa ....grasias por su visita....");
                             default:opcion3=5;
                         }
                    }while (opcion3 !=5);

                    break;
                case 3:
                    Scanner he4= new Scanner(System.in);
                    int opcion4 ;
                    do {
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   ");
                        System.out.println("--------APLICACION DEL EMPLEADO--------");
                        System.out.println("1. crear empleado");
                        System.out.println("2. listar empleado");
                        System.out.println("3. editar empleado ");
                        System.out.println("4. eliminar empleado ");
                        System.out.println("5. salir ");
                        opcion4=he4.nextInt();
                        switch (opcion4){
                            case 1:
                             empleadoService.crear_empleado();
                                break;
                            case 2:
                                empleadoService.listar_empleado();
                                break;
                            case 3:
                                empleadoService.editar_empleado();

                                break;
                            case 4:
                                empleadoService.borrar_empleado();

                                break;
                            case 5:
                                System.out.println("saliendo del programa ....grasias por su visita....");
                                System.out.println("  ");
                                break;
                            default:opcion3=5;
                        }
                    }while (opcion4 !=5);
                    break;

                case 4:
                    System.out.println("saliendo......");
                default:
                    opcion=4;
            }

        }while (opcion !=4);
    }
}
