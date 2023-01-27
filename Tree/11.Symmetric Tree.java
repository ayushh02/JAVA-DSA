/*Q)Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
 
 
 
 
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
    public boolean isSymmetric(TreeNode root) {
        if (root== null) return true;
   
        return  Symmetric(root.left,root.right);
  }

  public boolean Symmetric(TreeNode l,TreeNode r) {
      if (l== null || r == null) return (l==r);
 
      if(l.val!=r.val){
          return false;
      }
      return Symmetric(l.left,r.right) && Symmetric(l.right,r.left);

  }
}
