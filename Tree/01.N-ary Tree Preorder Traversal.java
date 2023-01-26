/*Q)N-ary Tree Preorder Traversal

Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]


CODE:*/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> ans=new LinkedList<>();
        return helper(root,ans);  
    }

    public List<Integer> helper(Node root,LinkedList ans){
        if(root==null){
            return ans;
        }

        ans.add(root.val);
       
        for(Node i : root.children){
            helper(i,ans);
        }
        
        return ans;
    }

}
