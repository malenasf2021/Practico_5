
package Ejercicio8y9;
import java.util.Random;

public class Ejercicio8y9 { 
    public static void main(String[] args) { 
        InstrumentoMusical[] instrumentos = { new Guitarra(), new Piano(), new Guitarra(), new Piano() }; 
        String[] notas = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si"}; 
        Random r = new Random(); 
        
        for (InstrumentoMusical inst : instrumentos) { 
            String nota = notas[r.nextInt(notas.length)]; 
            inst.tocarNota(nota); 
        } 
    } 
}


