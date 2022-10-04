import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * This problem was asked by Google.
 *
 * Given two singly linked lists that intersect at some point, find the
 * intersecting node. The lists are non-cyclical.
 *
 * For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return
 * the node with value 8.
 */

public class DCP7 {
  public static NodeDCP intersectionPoint(NodeDCP headA, NodeDCP headB) {

    if (headA == null && headB == null)
      return headA;

    HashSet<Integer> nodeSet = new HashSet<>();

    while (headA.next != null) {
      nodeSet.add(headA.data);
      headA = headA.next;
    }

    while (headB.next != null) {
      if (nodeSet.contains(headB.data)) {
        break;
      } else {
        nodeSet.add(headB.data);
        headB = headB.next;
      }
    }

    return headB;
  }

  public static void main(String[] args) {

    NodeDCP rootNode = new NodeDCP(3);
    rootNode.next = new NodeDCP(7);
    rootNode.next.next = new NodeDCP(8);
    rootNode.next.next.next = new NodeDCP(10);

    NodeDCP rootNod = new NodeDCP(99);
    rootNod.next = new NodeDCP(1);
    rootNod.next.next = new NodeDCP(8);
    rootNod.next.next.next = new NodeDCP(10);

    System.out.println(intersectionPoint(rootNode, rootNod).data);
  }
}

class NodeDCP {

  int data;
  NodeDCP next;

  public NodeDCP(int data) {
    this.data = data;
  }
}
