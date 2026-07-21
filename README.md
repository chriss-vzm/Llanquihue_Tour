# Llanquihue Tour

Sistema desarrollado en **Java** para administrar información relacionada con una agencia de turismo de la zona del lago Llanquihue.

La aplicación permite cargar clientes, guías y servicios turísticos desde archivos de texto, buscar registros mediante sus identificadores y crear reservas relacionando un cliente, un guía y un servicio turístico.

## Objetivo del proyecto

El proyecto busca mejorar la organización de las reservas de una agencia turística. En lugar de mantener la información dispersa, el sistema permite centralizar los datos principales y relacionarlos mediante objetos de tipo `Reserva`.

Cada reserva contiene:

* Un cliente.
* Un guía turístico.
* Un servicio turístico.
* Una fecha de inicio.

## Funcionalidades

* Carga de clientes desde un archivo de texto.
* Carga de guías turísticos desde un archivo de texto.
* Carga de servicios turísticos desde un archivo de texto.
* Registro de proveedores.
* Búsqueda de clientes mediante su RUT.
* Búsqueda de guías mediante su identificador.
* Búsqueda de servicios mediante su identificador.
* Creación de reservas.
* Almacenamiento de reservas en un `ArrayList`.
* Visualización del detalle completo de una reserva.
* Validación del formato del RUT mediante una excepción personalizada.
* Manejo de diferentes tipos de servicios mediante herencia y polimorfismo.

## Tecnologías utilizadas

* Java.
* Programación orientada a objetos.
* IntelliJ IDEA.
* Git y GitHub.
* Archivos de texto para la carga de datos.

## Conceptos aplicados

Durante el desarrollo se utilizaron los siguientes conceptos de programación:

* Clases y objetos.
* Encapsulamiento.
* Herencia.
* Polimorfismo.
* Clases abstractas.
* Interfaces.
* Composición de objetos.
* Sobrescritura de métodos.
* Colecciones `ArrayList`.
* Lectura de archivos con `BufferedReader`.
* Manejo de excepciones.
* Excepciones personalizadas.
* Búsqueda de objetos mediante identificadores.

## Estructura del proyecto

```text
Llanquihue_Tour
├── src
│   ├── data
│   │   └── GestorDatos.java
│   │
│   ├── exception
│   │   └── RutInvalidoException.java
│   │
│   ├── model
│   │   ├── Cliente.java
│   │   ├── ExcursionCultural.java
│   │   ├── Guia.java
│   │   ├── Mostrable.java
│   │   ├── PaseoLacustre.java
│   │   ├── Persona.java
│   │   ├── Proveedor.java
│   │   ├── Reserva.java
│   │   ├── RutaGastronomica.java
│   │   └── ServicioTuristico.java
│   │
│   ├── resources
│   │   ├── clientes.txt
│   │   ├── guias.txt
│   │   └── servicios.txt
│   │
│   └── ui
│       └── Main.java
│
├── .gitignore
└── README.md
```

## Descripción de las clases principales

### `Persona`

Clase base que contiene los datos comunes de las personas registradas en el sistema.

### `Cliente`

Representa a un cliente de la agencia. Contiene información personal y utiliza el RUT como identificador principal.

### `Guia`

Representa al guía encargado de acompañar y dirigir una actividad turística.

### `ServicioTuristico`

Clase padre de los diferentes servicios ofrecidos por la agencia. Permite trabajar con distintos tipos de servicios mediante polimorfismo.

### `RutaGastronomica`

Servicio turístico enfocado en recorridos gastronómicos. Incluye información específica, como la cantidad de paradas.

### `PaseoLacustre`

Servicio turístico realizado en el lago. Incluye información relacionada con el tipo de embarcación utilizada.

### `ExcursionCultural`

Servicio turístico orientado a la visita de lugares culturales o históricos.

### `Proveedor`

Representa a la empresa o persona encargada de proporcionar un servicio turístico.

### `Reserva`

Relaciona los objetos necesarios para registrar una actividad turística:

```text
Reserva
├── Cliente
├── Guia
├── ServicioTuristico
└── Fecha de inicio
```

### `GestorDatos`

Se encarga de administrar la información del sistema.

Entre sus responsabilidades se encuentran:

* Leer los archivos de texto.
* Crear los objetos correspondientes.
* Guardar clientes, guías y servicios en colecciones.
* Buscar registros mediante sus identificadores.
* Registrar y almacenar reservas.

### `Mostrable`

Interfaz utilizada para definir el comportamiento de las clases que pueden mostrar su información o un resumen de sus datos.

### `RutInvalidoException`

Excepción personalizada utilizada cuando el RUT ingresado no cumple con el formato establecido por el sistema.

## Archivos de datos

Los datos iniciales se almacenan en la carpeta:

```text
src/resources
```

Los archivos utilizados son:

```text
clientes.txt
guias.txt
servicios.txt
```

Cada línea contiene la información necesaria para construir un objeto. Los datos se separan mediante un delimitador y son procesados utilizando métodos como:

```java
readLine();
split();
trim();
```

## Funcionamiento general

El sistema sigue este proceso:

1. Se crea una instancia de `GestorDatos`.
2. El gestor carga los clientes, guías y servicios desde los archivos de texto.
3. El usuario ingresa el RUT del cliente.
4. El usuario ingresa el identificador del guía.
5. El usuario ingresa el identificador del servicio.
6. El sistema busca los objetos correspondientes.
7. Si todos los objetos existen, se crea una reserva.
8. La reserva se guarda en la colección de reservas.
9. Finalmente, se muestra el detalle del cliente, guía, servicio y fecha seleccionada.

## Ejemplo de creación de una reserva

```java
Reserva reserva = new Reserva(
        clienteSeleccionado,
        guiaSeleccionado,
        servicioSeleccionado,
        fechaInicio
);

gestorDatos.getReservas().add(reserva);
```

La clase `Reserva` almacena referencias a los objetos seleccionados. Por esta razón, desde una reserva se puede acceder al detalle completo de cada elemento relacionado.

## Requisitos

Para ejecutar el proyecto se necesita:

* Java JDK 17 o superior.
* IntelliJ IDEA o cualquier IDE compatible con Java.
* Los archivos de la carpeta `resources` correctamente ubicados.

## Ejecución

1. Clonar el repositorio:

```bash
git clone https://github.com/chriss-vzm/Llanquihue_Tour.git
```

2. Abrir la carpeta del proyecto en IntelliJ IDEA.

3. Configurar un JDK compatible.

4. Verificar que existan los archivos de texto dentro de:

```text
src/resources
```

5. Ejecutar la clase:

```text
src/ui/Main.java
```

## Estado del proyecto

Proyecto académico en desarrollo.

Actualmente permite cargar los datos principales, relacionar objetos y crear reservas. Como mejoras futuras se podrían incorporar:

* Menú completo para registrar varias reservas.
* Validaciones para todos los datos ingresados.
* Guardado permanente de las reservas en un archivo.
* Modificación y eliminación de reservas.
* Interfaz gráfica más completa.
* Generación automática de identificadores.
* Validación completa del dígito verificador del RUT.

## Autor

**Christopher Zuñiga**

Estudiante de Analista Programador Computacional.
