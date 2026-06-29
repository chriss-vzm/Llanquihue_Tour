package model;

public class ExcursionCultural extends ServicioTuristico{

    String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico){

        super(nombre, duracionHoras);
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
    public String toString() {
        return super.toString() + "\nLugar Histórico: " + lugarHistorico;
    }
}
