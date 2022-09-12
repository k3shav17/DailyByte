import java.util.Arrays;

/**
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at
 * index i of the new array is the product of all the numbers in the original
 * array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
 * be [2, 3, 6].
 *
 */

public class DCP2 {

  public static void productOfElementsExceptIt(int[] arr) {

    int n = arr.length;
    int[] left_arr = new int[n];
    int[] right_arr = new int[n];

    left_arr[0] = 1;
    right_arr[n - 1] = 1;

    for (int i = 1; i < arr.length; i++) {
      left_arr[i] = left_arr[i - 1] * arr[i - 1];
    }

    for (int i = n - 2; i >= 0; i--) {
      right_arr[i] = right_arr[i + 1] * arr[i + 1];
    }

    for (int i = 0; i < n; i++) {
      arr[i] = right_arr[i] * left_arr[i];
    }

    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    productOfElementsExceptIt(arr);
  }
}
