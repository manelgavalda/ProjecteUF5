/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 *
 * @author manel
 */
public class AutoCloseableExample implements AutoCloseable {

    public AutoCloseableExample() throws IOException{
        throw new IOException();
    }

    @Override
    public void close() throws IOException {
        throw new IOException("An Exception During Close");
    }
    public void throwable() throws Throwable {
        try {
                PrintWriter fitxer = new PrintWriter("c:/sortida.txt");
        } catch (Exception e) {
            throw e.getSuppressed()[0];
        }
    }

}
