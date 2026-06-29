package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        System.out.println(gestor.crearRuta());
        System.out.println();

        System.out.println(gestor.crearPaseo());
        System.out.println();

    }
}

