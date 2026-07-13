package model;

public class Guia implements Registrable{

    private String nombre;
    private String telefono;

    public Guia(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
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
    public void mostrarResumen() {
        System.out.println("Guia: " + getNombre()
        + " | Telefono: " + getTelefono()
        );

    }
}