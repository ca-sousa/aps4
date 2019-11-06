package aps;

import java.util.List;

public class SelectionSort {
    public List Ordenar(List lista) 
    { 
        double aux, posMenor = (double)lista.get(1);
        for(int i = 1; i < lista.size()-1; i++){
            for(int j = i+1; j<lista.size(); j++){
           
                if((double) lista.get((int)posMenor)> (double)lista.get(j)){
                    posMenor = j;
                }
            }
            
            if((double)lista.get(i)>(double) lista.get((int) posMenor)){
//                System.out.println(lista);
                aux = (double) lista.get((int) posMenor);
                lista.set((int) posMenor, lista.get(i));
                lista.set(i, aux);
                
            }
        }
        return lista;
    }
}
