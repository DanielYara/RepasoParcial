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
public class VideoStreamming {
    private ArrayList<Video> videos;

    public VideoStreamming(ArrayList<Video> videos) {
        this.videos = videos;
    }
    
    public String listarVideos(){
        String listaVideos = "";
        for(Video video : videos){
            listaVideos += video;
        }
        return listaVideos;
    } 
    
    public ArrayList<Actor> listarActores(){
        ArrayList<Actor> actores = new ArrayList<>();
        for(Video video : videos){
            if(video instanceof Pelicula){
                Pelicula p = (Pelicula) video;
                actores.addAll(p.getActores());
            }
        }
        return actores;
    }
    
    //Para composicion
    public void addVideo(int capitulo, int temporada, String titulo, String director, int año){
        Serie serie = new Serie(capitulo, temporada, titulo, director, año);
        this.videos.add(serie);
    }
    
    public void addVideo(String titulo, String director, int año){
        Pelicula pelicula = new Pelicula(titulo, director, año);
        this.videos.add(pelicula);
    }
    
    public void addVideo(String genero, String titulo, String director, int año){
        Documental documental = new Documental(genero, titulo, director, año);
        this.videos.add(documental);
    }
    
    //Asociacion o agregacion
    public void addVideo(Video video){
        this.videos.add(video);
    }
    
    
    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
    
    
}
