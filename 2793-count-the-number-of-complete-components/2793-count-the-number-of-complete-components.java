class Solution {
    private void dfs(int curr, int[] nodes, int[] edges, List<List<Integer>> list1, boolean[] visited){
        nodes[0]++;
        visited[curr] = true;
        for(int nbr : list1.get(curr)){
            edges[0]++;
            if(!visited[nbr]){
                dfs(nbr, nodes, edges, list1, visited);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            list1.get(edge[0]).add(edge[1]);
            list1.get(edge[1]).add(edge[0]);
        }
        int cC = 0;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                int[] nodes = new int[1];
                int[] edgesCount = new int[1];
                dfs(i,nodes,edgesCount,list1,visited);
                if(edgesCount[0]==nodes[0]*(nodes[0]-1)){
                    cC++;
                }
            }
        }
        return cC;
    }
}