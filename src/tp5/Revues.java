/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author Abdelkalek
 */
public class Revues extends documents {
    protected int mois ; 
    protected int annee ; 
    public Revues(int n, String t, int m , int a ) {
        super(n, t);
        this.mois = m ;
        this.annee= a ;
                
    }
     @Override
      public String toString()
    {
        return "le numero de document est"+this.Num+" le titre de document est : "+this.titre+" de mois  "+this.mois+" d'anne"+this.annee; 
   
    }
}
