package data;

import java.util.ArrayList;
import model.Registrable;

public class GestorDatos {

    private ArrayList<Registrable> registros;

    public GestorDatos() {
        registros = new ArrayList<>();
    }

    public void agregarRegistro(Registrable registro) {
        registros.add(registro);
    }

    public ArrayList<Registrable> getRegistros() {
        return registros;
    }
}