/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author manel
 */
public class MultiCapsa<E> {
    
    private Collection<E> contingut;

public MultiCapsa(Collection<E> implementacio){


contingut=implementacio;
}

//Implementació dels altres mètodes
public boolean esBuida(){
    if(contingut.isEmpty()){
        return true;
    }
    return false;
    
}

public void afegir(E e){

    contingut.add(e);
    
}

public Object obtenir(){
    
    if(contingut.isEmpty()){
        return false;
    }
    return contingut.iterator().next();
}

public void eliminar(){
    contingut.remove("Primer");
}

    public boolean buidar() {
        if(contingut.isEmpty()){
            return false;
        }
        contingut.clear();
        return true;
    }

}

