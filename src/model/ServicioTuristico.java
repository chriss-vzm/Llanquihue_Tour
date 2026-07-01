package model;

public abstract class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras){
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }


    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }


    //SETTERS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }



    public abstract void mostrarInformacion();



    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nDuracion Horas: " + duracionHoras;
    }


}
