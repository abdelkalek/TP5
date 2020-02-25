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
public class Romans extends Livre  {
    private double prix ;
 
    public Romans(int n, String t, String a, int i,double p) {
        super(n, t, a, i);
        this.prix= p ; 
    }
     @Override
    public String toString()
    {
        return "le numero de document est"+this.Num+" le titre de document est : "+this.titre+" l'auteur est :"+this.auteur+" le nombre de page est :"+this.nbr_page+" leur prix est "+this.prix; 
   
    }
    
}
