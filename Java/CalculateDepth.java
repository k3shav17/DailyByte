/**
 * Given a binary tree, return its maximum depth. Note: the maximum depth is
 * defined as the number of nodes along the longest path from root node to leaf
 * node.
 *
 * Ex: Given the following tree…
 *
 * 9 / \ 1 2 return 2 Ex: Given the following tree…
 *
 * 5 / \ 1 29 / \ 4 13 return 3
 */
public class CalculateDepth {

  public static int depthOfTree(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return Integer.max(depthOfTree(root.right), depthOfTree(root.left)) + 1;
  }
}
