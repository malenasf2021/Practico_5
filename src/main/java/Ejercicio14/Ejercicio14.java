
package Ejercicio14;


public class Ejercicio14 {
    public static void main(String[] args) {
         Figura figuras []= new Figura [4];
         figuras[0]= new Poligono ();
         figuras[1]= new Estrella ();
         figuras[2]= new Poligono ();
         figuras[3]= new Estrella ();
         
         int cantPoligonos=0;
         int cantEstrellas=0;
         
         for(Figura f : figuras){
             
             /*instance of sirve para identificar si un objeto es de un tipo específico, arroja T o F*/
             if (f instanceof Poligono){
                 cantPoligonos++;
             }else{
                 cantEstrellas++;
             }
         }
         System.out.println("Cantidad de polígonos: "+ cantPoligonos);
         System.out.println("Cantidad de Estrellas: "+ cantEstrellas);
    }
}
