package model;

public abstract class ServicioTuristico  {

    private String nombre;
    private String id;
    private double precio;
    private Proveedor proveedor;

    public ServicioTuristico(String id,String nombre, double precio, Proveedor proveedor){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }


    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }


    //SETTERS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }



}



