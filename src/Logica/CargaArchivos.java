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
import videostreamming.*;

/**
 *
 * @author Estudiante
 */
public class CargaArchivos {
    private VideoStreamming videoStreaming;
    
    public void Cargar(String ruta){
        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if(lectura.exists()){
            try{
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String tipo = null, titulo = null, año = null, director = null, genero = null;
                int temporada = 0, capitulo = 0;
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
                        videoStreaming.addVideo(serie);
                        //Si fuera composicion
                        videoStreaming.addVideo(capitulo, temporada, titulo, director, annio);
                    } else if (tipo.equals("D")){
                        titulo = flujoEntrada.next().trim();
                        año = flujoEntrada.next().trim();
                        int annio = Integer.parseInt(año);
                        director = flujoEntrada.next().trim();
                        genero = flujoEntrada.next().trim();
                        //Agregacion
                        Documental d = new Documental(genero, titulo, director, annio);
                        videoStreaming.addVideo(d);
                        //Composicion
                        videoStreaming.addVideo(genero, titulo, director, annio);
                    } else if(tipo.equals("P")){
                        
                    }
                    
                    //Solo para prueba
                    System.out.println(tipo);
                }
            } catch (FileNotFoundException e){
                System.out.println("No se encontro el archivo");
            }
        }
    }
    
}
