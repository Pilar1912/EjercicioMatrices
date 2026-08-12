# EjercicioMatrices

Este proyecto es una pequeña aplicación en Java que trabaja con matrices de dos tipos:

- matrices formadas por enteros (`int[][]`)
- matrices formadas por objetos de tipo `ObjMatriz`

La idea principal es demostrar cómo se puede crear un menú interactivo para llenar y mostrar matrices, usando tanto tipos primitivos como objetos para almacenar cada valor.

---

## Descripción general del proyecto

El programa solicita al usuario la dimensión de la matriz y luego muestra un menú con varias opciones:

1. llenar una matriz de enteros
2. mostrar la matriz de enteros
3. llenar una matriz de objetos
4. mostrar la matriz de objetos
5. salir

Para esto, se separan las responsabilidades en tres archivos principales:

- `Menu.java`: controla la interfaz y el flujo del programa
- `metodos.java`: contiene las acciones para llenar y mostrar matrices
- `ObjMatriz.java`: representa cada posición de la matriz como un objeto

---

## 1) Menu.java

`Menu.java` es la clase principal del programa, ya que contiene el método `main`, que es el punto de entrada de la aplicación.

### ¿Qué hace?

- crea un `Scanner` para leer la entrada del usuario
- solicita la dimensión `n` de la matriz cuadrada
- declara dos arreglos bidimensionales:
  - `int[][] ME`: para la matriz de enteros
  - `ObjMatriz[][] MO`: para la matriz de objetos
- entra en un ciclo `while` para mostrar el menú repetidamente hasta que el usuario decida salir
- toma la opción elegida por el usuario con `nextInt()`
- según la opción, invoca los métodos de la clase `metodos`

### Flujo principal

1. Se pide la dimensión de la matriz.
2. Se crea la matriz de enteros y la matriz de objetos con esa dimensión.
3. Se muestra el menú.
4. Dependiendo de la opción:
   - `1`: llena la matriz de enteros con valores aleatorios
   - `2`: imprime la matriz de enteros en pantalla
   - `3`: llena la matriz de objetos con valores aleatorios
   - `4`: imprime la matriz de objetos en pantalla
   - `5`: termina el programa
   - cualquier otra opción: muestra un mensaje de error

### Importancia del archivo

Este archivo es el encargado de coordinar todo el comportamiento del programa. Es decir, conecta la interacción con el usuario con las operaciones reales que están implementadas en la clase `metodos`.

---

## 2) metodos.java

`metodos.java` contiene la lógica encargada de realizar todas las operaciones sobre las matrices.

### ¿Qué hace?

Esta clase tiene varios métodos públicos que permiten:

#### a) `LLenarMatrizEntera(int[][] m)`

- recorre la matriz completa con dos ciclos `for`
- genera un número aleatorio entre 1 y 50
- lo guarda en cada posición de la matriz
- devuelve la matriz ya llena

Ejemplo de lógica:

```java
m[i][j] = (int) (Math.random() * 50 + 1);
```

Esto produce valores aleatorios dentro del rango solicitado.

#### b) `MostrarMatrizEntera(int[][] m)`

- recorre cada fila y cada columna
- imprime cada valor de la matriz en la consola
- usa `System.out.print()` para mostrar los números de forma ordenada
- agrega `System.out.println()` al final de cada fila para crear una nueva línea

#### c) `LlenarMatrizObjetual(ObjMatriz[][] m)`

- recorre la matriz de objetos
- en cada posición crea un nuevo objeto `ObjMatriz`
- asigna un número aleatorio entre 1 y 50 al atributo `dato` del objeto
- guarda ese objeto dentro de la matriz
- devuelve la matriz llena

Este método muestra cómo se puede representar una matriz con objetos en lugar de simplemente usar números enteros.

#### d) `MostrarMatrizObjetual(ObjMatriz[][] m)`

- recorre la matriz de objetos
- por cada posición accede al valor `dato` del objeto con `getDato()`
- lo imprime en consola

### Importancia del archivo

Este archivo encapsula la lógica de negocio de la aplicación: llenar y mostrar la matriz. Es el “motor” del programa, mientras que `Menu.java` solo lo usa desde la interfaz.

---

## 3) ObjMatriz.java

`ObjMatriz.java` define la clase `ObjMatriz`, que sirve como una especie de contenedor para guardar un dato numérico dentro de la matriz.

### ¿Qué contiene?

La clase tiene un atributo:

```java
int dato;
```

Este atributo guarda el valor de cada posición de la matriz cuando se trabaja con objetos.

### Constructores

La clase tiene dos constructores:

- `ObjMatriz(int dato)`: inicializa el objeto con un valor concreto
- `ObjMatriz()`: constructor vacío, útil para crear un objeto y luego asignarle el valor con `setDato()`

### Métodos de acceso

- `getDato()`: devuelve el valor almacenado en el atributo `dato`
- `setDato(int dato)`: cambia el valor del atributo `dato`

### Importancia del archivo

Este archivo permite representar cada elemento de la matriz como un objeto en lugar de como un valor puro. Esto puede ser útil para comprender conceptos de programación orientada a objetos y para mostrar cómo una matriz puede contener estructuras más complejas que un simple `int`.

---

## Resumen del funcionamiento completo

El programa funciona así:

1. El usuario indica la dimensión de la matriz.
2. El menú ofrece distintas opciones.
3. `Menu.java` llama a los métodos correspondientes de `metodos.java`.
4. El método llena la matriz con valores aleatorios.
5. La matriz puede ser de enteros o de objetos.
6. El usuario puede ver la matriz en pantalla y continuar interactuando hasta que elija salir.

---

## Conclusión

Los tres archivos cumplen funciones distintas pero complementarias:

- `Menu.java` controla la interacción del usuario.
- `metodos.java` ejecuta las operaciones sobre las matrices.
- `ObjMatriz.java` define la estructura de dato utilizada para la matriz orientada a objetos.

En conjunto, forman una aplicación simple pero clara para trabajar con matrices y practicar conceptos básicos de Java, matrices, objetos y entrada/salida por consola.