import java.util.HashSet;

/*
 * This question is asked by Apple. Given a potentially cyclical linked list
 * where each value is unique, return the node at which the cycle starts. If the
 * list does not contain a cycle, return null.
 *
 * Ex: Given the following linked lists...
 *
 * 1->2->3, return null
 *
 * 1->2->3->4->5->2 (5 points back to 2), return a
 * reference to the node containing 2
 *
 * 1->9->3->7->7 (7 points to itself), return
 * a reference to the node containing 7
 */

public class ReturnStartOfCycle {

  public static Node startingPoint(Node head) {

    HashSet<Integer> node_set = new HashSet<>();
    Node temp = head;

    while (temp != null) {
      if (node_set.contains(temp.data)) {
        return temp;
      }
      node_set.add(temp.data);
      temp = temp.next;
    }
    return null;
  }
}
