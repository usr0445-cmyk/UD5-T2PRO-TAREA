package net.salesianos.Utilidades;

import javax.swing.JOptionPane;

public class utilidades {
    
    // Esta clase es para la validacion y la solicitud de datos de usuario


    public static int pedirEntero(String mensaje){
        while (true) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        } catch (Exception e) {
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
