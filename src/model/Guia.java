package model;

public class Guia extends Persona implements Mostrable{

    private String id;


    public Guia(String nombre, int edad, String telefono,String id) {
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


    @Override
    public void mostrarDatos() {
        System.out.println(
                "Guia.txt: " + getNombre()
                + " | Edad: " + getEdad()
                + " | Telefono: " + getTelefono()
                + " | ID: " + id
        );


    }

}

