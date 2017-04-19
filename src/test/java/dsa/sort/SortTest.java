package dsa.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import java.util.List;
import java.util.ArrayList;

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

}
