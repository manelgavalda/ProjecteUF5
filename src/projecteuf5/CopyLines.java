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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {

    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        BufferedReader inputStream2 = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("origen1.txt"));
            inputStream2 = new BufferedReader(new FileReader("origen2.txt"));
            outputStream = new PrintWriter(new FileWriter("fusio.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
            while ((l = inputStream2.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
