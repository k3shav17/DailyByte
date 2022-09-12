import java.util.LinkedList;
import java.util.Queue;

/**
 * This question is asked by Google. Create a class CallCounter that tracks the
 * number of calls a client has made within the last 3 seconds. Your class
 * should contain one method, ping(int t) that receives the current timestamp
 * (in milliseconds) of a new call being made and returns the number of calls
 * made within the last 3 seconds. Note: you may assume that the time associated
 * with each subsequent call to ping is strictly increasing.
 *
 * Ex: Given the following calls to ping…
 *
 * ping(1), return 1 (1 call within the last 3 seconds) ping(300), return 2 (2
 * calls within the last 3 seconds) ping(3000), return 3 (3 calls within the
 * last 3 seconds) ping(3002), return 3 (3 calls within the last 3 seconds)
 * ping(7000), return 1 (1 call within the last 3 seconds)
 */

public class CallCounter {

  Queue<Integer> queue;

  public CallCounter() {
    queue = new LinkedList<>();
  }

  public int ping(int t) {
    queue.offer(t);
    while (queue.peek() < t - 3000) {
      queue.poll();
    }
    return queue.size();
  }

  public static void main(String[] args) {

    CallCounter cc = new CallCounter();
    System.out.println(cc.ping(1));
    System.out.println(cc.ping(300));
    System.out.println(cc.ping(3000));
    System.out.println(cc.ping(3002));
    System.out.println(cc.ping(7000));
  }
}
