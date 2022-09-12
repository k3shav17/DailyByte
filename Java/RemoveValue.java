/*
 * This question is asked by Google. Given a linked list and a value, remove all
 * nodes containing the provided value, and return the resulting list.
 *
 * Ex: Given the following linked lists and values...
 *
 * 1->2->3->null, value = 3, return 1->2->null 8->1->1->4->12->null, value = 1,
 * return 8->4->12->null 7->12->2->9->null, value = 7, return 12->2->9->null
 */

public class RemoveValue {

  public static Node remove_repeated(Node head, int val) {

    Node curr = head;

    if (curr != null && curr.data == val)
      curr = curr.next;

    while (curr != null && curr.next != null) {
      if (curr.next.data == val)
        curr.next = curr.next.next;
      else
        curr = curr.next;
    }
    return head;
  }
}
