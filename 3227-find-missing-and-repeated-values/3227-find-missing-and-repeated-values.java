class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;//no of rows
        int[] result = new int[2];
        //range is 1 to n*n
        //repeated number 
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int [] row: grid){
            for(int element: row){
                mpp.put(element, mpp.getOrDefault(element,0)+1);
            }
        }
    
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            if(entry.getValue()==2){
                result[0] = entry.getKey();
                break;
            }
        }
        //for missing element
        for(int i=1;i<=n*n;i++){
            if(!mpp.containsKey(i)){
                result[1] = i;
                break;
            }
        }
        return result;
    }
}