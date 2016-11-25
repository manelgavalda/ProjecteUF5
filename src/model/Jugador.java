/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author manel
 */

public class Jugador implements Serializable {

    //HashSet per tindre una llista dels jugadors perquè no és repeteixin.
    private String  _1nom;
    private String  _2email;
    private int _3numero;
    private String _4jugaPer;
    private ArrayList<Equip> _5haJugatPer; //Ficarem en ArrayList ja que tindrem una llista per cada jugador(1) a tots els equips que ha jugat(0,n).

    public Jugador(String _1nom, String _2email, int _3numero, String _4jugaPer) {
        this._1nom = _1nom;
        this._2email = _2email;
        this._3numero = _3numero;
        this._4jugaPer = _4jugaPer;
    }

    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }

    public String get2email() {
        return _2email;
    }

    public void set2email(String _2email) {
        this._2email = _2email;
    }

    public int get3numero() {
        return _3numero;
    }

    public void set3numero(int _3numero) {
        this._3numero = _3numero;
    }

    public String get4jugaPer() {
        return _4jugaPer;
    }

    public void set4jugaPer(String _4jugaPer) {
        this._4jugaPer = _4jugaPer;
    }

    public ArrayList<Equip> get5haJugatPer() {
        return _5haJugatPer;
    }

    public void set5haJugatPer(ArrayList<Equip> _5haJugatPer) {
        this._5haJugatPer = _5haJugatPer;
    }


       
}
