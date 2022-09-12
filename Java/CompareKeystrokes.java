import java.util.Stack;

/**
 * This question is asked by Amazon. Given two strings s and t, which represents
 * a sequence of keystrokes, where # denotes a backspace, return whether or not
 * the sequences produce the same result.
 *
 * Ex: Given the following strings...
 *
 * s = "ABC#", t = "CD##AB", return true s = "como#pur#ter", t = "computer",
 * return true s = "cof#dim#ng", t = "code", return false
 */

public class CompareKeystrokes {

  public static boolean hasSequence(String s, String t) {
    if (s.equals(t))
      return true;
    return backspace(s).equals(backspace(t));
  }

  public static String backspace(String str) {

    Stack<Character> stack = new Stack<>();

    for (Character c : str.toCharArray()) {
      if (c != '#')
        stack.push(c);
      else if (!stack.isEmpty())
        stack.pop();
    }
    System.out.println(String.valueOf(stack));
    return String.valueOf(stack);
  }

  public static void main(String[] args) {
    String s = "cof#dim#ng";
    String t = "coding";
    System.out.println(hasSequence(s, t));
  }
}
