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
public class Serie extends Video{
    private int capitulo;
    private int temporada;

    public Serie(int capitulo, int temporada, String titulo, String director, int año) {
        super(titulo, director, año);
        this.capitulo = capitulo;
        this.temporada = temporada;
    }

    @Override
    public String retornarInformacion() {
        return this.capitulo + this.temporada + super.toString();
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    
    
}
