class Solution {
    static void flipWindows(int[]nums, int p){
        nums[p] ^= 1;
        nums[p+1] ^= 1;
        nums[p+2] ^= 1;
    }
    public int minOperations(int[] nums) {
        int l = nums.length;
        int op=0;
        for(int i=0;i<l-2;++i){
            if(nums[i]==1){
                continue;
            }
            flipWindows(nums,i);
            op++;
        }
        if(nums[l-2]==0 || nums[l-1]==0){
            return -1;
        }
        return op;
    }
}