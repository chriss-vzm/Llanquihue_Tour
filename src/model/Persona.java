package model;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public abstract class Persona implements Mostrable {


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



    protected void mostrarDatosGenerales(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Telefono: " + getTelefono());
    }

    public abstract void mostrarDatos();




}
