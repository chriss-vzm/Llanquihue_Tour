package model;

public abstract class ServicioTuristico implements Mostrable {

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


    protected void mostrarDatosGenerales() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Proveedor: " + proveedor.getNombre());
    }


    @Override
    public abstract void mostrarDatos();

}



