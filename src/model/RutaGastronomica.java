package model;



public class RutaGastronomica extends ServicioTuristico implements Registrable{

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
    public void mostrarInformacion(){
        System.out.println(" -------- RUTA GASTRONOMICA --------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duracion: " + getDuracionHoras() + "hrs");
        System.out.println("Paradas: " + numeroParadas + " paradas");
    }


    @Override
    public String toString(){
        return super.toString() + "\nNumero Paradas: " + numeroParadas;
    }


    @Override
    public void mostrarResumen() {
        System.out.println("Ruta Gastronómica: " + getNombre()
        + " | Duracion: " + getDuracionHoras() + "hrs"
        + " | Paradas: " + numeroParadas
        );

    }
}
