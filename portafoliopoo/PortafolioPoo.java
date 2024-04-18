package portafoliopoo;

import java.util.Scanner;

public class PortafolioPoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ListaDeAutos lista = new ListaDeAutos();
        int opc, op;
        String modelo,marca, cliente;
        
        do{
            System.out.println("Menu");
            System.out.println("Seleccione el tipo de usuario");
            System.out.println("1.Consecionario");
            System.out.println("2.Cliente");
            System.out.println("3.Salir");
            op = leer.nextInt();
            switch(op){
                case 1-> {
                    //consecionario
                     do{
                        System.out.println("Menu");
                        System.out.println("1.Agregar Auto");
                        System.out.println("2.Mostrar todos los Autos");
                        System.out.println("3.Mostrar Autos Vendidos");
                        System.out.println("4.Mostrar Autos Disponibles");
                        System.out.println("5.Salir");
                        opc = leer.nextInt();
                        switch(opc){
                            case 1 -> {
                                //el vendedor agrega un nuevo auto al stock
                                System.out.println("1.Agregar un Auto");
                                System.out.println("Ingresa Modelo: ");
                                modelo = leer.next();
                                System.out.println("Ingresa la Marca: ");
                                marca = leer.next();
                                lista.insertar (modelo,marca);
                            }
                            //muestra todos los autos, incluso los que no están disponibles
                            case 2 -> {
                                System.out.println("2.Mostrar todos los Autos");
                                lista.mostrar();
                            }
                            //excluye los autos que aún no se venden
                            case 3 -> {
                                System.out.println("3.Mostrar Autos Vendidos");
                                lista.autosVendidos();
                            }
                            //excluye los autos que ya se vendieron
                            case 4 -> {
                                System.out.println("4.Mostrar Autos Disponibles");
                                System.out.println("2.Eliminar primero");
                                lista.autosDisponibles();
                            }
                            //sale del menú del concesionario
                            case 5 -> {
                                System.out.println("bye bye");
                            }
                            //en caso de que le ingrese una opcion que no sea válida
                            default -> System.out.println("Opcion invalida");
                            }
                    }while(opc!=5);
                }
                case 2-> {
                    //cliente
                    do{
                        System.out.println("Menu");
                        System.out.println("1.Mostrar todos los Autos");
                        System.out.println("2.Mostrar Autos Disponibles");
                        System.out.println("3.Comprar Auto");
                        System.out.println("4.Devolver Auto");
                        System.out.println("5.Bucar Auto");
                        System.out.println("6.Salir");
                        opc = leer.nextInt();
                        switch(opc){
                            case 1 -> {
                                //se muestran todos los autos incluso los que ya se vendieron
                                System.out.println("1.Mostrar todos los Autos");
                                lista.mostrar();
                            }
                            case 2 -> {
                                //se excluyen los autos que ya se vendieron y solo se muestran los que están disponibles
                                System.out.println("2.Mostrar Autos Disponibles");
                                lista.autosDisponibles();
                            }
                            case 3 -> {
                                //el usuario ingresa el modelo del coche y si está disponible, se permite la compra
                                System.out.println("3.Comprar Auto");
                                System.out.println("Ingrese modelo a comprar");
                                modelo = leer.next();
                                System.out.println("Ingrese su nombre para consolidar su compra");
                                cliente = leer.next();
                                lista.venderAuto(modelo, cliente);
                            }
                            case 4 -> {
                                //se busca el coche por modelo y verifica que no esté disponible para poder devolverlo
                                System.out.println("4.Devolver Auto");
                                System.out.println("Ingrese modelo a devolver");
                                modelo = leer.next();
                                lista.devolverAuto(modelo);
                            }
                            case 5 -> {
                                //busca por modelo de coche incluso a los que ya están vendidos y lo muestra
                                System.out.println("5.Buscar Auto");
                                System.out.println("Ingrese modelo a Buscar");
                                modelo = leer.next();
                                lista.buscar(modelo);
                            }
                            case 6 -> {
                                //sale del menú del cliente
                                System.out.println("bye bye");
                            }
                            //en caso de que se ingrese una opcion que no sea válida
                            default -> System.out.println("Opcion invalida");
                            }
                    }while(opc!=6);
                }
                case 3-> {
                    //sale del programa
                    System.out.println("bye bye");
                }
                //en caso dde que el usuario ingrese una opcion que no sea válida
                default -> System.out.println("Opcion invalida");
            }
        }while(op!=3);
    }
    
}
