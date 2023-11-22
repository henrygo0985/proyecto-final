/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainrestaurante;

/**
 *
 * @author jdani
 */
public class Platillo {
    private int id;
    private String nombre;
    private int gastoIngredientes;
    private int precio;

    // Constructor
    public Platillo(int id, String nombre, int gastoIngredientes, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.gastoIngredientes = gastoIngredientes;
        this.precio = precio;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGastoIngredientes() {
        return gastoIngredientes;
    }

    public int getPrecio() {
        return precio;
    }
}
