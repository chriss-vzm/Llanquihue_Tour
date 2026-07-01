package ui;

import data.GestorDatos;
import model.RutaGastronomica;
import model.ServicioTuristico;
import model.Tour;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorDatos datos = new GestorDatos();
        List<ServicioTuristico> servicio = datos.crearServicios();


        for(ServicioTuristico s : servicio){
            s.mostrarInformacion();
            System.out.println();
        }

    }
}

