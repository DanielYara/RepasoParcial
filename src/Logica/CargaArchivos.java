/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class CargaArchivos {
    
    public void Cargar(String ruta){
        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if(lectura.exists()){
            try{
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter("");
                String tipo = "";
                while(flujoEntrada.hasNext()){
                    tipo = flujoEntrada.next().trim();
                    if(tipo.equals("S")){
                        
                    } else if (tipo.equals(D)){
                        
                    } else if(tipo.equals(P)){
                        
                    }
                    
                    //Solo para prueba
                    System.out.println(tipo);
                }
            } catch 
        }
    }
    
}
