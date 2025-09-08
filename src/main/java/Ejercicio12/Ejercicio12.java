
package Ejercicio12;


public class Ejercicio12 {
    public static void main(String[] args) {
        Robot[] robots = new Robot[4];
        robots[0] = new RobotCocina();
        robots[1] = new RobotLimpieza();
        robots[2] = new RobotCocina();
        robots[3] = new RobotLimpieza();
        
        for(Robot r : robots){
            r.realizarTarea();
        }
    }
    
}
