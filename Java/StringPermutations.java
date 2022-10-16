import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * This question is asked by Amazon. Given a string s consisting of only letters
 * and digits, where we are allowed to transform any letter to uppercase or
 * lowercase, return a list containing all possible permutations of the string.
 *
 * Ex: Given the following string…
 *
 * S = "c7w2", return ["c7w2", "c7W2", "C7w2", "C7W2"]
 */

public class StringPermutations {

  public static List<String> permutations(String word) {

    if (word.length() == 0)
      return new LinkedList<>();

    Queue<String> queue = new LinkedList<>();
    queue.offer(word);

    for (int i = 0; i < word.length(); i++) {

      if (Character.isDigit(word.charAt(i)))
        continue;

      int size = queue.size();

      for (int j = 0; j < size; j++) {

        String current = queue.poll();
        char[] chars = current.toCharArray();

        chars[i] = Character.toUpperCase(chars[i]);
        queue.offer(String.valueOf(chars));

        chars[i] = Character.toLowerCase(chars[i]);
        queue.offer(String.valueOf(chars));
      }
    }

    return new LinkedList<>(queue);
  }

  public static void main(String[] args) {

    String word = "c7w2";
    System.out.println(permutations(word));
  }
}
