# Llanquihue Tour

## Descripción

Aplicación desarrollada en Java para registrar y visualizar
entidades relacionadas con la agencia Llanquihue Tour.

El sistema utiliza programación orientada a objetos,
herencia, interfaces, polimorfismo, ArrayList, instanceof
y una interfaz gráfica básica mediante JOptionPane.

## Clases e interfaces

### Interfaz

- Registrable
  - Define el método mostrarResumen().

### Clase abstracta

- ServicioTuristico
  - Superclase de los servicios turísticos.

### Clases

- RutaGastronomica
- PaseoLacustre
- Guia
- GestorDatos
- Main

RutaGastronomica, PaseoLacustre y Guia implementan
la interfaz Registrable.

## Funcionalidades

- Registrar rutas gastronómicas.
- Registrar paseos lacustres.
- Registrar guías turísticos.
- Almacenar distintos objetos en un ArrayList<Registrable>.
- Identificar objetos mediante instanceof.
- Mostrar los registros usando polimorfismo.
- Ingresar y visualizar datos mediante JOptionPane.

## Estructura

    src
    ├── data
    │   └── GestorDatos.java
    ├── model
    │   ├── ServicioTuristico.java
    │   ├── Registrable.java
    │   ├── RutaGastronomica.java
    │   ├── PaseoLacustre.java
    │   └── Guia.java
    └── ui
    └── Main.java

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que esté configurado Java JDK 17 o superior.
3. Ejecutar la clase Main ubicada en el paquete ui.
4. Seleccionar una opción desde el menú mostrado mediante JOptionPane.

## Autor

Christopher Zuñiga