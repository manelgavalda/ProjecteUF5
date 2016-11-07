/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
    return this.contingut.isEmpty();
}

public void afegir(E e){
    contingut.add(e);
}

public E obtenir(){
    
    if(contingut.isEmpty()){
        return null;
    }
    return contingut.iterator().next();
}

public boolean eliminar(){
    E e=this.obtenir();
    if(!e.equals(null))
        return this.contingut.remove(e);
    else
        return false;
}

    public boolean buidar() {
        if(!contingut.isEmpty()){
            return false;
        }
        contingut.clear();
        return true;
    }

    /*
    3. Afegiu a la MultiCapsa un mètode genèric que retorne el seu contingut en ordre creixent, 
    fent els canvis necessaris per a que ho puguem fer en qualsevol classe sense possibilitat 
    de rebre errors en temps d'execució per causa del tipus utilitzat. 
    Implementar la capsa intentant posar bicicletes (classe Bicycle). 
    Heu pogut? Modifiqueu les bicicletes fins aconseguir-ho. 
    La capçalera (no del tot correcta) del mètode serà pareguda a la següent:
    */
    public static <E extends Comparable> E ordenar(Collection <E> contingut){
        List <E> list = new ArrayList<>(contingut);
        return Collections.sort(list);
}
}

