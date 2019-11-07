package aps;

import java.util.List;

public class Tempo {
    
    public double BubbleSort(List lista) {
        BubbleSort bubble = new BubbleSort();
        
        double horaInicio = System.nanoTime();
        bubble.Ordenar(lista);
        double horaParada = System.nanoTime();
        
        return (horaParada - horaInicio)/1000000;
    }
    
    public double InsertionSort(List lista) {
        InsertionSort insertion = new InsertionSort();
        
        double horaInicio = System.nanoTime();
        insertion.Ordenar(lista);
        double horaParada = System.nanoTime();
        
        return (horaParada - horaInicio)/1000000;
    }
    
    public double QuickSort(List lista) {
        QuickSort quick = new QuickSort();
        
        double horaInicio = System.nanoTime();
        quick.Ordenar(lista);
        double horaParada = System.nanoTime();
        
        return (horaParada - horaInicio)/1000000;
    }
    
    public double SelectionSort(List lista) {
        SelectionSort selection = new SelectionSort();
        
        double horaInicio = System.nanoTime();
        selection.Ordenar(lista);
        double horaParada = System.nanoTime();
        
        return (horaParada - horaInicio)/1000000;
    }
    
        public double MergeSort(List lista) {
        MergeSort merge = new MergeSort();
        
        double horaInicio = System.nanoTime();
        merge.Ordenar(lista);
        double horaParada = System.nanoTime();
        
        return (horaParada - horaInicio)/1000000;
    }

}
