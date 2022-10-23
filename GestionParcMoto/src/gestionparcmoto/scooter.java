/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 *
 * @author ASUS
 */
package gestionparcmoto; 
import gestionparcmoto.connexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.Debug.id;
  // Import the File class                         


public class scooter {
int num_id,killom;
String modéle;
 String etat;
Parc x;
public scooter(int id,String m,int km, String e){
        this.modéle= m;
        this.killom = km;
        this.etat=e;
        this.num_id=id;
        
    }

 public scooter(){}
 public String etat(){
 return "le modéle est 'yamaha'le numéro d'identifiacation est'02' le le "
 + "killométrage '100' son etat est'disponible ',"
 + " il appartient à parc de 'lewis' ";
  }
public void Location(int id){
connexion c1 = new connexion();
Statement s = c1.getStmt();
    try {
   s.execute(" select `num_id` from `scooter` WHERE `scooter`.`num_id` ="+id); 
       c1.close();
      } catch (SQLException ex) {
       Logger.getLogger(scooter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void Réception( int id, int km){
        connexion c1 = new connexion();
        Statement s = c1.getStmt();
        try {
  s.execute(" UPDATE `gestion_parc_scooter`.`scooter` SET `killom` = '"
    +this.killom+km + "' WHERE `scooter`.`num_id`="+id); 
   c1.close();
     } catch (SQLException ex) {
     Logger.getLogger(scooter.class.getName()).log(Level.SEVERE, null, ex);
        }
}
       
         
     }
  


