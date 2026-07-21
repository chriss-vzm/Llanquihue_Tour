package model;

public class Proveedor implements Mostrable{

    private String id;
    private String nombre;
    private String direccion;
    private String numero;



    public Proveedor(String id,String nombre, String direccion, String numero) {

        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;

    }


    //GETTERS


    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumero() {
        return numero;
    }



    //SETTERS


    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("===== PROVEEDOR =====");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero: " + numero);
    }



}


