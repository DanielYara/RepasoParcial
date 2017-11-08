/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Logica.CargaArchivos;
import videostreamming.VideoStreamming;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CargaArchivos carga = new CargaArchivos();
        carga.Cargar("videoStreamming.csv");
        String videos = carga.listarVideos();
        System.out.println(videos);
    }
    
}
