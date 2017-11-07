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

    
    
}
