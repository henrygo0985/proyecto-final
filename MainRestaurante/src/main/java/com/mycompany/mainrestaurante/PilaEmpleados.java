/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainrestaurante;

import java.util.Stack;

/**
 *
 * @author jdani
 */
public class PilaEmpleados {
    private Stack<Empleado> pila = new Stack<>();

    public void agregarEmpleado(Empleado empleado) {
        pila.push(empleado);
    }

    public void imprimirEmpleados() {
        if (!pila.isEmpty()) {
            Empleado empleado = pila.pop();
            System.out.println("ID: " + empleado.getId() + ", Nombre: " + empleado.getNombre() + ", Puesto: " + empleado.getPuesto());
            imprimirEmpleados();
            pila.push(empleado);
        }
    }
}
