/*
 * This question is asked by Amazon. Given a non-empty linked list, return the
 * middle node of the list. If the linked list contains an even number of
 * elements, return the node closer to the end. Ex: Given the following linked
 * lists...
 *
 * 1->2->3->null, return 2 1->2->3->4->null, return 3 1->null, return 1*
 */

public class MiddleElement {

  public static Node middle(Node head) {

    int length = 0;
    Node temp = head;

    while (temp != null) {
      length++;
      temp = temp.next;
    }

    int i = 0;
    Node curr = head;
    while (i++ < length / 2) {
      curr = curr.next;
    }
    return curr;
  }
}
