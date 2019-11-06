package aps;

import java.util.List;

public class InsertionSort {
    public List Ordenar (List lista) {
        int tamanho = lista.size();
        for(int i = 1; i < tamanho; i++) {
            double key = (double) lista.get(i);
            int j = i - 1;
            while(j >= 0 && (double) lista.get(j) > key) {
                lista.set(j+1, lista.get(j));
                j = j-1;
            }
            lista.set(j+1, key);
            System.out.println(lista);
        }
        return lista;
    }
}
