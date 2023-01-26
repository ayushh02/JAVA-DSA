/*Binary Tree Inorder Traversal

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]



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
    public List<Integer> inorderTraversal(TreeNode root) {
    LinkedList<Integer> ans=new LinkedList<>();
    return helper(root,ans);  
    }

    public List<Integer> helper(TreeNode root,LinkedList ans){
        if(root==null){
            return ans;
        }

       helper(root.left,ans);
       ans.add(root.val);
       helper(root.right,ans);
       
       return ans;
    }
    
}
