/**
 * Given a binary search tree, return the minimum difference between any two
 * nodes in the tree.
 *
 * Ex: Given the following tree... 2 / \ 3 1 return 1. Ex: Given the following
 * tree... 29 / \ 17 50 / / \ 1 42 59 return 8. Ex: Given the following tree...
 * 2 \ 100 return 98.
 */

public class MinimumDifference {

  static int minDiff = Integer.MAX_VALUE;
  static TreeNode prev;

  public static int minimumDifferenceOfTwoNodes(TreeNode root) {

    inorder(root);
    return minDiff;

  }

  public static void inorder(TreeNode root) {

    if (root == null)
      return;

    inorder(root.left);
    if (prev != null) minDiff = Math.min(minDiff, root.data - prev.data);
    prev = root;
    inorder(root.right);
  }
}
