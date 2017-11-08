/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostreamming;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pelicula extends Video{
    ArrayList<Actor> actores;

    public Pelicula(String titulo, String director, int año) {
        super(titulo, director, año);
        this.actores = new ArrayList<>();
    }
    //Asociacion o agregacion
    public void addActor(Actor actor){
        this.actores.add(actor);
    }
    //Composicion
    public void addActor(String nombre, String apellido){
        Actor actor = new Actor(nombre, apellido);
        this.actores.add(actor);
    }

    @Override
    public String retornarInformacion() {
        String informacion = "";
        for(Actor actor : actores)
            informacion += "nombre: " + actor.getNombre() + ", apellido: " +  actor.getApellidos() + " ";
        informacion += super.toString();
        return informacion;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }
    
    
    
}
