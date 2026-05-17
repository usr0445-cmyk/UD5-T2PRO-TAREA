import net.salesianos.ListaInteligente.listaInteligente;
import net.salesianos.Videojuego.videojuego;
import net.salesianos.Utilidades.utilidades;
import javax.swing.JOptionPane;

//Esta es la clase principal del programa

public class Main {
    public static void main(String[] args) {

        //Aqui usamos la lista inteligente donde se guardaran los videojuegos
        listaInteligente lista = new listaInteligente();

        //Una variable que controla cuando salir del programa
        boolean salir = false;

        while (!salir) {

        //Mostrara una ventana con un menu de opciones para el usuario
        String opcion = JOptionPane.showInputDialog(
            "MENU PRINCIPAL" +
            "1. Agregar videojuego" +
            "2. Editar videojuego" +
            "3. Eliminar videojuego" +
            "4. Mostrar lista ordenada" +
            "5. Salir"
        );

        //Si el usuario cierra la ventana, se saldra del programa, por eso el null
        if (opcion == null) {
            salir = true;
            //Usamos equals porque es un string
        } else if (opcion.equals("1")) {

        //El metodo utilidades muestra el JOptionPane y validan para que el usuario no rompa esto
        String titulo = utilidades.pedirTexto("Titulo: ");
        String genero = utilidades.pedirTexto("Genero: ");
        int año = utilidades.pedirEntero("Año: ");
        int puntuacion = utilidades.pedirEntero("Puntuacion: ");

        //Creamos el objeto videojuego con los datos ingresados y despues se añadira a la lista
        videojuego v = new videojuego(titulo, genero, año, puntuacion);
        lista.agregarVideojuego(v);
               
        } else if (opcion.equals("2")) {

        //Indice para que pueda edirar el juego
        int index = utilidades.pedirEntero("Ingrese el indice del videojuego a editar: ");

        String titulo = utilidades.pedirTexto("Nuevo titulo: ");
        String genero = utilidades.pedirTexto("Nuevo genero: ");
        int año = utilidades.pedirEntero("Nuevo año: ");
        int puntuacion = utilidades.pedirEntero("Nueva puntuacion: ");


        videojuego v = new videojuego(titulo, genero, año, puntuacion);

        //Se reemplaza el videojuego en la lista
        lista.editarVideojuego(index, v);

        } else if (opcion.equals("3")) {

        int index = utilidades.pedirEntero("Indice que se va a elminar:");
        lista.eliminarVideojuego(index);

        } else if (opcion.equals("4")) {

        //Ordena la lista por puntuacion de mayor a menor y luego muestra la lista ordenada con JOptionPane
        lista.ordenarPorPuntuacionDesc();
        JOptionPane.showMessageDialog(null, lista.obtenerTodos());
     

            //Nos salimos
        } else if (opcion.equals("5")) {
            salir = true;
        }
        }

        }


    }

