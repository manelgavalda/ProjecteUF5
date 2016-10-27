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

public class Jugador {

    //HashSet per tindre una llista dels jugadors perquè no és repeteixin.
    private final Set haJugat = new HashSet();    
    private String  nom;
    private int numero;
    private int altura;
    private int pes;
    private int dataNaixement;
    
        //Ficarem en ArrayList ja que tindrem una llista per cada jugador(1) a tots els equips que ha jugat(0,n).
    public Jugador(String nom, int numero, int altura, int pes, int dataNaixement, String jugaPer) {
        this.nom = nom;
        this.numero = numero;
        this.altura = altura;
        this.pes = pes;
        this.dataNaixement = dataNaixement;
        this.jugaPer = jugaPer;
    }
    private String jugaPer;
    
}
