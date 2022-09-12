
/*
 * This question is asked by Apple. Given two sorted linked lists, merge them together in ascending order and return a reference to the merged list

 * Ex: Given the following lists...
 *
 * list1 = 1->2->3, list2 = 4->5->6->null, return 1->2->3->4->5->6->null
 * list1 = 1->3->5, list2 = 2->4->6->null, return 1->2->3->4->5->6->null
 * list1 = 4->4->7, list2 = 1->5->6->null, return 1->4->4->5->6->7->null
 */
public class MergeLinkedLists {

  public static Node merge(Node node1, Node node2) {

    Node temp = new Node(0);
    Node res = temp;

    while (node1 != null && node2 != null) {

      if (node1.data < node2.data) {
        res.next = node1;
        node1 = node1.next;
      } else {
        res.next = node2;
        node2 = node2.next;
      }
      res = res.next;
    }

    if (node1 != null) {
      res.next = node1;
      node1 = node1.next;
    }

    if (node2 != null) {
      res.next = node2;
      node2 = node2.next;
    }
    return temp.next;
  }
}
