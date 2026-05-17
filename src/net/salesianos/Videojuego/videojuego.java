package net.salesianos.Videojuego;

// Esta clase representa un videojuego con sus atributos y metodos

public class videojuego {

    private String titulo;
    private String genero;
    private int año;
    private int puntuacion;

    public videojuego(String titulo, String genero, int año, int puntuacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.puntuacion = puntuacion;
    }

     public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    @Override
    public String toString(){
        return titulo + " (" + año + ") - " + genero + " - Puntuacion: " + puntuacion;
    }

}