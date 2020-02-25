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
public class Livre extends documents {
    protected String auteur ; 
    protected  int nbr_page ; 
    public Livre(int n, String t, String a ,int i ) {
        super(n, t);
        this.auteur = a ; 
        this.nbr_page = i ; 
    }

    public Livre(int n, String t) {
        super(n, t);
    }
    @Override
    public String toString()
    {
        return "le numero de document est"+this.Num+" le titre de document est : "+this.titre+" l'auteur est :"+this.auteur+" le nombre de page est :"+this.nbr_page; 
   
    }
}
