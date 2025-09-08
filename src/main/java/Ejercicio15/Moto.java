
package Ejercicio15;

//Subclase Moto que hereda de Vehiculo

import java.util.Random;

class Moto extends Vehiculo {
    //Objeto para random para generar los avances aleatorios
    private Random random = new Random();
    
    //Constructor que llama al constructor de la clase padre con super
    public Moto(String nombre) {
        super(nombre);
    }


    //Implementación del método avanzar() para Motos
    public void avanzar() {
        //Las motos avanzan entre 5 y 10 “metros”
        int avance = random.nextInt(6) + 5;

        //Suma el avance a la distancia total recorrida
        distanciaRecorrida += avance;

        System.out.println("La moto: " + nombre + " avanza " + avance + " metros. Total recorrido: " + distanciaRecorrida);
    }
}

