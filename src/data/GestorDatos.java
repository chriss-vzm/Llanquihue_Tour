package data;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {


    public List<Registrable> crearServicios() {


        List<Registrable> registros = new ArrayList<>();


        registros.add(new RutaGastronomica(
                "Ruta del sabor",
                3,
                2));

        registros.add(new Guia("Christopher Zuñiga", "998693238"));

        registros.add(new PaseoLacustre(
                "Pase Lago Llanquigue",
                3,
                "Catamarán Turístico Lago Azul"
        ));



        return registros;
    }


}

