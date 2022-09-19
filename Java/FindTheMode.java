import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a binary search tree, return its mode (you may assume the answer is
 * unique). If the tree is empty, return -1. Note: the mode is the most
 * frequently occurring value in the tree.
 *
 * Ex: Given the following tree...
 *
 * 2 / \ 1 2 return 2.
 *
 * Ex: Given the following tree...
 *
 * 7 / \ 4 9 / \ / \ 1 4 8 9 \ 9 return 9.
 */

public class FindTheMode {

  public static int modeInTree(TreeNode root) {

    if (root == null)
      return -1;

    HashMap<Integer, Integer> repeatedNodeMap = new HashMap<>();

    Stack<TreeNode> treeStack = new Stack<>();
    treeStack.push(root);

    while (treeStack.size() > 0) {

      TreeNode tempTreeNode = treeStack.pop();
      repeatedNodeMap.put(tempTreeNode.data, repeatedNodeMap.getOrDefault(tempTreeNode.data, 0) + 1);

      if (tempTreeNode.left != null)
        treeStack.push(tempTreeNode.left);
      if (tempTreeNode.right != null)
        treeStack.push(tempTreeNode.right);

    }

    return repeatedNodeMap.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow();
  }
}
