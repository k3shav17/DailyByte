import java.util.LinkedList;
import java.util.Queue;

/**
 * Design a class to implement a stack using only a single queue. Your class,
 * QueueStack, should support the following stack methods: push() (adding an
 * item), pop() (removing an item), peek() (returning the top value without
 * removing it), and empty() (whether or not the stack is empty).
 */

public class QueueStack {

  static Queue<Integer> queue = new LinkedList<>();

  public static void push(int element) {
    queue.add(element);
    for (int i = 1; i < queue.size(); i++) {
      queue.add(queue.remove());
    }
  }

  public static void pop() {
    queue.remove();
  }

  public static int peek() {
    return queue.peek();
  }

  public static boolean isEmpty() {
    return queue.isEmpty();
  }

  public static void main(String[] args) {
    QueueStack.push(1);
    QueueStack.push(2);
    QueueStack.push(3);
    QueueStack.push(4);

    System.out.println(QueueStack.peek());
    QueueStack.pop();
    System.out.println(QueueStack.peek());
  }
}
