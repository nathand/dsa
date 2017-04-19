package dsa.sort;

import java.util.List;
import java.util.ArrayList;

public class Quicksort<E extends Comparable> implements Sort<E> {

  @Override
  public List<E> sort(List<E> list) {
    if (list.size() <= 1)
      return list;

    E pivot = list.get(0);
    List<E> low = new ArrayList<E>();
    List<E> high = new ArrayList<E>();
    for (int i = 1; i < list.size(); i++) {
      E c = list.get(i);
      if (c.compareTo(pivot) < 0)
        low.add(c);
      else
        high.add(c);
    }
    List<E> result = sort(low);
    result.add(pivot);
    result.addAll(sort(high));
    return result;
  }

  @Override
  public E[] sort(E[] list) {
    return null;
  }
}
