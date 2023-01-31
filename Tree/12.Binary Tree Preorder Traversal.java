/*Q)Binary Tree Preorder Traversal

Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

CODE:*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
   LinkedList<Integer> ans=new LinkedList<>();

        return helper(root,ans);
        
    }
    public List<Integer> helper(TreeNode root,LinkedList ans){
        if(root==null){
            return ans;
        }
        ans.add(root.val);
        helper(root.left,ans);
        helper(root.right,ans);
        return ans;
    }
}
