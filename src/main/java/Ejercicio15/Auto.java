
package Ejercicio15;

//Subclase Auto que hereda de Vehiculo

import java.util.Random;

class Auto extends Vehiculo {
    //Objeto para random para generar los avances aleatorios
    private Random random = new Random();


    //Constructor que llama al constructor de la clase padre con super
    public Auto(String nombre) {
        super(nombre);
    }


    //Implementación del método avanzar() para Autos
    public void avanzar() {
        //Los vehículos avanzan entre 5 y 10 “metros”
        int avance = random.nextInt(6) + 5;
        
        //Suma el avance a la distancia total recorrida
        distanciaRecorrida += avance;

        System.out.println("El auto: " + nombre + " avanza " + avance + " metros. Total recorrido: " + distanciaRecorrida);
    }
}

