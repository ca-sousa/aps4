package aps;

import java.util.List;

public class SelectionSort {
    public List Ordenar(List lista) 
    { 
        int aux, posMenor = (int)lista.get(1);
        for(int i = 1; i < lista.size()-1; i++){
            for(int j = i+1; j<lista.size(); j++){
           
                if((int) lista.get((int)posMenor)> (int)lista.get(j)){
                    posMenor = j;
                }
            }
            
            if((int)lista.get(i)>(int) lista.get((int) posMenor)){
                System.out.println(lista); //Para printar o passo a passo da ordenacao
                aux = (int) lista.get((int) posMenor);
                lista.set((int) posMenor, lista.get(i));
                lista.set(i, aux);
                
            }
        }
        return lista;
    }
}
