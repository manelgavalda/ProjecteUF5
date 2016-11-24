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
public class Equip implements Comparable<Equip>,Serializable{


    private String _1nom;
    private String _2regio;
    private String _3lliga;
    private int _4posicioLliga;

    public Equip(String _1nom, String _2regio, String _3lliga, int _4posicioLliga) {
        this._1nom = _1nom;
        this._2regio = _2regio;
        this._3lliga = _3lliga;
        this._4posicioLliga = _4posicioLliga;
    }

    public Equip(String _1nom, String _2regio) {
        this._1nom = _1nom;
        this._2regio = _2regio;
    }

    
    @Override
    public int compareTo(Equip o) {
        return this._4posicioLliga-o._4posicioLliga;
    }
    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }

    public String get2regio() {
        return _2regio;
    }

    public void set2regio(String _2regio) {
        this._2regio = _2regio;
    }

    public String get3lliga() {
        return _3lliga;
    }

    public void set3lliga(String _3lliga) {
        this._3lliga = _3lliga;
    }

    public int get4posicioLliga() {
        return _4posicioLliga;
    }

    public void set4posicioLliga(int _4posicioLliga) {
        this._4posicioLliga = _4posicioLliga;
    }
    
        
}
