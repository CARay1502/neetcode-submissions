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

 ==== recursive solution - Depth First Search ====
 this solution takes a binary tree and inverts it by inverting the tree recursively in a top-down manner. 

 step 0: check if tree is empty (if root == null)
 step 1: swap the nodes left and right pointers
 step 2: recursively call dfs on the new left child
 step 3: recursivley call dfs on teh new right child
 step 4: return the current node (inverted)
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { return null; }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
