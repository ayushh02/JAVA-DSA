/*Bipartite Graph using BFS
Given an adjacency list of a graph adj  of V no. of vertices having 0 based index. Check whether the graph is bipartite or not.
 
Example 1:
Input: 
Output: 1
Explanation: The given graph can be colored 
in two colors so, it is a bipartite graph.
Example 2:
Input:
Output: 0
Explanation: The given graph cannot be colored 
in two colors such that color of adjacent 
vertices differs. 


CODE:*/

class Solution
{
    public boolean helper(int start,int color[], ArrayList<ArrayList<Integer>>adj)
    {
        Queue <Integer> q = new LinkedList<>();
        q.add(start);
        color[start]=0;
        
        while(!q.isEmpty()){
            int node=q.poll();
            
            for(int i:adj.get(node)){
                if(color[i]==-1){
                    color[i]=1-color[node];
                    q.add(i);
                }
                else if(color[i]==color[node]){
                        return false;
                    }
                
            }
        }
        return true;
    }
    
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int color[]=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(helper(i,color,adj)==false){
                    return false;
                }
            }
        }
        return true;
    }
}
