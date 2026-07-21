package model;

public class ExcursionCultural extends ServicioTuristico{

    String lugarHistorico;

    public ExcursionCultural(String id, String nombre, double precio, Proveedor proveedor, String lugarHistorico){

        super(id,nombre,precio,proveedor);
        this.lugarHistorico = lugarHistorico;

    }

    //GETTERS

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    //SETTERS

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("===== EXCURSIÓN CULTURAL =====");
        mostrarDatosGenerales();
        System.out.println("Lugar histórico: " + lugarHistorico);
    }

}


