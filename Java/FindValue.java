import java.util.Stack;

/*
 * This question is asked by Google. Given the reference to the root of a binary
 * search tree and a search value, return the reference to the node that
 * contains the value if it exists and null otherwise. Note: all values in the
 * binary search tree will be unique.
 *
 * Ex: Given the tree...
 *
 * 3 / \ 1 4 and the search value 1 return a reference to the node containing 1.
 * Ex: Given the following tree...
 *
 * 7 / \ 5 9 / \ 8 10 and the search value 9 return a reference to the node
 * containing 9. Ex: Given the following tree...
 *
 * 8 / \ 6 9 and the search value 7 return null.
 */

public class FindValue {

  public static TreeNode nodeOfValue(int valueToBeSearched, TreeNode root) {

    if (root == null)
      return root;

    Stack<TreeNode> stackOfTreeNodes = new Stack<>();
    stackOfTreeNodes.push(root);

    while (!stackOfTreeNodes.isEmpty()) {

      TreeNode tempNode = stackOfTreeNodes.pop();
      int valueOfNode = tempNode.data;

      if (valueOfNode == valueToBeSearched)
        return tempNode;

      if (tempNode.left != null)
        stackOfTreeNodes.push(tempNode.left);
      if (tempNode.right != null)
        stackOfTreeNodes.push(tempNode.right);
    }

    return null;
  }
}
