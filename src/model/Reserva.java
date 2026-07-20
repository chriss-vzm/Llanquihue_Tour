package model;

public class Reserva implements Mostrable{

    private String idReserva;
    private Cliente cliente;
    private ServicioTuristico servicio;
    private String fecha;



    public Reserva(String idReserva, Cliente cliente, ServicioTuristico servicio, String fecha){
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.servicio = servicio;
        this.fecha = fecha;

    }

    // GETTERS

    public String getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ServicioTuristico getServicio() {
        return servicio;
    }

    public String getFecha() {
        return fecha;
    }


    //SETTERS


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public void mostrarResumen(){

    }
}
