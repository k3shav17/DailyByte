
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

    // Node node = new Node(1);
    // node.next = new Node(9);
    // node.next.next = new Node(3);
    // node.next.next.next = new Node(7);
    // node.next.next.next.next = new Node(5);
    // node.next.next.next.next.next = new Node(2);

    // printLists(ReverseList.reverse(node));

    // TreeNode rootNode = new TreeNode(8);
    // rootNode.right = new TreeNode(9);
    // rootNode.left = new TreeNode(6);
    // // rootNode.right.right = new TreeNode(10);
    // // rootNode.right.left = new TreeNode(8);

    // TreeNode res = FindValue.nodeOfValue(7, rootNode);

    // if (res == null)
    // System.out.println("null");
    // else
    // System.out.println(res.data);

    // TreeNode rootNode = new TreeNode(5);
    // rootNode.right = new TreeNode(9);
    // rootNode.left = new TreeNode(2);
    // rootNode.left.right = new TreeNode(3);
    // rootNode.left.left = new TreeNode(1);

    // System.out.println(BinaryToLinkedList.binaryToLinked(rootNode));

    // TreeNode firstTree = new TreeNode(1);
    // firstTree.right = new TreeNode(9);
    // firstTree.right.right = new TreeNode(18);

    // TreeNode secondTree = new TreeNode(1);
    // secondTree.left = new TreeNode(9);
    // secondTree.left.right = new TreeNode(18);

    // System.out.println(IdenticalTrees.areTreesIdentical(firstTree, secondTree));

    // TreeNode rootNode = new TreeNode(29);
    // rootNode.right = new TreeNode(50);
    // rootNode.right.right = new TreeNode(59);
    // rootNode.right.left = new TreeNode(42);

    // rootNode.left = new TreeNode(17);
    // rootNode.left.left = new TreeNode(1);
    // TreeNode rootNode = new TreeNode(2);
    // rootNode.right = new TreeNode(100);

    // System.out.println(MinimumDifference.minimumDifferenceOfTwoNodes(rootNode));

    // FindTheMode
    TreeNode rootNode = new TreeNode(7);
    rootNode.left = new TreeNode(4);
    rootNode.left.right = new TreeNode(4);
    rootNode.left.left = new TreeNode(1);
    rootNode.right = new TreeNode(9);
    rootNode.right.right = new TreeNode(9);
    rootNode.right.right.right = new TreeNode(9);
    rootNode.right.left = new TreeNode(8);

    System.out.println(FindTheMode.modeInTree(rootNode));
  }

  public static void printLists(Node node) {
    while (node != null) {
      System.out.print(node.data + "->");
      node = node.next;
    }
    System.out.println("null");
  }
}
