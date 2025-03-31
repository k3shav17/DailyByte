import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BadRelease {

  public static List<Integer> versions = Arrays.asList(4, 5, 6);

  public static void main(String[] args) {

    int releases = 5;

    int first = 0;
    int latest = releases;
    int fault = -1;

    while (first <= latest) {
      int buggy = first + (latest - first) / 2;

      if (isBadRelease(buggy)) {
        fault = buggy;
        latest = buggy - 1;
      } else {
        first = buggy + 1;
      }
    }

    System.out.println(fault);
  }

  public static boolean isBadRelease(int releaseNumber) {
    return versions.contains(releaseNumber);
  }

}
