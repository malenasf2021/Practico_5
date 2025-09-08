# Programación 2 – Lista de ejercicios Práctico 5

| Ejercicio | Descripción | Nota: |
|-----------|-------------|-----------------------|
| **6 y 7** | Clase abstracta `Personaje` con `nombre` y `nivel`. Método abstracto `accionEspecial()`. Subclases `Mago` y `Guerrero`. | Crear un arreglo polimórfico de `Personaje` con 4 elementos. Ejecutar `accionEspecial()` de todos y mostrar resultados. |
| **8 y 9** | Clase base `InstrumentoMusical` con método abstracto `tocarNota(String nota)`. Subclases `Guitarra` y `Piano`. | En el `main`, crear un arreglo de instrumentos y tocar una secuencia de notas aleatorias. |
| **10** | Clase `Sensor` con atributo `valor` y método `medir()`. Subclases `SensorTemperatura` y `SensorPresion`. | Crear un arreglo de `Sensor` y mostrar las mediciones obtenidas. |
| **11** | Clase `PlataformaStreaming` con método abstracto `reproducirContenido()`. Subclases `Netflix` y `YouTube`. | Crear un arreglo polimórfico y reproducir 3 contenidos distintos por plataforma. |
| **12** | Clase `Robot` con método abstracto `realizarTarea()`. Subclases `RobotLimpieza` y `RobotCocina`. | Crear un arreglo de `Robot` y ejecutar las tareas de cada uno. |
| **13** | Clase abstracta `VehiculoAereo` con método `despegar()`. Subclases `Avion` y `Helicoptero`. | Crear un arreglo polimórfico y mostrar el orden de despegue según la posición en el arreglo. |
| **14** | Clase abstracta `Figura` con subclases `Poligono` y `Estrella`. | Detectar, mediante `instanceof`, cuántos elementos son de cada tipo y mostrarlo en pantalla. |
| **15** | Simulación de carrera de `Vehiculo` con subclases `Auto` y `Moto`. | Cada vehículo avanza una distancia aleatoria por turno. Determinar ganador al final de 5 rondas usando un arreglo polimórfico. |

# Códigos: 
## Ejercicios 6 y 7
Crea una clase abstracta `Personaje` con atributos `nombre` y `nivel`. Define un método abstracto
`accionEspecial()`. Implementa las clases `Mago` y `Guerrero`, cada una con su propia versión de
`accionEspecial()`.

**Main:**
```java
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
```

**Clase personaje:**
```java
abstract class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
     public abstract void accionEspecial();
}
```

**Clase Mago:**
```java
public class Mago extends Personaje {

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void accionEspecial() {
        System.out.println("Soy el Mago de nombre: " + nombre + " y estoy en el nivel: " + nivel);
    }
}
```
**Clase Guerrero:**
```java
public class Guerrero extends Personaje{

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }
    
    @Override
    public void accionEspecial() {
        System.out.println("Soy el Guerrero de nombre: " + nombre + " y estoy en el nivel: " + nivel);
    }
}
```
## Ejercicios 8 y 9
Crea una clase base `InstrumentoMusical` con un método abstracto `tocarNota(String nota)`.
Implementa `Guitarra` y `Piano` con comportamientos distintos al tocar la misma nota.
En el `main`, crea un **arreglo** de `InstrumentoMusical` con distintos instrumentos y haz que toquen una
secuencia de notas aleatorias.
**Main:**
```java
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
```
**Instrumento musical:**
```java
abstract class InstrumentoMusical {
    
    public abstract void tocarNota(String nota);

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); 
    } 
}
```
**Guitarra:**
```java
public class Guitarra extends InstrumentoMusical {

    @Override
    public void tocarNota(String nota) {
        System.out.println("La guitarra toca la nota: " + nota);
    }
}
```
**Piano:**
```java
public class Piano extends InstrumentoMusical{

    @Override
    public void tocarNota(String nota) {
       System.out.println("El piano toca la nota: " + nota);
    }
}
```
## Ejercicio 10

## Ejercicio 11

## Ejercicio 12

## Ejercicio 13

## Ejercicio 14

## Ejercicio 15
