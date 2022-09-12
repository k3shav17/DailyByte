import java.util.ArrayList;

/**
 * This question is asked by Amazon. Given two arrays of numbers, where the
 * first array is a subset of the second array, return an array containing all
 * the next greater elements for each element in the first array, in the second
 * array. If there is no greater element for any element, output -1 for that
 * number.
 *
 * Ex: Given the following arrays…
 *
 * nums1 = [4,1,2], nums2 = [1,3,4,2], return [-1, 3, -1] because no element in
 * nums2 is greater than 4, 3 is the first number in nums2 greater than 1, and
 * no element in nums2 is greater than 2. nums1 = [2,4], nums2 = [1,2,3,4],
 * return [3, -1] because 3 is the first greater element that occurs in nums2
 * after 2 and no element is greater than 4.
 */

public class GreaterElements {

  public static void greater(int[] arr_one, int[] arr_two) {

    ArrayList<Integer> arr_list = new ArrayList<>();

    for (int i = 0; i < arr_one.length; i++) {
      for (int j = i; j < arr_two.length;) {
        if (arr_two[j] > arr_one[i]) {
          arr_list.add(arr_two[j]);
          break;
        } else {
          arr_list.add(-1);
          break;
        }
      }
    }
    System.out.println(arr_list);
  }

  public static void main(String[] args) {

    int[] arr_one = { 4, 1, 2 };
    int[] arr_two = { 1, 3, 4, 2 };

    greater(arr_one, arr_two);
  }
}
