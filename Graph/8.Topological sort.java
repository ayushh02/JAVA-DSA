/*8.Topological sort
Given a Directed Acyclic Graph (DAG) with V vertices and E edges, Find any Topological Sorting of that Graph.

Example 1:

Input:

Output:
1
Explanation:
The output 1 denotes that the order is
valid. So, if you have, implemented
your function correctly, then output
would be 1 for all test cases.
One possible Topological order for the
graph is 3, 2, 1, 0.
Example 2:

Input:

Output:
1
Explanation:
The output 1 denotes that the order is
valid. So, if you have, implemented
your function correctly, then output
would be 1 for all test cases.
One possible Topological order for the
graph is 5, 4, 2, 1, 3, 0.

CODE:
*/


class Solution
{
    
    public static void dfs(int node,int vis[],Stack<Integer> s, ArrayList<ArrayList<Integer>> adj){
         vis[node]=1;
         
         for(int i:adj.get(node)){
             if(vis[i]==0){
                 dfs(i,vis,s,adj);
             }
         }
          s.push(node);
    }
     
    //Function to return list containing vertices in Topological order. 
   public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int vis[]=new int[V];
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,vis,s,adj);
            }
        }
        
        int ans[]=new int[V];
        int i=0;
        while(!s.isEmpty()){
            ans[i++]=s.pop();
        }
        return ans;
    }
}

