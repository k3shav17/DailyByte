import java.util.List;
import java.util.ArrayList;

public class GenerateParanthesis {

  public static void main(String[] args) {
    int n = 4;
    System.out.println(generateParanthesis(n));
  }

  public static List<String> generateParanthesis(int n) {
    List<String> paranthesis = new ArrayList<>();
    generateHelper(paranthesis, "", n, n);
    return paranthesis;
  }

  private static void generateHelper(List<String> paranthesis, String currentBrace, int open, int close) {
    if (open == 0 && close == 0) {
      paranthesis.add(currentBrace);
      return;
    }

    if (open > 0) {
      generateHelper(paranthesis, currentBrace + "(", open - 1, close);
    }
    if (close > open) {
      generateHelper(paranthesis, currentBrace + ")", open, close - 1);
    }
  }
}
