/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainrestaurante;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author jdani
 */

public class ManejoOrdenes {
    private Queue<Orden> colaOrdenes = new LinkedList<>();

    public void atenderCliente(Cliente cliente, Platillo platillo) {
        int monto = platillo.getPrecio() + platillo.getPrecio() / 10; // Aplicar el 10% de servicio
        Orden orden = new Orden(colaOrdenes.size(), cliente.getNombre(), platillo.getNombre(), monto);
        colaOrdenes.offer(orden);
    }

    public void procesarOrden() {
        Orden orden = colaOrdenes.poll();
        System.out.println("Procesando Orden - ID: " + orden.getId() + ", Cliente: " + orden.getNombreCliente() +
                ", Platillo: " + orden.getPlatillo() + ", Monto: " + orden.getMonto());
    }

    public void imprimirOrdenes() {
        for (Orden orden : colaOrdenes) {
            System.out.println("Orden - ID: " + orden.getId() + ", Cliente: " + orden.getNombreCliente() +
                    ", Platillo: " + orden.getPlatillo() + ", Monto: " + orden.getMonto());
        }
    }
}

