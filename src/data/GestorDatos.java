package data;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {


    public List<ServicioTuristico> crearServicios() {


        List<ServicioTuristico> servicios = new ArrayList<>();


        servicios.add(new RutaGastronomica(
                "Ruta del sabor",
                3,
                2));

        servicios.add (new PaseoLacustre(
                "Lago Llanquigue",
                3 ,
                "Lancha Turística"));

        servicios.add(new ExcursionCultural(
                "Museo Colonial Alemán",
                2,
                "Frutillar"));


        servicios.add(new ExcursionCultural(
                "Teatro del Lago",
                1,
                "Frutillar"));


        servicios.add(new PaseoLacustre(
                "Bahía de Ensenada",
                2,
                "Catamarán"));


        return servicios;
    }


}

