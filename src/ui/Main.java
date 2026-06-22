package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.cargarTours();

        System.out.println("=== TODOS LOS TOURS ===");

        for (Tour t : tours) {
            System.out.println(t);
        }

        System.out.println("\n=== TOURS MAYORES A 18000 ===");

        for (Tour t : tours) {

            if (t.getPrecio() > 18000) {
                System.out.println(t);
            }

        }

        System.out.println("\n=== TOURS EN PUERTO VARAS ===");

        for (Tour t : tours) {

            if (t.getDestino().equalsIgnoreCase("Puerto Varas")) {
                System.out.println(t);
            }

        }
    }
}