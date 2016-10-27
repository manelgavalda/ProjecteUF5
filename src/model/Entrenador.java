/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manel
 */
public class Entrenador {
    private String nom;
    private int dataNaixement;
    //Tindrem una relació que ens indicarà l'equip(0..1), que està entrenant actualment(1).
    private String entrena;
    //També tindrem una llista de tots els equips(0..n), que ha entenat en el pasat.
    private List haEntrenat = new ArrayList();
}
