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
                                System.out.println("1.Agregar un Auto");
                                System.out.println("Ingresa Modelo: ");
                                modelo = leer.next();
                                System.out.println("Ingresa la Marca: ");
                                marca = leer.next();
                                lista.insertar (modelo,marca);
                            }
                            case 2 -> {
                                System.out.println("2.Mostrar todos los Autos");
                                lista.mostrar();
                            }
                            case 3 -> {
                                System.out.println("3.Mostrar Autos Vendidos");
                                lista.autosVendidos();
                            }
                            case 4 -> {
                                System.out.println("4.Mostrar Autos Disponibles");
                                System.out.println("2.Eliminar primero");
                                lista.autosDisponibles();
                            }
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
                                System.out.println("1.Mostrar todos los Autos");
                                lista.mostrar();
                            }
                            case 2 -> {
                                System.out.println("2.Mostrar Autos Disponibles");
                                lista.autosDisponibles();
                            }
                            case 3 -> {
                                System.out.println("3.Comprar Auto");
                                System.out.println("Ingrese modelo a comprar");
                                modelo = leer.next();
                                System.out.println("Ingrese su nombre para consolidar su compra");
                                cliente = leer.next();
                                lista.venderAuto(modelo, cliente);
                            }
                            case 4 -> {
                                System.out.println("4.Devolver Auto");
                                System.out.println("Ingrese modelo a devolver");
                                modelo = leer.next();
                                lista.devolverAuto(modelo);
                            }
                            case 5 -> {
                                System.out.println("5.Buscar Auto");
                                System.out.println("Ingrese modelo a Buscar");
                                modelo = leer.next();
                                lista.buscar(modelo);
                            }
                            case 6 -> {
                                System.out.println("bye bye");
                            }
                            default -> System.out.println("Opcion invalida");
                            }
                    }while(opc!=6);
                }
                case 3-> {
                    //salir
                    System.out.println("bye bye");
                }
                default -> System.out.println("Opcion invalida");
            }
        }while(op!=3);
    }
    
}
