package model;

public class Reserva implements Mostrable{


    private Cliente cliente;
    private Guia guia;
    private ServicioTuristico servicio;
    private String fecha;



    public Reserva( Cliente cliente,Guia guia, ServicioTuristico servicio, String fecha){

        this.cliente = cliente;
        this.guia = guia;
        this.servicio = servicio;
        this.fecha = fecha;

    }

    // GETTERS

    public Guia getGuia() {
        return guia;
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
    public void mostrarDatos() {
        System.out.println("===== RESERVA =====");
        System.out.println("Fecha: " + fecha);
        cliente.mostrarDatos();
        guia.mostrarDatos();
        servicio.mostrarDatos();
        servicio.getProveedor().mostrarDatos();

    }
}
