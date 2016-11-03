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
public class UniCapsa<T> {
    private T t;
    
    public void afegir(T t){
    this.t=t;    
    }
    
    
    public boolean esPlena(){
        if(t == null){
        return false;
        }
        return true;
    }
    
    public T obtenir(){
        return t;
    }
    
    public boolean buidar(){
        if(t.equals(null)){
            return false;
        }
        this.t=null;
        
        return true;
    }
}
