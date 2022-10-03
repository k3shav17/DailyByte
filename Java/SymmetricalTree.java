/**
 * Given a binary tree, return whether or not it forms a reflection across its
 * center (i.e. a line drawn straight down starting from the root). Note: a
 * reflection is when an image, flipped across a specified line, forms the same
 * image.
 *
 * Ex: Given the following tree…
 *
 * 2 / \ 1 1 return true as when the tree is reflected across its center all the
 * nodes match. Ex: Given the following tree…
 *
 * 1 / \ 5 5 \ \ 7 7 return false as when the tree is reflected across its
 * center the nodes containing sevens do not match.
 */

public class SymmetricalTree {

  public static boolean isSymmetrical(TreeNode root) {

    if (root == null)
      return true;

    return isMirror(root.right, root.left);
  }

  public static boolean isMirror(TreeNode right, TreeNode left) {

    if (right == null && left == null)
      return true;

    if (right == null || left == null)
      return false;

    return right.data == left.data && isMirror(right.right, left.left) && isMirror(right.left, left.right);
  }
}
