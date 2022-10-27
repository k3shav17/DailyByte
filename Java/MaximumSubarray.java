/**
 * This question is asked by Facebook. Given an integer array, return the sum of
 * its contiguous subarray that produces the largest value.
 * Note: Your subarray must contain at least one value.
 * 
 * Ex: Given the following integer arrays…
 * 
 * nums = [-3,8,-8,2], return 8 (8)
 * nums = [2, 3,-4, 2], return 5 (2 + 3)
 * nums = [1, 5,-2, -3, 7], return 8 (1 + 5 + (-2) + (-3) + 7)
 */

public class MaximumSubarray {

  public static int maxSumOfSubarrayElements(int[] array) {
    
    int maxEndingHere = 0;
    int maxSoFar = Integer.MIN_VALUE;

    for (Integer el : array) {
      
      maxEndingHere += el;
      maxEndingHere = Integer.max(maxEndingHere, el);
      maxSoFar = Integer.max(maxEndingHere, maxSoFar);
    }
    return maxSoFar;
  }
}
