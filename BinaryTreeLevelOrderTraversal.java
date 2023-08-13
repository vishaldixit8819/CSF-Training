import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the values of the binary tree nodes : ");
        String input = scanner.nextLine();

        // Split the input string and construct the binary tree
        String[] values = input.split(" ");
        TreeNode root = constructBinaryTree(values, 0);

        // Perform level order traversal
        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> levelOrderTraversal = solution.levelOrder(root);
        System.out.println("Level order traversal: " + levelOrderTraversal);
    }

    private static TreeNode constructBinaryTree(String[] values, int index) {
        if (index >= values.length || values[index].equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(values[index]));
        node.left = constructBinaryTree(values, 2 * index + 1);
        node.right = constructBinaryTree(values, 2 * index + 2);
        return node;
    }
}
