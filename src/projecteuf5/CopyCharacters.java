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
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileReader inputStream2 = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("origen1.txt");
            inputStream2 = new FileReader("origen2.txt");
            outputStream = new FileWriter("fusio.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            while ((c = inputStream2.read()) != -1) {
                outputStream.write(c);
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



