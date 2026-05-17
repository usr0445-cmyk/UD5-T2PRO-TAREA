# UD5-T2PRO-TAREA - Gestión de Videojuegos 

## Objetivos del proyecto
El objetivo de este proyecto es desarrollar una aplicación en Java que permita gestionar una lista de videojuegos utilizando una *lista inteligente*.  
El programa debe cumplir los siguientes puntos:

- Crear una clase elemento (`videojuego`) con varios atributos.
- Almacenar los objetos en una lista inteligente y gestionarlos mediante sus métodos.
- Utilizar `JOptionPane` para solicitar y mostrar información al usuario.
- Modularizar el código mediante clases con métodos estáticos para validación y entrada de datos.
- Implementar un menú que permita añadir, editar, mostrar, eliminar y ordenar los elementos.
- Controlar excepciones para evitar que el programa se rompa.
- Documentar cada clase con un comentario explicando su finalidad.

## Manual de usuario

Al ejecutar el programa, aparecerá un menú con las siguientes opciones:

### 1. Agregar videojuego
El usuario introduce:
- Título  
- Género  
- Año  
- Puntuación  

El videojuego se añade a la lista inteligente.


### 2. Editar videojuego
El usuario introduce el índice del videojuego que desea modificar.  
Después, introduce los nuevos datos y el registro se actualiza.


### 3. Eliminar videojuego
El usuario introduce el índice del videojuego que quiere eliminar.  
Si el índice es válido, el elemento se borra de la lista.


### 4. Mostrar lista ordenada
La aplicación ordena los videojuegos por **puntuación descendente** y muestra la lista completa mediante `JOptionPane`.


### 5. Salir
Finaliza la ejecución del programa.


## Requisitos técnicos cumplidos
- Java  
- `javax.swing.JOptionPane`  
- `ArrayList`  
- Manejo de excepciones con `try/catch`  
- Código modular y comentado  


## ✔️ Conclusión
Este proyecto implementa una aplicación sencilla, modular y robusta para gestionar videojuegos utilizando una lista inteligente, cumpliendo todos los requisitos funcionales establecidos.