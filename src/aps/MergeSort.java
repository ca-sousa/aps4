package aps;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public List Ordenar(List list) {
    if (list.size() < 2) {
        return list;
    }
    int mid = list.size()/2;
    return merged(
        Ordenar(list.subList(0, mid)), 
        Ordenar(list.subList(mid, list.size())));
  }

  private static List merged(List left, List right) {
    int leftIndex = 0;
    int rightIndex = 0;
    List merged = new ArrayList();

    while (leftIndex < left.size() && rightIndex < right.size()) {
      if ((int) left.get(leftIndex) < (int) right.get(rightIndex)) {
        merged.add(left.get(leftIndex++));
      } else {
        merged.add(right.get(rightIndex++));
      }
        System.out.println(merged); //Para printar o passo a passo da ordenacao
    }
    merged.addAll(left.subList(leftIndex, left.size()));
    merged.addAll(right.subList(rightIndex, right.size()));
    return merged;
  }
}

