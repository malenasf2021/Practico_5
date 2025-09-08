
package Ejercicio10;


public class SensorPresion extends Sensor{

    @Override
    public void medir() {
        valor= (float) (Math.random()*100);
        System.out.println("Temperatura: " + valor + " grados Celsius");
    }
    
}
