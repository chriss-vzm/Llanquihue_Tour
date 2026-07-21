package data;

import exception.RutInvalidoException;
import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    private final ArrayList<Cliente> clientes;
    private final ArrayList<Guia> guias;
    private final ArrayList<ServicioTuristico> servicios;
    private final ArrayList<Proveedor> proveedores;
    private ArrayList<Reserva> reservas;

    public GestorDatos() {
        clientes = new ArrayList<>();
        guias = new ArrayList<>();
        servicios = new ArrayList<>();
        proveedores = new ArrayList<>();
        reservas = new ArrayList<>();

        cargarDatos();

    }


    public void cargarDatos(){
        cargarProveedores("Proveedores.txt");
        cargarClientes("Clientes.txt");
        cargarGuias("Guia.txt");
        cargarServicios("Servicios.txt");
    }

    // =========================================================
    // LECTURA DE PROVEEDORES
    // =========================================================


    public void cargarProveedores(String rutaArchivo){

        try (BufferedReader lector =
                     new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null){

                numeroLinea++;

                if(linea.isBlank()){
                    continue;
                }

                String[] datos = linea.split(";");

                String id = datos[0].trim();
                String nombre = datos[1].trim();
                String direccion = datos[2].trim();
                String numero = datos[3].trim();

                Proveedor proveedor = new Proveedor(
                        id,
                        nombre,
                        direccion,
                        numero
                );

                proveedores.add(proveedor);

            }

        } catch (IOException e){

            System.out.println(
                    "No se pudo leer el archivo de clientes: " +
                            e.getMessage()

            );
        }

    }


    // =========================================================
    // LECTURA DE CLIENTES
    // =========================================================

    public void cargarClientes(String rutaArchivo) {

        try (BufferedReader lector =
                     new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {

                numeroLinea++;

                if (linea.isBlank()) {
                    continue;
                }

                String[] datos = linea.split(";");


                try {

                    String nombre = datos[0].trim();
                    int edad = Integer.parseInt(datos[1].trim());
                    String telefono = datos[2].trim();
                    String rut = datos[3].trim();



                    Cliente cliente = new Cliente(
                            nombre,
                            edad,
                            telefono,
                            rut
                    );

                    clientes.add(cliente);

                } catch (RutInvalidoException e) {

                    System.out.println(
                            "RUT inválido en línea " + numeroLinea +
                                    ": " + e.getMessage()
                    );

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Edad inválida en línea " + numeroLinea
                    );
                }
            }

        } catch (IOException e) {

            System.out.println(
                    "No se pudo leer el archivo de clientes: " +
                            e.getMessage()
            );
        }
    }

    // =========================================================
    // LECTURA DE GUÍAS
    // =========================================================

    public void cargarGuias(String rutaArchivo) {

        try (BufferedReader lector =
                     new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {

                numeroLinea++;

                if (linea.isBlank()) {
                    continue;
                }

                String[] datos = linea.split(";");

                try {
                    String nombre = datos[0].trim();
                    int edad = Integer.parseInt(datos[1].trim());
                    String telefono = datos[2].trim();
                    String id = datos[3].trim();

                    Guia guia = new Guia(
                            nombre,
                            edad,
                            telefono,
                            id
                    );

                    guias.add(guia);

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Edad de guía inválida en línea " +
                                    numeroLinea
                    );
                }
            }

        } catch (IOException e) {

            System.out.println(
                    "No se pudo leer el archivo de guías: " +
                            e.getMessage()
            );
        }
    }

    // =========================================================
    // LECTURA DE SERVICIOS
    // =========================================================


    public void cargarServicios(String rutaArchivo) {

        try (BufferedReader lector =
                     new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {

                numeroLinea++;

                if (linea.isBlank()) {
                    continue;
                }

                String[] datos = linea.split(";");


                try {
                    String id = datos[0].trim();
                    String nombre = datos[1].trim();
                    double precio =
                            Double.parseDouble(datos[2].trim());

                    String idProveedor = datos[3].trim();
                    String datoEspecial = datos[4].trim();


                    ServicioTuristico servicio = null;

                    if (id.startsWith("RG")) {

                        int numeroParadas =
                                Integer.parseInt(datoEspecial);

                        servicio = new RutaGastronomica(
                                id,
                                nombre,
                                precio,
                                proveedores.get(0),
                                numeroParadas
                        );

                    } else if (id.startsWith("PL")) {

                        servicio = new PaseoLacustre(
                                id,
                                nombre,
                                precio,
                                proveedores.get(1),
                                datoEspecial
                        );

                    } else if (id.startsWith("EC")) {

                        servicio = new ExcursionCultural(
                                id,
                                nombre,
                                precio,
                                proveedores.get(2),
                                datoEspecial
                        );

                    } else {

                        System.out.println(
                                "Tipo de servicio desconocido en línea " +
                                        numeroLinea + ": " + id
                        );
                    }

                    if (servicio != null) {
                        servicios.add(servicio);
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Precio o número de paradas inválido " +
                                    "en línea " + numeroLinea
                    );
                }
            }

        } catch (IOException e) {

            System.out.println(
                    "No se pudo leer el archivo de servicios: " +
                            e.getMessage()
            );
        }
    }


    // =========================================================
    // GETTERS DE LAS LISTAS
    // =========================================================

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Guia> getGuias() {
        return guias;
    }

    public ArrayList<ServicioTuristico> getServicios() {
        return servicios;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
}