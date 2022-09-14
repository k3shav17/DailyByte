import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an array of integers, find the first missing positive integer in linear
 * time and constant space. In other words, find the lowest positive integer
 * that does not exist in the array. The array can contain duplicates and
 * negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0]
 * should give 3.
 */

public class DCP3 {

  public static int leastMissing(int[] arr) {

    List<Integer> sortedArrayToList = Arrays.stream(arr).filter(el -> el >= 0).boxed().distinct().sorted()
        .collect(Collectors.toList());

    // System.out.println(sortedArrayToList);

    int size = sortedArrayToList.size();
    int sumOfListElements = 0;
    int sumOfNNumbers = size * ((size + 1) / 2);

    for (int i = 0; i < sortedArrayToList.size(); i++) {
      sumOfListElements += sortedArrayToList.get(i);
    }

    return Math.abs(sumOfNNumbers - sumOfListElements);

  }

  public static void main(String[] args) {

    int[] arr = { 3, 4, -1, 1 };
    System.out.println(leastMissing(arr));
  }
}
