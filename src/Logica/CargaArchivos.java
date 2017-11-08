/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import videostreamming.*;

/**
 *
 * @author Estudiante
 */
public class CargaArchivos {
    private VideoStreamming videoStreamming;

    public CargaArchivos() {
        this.videoStreamming = new VideoStreamming();
    }
    
    public String listarVideos(){
        String listaVideos = "";
        for(Video video : this.videoStreamming.getVideos()){
            listaVideos += video.retornarInformacion();
        }
        return listaVideos;
    } 
    
    public ArrayList<Actor> listarActores(){
        ArrayList<Actor> actores = new ArrayList<>();
        for(Video video : this.videoStreamming.getVideos()){
            if(video instanceof Pelicula){
                Pelicula p = (Pelicula) video;
                actores.addAll(p.getActores());
            }
        }
        return actores;
    }
    
    public void Cargar(String ruta){
        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if(lectura.exists()){
            try{
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String tipo = null, titulo = null, año = null, director = null, genero = null;
                int temporada = 0, capitulo = 0, aux = 0;
                Pelicula pelicula = null;
                while(flujoEntrada.hasNext()){
                    tipo = flujoEntrada.next().trim();
                    if(tipo.equals("S")){
                        titulo = flujoEntrada.next().trim();
                        año = flujoEntrada.next().trim();
                        int annio = Integer.parseInt(año);
                        director = flujoEntrada.next().trim();
                        temporada = flujoEntrada.nextInt();
                        capitulo = flujoEntrada.nextInt();
                        //Si fuera agregacion
                        Serie serie = new Serie(capitulo, temporada, titulo, director, annio);
                        videoStreamming.addVideo(serie);
                    } else if (tipo.equals("D")){
                        titulo = flujoEntrada.next().trim();
                        año = flujoEntrada.next().trim();
                        int annio = Integer.parseInt(año);
                        director = flujoEntrada.next().trim();
                        genero = flujoEntrada.next().trim();
                        //Agregacion
                        Documental d = new Documental(genero, titulo, director, annio);
                        videoStreamming.addVideo(d);
                    } else if(tipo.equals("P")){
                        titulo = flujoEntrada.next().trim();
                        año = flujoEntrada.next().trim();
                        int annio = Integer.parseInt(año);
                        director = flujoEntrada.next().trim();
                        pelicula = new Pelicula(titulo, director, annio);
                        videoStreamming.addVideo(pelicula);
                    } else if(tipo.equals("N")){
                           String nombre = flujoEntrada.next().trim();
                           String apellido = flujoEntrada.next().trim();
                           Actor actor = new Actor(nombre, apellido);
                           pelicula.addActor(actor);
                    }  
                    }
                    //Solo para prueba
                    //System.out.println(tipo);
            } catch (FileNotFoundException e){
                Logger.getLogger(CargaArchivos.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
}
