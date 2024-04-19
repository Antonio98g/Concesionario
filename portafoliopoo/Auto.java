package portafoliopoo; //Se encarga de agrupar las clases

// Clase que representa un objeto de automóvil
public class Auto {
    private String modelo; // Modelo del automóvil
    private String marca; // Marca del automóvil
    private boolean disponible; // Indica si el automóvil está disponible para la venta
    private String cliente; // Cliente que ha adquirido el automóvil
    private Auto siguiente; // Referencia al siguiente automóvil en la lista enlazada

    // Constructor de la clase Auto
    public Auto(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.disponible = true;
        this.siguiente = null;
    }

    // Métodos getters y setters para los atributos privados

    // Obtiene el modelo del automóvil
    public String getModelo() {
        return modelo;
    }

    // Establece el modelo del automóvil
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Obtiene la marca del automóvil
    public String getMarca() {
        return marca;
    }

    // Establece la marca del automóvil
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Comprueba si el automóvil está disponible para la venta
    public boolean isDisponible() {
        return disponible;
    }

    // Establece la disponibilidad del automóvil
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Obtiene el cliente que ha adquirido el automóvil
    public String getCliente() {
        return cliente;
    }

    // Establece el cliente que ha adquirido el automóvil
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // Obtiene el siguiente automóvil en la lista enlazada
    public Auto getSiguiente() {
        return siguiente;
    }

    // Establece el siguiente automóvil en la lista enlazada
    public void setSiguiente(Auto siguiente) {
        this.siguiente = siguiente;
    }

    // Devuelve una representación en cadena de caracteres de los atributos del automóvil
    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", marca=" + marca + ", disponible=" + disponible + ", siguiente=" + siguiente + '}';
    }

    // Devuelve una representación en cadena de caracteres del modelo y la marca del automóvil
    public String toStringBusqueda() {
        return "Auto:" + "modelo=" + modelo + ", marca=" + marca + ", disponible=" + disponible ;
    }

    // Devuelve una representación en cadena de caracteres del modelo, la marca y el cliente del automóvil
    public String toStringVendidos() {
        return "Auto:" + "modelo=" + modelo + ", marca=" + marca + ", cliente=" + cliente ;
    }

    // Devuelve una representación en cadena de caracteres del modelo, la marca y la disponibilidad del automóvil
    public String toStringDevuelto() {
        return "Auto:" + "modelo=" + modelo + ", marca=" + marca + ", cliente= pendiente" + ", disponible=" + disponible ;
    }   
}

