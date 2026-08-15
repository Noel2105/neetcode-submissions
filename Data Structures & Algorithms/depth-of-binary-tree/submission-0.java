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
    private int max = 0;
    private int cnt = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            max = Math.max(max, cnt);
            return max;
        }
        cnt +=1 ;
        maxDepth(root.left);
        maxDepth(root.right);
        cnt -= 1;
        return max;
    }
}
