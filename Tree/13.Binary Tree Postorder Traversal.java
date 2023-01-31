/*Q)Binary Tree Postorder Traversal

Given the root of a binary tree, return the postorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:
Input: root = []
Output: []



CODE:*/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
   LinkedList<Integer> ans=new LinkedList<>();

        return helper(root,ans);
        
    }
    public List<Integer> helper(TreeNode root,LinkedList ans){
        if(root==null){
            return ans;
        }
        
        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.val);
        return ans;
    }
}
