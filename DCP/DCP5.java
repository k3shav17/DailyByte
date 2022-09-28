import java.util.ArrayList;

/**
 * You run an e-commerce website and want to record the last N order ids in a
 * log. Implement a data structure to accomplish this, with the following API:
 *
 * record(order_id): adds the order_id to the log get_last(i): gets the ith last
 * element from the log. i is guaranteed to be smaller than or equal to N.
 */

public class DCP5 {

  static ArrayList<Integer> orderList = new ArrayList<>();

  public static void record(int orderId) {
    orderList.add(orderId);
  }

  public static int getLast(int ithOrder) {

    int size = orderList.size();

    if (!orderList.isEmpty()) {
      for (int order = size - 1; order >= size - ithOrder; order--) {
        if (order == (size - ithOrder))
          return orderList.get(order);
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    record(1);
    record(2);
    record(8);
    record(3);

    if (getLast(4) < 0) {
      System.out.println("order log is empty");
    } else
      System.out.println(getLast(4));
  }
}
