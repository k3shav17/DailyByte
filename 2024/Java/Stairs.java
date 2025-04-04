/*
 * Given a staircase with N steps and the ability to climb either one or two steps at a time, return the total number of ways to arrive at the top of the staircase.
 * Ex: Given the following value of N…
 * 
 * N = 2, return 2
 * 1 step + 1 step
 * 2 steps
 * Ex: Given the following value of N…
 * 
 * N = 3, return 3
 * 1 step + 1 step + 1 step
 * 1 step + 2 steps
 * 2 steps + 1 step
 */

public class Stairs {

  public static void main(String[] args) {

    int stairs = 3;

    System.out.println(stairs);
  }


  public static int noOfWays(int steps) {

    if (steps == 1) {
      return 1;
    }

    int noOfWays = 0;

    int first = 1;
    int second = 1;

    for (int i = 2; i <= steps; i++) {
      noOfWays = first + second;
      first = second;
      second = noOfWays;
    }
    return noOfWays;
  }
}
