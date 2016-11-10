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
import java.io.*;

import java.util.List;

import java.util.ArrayList;

public class LlistaDeNumeros2 {

    private List<Integer> list;

    private static final int SIZE = 10;

    public LlistaDeNumeros2() {

        list = new ArrayList<Integer>(SIZE);
//Forçem l'error
        for (int i = 33; i < SIZE; i++) {

            list.add(i);

        }

    }

    public void writeList(String fileName) {

        try{
            try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
                for (int i = 0; i < SIZE; i++) {
                    
                    out.println("Value at: " + i + " = " + list.get(i));
                    
                }   }
        }
        catch(Exception e) {
            System.out.println("Error, " + e);
        } finally{
            System.out.println("Final de l'execució");
        }
    }

    public void readList(String fileName) {

        String line = null;

        try {
            try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
                while ((line = raf.readLine()) != null) {
                    
                    Integer i = Integer.parseInt(line);
                    
                    System.out.println(i);
                    list.add(i);
                    
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error, " + e);
        } finally {
            System.out.println("Final de l'execució");
        }

    }

}
