package portafoliopoo;

import java.util.Scanner;

public class PortafolioPoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ListaDeAutos lista = new ListaDeAutos();
        int opc;
        String modelo,marca, cliente;

        do{
            System.out.println("Menu");
            System.out.println("1.Agregar Auto");
            System.out.println("2.Mostrar todos los Autos");
            System.out.println("3.Mostrar Autos Vendidos");
            System.out.println("4.Mostrar Autos Disponibles");
            System.out.println("5.Vender Auto");
            System.out.println("6.Devolver Auto");
            System.out.println("7.Bucar Auto");
            System.out.println("8.Salir");
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
                case 5 -> {
                    System.out.println("5.Vender Auto");
                    System.out.println("Ingrese modelo a comprar");
                    modelo = leer.next();
                    System.out.println("Ingrese su nombre para consolidar su compra");
                    cliente = leer.next();
                    lista.venderAuto(modelo, cliente);
                }
                case 6 -> {
                    System.out.println("6.Devolver Auto");
                    System.out.println("Ingrese modelo a devolver");
                    modelo = leer.next();
                    lista.devolverAuto(modelo);
                }
                case 7 -> {
                    System.out.println("7.Buscar Auto");
                    System.out.println("Ingrese modelo a Buscar");
                    modelo = leer.next();
                    lista.buscar(modelo);
                }
                case 8 -> {
                    System.out.println("bye bye");
                }
                    
                default -> System.out.println("Opcion invalida");
            }
         }while(opc!=8);
    }
    
}
