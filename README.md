# Programación 2 – Lista de ejercicios Práctico 5

| Ejercicio | Letra: | Nota: |
|-----------|-------------|-----------------------|
| **6 y 7** | Crea una clase abstracta Personaje con atributos nombre y nivel. Define un método abstracto accionEspecial(). Implementa las clases Mago y Guerrero, cada una con su propia versión de accionEspecial(). En el main, crea un arreglo polimórfico de Personaje con al menos 4 elementos combinando Mago y Guerrero. Haz que todos ejecuten su accionEspecial() y muestra el resultado en pantalla. | Crear un arreglo polimórfico de `Personaje` con 4 elementos. Ejecutar `accionEspecial()` de todos y mostrar resultados. |
| **8 y 9** | Clase base `InstrumentoMusical` con método abstracto `tocarNota(String nota)`. Subclases `Guitarra` y `Piano`. | En el `main`, crear un arreglo de instrumentos y tocar una secuencia de notas aleatorias. |
| **10** | Clase `Sensor` con atributo `valor` y método `medir()`. Subclases `SensorTemperatura` y `SensorPresion`. | Crear un arreglo de `Sensor` y mostrar las mediciones obtenidas. |
| **11** | Clase `PlataformaStreaming` con método abstracto `reproducirContenido()`. Subclases `Netflix` y `YouTube`. | Crear un arreglo polimórfico y reproducir 3 contenidos distintos por plataforma. |
| **12** | Clase `Robot` con método abstracto `realizarTarea()`. Subclases `RobotLimpieza` y `RobotCocina`. | Crear un arreglo de `Robot` y ejecutar las tareas de cada uno. |
| **13** | Clase abstracta `VehiculoAereo` con método `despegar()`. Subclases `Avion` y `Helicoptero`. | Crear un arreglo polimórfico y mostrar el orden de despegue según la posición en el arreglo. |
| **14** | Clase abstracta `Figura` con subclases `Poligono` y `Estrella`. | Detectar, mediante `instanceof`, cuántos elementos son de cada tipo y mostrarlo en pantalla. |
| **15** | Simulación de carrera de `Vehiculo` con subclases `Auto` y `Moto`. | Cada vehículo avanza una distancia aleatoria por turno. Determinar ganador al final de 5 rondas usando un arreglo polimórfico. |

Crea una clase abstracta Personaje con atributos nombre y nivel. Define un método abstracto
accionEspecial(). Implementa las clases Mago y Guerrero, cada una con su propia versión de
accionEspecial().
En el main, crea un arreglo polimórfico de Personaje con al menos 4 elementos combinando Mago
y Guerrero. Haz que todos ejecuten su accionEspecial() y muestra el resultado en pantalla.
