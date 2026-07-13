package model;

public class Tour {

    private String nombre;
    private String destino;
    private int precio;
    private Guia guia;


    public Tour(String nombre, String destino, int precio, Guia guia) {

        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.guia = guia;


    }


    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public int getPrecio() {
        return precio;
    }

    public Guia getGuia() {
        return guia;
    }

    //SETTERS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Tour{ " +
                "nombre: '" + nombre + '\'' +
                ", destino: '" + destino + '\'' +
                ", precio: " + precio +
                ", guia: " + guia +
                '}';
    }

}


