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
public class TestDocuments {
     public static void main(String[] args) {
      documents d = new documents(40," RobenHoud"); 
       System.out.println(d);
      Livre l = new Livre(405,"alibaba et ","ali",40);
       System.out.println(l);
    Revues r = new Revues(70,"les miserable", 5 ,1982);
       System.out.println(r);
   Manuels m = new   Manuels(78,"Alibaba", "jack",40 ,2);
          System.out.println(m);
    Dictionnaires  di = new  Dictionnaires(45, "lllsa",langue.anglais);
     System.out.println(di);



    }
}
