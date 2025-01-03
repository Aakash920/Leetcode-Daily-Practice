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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }   
    public int helper(TreeNode node){
        if(node==null) return 0;

        int ls=helper(node.left);
        int rs=helper(node.right);

        ls=Math.max(0,ls);
        rs=Math.max(0,rs);

        max=Math.max(max, ls+rs+node.val);
        return Math.max(ls,rs)+node.val;
    }
}