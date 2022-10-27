import java.util.Arrays;

/**
 * This question is asked by Amazon. Given a string s and a list of words
 * representing a dictionary, return whether or not the entirety of s can be
 * segmented into dictionary words.
 * Note: You may assume all characters in s and the dictionary are lowercase.
 *
 * Ex: Given the following string s and dictionary…
 *
 * s = "thedailybyte", dictionary = ["the", "daily", "byte"], return true.
 *
 * Ex: Given the following string s and dictionary…
 *
 * s = "pizzaplanet", dictionary = ["plane", "pizza"], return false.
 */

public class DictionaryWords {

  public static boolean areSegmented(String s, String[] dictionary) {

    if (s.length() == 0 || dictionary.length == 0)
      return false;

    StringBuilder appendDictWords = new StringBuilder();

    for (int i = 0; i < dictionary.length; i++) {
      appendDictWords.append(dictionary[i]);
    }

    if (appendDictWords.length() != s.length())
      return false;

    char[] arrayOfS = s.toCharArray();
    char[] arrayOfDict = appendDictWords.toString().toCharArray();

    Arrays.sort(arrayOfS);
    Arrays.sort(arrayOfDict);

    for (int i = 0; i < s.length(); i++) {
      if (arrayOfS[i] != arrayOfDict[i])
        return false;
    }
    return true;
  }
}
