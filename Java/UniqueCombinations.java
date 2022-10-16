import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * This question is asked by Apple. Given a list of positive numbers without
 * duplicates and a target number, find all unique combinations of the numbers
 * that sum to the target. Note: You may use the same number more than once.
 *
 * Ex: Given the following numbers and target…
 *
 * numbers = [2,4,6,3], target = 6,
 * return [
 * [2,2,2],
 * [2,4],
 * [3,3],
 * [6]
 * ]
 */

public class UniqueCombinations {

  public static List<List<Integer>> combinations(int target, int[] numbers) {

    List<List<Integer>> combinationsOfTargetSum = new ArrayList<>();

    if (numbers.length == 0)
      return combinationsOfTargetSum;

    HashSet<Integer> hash_set = new HashSet<>();

    for (int i = 0; i < numbers.length; i++) {

      ArrayList<Integer> tempList1 = new ArrayList<>();
      ArrayList<Integer> tempList2 = new ArrayList<>();

      if (hash_set.contains(target - numbers[i])) {
        tempList1.add(numbers[i]);
        tempList1.add(target - numbers[i]);
      }

      if (target % numbers[i] == 0) {
        int tempRemainder = target / numbers[i];
        for (int j = 0; j < tempRemainder; j++) {
          tempList2.add(numbers[i]);
        }
      }

      if (tempList2.size() > 0)
        combinationsOfTargetSum.add(tempList2);

      if (tempList1.size() > 0)
        combinationsOfTargetSum.add(tempList1);

      hash_set.add(numbers[i]);
    }
    return combinationsOfTargetSum;
  }

  public static void main(String[] args) {
    int target = 5;
    int[] arr = { 1, 5, 4, 3, 2 };
    System.out.println(combinations(target, arr));
  }
}
