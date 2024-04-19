package portafoliopoo;

public class Auto {
    private String modelo;
    private String marca;
    private boolean disponible;
    private String cliente;
    private Auto siguiente;

    //constructor de la clase auto
    public Auto(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.disponible = true;
        this.siguiente = null;
    }

    //setters y getters de la clase auto
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Auto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Auto siguiente) {
        this.siguiente = siguiente;
    }

    //método toString que muestra los datos del nodo
    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", marca=" + marca + ", disponible=" + disponible + ", siguiente=" + siguiente + '}';
    }

    //método toStringBusqueda que solo muestra el modelo del auto que el usuario desea
    public String toStringBusqueda() {
        return "Auto:" + "modelo=" + modelo + ", marca=" + marca + ", disponible=" + disponible ;
    }

    //método toStringVendidos que muestra solo a los autos que ya han sido comprados
    public String toStringVendidos() {
        return "Auto:" + "modelo=" + modelo + ", marca=" + marca + ", cliente=" + cliente ;
    }

    //método toStringDevuelto que muestra los autos que algún cliente ha devuelto
    public String toStringDevuelto() {
        return "Auto:" + "modelo=" + modelo + ", marca=" + marca + ", cliente= pendiente" + ", disponible=" + disponible ;
    }
    
}
