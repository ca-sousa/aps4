package aps;

import java.util.Arrays;
import java.util.List;

public class Aps {
    
    public static List listaDis() {
        Double distancia[] = new Double[]{ 0.0, 5.3, 3.6, 3.4, 8.6, 5.7, 9.1, 10.9, 8.7, 6.9, 0.0, 4.5, 5.3, 3.4, 6.6, 11.1, 9.5, 9.8, 4.4, 2.2, 0.0, 3.0, 5.9, 2.9, 8.5, 7.1, 5.4, 2.2, 4.8, 3.0,
        0.0, 9.0, 6.5, 6.4, 11.7, 9.5, 8.9, 4.1, 5.1, 7.4, 0.0, 7.3, 13.1, 12.1, 10.4, 5.2, 5.0, 2.8, 3.7, 8.7, 0.0, 5.3, 5.7, 4.0, 6.2, 10.6, 8.7, 9.6, 14.4, 6.7, 0.0, 6.3, 5.0, 11.7, 10.5, 9.1, 10.2, 
        14.2, 4.9, 5.7, 0.0, 2.3, 8.1, 7.6, 6.6, 11.3, 3.3, 7.3, 2.4, 0.0};
        
        List listaDis = Arrays.asList(distancia);

        return listaDis;
    }
    
    public static List listaTempo () {    
        Integer tempo[] = new Integer[]{0, 17, 14, 13, 24, 11, 16, 23, 18, 17, 0, 14, 16, 9, 19, 25, 25, 26, 9, 6, 0, 9, 13, 8, 21, 17, 13,
        6, 18, 12, 0, 26, 11, 14, 27, 21, 24, 11, 16, 22, 0, 22, 31, 31, 29, 12, 20, 11, 11, 27, 0, 18, 17, 14, 19, 30, 17, 21, 37, 17, 0, 20, 17,
        25, 23, 20, 24, 29, 17, 17, 0, 9, 19, 19, 16, 20, 26, 10, 18, 7, 0};

        List listaTempo = Arrays.asList(tempo);
        
        return listaTempo;
    }
    
    public static void main(String[] args) {
        //importacao
        Tempo tempo = new Tempo();
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        QuickSort quick = new QuickSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();

                
        System.out.println("APS - 4 SEMESTRE");
        System.out.println("-------------------------Listas---------------------------");
        System.out.println("Lista de Tempo: \n" + listaTempo());
//        System.out.println("Lista de Distancia: \n" + listaDis());
    
        System.out.println("------------Bubble Sort-------------------------------");
        System.out.println(bubble.Ordenar(listaDis()));
        System.out.println("Tempo:" + tempo.BubbleSort(listaDis()));
        
        System.out.println("------------Insertion Sort-------------------------------");
        System.out.println(insertion.Ordenar(listaDis()));
        System.out.println("Tempo:" + tempo.InsertionSort(listaDis()));

        System.out.println("------------Quick Sort-------------------------------");
        System.out.println(quick.Ordenar(listaDis()));
        System.out.println("Tempo:" + tempo.QuickSort(listaDis()));
    
        System.out.println("------------Selection Sort-------------------------------");
        System.out.println(selection.Ordenar(listaDis()));
        System.out.println("Tempo:" + tempo.SelectionSort(listaDis()));
       
        System.out.println("------------Merge Sort-------------------------------");
        System.out.println(merge.sorted(listaDis()));
        System.out.println("Tempo:" + tempo.MergeSort(listaDis()));
    }
    
}
