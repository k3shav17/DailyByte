import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This question is asked by Google. Given two strings s and t, return the
 * minimum number of operations needed to convert s into t where a single
 * operation consists of inserting a character, deleting a character, or
 * replacing a character.
 *
 * Ex: Given the following strings s and t…
 *
 * s = "cat", t = "bat", return 1.
 *
 * Ex: Given the following strings s and t…
 *
 * s = "beach", t = "batch", return 2.
 * Delete the 'e' in "beach" and add a 't' to the resulting "bach".
 */

public class EditDistance {

  public static int minimumNoOfOperationsToMatch(String s, String t) {

    if (s.length() != t.length())
      return 0;
    if (s.length() == 0 && t.length() == 0)
      return 0;

    char[] arrayOfS = s.toCharArray();
    char[] arrayOfT = t.toCharArray();

    Arrays.sort(arrayOfS);
    Arrays.sort(arrayOfT);

    int minDiff = 0;

    for (int i = 0; i < s.length(); i++) {

      if (arrayOfS[i] != arrayOfT[i])
        minDiff++;
    }
    return minDiff;
  }

}
