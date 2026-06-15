package model;

public class Tour {

    private String nombre;
    private String destino;
    private int precio;



    public Tour(String nombre, String destino, int precio){

        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;


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

    @Override
    public String toString() {
        return "Tour{ " +
                "nombre: '" + nombre + '\'' +
                ", destino: '" + destino + '\'' +
                ", precio: " + precio +
                '}';
    }


}
