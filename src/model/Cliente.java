package model;

import exception.RutInvalidoException;

public class Cliente extends Persona implements Mostrable{

    private String rut;

    public Cliente(String nombre, int edad, String telefono, String rut)
            throws RutInvalidoException {

        super(nombre, edad, telefono);



        validarRut(rut);

        this.rut = rut;
    }

    private void validarRut(String rut)
            throws RutInvalidoException {

        if (!rut.matches("\\d{7,8}-[0-9Kk]")) {
            throw new RutInvalidoException("Formato de RUT inválido.");
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws RutInvalidoException {
        validarRut(rut);
        this.rut = rut;
    }

    @Override
    public void mostrarDatos(){
        System.out.println(
                "Cliente: " + getNombre()
                + " | Edad: " + getEdad()
                + " | Telefono: " + getTelefono()
                + " | Rut: " + rut
        );
    }



}