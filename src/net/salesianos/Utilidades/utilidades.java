package net.salesianos.Utilidades;

import javax.swing.JOptionPane;

public class utilidades {
    
    // Esta clase es para la validacion y la solicitud de datos de usuario

    //Usamos try catch para evitar que el programa se rompa

    public static int pedirEntero(String mensaje){
        while (true) {
        try {
            //Integer.parseInt convierte el texto escrito a un numero entero
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        } catch (Exception e) {
            //El JOptionPane.showMessageDialog mostrara un mensaje de error al usuario
            JOptionPane.showMessageDialog(null, "Valor invalido. Intenta de nuevo.");
            }
        }

    }

    public static String pedirTexto(String mensaje) {
        String texto = JOptionPane.showInputDialog(mensaje);
        if (texto == null) return "";
        return texto;
    }

}
