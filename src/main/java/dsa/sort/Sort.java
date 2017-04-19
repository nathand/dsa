package dsa.sort;

import java.util.List;

interface Sort<E> {

  List<E> sort(List<E> list);
  E[] sort(E[] array);
}
