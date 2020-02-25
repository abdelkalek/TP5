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
public class Manuels extends Livre {
   private int niv_scolaire ; 
    public Manuels(int n, String t, String a, int i ,int niv) {
        super(n, t, a, i);
        this.niv_scolaire = niv ; 
        
    }
     @Override
    public String toString()
    {
        return "le numero de document est"+this.Num+" le titre de document est : "+this.titre+" l'auteur est :"+this.auteur+" le nombre de page est :"+this.niv_scolaire; 
   
    }
    
}
