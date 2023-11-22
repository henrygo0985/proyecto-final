/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainrestaurante;

/**
 *
 * @author jdani
 */
public class Orden {
    private int id;
    private String nombreCliente;
    private String platillo;
    private int monto;

    public Orden(int id, String nombreCliente, String platillo, int monto) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.platillo = platillo;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPlatillo() {
        return platillo;
    }

    public int getMonto() {
        return monto;
    }
}
