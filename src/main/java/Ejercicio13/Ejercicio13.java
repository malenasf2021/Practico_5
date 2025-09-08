
package Ejercicio13;


public class Ejercicio13 {
    public static void main(String[] args) {
        VehiculoAereo[] unVehiculoAereo = new VehiculoAereo[4];
        unVehiculoAereo[0] = new Avion();
        unVehiculoAereo[1] = new Helicoptero();
        unVehiculoAereo[2] = new Avion();
        unVehiculoAereo[3] = new Helicoptero();
    
    int posicion=1;
    for (VehiculoAereo v : unVehiculoAereo){
        v.despegar();
        System.out.println("Posición: " + posicion);
        posicion = posicion + 1;
    }
    }
}
