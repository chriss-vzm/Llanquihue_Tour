package model;

public class PaseoLacustre extends ServicioTuristico{

    String tipoEmbarcacion;


    public PaseoLacustre(String id, String nombre, double precio , Proveedor proveedor , String tipoEmbarcacion){

        super(id,nombre,precio,proveedor);
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
    public void mostrarDatos() {
        System.out.println("===== PASEO LACUSTRE =====");
        mostrarDatosGenerales();
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
    }



}
