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
    public boolean isSymmetric(TreeNode root) {
        // if(root==null) return false;
        return BFS(root.left,root.right);
        // return check(root.left,root.right);
    }
    //DFS Approach
    // public boolean check(TreeNode l, TreeNode r){
    //     if(l==null && r==null) return true;
    //     if(l==null || r==null) return false;
    //     if(l.val!=r.val){
    //         return false;
    //     }
    //     return check(l.left,r.right) && check(l.right,r.left);
    // }

    public boolean BFS(TreeNode l, TreeNode r){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(l);
        q.add(r);
        while(!q.isEmpty()){
            TreeNode lside=q.poll();
            TreeNode rside=q.poll();
            if(lside==null && rside==null) {
                continue;
            }

            if(lside==null || rside==null){
                return false;
            }
            
            if(lside.val!=rside.val){
                return false;
            }
            q.offer(lside.left);
            q.offer(rside.right);
            q.offer(lside.right);
            q.offer(rside.left);
        }
        return true;
    }
}