/*Detect cycle in an undirected graph using DFS*/ 

public boolean dfs(int src,int parent,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[src]=true;
        
         for(Integer i:adj.get(src)){
                 if(vis[i]==false){
                     if(dfs(i,src,adj,vis)==true){
                         return true;
                     }
                 }
                 else if(parent!=i){
                     return true;
                 }
         }
         return false;
    }
    
     public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
      
        for(int i=0;i<V;i++){
            if(vis[i]==false){
            if(dfs(i,-1,adj,vis)==true){
                return true;
            }
            }
        }
        return false;
     }
        
