import java.util.ArrayList;

/**
 * This question is asked by Microsoft. Design a class, MovingAverage, which
 * contains a method, next that is responsible for returning the moving average
 * from a stream of integers. Note: a moving average is the average of a subset
 * of data at a given point in time.
 *
 * Ex: Given the following series of events...
 *
 * the moving average has a capacity of 3. MovingAverage movingAverage = new
 * MovingAverage(3); m.next(3) returns 3 because (3 / 1) = 3 m.next(5) returns 4
 * because (3 + 5) / 2 = 4 m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
 * m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6
 *
 * MovingAverage class definition:
 */

public class MovingAverage {
  int size;
  ArrayList<Integer> list;

  /**
   * Initializes a MovingAverage with a capacity of `size`.
   */
  public MovingAverage(int size) {
    this.size = size;
    list = new ArrayList<>(this.size);
  }

  /**
   * Adds `val` to the stream of numbers and returns the current average of the
   * numbers.
   */
  public double next(int val) {
    list.add(val);

    if (list.size() > size)
      list.remove(0);

    int sum = list.stream().reduce(0, (a, b) -> a + b);
    return sum / list.size();
  }

  public static void main(String[] args) {

    MovingAverage m = new MovingAverage(3);
    System.out.println(m.next(3));
    System.out.println(m.next(5));
    System.out.println(m.next(7));
    System.out.println(m.next(6));
  }

}
