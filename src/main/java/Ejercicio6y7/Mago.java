/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6y7;

/**
 *
 * @author Malena
 */
public class Mago extends Personaje {

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void accionEspecial() {
        System.out.println("Soy el Mago de nombre: " + nombre + " y estoy en el nivel: " + nivel);
    }
    
}
