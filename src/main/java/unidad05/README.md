# Unidad 5: Estructuras de Almacenamiento
Este módulo se centra en el manejo de colecciones de datos del mismo tipo bajo un solo nombre, permitiendo gestionar grandes volúmenes de información de manera eficiente.

## Arrays Unidimensionales (Vectores)
Un array es una estructura de datos que contiene una colección finita de elementos del mismo tipo.

Declaración e Inicialización: En Java se define el tipo seguido de corchetes.

```java
int[] numeros = new int[5]; // Array de 5 enteros inicializados a 0.
int[] valores = {10, 20, 30}; // Inicialización directa.
```

> Índices: el acceso siempre empieza en **0** y termina en **longitud - 1**.

Propiedad `.length`: devuelve el número total de elementos del array.

## Operaciones con Arrays
Para recorrer arrays se utilizan bucles `for` tradicionales o el bucle `for-each` para lectura.

**Ordenación**

Para ordenarlos existes varios algoritmos. El más usado es el **algoritmo de la burbuja** o el uso de `Arrays.sort()` de la API de Java.

**Búsqueda**

De entre otros métodos, los más conocidos son:

* Búsqueda **secuencial**: recorre uno a uno todos los elementos del array (para arrays desordenados). 
* Búsqueda **binaria**: es mucho más rápida que la secuencial, pero **requiere que el array esté previamente ordenado.**

## Arrays Multidimensionales (Matrices)
Son "arrays de arrays". La forma más común es la **bidimensional** (filas y columnas). Se llama así porque requiere de dos dimensiones para localizar cualquier elemento en la matriz.

> Por ese motivo los arrays o vectores son de una sóla dimensión: sólo necesitan un índice para localizar cualquier elemento. 

La declaración de una matriz es similar a la del array, pero añadiendo tantos pares de corchetes como dimensiones (2 en el caso de la matriz):

```java
int[][] matriz = new int[filas][columnas];
```

Para acceder a cualquier elemento en la matriz hay que usar dos índices, por ejemplo
`matriz[0][1]` para acceder a la primera fila, segunda columna.

Podemos recorrer todos los elementos de la matriz mediante **bucles anidados** (un `for`
dentro de otro).

## Cadenas de Caracteres (Strings)
En Java, los `Strings` no son tipos primitivos, sino **objetos**.

Se dice que son **inmutables**. Esto significa que, una vez creado un objeto `String`,
**su contenido no puede cambiar**. Cuando cambiamos el texto de un `String` realmente se
crea un nuevo objeto en memoria.

Los métodos clave son:

| Método   | Descripción                                           |
|----------|-------------------------------------------------------|
| `length()` | Longitud de la cadena                                 |
| `charAt(int i)` | Carácter en la posición i                             |
| `equals(String s)` | Comparación de contenido ( **¡No se debe usar ==!** ) |
| `substring(int inicio, int fin)` | Extrae una parte de la cadena                         |

> Para comparar dos cadenas de texto se debe usar el método `equals(String s)`.
> Usar cualquier operador de comparación (`==`, `!=`) es un error, ya que éstos comprueban
> que dos objetos String sean la misma instancia, que apunten al mismo objeto en memoria.

### StringBuffer / StringBuilder
Clases alternativas a `String` que almacen texto **mutable**. Se usan cuando necesitamos modificar cadenas frecuentemente sin penalizar el rendimiento.

> Puedes ver ejemplos de clase [aquí](./cadenas).

## Expresiones regulares (regexp)
Encontrar un patrón en un texto es complicado con las funcionalidades básicas que nos ofrece `String`.
Pero usando expresiones regulares podemos encontrar ocurrencias de un patrón concreto en cualquier texto de forma rápida y eficiente.

Para ello podemos usar el método `String.matches(expresión regular)` o las clases `Pattern` y `Matcher`.

> Puedes ver ejemplos de clase [aquí](./expresionesRegulares).

