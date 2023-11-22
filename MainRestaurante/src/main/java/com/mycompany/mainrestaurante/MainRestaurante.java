

package com.mycompany.mainrestaurante;

/**
 *
 * @author jdani
 */
public class MainRestaurante {
    public static void main(String[] args) {
        // Crear platillos
        Platillo platillo1 = new Platillo(0, "Arroz con Pollo", 3000, 4000);
        Platillo platillo2 = new Platillo(1, "Carnita Roja", 4000, 6000);
        Platillo platillo3 = new Platillo(2, "Chifrijo", 3500, 6000);
        Platillo platillo4 = new Platillo(3, "Crepa", 1300, 3000);
        Platillo platillo5 = new Platillo(4, "Vigorón", 4200,7500);

        ListaCircularPlatillos listaPlatillos = new ListaCircularPlatillos();
        listaPlatillos.agregarPlatillo(platillo1);
        listaPlatillos.agregarPlatillo(platillo2);
        listaPlatillos.agregarPlatillo(platillo3);   
        listaPlatillos.agregarPlatillo(platillo4);
        listaPlatillos.agregarPlatillo(platillo5); 

        // Crear empleados
        Empleado empleado1 = new Empleado(0, "Daniel Cordero", "cocinero");
        Empleado empleado2 = new Empleado(1, "Maria Jose Obando", "cajero");
        Empleado empleado3 = new Empleado(2, "Sofia Romero", "mesera");
        Empleado empleado4 = new Empleado(3, "Josue Vargas", "lava platos");

        PilaEmpleados pilaEmpleados = new PilaEmpleados();
        pilaEmpleados.agregarEmpleado(empleado1);
        pilaEmpleados.agregarEmpleado(empleado2);
        pilaEmpleados.agregarEmpleado(empleado3);
        pilaEmpleados.agregarEmpleado(empleado4);

        // Crear clientes y gestionar ordenes
        Cliente cliente1 = new Cliente(1, "Alejandro");
        Cliente cliente2 = new Cliente(2, "Patricio");
        Cliente cliente3 = new Cliente(3, "Enrique");
        Cliente cliente4 = new Cliente(4, "Cristina");
        Cliente cliente5 = new Cliente(5, "Keisy");

        ManejoOrdenes manejoOrdenes = new ManejoOrdenes();

        // Asignar órdenes a clientes
        manejoOrdenes.atenderCliente(cliente1, listaPlatillos.obtenerPlatilloPorId(0)); // Orden para cliente1
        manejoOrdenes.atenderCliente(cliente2, listaPlatillos.obtenerPlatilloPorId(1)); // Orden para cliente2
        manejoOrdenes.atenderCliente(cliente3, listaPlatillos.obtenerPlatilloPorId(2)); // Orden para cliente3
        manejoOrdenes.atenderCliente(cliente4, listaPlatillos.obtenerPlatilloByNombre("Carnita Roja")); // Orden para cliente4
        manejoOrdenes.atenderCliente(cliente5, listaPlatillos.obtenerPlatilloByNombre("Vigorón")); // Orden para cliente5

        // Imprimir órdenes
        System.out.println("\nÓrdenes en Cola:");
        manejoOrdenes.imprimirOrdenes();

        // Imprimir platillos y empleados
        System.out.println("Lista de Platillos:");
        listaPlatillos.imprimirPlatillos();

        System.out.println("\nPila de Empleados:");
        pilaEmpleados.imprimirEmpleados();
    }
}