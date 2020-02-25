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
   enum langue {
  anglais,
  allemand,
  espagnol
}
public class Dictionnaires extends documents {

  protected langue la ; 
    public Dictionnaires(int n, String t,langue  l) {
        super(n, t);
        this.la= l; 
    }
    @Override
      public String toString()
    {
        return "le numero de document est"+this.Num+" le titre de document est : "+this.titre+" de langue "+this.la; 
   
    }
    
    
}
