import net.salesianos.ListaInteligente.listaInteligente;
import net.salesianos.Videojuego.videojuego;
import net.salesianos.Utilidades.utilidades;
import javax.swing.JOptionPane;

//Esta es la calse principal del programa

public class Main {
    public static void main(String[] args) {

        ListaInteligente lista = new ListaInteligente();
        boolean salir = false;

        while (!salir) {

            String opcion = JOptionPane.showInputDialog(
                "MENU PRINCIPAL" +
                "1. Agregar videojuego" +
                "2. Editar videojuego" +
                "3. Eliminar videojuego" +
                "4. Mostrar lista ordenada" +
                "5. Salir"
            );

            if (opcion == null) {
                salir = true;
            } else if (opcion.equals("1")) {

                String titulo = utilidades.pedirTitulo("Titulo: ");
                String genero = utilidades.pedirGenero("Genero: ");
                int año = utilidades.pedirAño("Año: ");
                int puntuacion = utilidades.pedirPuntuacion("Puntuacion: ");

                    videojuego v = new videojuego(titulo, genero, año, puntuacion);
                    lista.agregarVideojuego(v);
               
                } else if (opcion.equals("2")) {
                    

                }

            }

        }
















    }
}
