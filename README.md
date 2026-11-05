# Fase1APE5-3-ejercicios

## Universidad Técnica de Ambato

**Asignatura:** Algoritmos y Lógica de Programación  
**Tema:** Creación, Lectura y Escritura de Ficheros  
**Estudiante:** Julio Terán
**Modalidad:** Individual

---

## Descripción

Desarrolle los 3 ejercicios indicadados en clase de manera individual. Realice un archivo en pdf y coloque el link del repositorio del github.

## Objetivo

Aplicar los conocimientos de Java para realizar operaciones básicas con archivos de texto mediante las clases y métodos correspondientes.

## Ejercicios desarrollados

### Ejercicio 1. Crear un fichero en Java

**Enunciado:**

Desarrollar un programa en Java que permita crear un archivo de texto llamado `curso.txt`.

**Indicaciones:**

1. Importar las clases necesarias para trabajar con archivos.
2. Crear un objeto de tipo File.
3. Utilizar el método `createNewFile()` para crear el archivo.
4. Comprobar si el archivo se creó correctamente o si ya existe.
5. Mostrar el nombre del archivo utilizando `getName()`.
6. Utilizar try-catch para controlar posibles errores.

**Clases y métodos sugeridos:**

- File
- IOException
- createNewFile()
- getName()

### Ejercicio 2. Escribir información en un fichero

**Enunciado:**

Desarrollar un programa en Java que permita ingresar un mensaje por teclado y almacenarlo en un archivo de texto existente llamado `estudiantes.txt`.

**Indicaciones:**

1. Importar las clases necesarias.
2. Crear un objeto Scanner para ingresar información por teclado.
3. Solicitar al usuario que escriba un mensaje.
4. Utilizar FileWriter para abrir el archivo estudiantes.txt.
5. Utilizar el parámetro true para conservar la información anterior y agregar el nuevo mensaje al final.
6. Utilizar el método `write()` para guardar el mensaje.
7. Cerrar el archivo utilizando `close()`.
8. Mostrar un mensaje indicando que la información se guardó correctamente.
9. Controlar posibles errores mediante try-catch.

**Clases y métodos sugeridos:**

- Scanner
- FileWriter
- IOException
- write()
- close()

**Nota:** El archivo estudiantes.txt debe existir previamente.

### Ejercicio 3. Eliminar un fichero en Java

**Enunciado:**

Desarrollar un programa en Java que permita eliminar el archivo de texto `estudiantes.txt`.

**Indicaciones:**

1. Importar la clase necesaria para trabajar con archivos.
2. Crear un objeto de tipo File indicando el nombre del archivo que se desea eliminar.
3. Utilizar el método `delete()` para intentar eliminar el archivo.
4. Comprobar si la eliminación se realizó correctamente.
5. Si el archivo se eliminó, mostrar un mensaje de confirmación.
6. Si no se pudo eliminar, mostrar un mensaje indicando el problema.

**Clases y métodos sugeridos:**

- File
- delete()
- if-else
- System.out.println()</WriteingBlock>

## Conclusión

La práctica permitió comprender cómo crear, escribir y eliminar archivos de texto en Java, aplicando las clases y métodos de manejo de ficheros.
