# Programación 2 – Lista de ejercicios Práctico 5

| Ejercicio | Letra: | Nota: |
|-----------|-------------|-----------------------|
| **6 y 7** | Crea una clase abstracta `Personaje` con atributos `nombre` y `nivel`. Define un **método abstracto** `accionEspecial()`. Implementa las clases `Mago` y `Guerrero`, cada una con su propia versión de `accionEspecial()`. En el `main`, crea un **arreglo polimórfico** de `Personaje` con al menos 4 elementos combinando `Mago` y `Guerrero`. Haz que todos ejecuten su `accionEspecial()` y muestra el resultado en pantalla. | Crear un arreglo polimórfico de `Personaje` con 4 elementos. Ejecutar `accionEspecial()` de todos y mostrar resultados. |
| **8 y 9** | Crea una clase base `InstrumentoMusical` con un **método abstracto** `tocarNota(String nota)`. Implementa `Guitarra` y `Piano` con comportamientos distintos al tocar la misma nota. En el `main`, crea un arreglo de `InstrumentoMusical` con distintos instrumentos y haz que toquen una **secuencia de notas aleatorias**. | En el `main`, crear un arreglo de instrumentos y tocar una secuencia de notas aleatorias. |
| **10** | Diseña una clase `Sensor` con atributo `valor` y método `medir()`. Hereda `SensorTemperatura` y `SensorPresion` con su propia forma de generar valores simulados. En el `main`, usa un arreglo de `Sensor` y muestra las mediciones obtenidas. | Crear un arreglo de `Sensor` y mostrar las mediciones obtenidas. |
| **11** |Crea una clase `PlataformaStreaming` con un método abstracto `reproducirContenido()`. Implementa `Netflix` y `YouTube` con comportamientos diferentes. Crea un **arreglo polimórfico** y haz que cada plataforma reproduzca 3 contenidos distintos. | Crear un arreglo polimórfico y reproducir 3 contenidos distintos por plataforma. |
| **12** | Implementa una clase `Robot` con un **método abstracto** `realizarTarea()`. Crea subclases `RobotLimpieza` y `RobotCocina`. En el `main`, usa un **arreglo** de `Robot` y haz que cada uno ejecute su tarea. | Crear un **arreglo** de `Robot` y ejecutar las tareas de cada uno. |
| **13** | Diseña una **clase abstracta** `VehiculoAereo` con **método abstracto** `despegar()`. Implementa `Avion` y `Helicoptero`. Crea un **arreglo polimórfico** con diferentes vehículos y muestra el orden de despegue según la posición en el arreglo. | Crear un arreglo polimórfico y mostrar el orden de despegue según la posición en el arreglo. |
| **14** | Crea un arreglo de `Figura` (**abstracta**) con **subclases** `Poligono` y `Estrella`. Haz que el programa detecte, mediante `instanceof`, cuántos elementos son de cada tipo y lo muestre en pantalla. | Detectar, mediante `instanceof`, cuántos elementos son de cada tipo y mostrarlo en pantalla. |
| **15** | Simula una carrera de `Vehiculo` (subclases `Auto` y `Moto`) en la que cada vehículo avanza una distancia aleatoria en cada turno. Usa un **arreglo polimórfico** para los competidores y determina el ganador al final de 5 rondas. | Cada vehículo avanza una distancia aleatoria por turno. Determinar ganador al final de 5 rondas usando un arreglo polimórfico. |








