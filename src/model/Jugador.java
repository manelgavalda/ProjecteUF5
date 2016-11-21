/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author manel
 */

public class Jugador {

    //HashSet per tindre una llista dels jugadors perquè no és repeteixin.
    private String  _1nom;
    private String  _2email;
    private int _3numero;
    private float _4altura;
    private int _5pes;
    private int _6dataNaixement;
    private String _7jugaPer;
    private ArrayList _8haJugatPer; //Ficarem en ArrayList ja que tindrem una llista per cada jugador(1) a tots els equips que ha jugat(0,n).

    public Jugador(String _1nom, String _2email, int _3numero, float _4altura, int _5pes, int _6dataNaixement, String _7jugaPer, ArrayList _8haJugatPer) {
        this._1nom = _1nom;
        this._2email = _2email;
        this._3numero = _3numero;
        this._4altura = _4altura;
        this._5pes = _5pes;
        this._6dataNaixement = _6dataNaixement;
        this._7jugaPer = _7jugaPer;
        this._8haJugatPer = _8haJugatPer;
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

    public float get4altura() {
        return _4altura;
    }

    public void set4altura(float _4altura) {
        this._4altura = _4altura;
    }

    public int get5pes() {
        return _5pes;
    }

    public void set5pes(int _5pes) {
        this._5pes = _5pes;
    }

    public int get6dataNaixement() {
        return _6dataNaixement;
    }

    public void set6dataNaixement(int _6dataNaixement) {
        this._6dataNaixement = _6dataNaixement;
    }

    public String get7jugaPer() {
        return _7jugaPer;
    }

    public void set7jugaPer(String _7jugaPer) {
        this._7jugaPer = _7jugaPer;
    }

    public ArrayList get8haJugatPer() {
        return _8haJugatPer;
    }

    public void set8haJugatPer(ArrayList _8haJugatPer) {
        this._8haJugatPer = _8haJugatPer;
    }
    
       
}
