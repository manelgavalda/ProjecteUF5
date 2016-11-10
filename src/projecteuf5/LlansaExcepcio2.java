/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

/**
 *
 * @author manel
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LlansaExcepcio2 {

   private PrintWriter fitxer = null;

   void metode1() {
      metode2();
   }

   void metode2() {
      metode3();
   }

   void metode3() {
       try {
           metode4();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(LlansaExcepcio2.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

   void metode4() throws FileNotFoundException {
      fitxer=new PrintWriter("c:/sortida.txt");
   }

   public static void main(String[] args) {
      // TODO code application logic here
      LlansaExcepcio ll = new LlansaExcepcio();
      ll.metode1();
   }
}



