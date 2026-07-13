package ui;

import data.GestorDatos;
import model.Guia;
import model.PaseoLacustre;
import model.Registrable;
import model.RutaGastronomica;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorDatos datos = new GestorDatos();
        List<Registrable> registros = datos.crearServicios();


        for(Registrable r : registros){

            r.mostrarResumen();

            if (r instanceof RutaGastronomica){
                System.out.println("Es un servicio Gastronómico.");
            }
            if(r instanceof PaseoLacustre){
                System.out.println("Es un servicio de Excursión.");
            }
            if(r instanceof Guia){
                System.out.println("Es un guía.");
            }

            System.out.println();

        }

    }
}

