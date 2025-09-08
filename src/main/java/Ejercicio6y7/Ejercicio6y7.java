/*
Ejercicio 6 – Crea una clase abstracta Personaje con atributos nombre y nivel. 
Define un método abstracto accionEspecial(). 
Implementa las clases Mago y Guerrero, cada una con su propia versión de accionEspecial().

Ejercicio 7 - En el main, crea un arreglo polimórfico de Personaje con al menos 4 elementos 
combinando Mago y Guerrero. Haz que todos ejecuten su accionEspecial() y muestra el resultado en pantalla.
*/
package Ejercicio6y7;


public class Ejercicio6y7 {

    public static void main(String[] args) {
        Personaje[] unPersonaje = new Personaje[4];
        unPersonaje[0]= new Mago ("Gandalf", 1);
        unPersonaje[1]= new Guerrero ("Xena", 2);
        unPersonaje[2]= new Mago ("Merlín", 3);
        unPersonaje[3]= new Guerrero ("He-man", 4);
    
    for (Personaje p : unPersonaje){
        p.accionEspecial();
    }

    }
   
}
