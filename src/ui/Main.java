package ui;

import data.GestorDatos;
import model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorDatos gestor = new GestorDatos();

        Cliente clienteSeleccionado = null;
        Guia guiaSeleccionado = null;
        ServicioTuristico servicioSeleccionado = null;


        while (clienteSeleccionado == null) {

            System.out.println("Ingrese RUT del cliente, sin puntos y con guion:");
            String rut = sc.nextLine().trim();

            if (!rut.matches("\\d{7,8}-[0-9Kk]")) {
                System.out.println("Formato incorrecto. Ejemplo: 20282564-9");
                continue;
            }

            for (Cliente cliente : gestor.getClientes()) {
                if (cliente.getRut().equalsIgnoreCase(rut)) {
                    clienteSeleccionado = cliente;
                    break;
                }
            }

            if (clienteSeleccionado == null) {
                System.out.println("No existe un cliente con ese RUT.");
            }
        }


        while (guiaSeleccionado == null) {

            System.out.println("Ingrese ID del guía:");
            String idGuia = sc.nextLine().trim();

            if (idGuia.isBlank()) {
                System.out.println("El ID no puede estar vacío.");
                continue;
            }

            for (Guia guia : gestor.getGuias()) {
                if (guia.getId().equalsIgnoreCase(idGuia)) {
                    guiaSeleccionado = guia;
                    break;
                }
            }

            if (guiaSeleccionado == null) {
                System.out.println("No existe un guía con ese ID.");
            }
        }


        while (servicioSeleccionado == null) {

            System.out.println("Ingrese ID del servicio:");
            String idServicio = sc.nextLine().trim();

            if (idServicio.isBlank()) {
                System.out.println("El ID no puede estar vacío.");
                continue;
            }

            for (ServicioTuristico servicio : gestor.getServicios()) {
                if (servicio.getId().equalsIgnoreCase(idServicio)) {
                    servicioSeleccionado = servicio;
                    break;
                }
            }

            if (servicioSeleccionado == null) {
                System.out.println("No existe un servicio con ese ID.");
            }
        }


        String fecha;

        while (true) {

            System.out.println("Ingrese fecha de inicio en formato dd/mm/aaaa:");
            fecha = sc.nextLine().trim();

            if (fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
                break;
            }

            System.out.println("Formato de fecha incorrecto. Ejemplo: 25/07/2026");
        }

        Reserva reserva = new Reserva(
                clienteSeleccionado,
                guiaSeleccionado,
                servicioSeleccionado,
                fecha
        );


        reserva.mostrarDatos();

    }
}