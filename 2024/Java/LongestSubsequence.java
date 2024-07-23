/**
 * Given an array of unsorted integers, return the length of its longest increasing subsequence.
 * Note: You may assume the array will only contain positive numbers.
 * Ex: Given the following array nums…
 * nums = [1, 9, 7, 4, 7, 13], return 4.
 * The longest increasing subsequence is 1, 4, 7, 13.
 * */

public class LongestSubsequence {

  public static void main(String[] args) {

    int[] input = {10,9,2,5,3,7,101,18};
    int[] dp = new int[input.length];
    int maxLength = 0;

    for (int i = 1; i < input.length; i++) {
      for (int j = 0; j < i; j++) {
        if (input[i] > input[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }

    int max = 0;

    for (int i = 0; i < input.length; i++) {
      if (dp[i] > max) {
        max = dp[i];
      }
    }
    // +1 as every single element itself forms a strictly increasing subsequence of length 1.
    System.out.println(max + 1);

  }

}
