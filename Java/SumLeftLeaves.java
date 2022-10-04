import java.util.Stack;

/**
 * Given a binary tree, return the sum of all left leaves of the tree. Ex: Given the following tree…
 *
 * 5
 * / \
 * 2   12
 * /  \
 * 3    8
 * return 5 (i.e. 2 + 3)
 * Ex: Given the following tree…
 *
 * 2
 * / \
 * 4    2
 * / \
 * 3   9
 * return 3
 */

public class SumLeftLeaves {

    public static int leftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int sumOfLeaves = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode tempNode = stack.pop();

            if (tempNode.left != null) {
                if (tempNode.left.left == null && tempNode.left.right == null) {
                    sumOfLeaves += tempNode.left.data;
                }
                stack.push(tempNode.left);
            }

            if (tempNode.right != null) {
                stack.push(tempNode.right);
            }
        }
        return sumOfLeaves;
    }
}
