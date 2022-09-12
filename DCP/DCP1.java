import java.util.HashMap;

/**
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
 * 17.
 */
public class DCP1 {

  public static boolean hasSum(int target, int[] arr) {

    HashMap<Integer, Integer> hash_map = new HashMap<>();
    int i = 0;

    for (Integer in : arr) {
      if (hash_map.containsKey(target - in))
        return true;
      hash_map.put(in, i++);
    }
    return false;
  }

  public static void main(String[] args) {

    int[] arr = { 10, 15, 3, 7 };
    System.out.println(hasSum(17, arr));
  }
}
