
package Ejercicio6y7;

abstract class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
     public abstract void accionEspecial();
    
}
