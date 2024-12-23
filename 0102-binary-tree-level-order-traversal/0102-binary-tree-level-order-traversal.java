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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0 ; i<len ; i++){
                TreeNode curr=q.removeFirst();
                if(curr!=null){
                    list.add(curr.val);

                    q.addLast(curr.left);
                    q.addLast(curr.right);
                }
            }
            if(list.size()>0) ans.add(list);
        }
        return ans;
    }
}