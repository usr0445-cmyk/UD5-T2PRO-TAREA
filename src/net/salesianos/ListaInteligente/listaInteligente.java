package net.salesianos.ListaInteligente;
import net.salesianos.Videojuego.videojuego;
import java.util.ArrayList;

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

}
