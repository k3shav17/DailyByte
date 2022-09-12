/**
 * This question is asked by Microsoft. Given a linked list, containing unique
 * numbers, return whether or not it has a cycle. Note: a cycle is a circular
 * arrangement (i.e. one node points back to a previous node)
 *
 * Ex: Given the following linked lists...
 *
 * 1->2->3->1 -> true (3 points back to 1) 1->2->3 -> false 1->1 true (1 points
 * to itself)
 */

public class ContainsCycle {

  public static boolean hasCycle(Node head) {

    if (head == null)
      return false;

    Node slow = head;
    Node fast = head.next;

    while (slow != fast) {

      if (fast == null || fast.next == null)
        return false;

      slow = slow.next;
      fast = fast.next.next;
    }

    return true;
  }

  // public static boolean hasCycle(Node head) {

  // if (head == null)
  // return false;

  // HashSet<Integer> visited = new HashSet<>();
  // Node curr = head;

  // while (curr.next != null) {

  // if (visited.contains(curr.data)) {
  // return true;
  // } else {
  // visited.add(curr.data);
  // }
  // }
  // return false;
  // }
}
