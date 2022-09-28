import java.util.ArrayList;
import java.util.List;

/**
 * This problem was asked by Google.
 *
 * Given an array of integers and a number k, where 1 <= k <= length of the
 * array, compute the maximum values of each subarray of length k.
 *
 * For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10,
 * 7, 8, 8], since:
 *
 * 10 = max(10, 5, 2) 7 = max(5, 2, 7) 8 = max(2, 7, 8) 8 = max(7, 8, 7)
 */

public class DCP6 {

  public static List<Integer> maxSubArrayElements(int[] array, int k) {

    List<Integer> maxSubArrayElementsList = new ArrayList<>();

    for (int i = 0; i <= array.length - k; i++) {
      int max = array[i];
      for (int j = 1; j < k; j++) {
        max = Integer.max(array[i + j], max);
      }
      maxSubArrayElementsList.add(max);
    }
    return maxSubArrayElementsList;
  }

  public static void main(String[] args) {

    int[] arr = { 10, 5, 2, 7, 8, 7 };
    int window = 3;
    System.out.println(maxSubArrayElements(arr, window));
  }
}
