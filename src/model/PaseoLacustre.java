package model;

public class PaseoLacustre extends ServicioTuristico implements Registrable{

    String tipoEmbarcacion;


    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion){

        super(nombre,duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;


    }

    //GETTERS

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    //SETTERS


    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String mostrarInformacion() {
        return "-------- PASEO LACUSTRE --------"
                + "\nNombre: " + getNombre()
                + "\nDuración: " + getDuracionHoras() + " horas"
                + "\nTipo de embarcación: " + tipoEmbarcacion;
    }


    @Override
    public String mostrarResumen() {
        return mostrarInformacion();
    }



    @Override
    public String toString(){
        return super.toString() + "\nTipo Embarcación: " + tipoEmbarcacion;
    }


}
