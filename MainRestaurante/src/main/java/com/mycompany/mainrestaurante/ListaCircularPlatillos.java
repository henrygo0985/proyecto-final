/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainrestaurante;
import java.util.LinkedList;
import java.util.Stack;
/**
 *
 * @author jdani
 */
public class ListaCircularPlatillos {
    private LinkedList<Platillo> lista = new LinkedList<>();

    public void agregarPlatillo(Platillo platillo) {
        lista.add(platillo);
        lista.addFirst(lista.removeLast());
    }

    public void imprimirPlatillos() {
        for (Platillo platillo : lista) {
            System.out.println("ID: " + platillo.getId() + ", Nombre: " + platillo.getNombre() + ", Gasto en ingredientes: " + platillo.getGastoIngredientes() + ", Precio: " + platillo.getPrecio());
        }
    }
     public Platillo obtenerPlatilloPorId(int id) {
        for (Platillo platillo : lista) {
            if (platillo.getId() == id) {
                return platillo;
            }
        }
        return null;
    }

    public Platillo obtenerPlatilloByNombre(String nombre) {
        for (Platillo platillo : lista) {
            if (platillo.getNombre().equals(nombre)) {
                return platillo;
            }
        }
        return null;
    }
}


