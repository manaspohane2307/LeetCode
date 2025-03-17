class Solution {
    public boolean divideArray(int[] nums) {
        int pairs = nums.length/2;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        //iterate over map. If count of each value is divisible by 2 then output true
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            if(entry.getValue() %2 !=0){
                return false;
            }
        }
        return true;
    }
}