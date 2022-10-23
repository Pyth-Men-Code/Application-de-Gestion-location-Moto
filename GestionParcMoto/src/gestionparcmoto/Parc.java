/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionparcmoto;

/**
 *
 * @author ASUS
 */
public class Parc {
 String NomP;
int NbrScoEnLocation;
int NbrScoDispo;
private int km_moy;
int NbrT;
    
 public Parc( String n ,int l, int d ,int kM ,int nT){
this. NbrScoEnLocation=l;
this.NbrScoDispo=d;
this.km_moy=kM;
this.NbrT=nT;

}
public Parc(){
}
public   void km_moy(scooter[]killom){
    int [] killo = new int[NbrT];
  int i ;
  int somme=0;
  for( i=0 ;i<killo.length;i++){
  somme+=killo[i];
  this.km_moy= somme/NbrT;
  
}
}  
public int  nbr_sco(scooter [] num_id){
this.NbrT = num_id.length;
return NbrT;
      
  }
}
