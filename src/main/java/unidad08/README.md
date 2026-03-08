# Unidad 8: Flujos y Ficheros
Resumen de contenidos sobre el almacenamiento **persistente** de datos, gestión de archivos
y flujos (_streams_) en Java.

## 1. Conceptos Fundamentales
**Archivo/Fichero**: conjunto de información relacionada estructurada en unidades menores llamadas registros.

**Registro**: estructura de datos que contiene información sobre un elemento concreto. Se divide en campos.

**Campo**: unidad mínima de información (ej. NIF, Nombre). El campo que identifica unívocamente a un registro se llama clave.

**Memoria secundaria**: soporte no volátil (discos duros, USB) donde se almacenan los archivos, a diferencia de la RAM (volátil).

**Registro físico (bloque)**: cantidad de información que el SO transfiere en una sola operación de E/S. El **factor de bloqueo** es el número de registros lógicos por registro físico.


## 2. Tipos de Organización
️La organización determina cómo se estructuran físicamente los datos:

* **Secuencial**: los registros se graban uno tras otro. Para leer el registro `n`, hay que leer los `n - 1` anteriores.
* **Relativa (Directa/Aleatoria)**: permite acceder directamente a un registro mediante su ubicación. Se suelen usar **funciones Hash** para convertir una clave en una dirección física.
* **Indexada**: el archivo consta de un **área primaria** (datos) y un **área de índices** (diccionario) para búsquedas rápidas.

## 3. Flujos (Streams) en Java
Java utiliza el concepto de flujo para mover datos entre el programa y el exterior.

* Con buffer vs sin buffer: los flujos con buffer (como `BufferedReader`) acumulan datos en memoria para reducir los accesos físicos al disco, mejorando el rendimiento.
* Método `flush()`: fuerza el envío de los datos acumulados en el buffer antes de que se llene.

## 4. Clases Principales de Java

| Categoría          | Clases de Salida (Escritura)                        | Clases de Entrada (Lectura) |
|--------------------|-----------------------------------------------------|-----------------------------|
| Genérica           | `File` (gestión de archivos: borrar, renombrar, etc.) | -                           |
| Binaria            | `FileOutputStream`                                    | `FileInputStream`           |
| Texto (Caracteres) | `FileWriter`                                          | `FileReader`                |
| Tipos Primitivos   | `DataOutputStream`                                    | `DataInputStream`           |
| Objetos            | `ObjectOutputStream` (Serialización)                  |                             |
| Acceso Aleatorio   | `RandomAccessFile` (Lectura/Escritura directa)        | -                           |

## 5. Operaciones Comunes

* Gestión de archivos: uso de `exists()`, `createNewFile()`, `delete()` y `renameTo()` de la clase `File`.
* Lectura/Escritura: uso de métodos como `read()`, `write()`, `readLine()` (en Buffers).
* Borrado de registros: en archivos secuenciales es complejo; se suele marcar el registro como "no válido" o crear un archivo temporal nuevo excluyendo el registro borrado.
* Posicionamiento: en acceso aleatorio se usa `seek` (posicion) para mover el puntero de lectura/escritura.