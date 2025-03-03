class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int max_sum=nums[0];
        int sum=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum += nums[i];
            }
            else{
                max_sum = Math.max(max_sum,sum);
                sum = nums[i];
            }
        }
        return Math.max(max_sum,sum);
    }
}