package dsa.search;

import java.util.List;
import java.util.ArrayList;
import java.lang.UnsupportedOperationException;

public class SequentialSearch<E extends Comparable> implements Search<E> {
  @Override
  public List<E> search(List<E> list, E target) {
    throw new UnsupportedOperationException("Not supported");
  }

  @Override
  public E[] search(E[] list, E target) {
    throw new UnsupportedOperationException("Not supported");
  }
}
