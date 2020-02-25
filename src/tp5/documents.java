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
public class documents {
    protected int Num ; 
    protected String titre ;
    public documents(int n , String  t)
    {
        this.Num = n; 
        this.titre = t ; 
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNum() {
        return Num;
    }

    public String getTitre() {
        return titre;
    }
    
    public String toString()
    {
        return "le numero de document est"+this.Num+" le titre de document est : "+this.titre; 
   
    }
}
