package model;

public abstract class Persona {


    private String nombre;
    private int edad;
    private String telefono;


    public Persona (String nombre, int edad, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;

    }


    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }


    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }





}
