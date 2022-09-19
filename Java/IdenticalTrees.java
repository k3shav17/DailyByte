/**
 * Given two binary trees, return whether or not the two trees are identical.
 * Note: identical meaning they exhibit the same structure and the same values
 * at each node. Ex: Given the following trees...
 *
 * 2 / \ 1 3 2 / \ 1 3
 *
 * return true.
 *
 * Ex: Given the following trees...
 *
 * 1 \ 9 \ 18 1 / 9 \ 18
 *
 * return false.
 *
 * Ex: Given the following trees...
 *
 * 2 / \ 3 1 2 / \ 1 3
 *
 * return false.
 */

public class IdenticalTrees {

  public static boolean areTreesIdentical(TreeNode rootOne, TreeNode rootTwo) {

    if (rootOne == null && rootTwo == null)
      return true;

    if (rootOne == null || rootTwo == null)
      return false;

    if (rootOne.data != rootTwo.data)
      return false;

    return areTreesIdentical(rootOne.right, rootTwo.right) && areTreesIdentical(rootOne.left, rootTwo.left);
  }
}