## Arrays como Parámetros
Los arrays son objetos. Por tanto, cuando se pasan a los métodos lo que se pasa realmente es su referencia a memoria. Esto significa que si el método modifica el contenido del array, los cambios se mantienen fuera del método.

**Funciones variádicas**

Permiten que un método reciba un número indeterminado de argumentos usando la sintaxis `tipo... nombre`.

## Estructuras Dinámicas (Colecciones)
A diferencia de los arrays, estas estructuras pueden cambiar su tamaño en memoria durante la ejecución del programa. En Java, se encuentran principalmente en el paquete `java.util`.

### Listas (interfaz `List`)
Las listas son objetos que implementan la interfaz `List`: `ArrayList`, `LinkedList`, etc.

La estructura dinámica más utilizada es el `ArrayList`. **Internamente usa un array** que se redimensiona automáticamente.

En cualquier caso, las listas permiten el **acceso rápido por índice**.

Ejemplo de declaración:

```java
ArrayList<String> lista = new ArrayList<>();
```

Métodos principales:

| Método   | Descripción                                                                                          |
|----------|------------------------------------------------------------------------------------------------------|
| `add(elemento)` | Añade al final                                                                                       |
| `get(indice)` | Recupera el elemento (equivalente a `array[i]`)                                                      |
| `remove(indice)` | Elimina el elemento en la posición indicada. Cuidado! Si te pasas, salta una excepción.              |
| `remove(objeto)` | Elimina el elemento indicado. Para ello es necesario definir equals/hashCode en la clase del objeto. |
| `size()` | Devuelve el número de elementos |


### Conjuntos (interfaz `Set`)
Colecciones que **no permiten elementos duplicados**. Existen varias estructuras que implementan `Set`: `HashSet`, `LinkedHashSet` o `TreeSet`, entre otras.

Se usan para **evitar duplicados de una lista**.

`HashSet`: no garantiza el orden de los elementos. Es el `Set` más rápido.

`LinkedHashSet`: los elementos están dispuestos según orden de llegada.

`TreeSet`: mantiene los elementos ordenados automáticamente.


> **IMPORTANTE**
> 
> Para que un `Set` pueda comprobar si contiene o no un elemento, dicho objeto debe tener implementados los métodos `equals/hashCode`,
> ya que los usará para comparar el objeto a insertar con cada uno de los que contiene. 


### Mapas (interfaz `Map`)
Estructuras que almacenan parejas de **Clave - Valor**. Las más conocidas son: `HashMap`, `LinkedHashMap` y `TreeMap`.

Cada clave es única y se utiliza para recuperar su valor asociado de forma casi instantánea.

En otros lenguajes esta estructura se conoce también como **diccionario**, ya que la similitud es obvia: 
en un diccionario la "Clave" es la palabra y el "Valor" es la definición.

```java
HashMap<String, Integer> edades = new HashMap<>();
edades.put("Juan", 20);
System.out.println(edades.get("Juan")); // Imprime 20
```

## Tipos Genéricos (<T>)
Las colecciones de Java utilizan **genéricos**. Esto permite especificar qué tipo de objetos va a guardar la colección, lo que evita errores de ejecución y la necesidad de hacer _castings_ manuales.

> Así, por ejemplo, `ArrayList<Integer>` garantiza que solo se guarden números enteros.

## Diferencias: Estáticas vs. Dinámicas

| Característica | Arrays (Estáticas)                                                                   | Colecciones (Dinámicas)                              |
|----------------|--------------------------------------------------------------------------------------|------------------------------------------------------|
| Tamaño         | Fijo al inicio.                                                                      | Variable.                                            |
| Tipos de datos | Primitivos / Objetos.                                                                | Solo objetos (Wrappers).                             |
| Rendimiento    | Más rápidos y ligeros.                                                               | Algo más pesados pero flexibles.                     |
| Métodos        | Poca variedad.<br/>De ahí que surgiera la clase `Arrays`. | Gran variedad y potencia (ordenar, buscar, filtrar). |