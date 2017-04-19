package dsa.sort;

import java.util.List;
import java.util.ArrayList;
import java.lang.UnsupportedOperationException;

public class Bubblesort<E extends Comparable> implements Sort<E> {
  @Override
  public List<E> sort(List<E> list) {
    throw new UnsupportedOperationException("Not supported for lists");
  }

  @Override
  public E[] sort(E[] list) {
    boolean isChanged = false;
    do {
      isChanged = false;
      for (int i = 0; i < list.length - 2; i++) {
        E c = list[i];
        if (c.compareTo(list[i+1]) > 0) {
          list[i] = list[i+1];
          list[i+1] = c;
          isChanged = true;
          i = list.length;
        }
      }
    } while(isChanged);
    return list;
  }
}
