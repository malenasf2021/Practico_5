
package Ejercicio10;


public class SensorTemperatura extends Sensor{

    @Override
    public void medir() {
        valor= (float) (Math.random()*200);
        System.out.println("Presión: " + valor + " hPa");
    }
    
}
