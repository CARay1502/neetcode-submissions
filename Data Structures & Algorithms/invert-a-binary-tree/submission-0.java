/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);// add root node to queue
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); //pull root from queue
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.offer(node.left); //continues queue by offering left child of node
            }
            if (node.right != null) {
                queue.offer(node.right); //offer right child of node
            }
        }
        return root;
    }
}
