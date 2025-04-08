class Solution {
    public int minimumOperations(int[] nums) {
        int map[] = new int[101];
        int lastindex=0;
        for(int i=nums.length-1;i>=0;i--){
            if(map[nums[i]]>0){
                lastindex = i+1;
                break;
            }
            map[nums[i]]++;
        }
        if(lastindex%3==0){
            return lastindex/3;
        }
        return lastindex/3 + 1; 
    }
}