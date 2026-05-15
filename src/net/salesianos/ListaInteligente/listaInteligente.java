package net.salesianos.ListaInteligente;
import net.salesianos.Videojuego.videojuego;
import java.util.ArrayList;

public class listaInteligente {

    private ArrayList<videojuego> lista = new ArrayList<>();

    public void agregarVideojuego(videojuego v){
        lista.add(v);
    }

}
