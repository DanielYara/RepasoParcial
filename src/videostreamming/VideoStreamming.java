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

    public VideoStreamming() {
        this.videos = new ArrayList<>();
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
