package dsa.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.UnsupportedOperationException;

public class SortTest {

  @Test
  public void testQuicksort() throws Exception {
    List<Integer> input = new ArrayList<Integer>();
    for (int i = 9; i >= 0; i--) {
      input.add(i);
    }
    Sort<Integer> mySort = new Quicksort<Integer>();
    List<Integer> output = mySort.sort(input);
    boolean sorted = true;
    for (int i = 0; i < input.size(); i++) {
      if (output.get(i) != i)
        sorted = false;
    }
    Assert.assertTrue(sorted);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testQuicksortException() {
    Sort<Integer> mySort = new Quicksort<Integer>();
    Integer[] array = {1, 2, 3};
    mySort.sort(array);
  }

  @Test
  public void testBubblesort() throws Exception {
    Integer[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    Sort<Integer> mySort = new Bubblesort<Integer>();
    Integer[] output = mySort.sort(input);
    Arrays.sort(input);
    Assert.assertTrue(input.equals(output));
  }

}
