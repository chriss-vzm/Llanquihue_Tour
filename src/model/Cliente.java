package model;

public class Cliente extends Persona{

    private String rut;


    public Cliente(String nombre, int edad, String telefono){
        super(nombre,edad,telefono);
        this.rut = rut;
    }


    //GETTERS

    public String getRut() {
        return rut;
    }

    //SETTERS
    public void setRut(String rut) {
        this.rut = rut;
    }
}
