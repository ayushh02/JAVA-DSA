/*Q) Kth Smallest Element in a BST

Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3




CODE:*/
class Solution {
    int c=0;
    int ans=Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root,k);
        return ans;
    }

    public void inorder(TreeNode root,int k){
        if(root==null){
            return ;
        }
        inorder(root.left,k);
        c++;
        if(c==k){
            ans= root.val;
        }
        inorder(root.right,k);
      
    }
}
