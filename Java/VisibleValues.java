import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Given a binary tree return all the values you’d be able to see if you were
 * standing on the left side of it with values ordered from top to bottom.
 *
 * Ex: Given the following tree…
 *
 * --> 4 / \ --> 2 7 return [4, 2] Ex: Given the following tree…
 *
 * --> 7 / \ --> 4 9 / \ / \ --> 1 4 8 9 \ --> 9 return [7, 4, 1, 9]
 *
 */

public class VisibleValues {


  public static ArrayList<Integer> visibleLeaves(TreeNode root) {

    if (root == null)
      return new ArrayList<>();

    Deque<TreeNode> queue = new LinkedList<>(); 
    ArrayList<Integer> visibleList = new ArrayList<>();
    queue.offer(root);

    while (queue.size() > 0) {

      int n = queue.size();
      int num = 0;

      for (int i = 0; i < n; i++) {

        TreeNode tempNode = queue.poll();
        num = queue.getFirst().data;

        if (tempNode.left != null) {
          queue.offer(tempNode.left);
        }

        if (tempNode.right != null) {
          queue.offer(tempNode.right);
        }
      }
      visibleList.add(num);
    }
    return visibleList;
  }
}
