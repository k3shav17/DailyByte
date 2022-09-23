import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, returns of all its levels in a bottom-up fashion (i.e.
 * last level towards the root). Ex: Given the following tree…
 *
 * 2 / \ 1 2 return [[1, 2], [2]] Ex: Given the following tree…
 *
 * 7 / \ 6 2 / \ 3 3 return [[3, 3], [6, 2], [7]]
 */

public class BottomsUp {

  public static List<List<Integer>> bottomToTop(TreeNode root) {

    List<List<Integer>> listOfLevelNodes = new ArrayList<>();

    if (root == null)
      return listOfLevelNodes;

    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);

    while (queue.size() > 0) {

      ArrayList<Integer> tempList = new ArrayList<>();
      TreeNode tempNode = queue.peek();

      while (queue.size() > 0) {
        tempList.add(queue.poll().data);
      }

      if (tempNode.left != null)
        queue.offer(tempNode.left);
      if (tempNode.right != null)
        queue.offer(tempNode.right);

      if (tempList.size() > 0)
        listOfLevelNodes.add(tempList);
    }
    Collections.reverse(listOfLevelNodes);
    return listOfLevelNodes;
  }
}
