/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author manel
 */
public class CopaMundial {

    public CopaMundial(int any, int data, String guanyador, String millorJugador) {
        this.any = any;
        this.data = data;
        this.guanyador = guanyador;
        this.millorJugador = millorJugador;
    }
    
    private int any;
    //Farem un HashSet per a la copa(1) que contindrà totes les seleccions que hi participen(1,n) i que no fa falta que sigui ordenat, però si que no és repeteixqui.
    private Set participants = new HashSet();
    private int data;
    private String guanyador;
    private String millorJugador;
}
