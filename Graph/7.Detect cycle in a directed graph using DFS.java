/*Detect cycle in a directed graph*/
class Solution {
     public boolean dfs(int node,int vis[],int pathvis[], ArrayList<ArrayList<Integer>> adj){
         vis[node]=1;
         pathvis[node]=1;
         
         //Traverse the adjacent nodes
         for(int i:adj.get(node)){
             //if not visited
             if(vis[i]==0){
                 if(dfs(i,vis,pathvis,adj)==true){ //recursion
                     return true;
                 }
             }
             //if visited and path is also visited then a cycle
             else if(pathvis[i]==1){
                 return true;
             }
         }
         
         pathvis[node]=0;
         return false;
     }
    
    
    
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[]=new int[V];
        int pathvis[]=new int[V];
        
        for(int i=0;i<V;i++){            //for components which are not reachable from start node.
           if(vis[i]==0){
               if(dfs(i,vis,pathvis,adj)==true){
                   return true;
               }
           }
        }
        return false;
    }
}
