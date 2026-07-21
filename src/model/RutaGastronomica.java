package model;



public class RutaGastronomica extends ServicioTuristico {

    int numeroParadas;

    public RutaGastronomica(String id, String nombre, double precio, Proveedor proveedor, int numeroParadas){

        super(id,nombre,precio,proveedor);
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
    public void mostrarDatos() {
        System.out.println("===== RUTA GASTRONÓMICA =====");
        mostrarDatosGenerales();
        System.out.println("Número de paradas: " + numeroParadas);
    }


}
