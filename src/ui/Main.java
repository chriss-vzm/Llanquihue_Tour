package ui;

import data.GestorDatos;



import exception.RutInvalidoException;
import model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RutInvalidoException {

        Scanner sc = new Scanner(System.in);

        GestorDatos g1 = new GestorDatos();

        Cliente clienteSeleccionado = null;
        Guia guiaSeleccionado = null;
        ServicioTuristico servicioSeleccionado = null;



        System.out.println("Ingrese rut cliente: ");
        String rut = sc.nextLine();

        System.out.println("Ingrese id Guia.txt: ");
        String idG = sc.nextLine();

        System.out.println("Ingrese id Servicio: ");
        String id = sc.nextLine();

        System.out.println("Ingrese fecha de Inicio: ");
        String fecha = sc.nextLine();



        for(Cliente cliente : g1.getClientes()){

            if(cliente.getRut().equals(rut)){

                clienteSeleccionado = cliente;
                break;
            }
        }

        for(Guia guia : g1.getGuias()){

            if(guia.getId().equals(idG)){

                guiaSeleccionado = guia;
                break;
            }

        }


        for(ServicioTuristico servicio : g1.getServicios()){

            if(servicio.getId().equals(id)){

               servicioSeleccionado = servicio;
               break;

            }

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