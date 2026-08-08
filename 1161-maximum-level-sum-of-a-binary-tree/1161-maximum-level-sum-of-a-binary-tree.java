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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<TreeNode>();
        if(root==null){
            return 0;
        }
        queue.offer(root);
        int max=Integer.MIN_VALUE;
        int answer=0;
        int level=0;
        while(!queue.isEmpty()){
            int s=queue.size();
            
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode current= queue.poll();
                sum+=current.val;
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            level++;
            if(sum>max){
                max=sum;
                answer=level;
            }
         
        }
        return answer;
        
    }
}