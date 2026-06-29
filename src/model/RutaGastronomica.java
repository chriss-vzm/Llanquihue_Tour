package model;

public class RutaGastronomica extends ServicioTuristico{

    int numeroParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroParadas){

        super(nombre, duracionHoras);
        this.numeroParadas = numeroParadas;

    }

    //GETTERS

    public int getNumeroParadas() {
        return numeroParadas;
    }

    //SETTERS

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNumero Paradas: " + numeroParadas;
    }


}
