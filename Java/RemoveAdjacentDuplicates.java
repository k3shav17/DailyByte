import java.util.Stack;

/**
 * This question is asked by Facebook. Given a string s containing only
 * lowercase letters, continuously remove adjacent characters that are the same
 * and return the result.
 *
 * Ex: Given the following strings...
 *
 * s = "abccba", return "" s = "foobar", return "fbar" s = "abccbefggfe", return
 * "a"
 */

public class RemoveAdjacentDuplicates {

  public static String removeDuplicates(String str) {

    Stack<Character> stack = new Stack<>();
    StringBuilder res = new StringBuilder();

    for (Character c : str.toCharArray()) {
      if (!stack.isEmpty() && stack.peek() == c)
        stack.pop();
      else {
        stack.push(c);
      }
    }

    for (Character c : stack) {
      res.append(c);
    }
    return res.toString();
  }

  public static void main(String[] args) {
    String s = "abccbefggfe";
    System.out.println(removeDuplicates(s));
  }
}
