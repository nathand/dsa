package dsa.search;

import java.util.List;

interface Search<E extends Comparable> {

  List<E> search(List<E> list, E target);
  E[] search(E[] array, E target);
}
