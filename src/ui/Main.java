package ui;

import data.GestorDatos;

import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;

import exception.RutInvalidoException;
import model.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RutInvalidoException {

        Scanner sc = new Scanner(System.in);

        GestorDatos g1 = new GestorDatos();

        Cliente clienteSeleccionado = null;
        ServicioTuristico servicioSeleccionado = null;



        System.out.println("Ingrese rut cliente: ");
        String rut = sc.nextLine();

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


        for(ServicioTuristico servicio : g1.getServicios()){

            if(servicio.getId().equals(id)){

               servicioSeleccionado = servicio;
               break;

            }

        }


        Reserva reserva = new Reserva(

                clienteSeleccionado,
                g1.getGuias().get(0),
                servicioSeleccionado,
                fecha
        );;

        reserva.mostrarDatos();








    }

}