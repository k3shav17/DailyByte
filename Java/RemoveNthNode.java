/*
 * This question is asked by Facebook. Given a linked list and a value n, remove the nth to last node and return the resulting list.

 * Ex: Given the following linked lists...
 *
 * 1->2->3->null, n = 1, return 1->2->null
 * 1->2->3->null, n = 2, return 1->3->null
 * 1->2->3->null, n = 3, return 2->3->null
 * */
public class RemoveNthNode {
  public static Node remove_nth(Node node, int n) {

    int length = 0;
    Node dummy = new Node(0);
    dummy.next = node;
    Node curr = node;

    while (curr != null) {
      length++;
      curr = curr.next;
    }

    int i = length - n;
    curr = dummy;
    while (i > 0) {
      i--;
      curr = curr.next;
    }
    curr.next = curr.next.next;
    return dummy.next;
  }
}
