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

    //método para dar de alta un nuevo auto
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

    //muestra todos los autos tanto disponibles como vendidos
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

    //busca en toda la lista al modelo de auto que el usuario desea
    public void buscar (String dato){
        Auto actual = this.getInicio();
        //condicional en caso de que la lista esté vacía
        if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            //recorre toda la lista hasta que encuentre el modelo del auto que ingresó el usuario
            while (!actual.getModelo().equals(dato)) {
                actual = actual.getSiguiente();
                cont++;
                //si el auto no se encuentra, entonces se le indica al usuario
                if (actual == null) {
                    System.out.println("No se encontro el modelo de auto deseado.");
                    return;
                }
            }
            System.out.println(actual.toStringBusqueda());
        }
     }

    //método para cambiar el estado del vehiculo que desea comprar el usuario a 'no disponible'
    public void venderAuto(String modelo, String cliente){
        Auto actual = this.getInicio();
        //condicional en caso de que la lista esté vacía
        if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            //recorre la lista para encontrar el modelo de auto deseado por el usuario
            while (!actual.getModelo().equals(modelo)) {
                actual = actual.getSiguiente();
                //condicional en caso de que no se encuentre el modelo de auto deseado en la lista
                if (actual == null) {
                    System.out.println("El modelo de auto no se encuentra en la lista");
                    return ;
                }
            }
            //después de encontrar el auto por modelo y verificar que esté disponible se le asigna el comprador con el nombre que ingresó el cliente
            if (actual.isDisponible() == true){
                actual.setCliente(cliente);
                System.out.println("Su compra a sido exitosa" );
                actual.setDisponible(false);
                System.out.println(actual.toStringVendidos());
            }
            //si el auto no está disponible, se le indica al usuario    
            else{
                System.out.println("El auto no se encuentra disponible");
            }
            
        }
    }

    //método que le permite al cliente devolver un auto que anteriormente compró
    public void devolverAuto(String modelo){
        Auto actual = this.getInicio();
        //verifica que la lista mno esté vacía
        if (actual == null) {
            System.out.println("No hay ningun auto en stock");
        } else {
            //recorre la lista para buscar el auto que el cliente desea
            while (!actual.getModelo().equals(modelo)) {
                actual = actual.getSiguiente();
                //si no se encuentra el elemento en la lista, se le indica al usuario
                if (actual == null) {
                    System.out.println("El auto no se encuentra en la lista");
                    return ;
                }
            }
            //verifica que el auto haya sido comprado anteriormente
            if (actual.isDisponible() == false){
                actual.setCliente(null);
                System.out.println("Su compra a sido devuelta" );
                actual.setDisponible(true);
                System.out.println(actual.toStringDevuelto());
            }
            else{
                System.out.println("El auto no ha sido comprado");
            }
            
        }
    }

    //muestra unicamente los autos que han sido vendidos
    public void autosVendidos(){
        Auto actual = this.getInicio();
        //verifica que la lista no esté vacía
         if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            //recorre la lista y muestra los autos que ya están vendidos
            while (actual != null) {
                if (actual.isDisponible() == false) {
                    System.out.println(actual.toStringVendidos());
                }
                actual = actual.getSiguiente();
            }
        }
    }

    //muestra los autos que aún no han sido vendidos
    public void autosDisponibles(){
        Auto actual = this.getInicio();
        //verifica que el stock no esté vacío
         if (actual == null) {
            System.out.println("La lista está vacía");
        } else {
            //recorre la lista y muestra los autos excluyendo los que ya han sido comprados
            while (actual != null) {
                if (actual.isDisponible() == true) {
                    System.out.println(actual.toStringBusqueda());
                }
                actual = actual.getSiguiente();
            }
        }
    }
    
    
}
