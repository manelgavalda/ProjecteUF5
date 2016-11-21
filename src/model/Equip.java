/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author manel
 */
public class Equip{


    private String nom;
    private String regio;
    private String lliga;
    private int posicioLliga;
    
        public Equip(String nom, String regio, String lliga, int posicioLliga) {
        this.nom = nom;
        this.regio = regio;
        this.lliga = lliga;
        this.posicioLliga = posicioLliga;
    }
}
