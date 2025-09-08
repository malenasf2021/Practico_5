
package Ejercicio6y7;


public class Guerrero extends Personaje{

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }
    
    @Override
    public void accionEspecial() {
        System.out.println("Soy el Guerrero de nombre: " + nombre + " y estoy en el nivel: " + nivel);
    }
    
}
