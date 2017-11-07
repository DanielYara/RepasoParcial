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
public class Documental extends Video{
    private String genero;

    public Documental(String genero, String titulo, String director, int año) {
        super(titulo, director, año);
        this.genero = genero;
    }

    @Override
    public String retornarInformacion() {
        return this.genero + "" + super.toString();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
}
