package aps;

import java.util.List;

public class BubbleSort{
    public List Ordenar (List lista) {
        int tamanho = lista.size();
        for(int i = 0; i < tamanho; i++) {
            for(int j = i + 1; j < tamanho; j++) {
                if((int) lista.get(i) > (int) lista.get(j)) {
                    int auxiliar = (int) lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, auxiliar);
                    System.out.println(lista); //Para printar o passo a passo da ordenacao
                }
            }
        }
        return lista;
    }
}
