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
public class Bibliotheque {
    public static int N=0;
    public Livre livre;
    private int capacity;
    private documents Tableau[];
    public int t[] = new int[200];

    public Bibliotheque(int capacity) {
        this.capacity = capacity;
        this.Tableau = new documents[capacity];
    }
 public void afficherDoc(){
        for(documents D:Tableau)                                                    
            System.out.println(D);
    }
    void affichierTableau() {
        int i;
        if (this.capacity > 0) {
            if (this.Tableau.length > 0) {

                for (i = 0; i < this.Tableau.length; i++) {
                   /* if(this.Tableau[i] instanceof Livre)
                    {
                     Livre l1 = new Livre(15,"de");
                           l1 = (Livre) this.Tableau[i]; ////////////// non comprensible 
                    System.out.println(livre.toString() + "dzdz");

                     } */
              System.out.println(this.Tableau[i]);

                }
            } else {
                System.err.println("tableau vide");
            }
        } else {
            System.err.println("Tableau non reserevé");
        }

    }

    boolean ajouter(documents doc) {
        if (doc instanceof Livre){
        documents dou = new documents(40,"aas");
        dou = doc ;
        return true ; 
        }else 
        {
            return false;
        }
         }

    boolean supprimer(documents doc) {
        return true;
    }
        public boolean ajouterD(documents Doc)
        {
        if(N<Tableau.length)
           this.Tableau[N++]=Doc;
        return true;
        }

    public static void main(String[] args) {
   /*     Livre l = new Livre(12, "dazd", "de", 15);
        Livre l2 = new Livre(1755, "aeee", "pppppppppppppe", 82222);
        Bibliotheque b = new Bibliotheque(10);
        documents d = new documents(15, "dzdzefzef");
        b.ajouter(d) ;
        b.affichierTableau();*/
      Bibliotheque bib=new Bibliotheque(10);
     documents d1=new documents(12,"Base_de_donnee");
     bib.ajouter(d1);
     documents d2=new documents(1,"JAVA");
     bib.ajouter(d2);
      bib.ajouterD(new documents(1,"MATHS"));
      bib.ajouterD(new documents(2,"FRANCAIS"));
      bib.ajouterD(new documents(62,"ENGLISH"));
      bib.ajouterD(new documents(22,"ARABE"));
      bib.afficherDoc();
     /* System.out.println();
      System.out.println(bib.supprimer(d2));
      System.out.println();
      bib.affichierTableau();*/
    }
}
