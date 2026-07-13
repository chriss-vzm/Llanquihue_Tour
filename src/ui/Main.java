package ui;

import data.GestorDatos;
import javax.swing.JOptionPane;
import model.Guia;
import model.PaseoLacustre;
import model.Registrable;
import model.RutaGastronomica;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        int opcion;

        do {

            String menu = """
                    LLANQUIHUE TOUR

                    1. Registrar ruta gastronómica
                    2. Registrar paseo lacustre
                    3. Registrar guía
                    4. Mostrar registros
                    5. Salir
                    """;

            String entrada = JOptionPane.showInputDialog(menu);

            if (entrada == null) {
                opcion = 5;
            } else {

                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    opcion = 0;
                }
            }

            switch (opcion) {

                case 1 -> {

                    String nombre = JOptionPane.showInputDialog(
                            "Ingrese el nombre de la ruta:"
                    );

                    int duracion = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Ingrese la duración en horas:"
                            )
                    );

                    int paradas = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Ingrese el número de paradas:"
                            )
                    );

                    RutaGastronomica ruta =
                            new RutaGastronomica(
                                    nombre,
                                    duracion,
                                    paradas
                            );

                    gestor.agregarRegistro(ruta);

                    JOptionPane.showMessageDialog(
                            null,
                            "Ruta registrada correctamente."
                    );
                }

                case 2 -> {

                    String nombre = JOptionPane.showInputDialog(
                            "Ingrese el nombre del paseo:"
                    );

                    int duracion = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Ingrese la duración en horas:"
                            )
                    );

                    String embarcacion =
                            JOptionPane.showInputDialog(
                                    "Ingrese el tipo de embarcación:"
                            );

                    PaseoLacustre paseo =
                            new PaseoLacustre(
                                    nombre,
                                    duracion,
                                    embarcacion
                            );

                    gestor.agregarRegistro(paseo);

                    JOptionPane.showMessageDialog(
                            null,
                            "Paseo registrado correctamente."
                    );
                }

                case 3 -> {

                    String nombre = JOptionPane.showInputDialog(
                            "Ingrese el nombre del guía:"
                    );

                    String telefono = JOptionPane.showInputDialog(
                            "Ingrese el teléfono:"
                    );

                    Guia guia = new Guia(nombre, telefono);

                    gestor.agregarRegistro(guia);

                    JOptionPane.showMessageDialog(
                            null,
                            "Guía registrado correctamente."
                    );
                }

                case 4 -> {

                    if (gestor.getRegistros().isEmpty()) {

                        JOptionPane.showMessageDialog(
                                null,
                                "No existen registros."
                        );

                    } else {

                        String texto = "";

                        for (Registrable registro : gestor.getRegistros()) {

                            if (registro instanceof RutaGastronomica) {

                                texto += "Tipo: Ruta gastronómica\n";

                            } else if (registro instanceof PaseoLacustre) {

                                texto += "Tipo: Paseo lacustre\n";

                            } else if (registro instanceof Guia) {

                                texto += "Tipo: Guía turístico\n";
                            }

                            texto += registro.mostrarResumen();
                            texto += "\n\n";
                        }

                        JOptionPane.showMessageDialog(
                                null,
                                texto,
                                "Registros",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }

                case 5 -> JOptionPane.showMessageDialog(
                        null,
                        "Programa finalizado."
                );

                default -> JOptionPane.showMessageDialog(
                        null,
                        "Opción inválida."
                );
            }

        } while (opcion != 5);
    }
}