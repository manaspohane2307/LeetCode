class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if(nums.length == 0) return result;
        dfs(result, nums, new boolean[nums.length], new LinkedList<>());
        return result;
    }
    private void dfs(List<List<Integer>> result, int[] nums, boolean[] visited, List<Integer> temp){
        if(temp.size() == nums.length) result.add(new LinkedList<Integer>(temp));
        else{
            for(int i = 0; i < nums.length; i++){
                if(visited[i]) continue;
                visited[i] = true;
                temp.add(nums[i]);
                dfs(result, nums, visited, temp);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}