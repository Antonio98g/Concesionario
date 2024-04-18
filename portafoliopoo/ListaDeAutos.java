package portafoliopoo;

public class ListaDeAutos {
    private Auto inicio;
    private Auto fin;

    public ListaDeAutos() {
    }

    public Auto getInicio() {
        return inicio;
    }

    public void setInicio(Auto inicio) {
        this.inicio = inicio;
    }

    public Auto getFin() {
        return fin;
    }

    public void setFin(Auto fin) {
        this.fin = fin;
    }
    
    public void insertar(String modelo, String marca){
        Auto nuevo = new Auto (modelo, marca);
        if (this.getInicio() == null){
            this.inicio = nuevo;
            this.fin = nuevo;
        }
        else{
            this.getFin().setSiguiente(nuevo);
            this.setFin(nuevo);
        }
    }
    
    public void mostrar (){
        Auto actual = inicio;
        if(actual != null){
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
        else {
            System.out.println("La lista esta vacia");
        }
    }
    
    public void buscar (String dato){
        Auto actual = this.getInicio();
        int cont = 1;
        if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            while (!actual.getModelo().equals(dato)) {
                actual = actual.getSiguiente();
                cont++;
                if (actual == null) {
                    System.out.println("El dato no se encuentra en la lista");
                    return;
                }
            }
            System.out.println("Su dato está en la posición: " + cont);
            System.out.println(actual.toStringBusqueda());
        }
     }
    
    public void venderAuto(String modelo, String cliente){
        Auto actual = this.getInicio();
        if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            while (!actual.getModelo().equals(modelo)) {
                actual = actual.getSiguiente();
                if (actual == null) {
                    System.out.println("El dato no se encuentra en la lista");
                    return ;
                }
            }
            if (actual.isDisponible() == true){
                actual.setCliente(cliente);
                System.out.println("Su compra a sido exitosa" );
                actual.setDisponible(false);
                System.out.println(actual.toStringVendidos());
            }
            else{
                System.out.println("El auto no se encuentra disponible");
            }
            
        }
    }
    
    public void devolverAuto(String modelo){
        Auto actual = this.getInicio();
        if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            while (!actual.getModelo().equals(modelo)) {
                actual = actual.getSiguiente();
                if (actual == null) {
                    System.out.println("El dato no se encuentra en la lista");
                    return ;
                }
            }
            if (actual.isDisponible() == false){
                actual.setCliente(null);
                System.out.println("Su compra a sido devuelta" );
                actual.setDisponible(true);
                System.out.println(actual.toStringDevuelto());
            }
            else{
                System.out.println("El auto no se encuentra disponible para devolver");
            }
            
        }
    }
    
    public void autosVendidos(){
        Auto actual = this.getInicio();
         if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            while (actual != null) {
                if (actual.isDisponible() == false) {
                    System.out.println(actual.toStringVendidos());
                }
                actual = actual.getSiguiente();
            }
        }
    }
    
    public void autosDisponibles(){
        Auto actual = this.getInicio();
         if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            while (actual != null) {
                if (actual.isDisponible() == true) {
                    System.out.println(actual.toStringBusqueda());
                }
                actual = actual.getSiguiente();
            }
        }
    }
    
    
}