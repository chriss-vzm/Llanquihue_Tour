package model;

public class Guia extends Persona{

    private String id;


    public Guia(String nombre, int edad, String telefono) {
        super(nombre, edad, telefono);
        this.id = id;
    }


    //GETTERS

    public String getId(){
        return id;
    }

    //SETTERS

    public void setId(String id) {
        this.id = id;
    }


}

