
package Ejercicio10;


public class Ejercicio10 {
    public static void main(String[] args) {
        Sensor[] sensores = {new SensorTemperatura(), new SensorPresion()};
        
        /* Sensor[] sensores = new Sensor[2];
sensores[0] = new SensorTemperatura();
sensores[1] = new SensorPresion(); */

        for (Sensor s : sensores) {
            s.medir();
        }
    }
}
