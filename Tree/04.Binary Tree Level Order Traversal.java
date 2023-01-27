/*Q)Binary Tree Level Order Traversal

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]



CODE:*/

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
        ArrayList<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null) return ans;
        q.offer(root);

        while(!q.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();

                list.add(cur.val);

                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
