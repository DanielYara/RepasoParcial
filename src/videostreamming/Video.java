/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostreamming;

/**
 *
 * @author Estudiante
 */
public abstract class Video {
    protected String titulo;
    protected String director;
    protected int año;

    public Video(String titulo, String director, int año) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
    }
    
    public abstract String retornarInformacion();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", director=" + director + ", a\u00f1o=" + año + '}';
    }

    
    
}
