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


public class LlansaExcepcio3 {

   private PrintWriter fitxer = null;

   void metode1() {
      metode2();
   }

   void metode2() {
       try {
           metode3();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(LlansaExcepcio3.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

   void metode3() throws FileNotFoundException {
           metode4();
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



