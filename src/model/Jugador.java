/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author manel
 */
public class Jugador {
    //Ficarem en ArrayList ja que tindrem una llista per cada jugar(1) a tots els equips que ha jugat(1,n).
    private final List haJugat=new ArrayList();    
    private String  nom;
    private int numero;
    private int altura;
    private int pes;
    private int dataNaixement;
    
    //Una colecció que ens relacionarà el jugador(1) pels equips que està jugant(1..n)
    private Collection jugaPer = new ArrayList();
}
