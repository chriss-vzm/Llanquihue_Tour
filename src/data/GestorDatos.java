package data;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {


    public RutaGastronomica crearRuta(){
        return new RutaGastronomica(
          "Ruta del Sabor",
          3,
          3
        );

    }

    public PaseoLacustre crearPaseo(){
        return new PaseoLacustre(
                "Paseo Lacustre Lago Llanquigue",
                3,
                "Lancha Turística"
        );
    }









}

