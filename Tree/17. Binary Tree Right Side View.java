/*Q)Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]


CODE:
*/
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        rightview(root,0,ans);
        return ans;
    }

    public void rightview(TreeNode node,int depth,List<Integer>ans){
        if(node==null){
            return;
        }

        if(depth==ans.size()){
            ans.add(node.val);
        }
        rightview(node.right,depth+1,ans);
        rightview(node.left,depth+1,ans);

    }
}
