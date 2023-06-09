/*Bipartite Graph using DFS*/

public boolean dfs(int start,int col,int color[], ArrayList<ArrayList<Integer>>adj){
        
        color[start]=col;
        
        for(int i:adj.get(start)){
            if(color[i]==-1){
                if(dfs(i,1-col,color,adj)==false){
                    return false;
                }
            }
            else if(color[i]==col){
                return false;
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
                if(dfs(i,0,color,adj)==false){
                    return false;
                }
            }
        }
        return true;
    }
