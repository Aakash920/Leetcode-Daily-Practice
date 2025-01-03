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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        boolean flag=false;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0 ; i<size ; i++){
                TreeNode curr=q.poll();
                if(curr!=null)
                    list.add(curr.val);

                if(curr.left!=null)
                    q.offer(curr.left);
                    
                if(curr.right!=null)
                    q.offer(curr.right);
                
                
            }
            if(flag==false){
                ans.add(list);
                flag=true;
            }else{
                Collections.reverse(list);
                ans.add(list);
                flag=false;
            }
        }
        return ans;
    }
}