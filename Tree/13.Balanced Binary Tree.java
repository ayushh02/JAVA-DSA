/*Q)Balanced Binary Tree
Given a binary tree, determine if it is 
height-balanced
.
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: true

Example 2:
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false



CODE:*/

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return Math.abs(maxHeight(root.left)-maxHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
public int maxHeight(TreeNode root){
    if(root==null) return 0;

    return Math.max(maxHeight(root.left),maxHeight(root.right))+1;
}

}
