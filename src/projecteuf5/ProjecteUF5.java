/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.io.BufferedInputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author manel
 */
public class ProjecteUF5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Exerici 2
        if (args.length == 0) {
            System.out.println("No has pasat arguments");
        } else if (!args[0].contains(".")) {
            System.out.println("L'argument no té cap .!");
        } else {

            try {
                double d = Double.valueOf(args[0]);
                int x = 0;
                for (int i = args[0].indexOf("."); i < args[0].length(); i++) {
                    x++;
                }
                System.out.println(x - 1);
            } catch (java.lang.NumberFormatException e) {
                System.out.println("L'argument no és un número real");

            }
        }
         */
 /* Exercici 3
        String caracter,text,distingir,orientacio;
        String sn = "SNsn";
        char resposta;
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introdueix un text acabat en INTRO: ");
            text = scanner.nextLine();
        } while (text.isEmpty());

        do {
            System.out.println("Introdueix un caràcter a buscar: ");
            caracter = scanner.nextLine();
            resposta = caracter.charAt(0);
        } while (caracter.isEmpty());

        do {
            System.out.println("Vols distingir entre majúscules i minúscules: Si/No");
            distingir = scanner.nextLine();
            resposta = distingir.charAt(0);
        } while (sn.indexOf(resposta) == -1);

        String s = "" + resposta;

        if (!"s".equals(s) || "S".equals(s)) {
            text = text.toLowerCase();
            caracter = caracter.toLowerCase();
        }
         
        do {
            System.out.println("Vols buscar de dreta a esquerra(1) o d'esquerra a dreta(2)");
            orientacio = scanner.nextLine();
            resposta = orientacio.charAt(0);
            s = "" + resposta;
            numero = Integer.parseInt(s);
            System.out.println(numero);
        } while (numero != 1 && numero != 2);

        if (numero == 1) {
            text = new StringBuffer(text).reverse().toString();
        }

        int i = text.indexOf(caracter);
        while (i >= 0) {
            System.out.println("Caràcter trobat en la posició: " + i);
            i = text.indexOf(caracter, i + 1);
        }
         */
 /* Exercici 4
        Scanner scanner = new Scanner(System.in);
        String text;
        String hola;
        
        do {
            System.out.println("Introdueix un text acabat en INTRO: ");
            text = scanner.nextLine();
        } while (text.isEmpty());
        
       
        if(text.equals(new StringBuffer(text).reverse().toString())){
            System.out.println("El text és palíndrom");
        } else{
            System.out.println("El text no és palíndrom");
        }
        //hola= text.equals(new StringBuffer(text).reverse().toString()) ? System.out.println("El text és palíndrom") : System.out.println("El text no es palindrom")
         */
 /* Exercici 4 regex.
 
 String text;
 Scanner scanner = new Scanner(System.in);
 Pattern pattern = null;
 String regex="\\p{Punct}";
 
 do{
     System.out.println("Introdueix un text");
     text= scanner.nextLine();
 }while(text.isEmpty());
 
            try{
                pattern  = Pattern.compile(regex);
            }catch(PatternSyntaxException e){            
                System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
            }
 
 Matcher matcher = pattern.matcher(text);
 
 text=matcher.replaceAll("");
 
 String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);
 String removed = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+","");
 
        System.out.println(removed);
        
        if(text.equals(new StringBuffer(removed).reverse().toString())){
            System.out.println("El text és palíndrom");
        } else{
            System.out.println("El text no és palíndrom");
        }
        
         */
        //replace all classe matcher (parto per cadena buida "") retorna el nou string.
        /* Exercici 6
        Scanner scanner = new Scanner(System.in);
        String text1,text2;
        StringBuilder textnou1 = new StringBuilder();
        StringBuilder textnou2 = new StringBuilder();
        
        do {
            System.out.println("Introdueix un text");
            text1 = scanner.nextLine();
        } while (text1.isEmpty());

        do {
            System.out.println("Introdueix un altre text");
            text2 = scanner.nextLine();
        } while (text2.isEmpty());

        char[] array1 = text1.toLowerCase().toCharArray();
        char[] array2 = text2.toLowerCase().toCharArray();

        for (char l : array1) {
            if (Character.isLetter(l)) {
                text1 = textnou1.append(l).toString();
            }
        }

        for (char l : array2) {
            if (Character.isLetter(l)) {
                text2 = textnou2.append(l).toString();
            }
        }

        array1 = text1.toCharArray();
        Arrays.sort(array1);
        array2 = text2.toCharArray();
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("Són anagrama");
        } else {
            System.out.println("No ho són");
        }
 
  /* Exercici 6 regex 
        Scanner scanner = new Scanner(System.in);
        String text1,text2;
        StringBuilder textnou1 = new StringBuilder();
        StringBuilder textnou2 = new StringBuilder();
        Pattern pattern = null;
        String regex="\\p{Punct}";
        
        try{
                pattern  = Pattern.compile(regex);
            }catch(PatternSyntaxException e){            
                System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
            }
        
        do {
            System.out.println("Introdueix un text");
            text1 = scanner.nextLine();
        } while (text1.isEmpty());

        do {
            System.out.println("Introdueix un altre text");
            text2 = scanner.nextLine();
        } while (text2.isEmpty());
        
        Matcher matcher = pattern.matcher(text1);
        
 text1=matcher.replaceAll("\b");
 
 String normalized = Normalizer.normalize(text1, Normalizer.Form.NFD);
 String removed = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+","");

        System.out.println(text1);
        System.out.println
        if (text1.equals(text2)) {
            System.out.println("Són anagrama");
        } else {
            System.out.println("No ho són");
        }
         */
 /* Exercici 5  regex
         
         String text;
        StringBuilder textnou = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b.[^\\s\\p{Punct}\\r]";
        Pattern pattern = null;
 
            try{
                pattern  = Pattern.compile(regex);
            }catch(PatternSyntaxException e){            
                System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
            }
 
        do {
            System.out.println("Introdueix un text");
            text = scanner.nextLine();
        } while (text.isEmpty());


        Matcher matcher = pattern.matcher(text);

        text=matcher.replaceAll("");

         String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);
         String removed = normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+","");
         
         System.out.println(text);
         */
 /* Exercici 7
        String text;
        Scanner scanner = new Scanner(System.in);
        String regex = "^(.+)@(.+)\\.(.+)$";
        Pattern pattern = null;
 
            try{
                pattern  = Pattern.compile(regex);
            }catch(PatternSyntaxException e){            
                System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
            }
 
        do {
            System.out.println("Introdueix un text");
            text = scanner.nextLine();
        } while dtext.isEmpty());


        Matcher matcher = pattern.matcher(text);

        System.out.println(text.matches(regex));
         */
 /* Exercici 9 
        String text;
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = null;
        String regex = "\\b(\\w+)(\\w+)(\\w+).+(\\3+)(\\2+)(\\1+)$";
        
        //\b(\w)\3{3}·(\w)\3{3}$
        try{
                pattern  = Pattern.compile(regex);
            }catch(PatternSyntaxException e){            
                System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
            }
 
        do {
            System.out.println("Introdueix un text");
            text = scanner.nextLine();
        } while (text.isEmpty());


        Matcher matcher = pattern.matcher(text);

        System.out.println(text.matches(regex));
         */
 /*Exercici 2 col·leccions.
        String TERMINATOR_STRING = "";
        java.util.Scanner a = new java.util.Scanner(System.in);
        StringBuilder b = new StringBuilder();
        String strLine;
        
        while (!(strLine = a.nextLine()).equals(TERMINATOR_STRING)) {
            b.append(strLine);
            b.append(" ");
        }
        
        String[] text=b.toString().split(" ");
            
        Arrays.stream(text)
      .collect(Collectors.groupingBy(s -> s))
      .forEach((k, v) -> System.out.println(k+" "+v.size()));
         */
 /*Exercici 1 classes genperiques.
        UniCapsa box= new UniCapsa();
        box.afegir("objecte1");
        
        System.out.println(box.obtenir());

        System.out.println(box.esPlena());
        
        box.buidar();
        
        System.out.println(box.esPlena());
        
        System.out.println(box.obtenir());
        
        box.afegir("objecte2");
        
        System.out.println(box.esPlena());
        
        System.out.println(box.obtenir());
         */
 /* Exercici 2 Multicapsa
        MultiCapsa mc = new MultiCapsa(new ArrayList());

        mc.afegir("Primer");
        mc.afegir("Segon");

        System.out.println((mc.esBuida() ? "buida" : "no buida"));

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println((mc.buidar() ? "buidada" : "no buidada"));

        System.out.println((mc.esBuida() ? "buida" : "no buida"));

        mc = new MultiCapsa(new HashSet());

        mc.afegir("Primer");

        mc.afegir("Segon");

        System.out.println((mc.esBuida() ? "buida" : "no buida"));

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println((mc.buidar() ? "buidada" : "no buidada"));

        System.out.println((mc.esBuida() ? "buida" : "no buida"));
        
        System.out.println();
*/

 /* Exercici 1 excepcions */
 
    }

}
