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


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileInputStream in2 = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("origen1.txt");
            in2 = new FileInputStream("origen2.txt");
            out = new FileOutputStream("fusio.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
            while ((c = in2.read()) != -1) {
                out.write(c);
            }
            
        } finally {
            if (in != null) {
                in.close();
            }
            if (in2 != null) {
                in2.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}