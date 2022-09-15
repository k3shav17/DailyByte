import java.util.LinkedList;

/**
 * Given a binary search tree, rearrange the tree such that it forms a linked
 * list where all its values are in ascending order.
 *
 * Ex: Given the following tree... 5 / \ 1 6 return...
 *
 * 1 \ 5 \ 6 Ex: Given the following tree...
 *
 * 5 / \ 2 9 / \ 1 3 return...
 *
 * 1 \ 2 \ 3 \ 5 \ 9 Ex: Given the following tree...
 *
 * 5 \ 6 return...
 *
 * 5 \ 6
 */

public class BinaryToLinkedList {

  static LinkedList<Integer> linkedList = new LinkedList<>();

  public static LinkedList<Integer> binaryToLinked(TreeNode root) {

    if (root == null)
      return linkedList;

    binaryToLinked(root.left);
    linkedList.add(root.data);
    binaryToLinked(root.right);

    return linkedList;
  }
}
