package model;

public class Guia implements Registrable{

    private String nombre;
    private String telefono;

    public Guia(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }



    //GETTERS

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    //SETTERS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public String mostrarResumen() {
        return "-------- GUÍA TURÍSTICO --------"
                + "\nNombre: " + nombre
                + "\nTeléfono: " + telefono;
    }
}