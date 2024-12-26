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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xNode=find(root,x);
        TreeNode yNode=find(root,y);

        int xLevel=level(root,xNode,0);
        int yLevel=level(root,yNode,0);

        boolean sibling=isSibling(root,xNode,yNode);

        return ((xLevel==yLevel) && !sibling);
    }
    TreeNode find(TreeNode root, int x){
        if(root==null) return null;

        if(root.val==x){
            return root;
        }
        TreeNode lFind=find(root.left,x);
        if(lFind!=null){
            return lFind;
        }
        TreeNode rFind=find(root.right,x);
        return rFind;
    }
    int level(TreeNode root, TreeNode x, int currLevel){
        if(root==null) return 0;
        if(root==x){
            return currLevel;
        }
        int lLevel=level(root.left, x, currLevel+1);
        if(lLevel!=0) return lLevel;

        return level(root.right, x, currLevel+1);
    }
    boolean isSibling(TreeNode root, TreeNode x, TreeNode y){
        if(root==null) return false;
        return ((root.left==x && root.right==y) || (root.left==y && root.right==x) || isSibling(root.left,x,y) || isSibling(root.right,x,y));
    }
}