package model;

public class PaseoLacustre extends ServicioTuristico{

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
    public String toString(){
        return super.toString() + "\nTipo Embarcación: " + tipoEmbarcacion;
    }


}
