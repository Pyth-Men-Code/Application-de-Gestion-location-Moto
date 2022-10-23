/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionparcmoto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class Magasin {
   
  //  public static void main(String [] args) throws IOException{
    String nomM="LouScoot";
    
    
    
    public void sauvegarde(scooter s, Parc p) {
        
        
        File file = new File("C://Users/ASUS/Desktop/gestion_parc_scooter.sql");
        if(!file.exists()){
            try{
            file.createNewFile();
            
        }
            catch(IOException e){
           e.printStackTrace();     
            }
    }
        else{
            try{
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            writer.close();
        }
            catch(IOException e){
                e.printStackTrace();
            }
}
}
}
