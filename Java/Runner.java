public class Runner {
  public static void main(String[] args) {

    // Merge LinkedLists
    // Node node = new Node(4);
    // node.next = new Node(4);
    // node.next.next = new Node(7);

    // Node node2 = new Node(1);
    // node2.next = new Node(5);
    // node2.next.next = new Node(6);
    // Node result = MergeLinkedLists.merge(node, node2);

    // RemoveNthNode
    // Node rem = new Node(1);
    // rem.next = new Node(2);
    // rem.next.next = new Node(3);
    // int n = 3;
    // RemoveNthNode.remove_nth(rem, n);
    // Runner.printLists(rem);

    // RemoveValue

    // Node node = new Node(1);
    // node.next = new Node(2);
    // node.next.next = new Node(3);
    // node.next.next.next = new Node(4);
    // node.next.next.next.next = new Node(12);

    // RemoveValue.remove_repeated(node, 7);
    // Runner.printLists(node);

    // ContainsCycle
    // Node node = new Node(1);
    // node.next = new Node(2);
    // node.next.next = new Node(3);
    // node.next.next.next = new Node(1);

    // System.out.println(ContainsCycle.hasCycle(node));

    // ReturnStartOfCycle
    // Node node = new Node(1);
    // node.next = new Node(9);
    // node.next.next = new Node(3);
    // node.next.next.next = new Node(7);
    // node.next.next.next.next = new Node(7);
    // // node.next.next.next.next.next = new Node(2);

    // Node res = ReturnStartOfCycle.startingPoint(node);
    // if (res != null)
    // System.out.println(res.data);
    // else
    // System.out.println("null");

    // ReverseList

    Node node = new Node(1);
    node.next = new Node(9);
    node.next.next = new Node(3);
    node.next.next.next = new Node(7);
    node.next.next.next.next = new Node(5);
    node.next.next.next.next.next = new Node(2);

    printLists(ReverseList.reverse(node));

  }

  public static void printLists(Node node) {
    while (node != null) {
      System.out.print(node.data + "->");
      node = node.next;
    }
    System.out.println("null");
  }
}
