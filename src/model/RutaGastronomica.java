package model;



public class RutaGastronomica extends ServicioTuristico implements Mostrable{

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
    public void mostrarDatos(){
        System.out.println(
                "ID: " + getId()
                + " | Nombre: " + getNombre()
                + " | Precio: " + getPrecio()
                + " | Proveedor: " + getProveedor()
                + " | Numero Paradas: " + numeroParadas

        );
    }


}
