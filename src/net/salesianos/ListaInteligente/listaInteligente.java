package net.salesianos.ListaInteligente;
import net.salesianos.Videojuego.videojuego;
import java.util.ArrayList;

// Esta clase gestiona un lista de videojuegos

public class listaInteligente {

    private ArrayList<videojuego> lista = new ArrayList<>();

    public void agregarVideojuego(videojuego v){
        lista.add(v);
    }

    public void editarVideojuego(int index, videojuego v){
        if(index >= 0 && index < lista.size()){
            lista.set(index, v);
        }
    }

    public void eliminarVideojuego(int index){
        if(index >= 0 && index < lista.size()){
            lista.remove(index);
        }
    }

    public ArrayList<videojuego> obtenerTodos(){
        return lista;
    }

    public void ordenarPorPuntuacionDesc() {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).getPuntuacion() < lista.get(j + 1).getPuntuacion()) {

                    videojuego caja = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, caja);
                }
            }
        }
    }

}
