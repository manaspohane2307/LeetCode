class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max_len_inc=1;
        int len=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                len++;
                max_len_inc = Math.max(max_len_inc,len);
            }
            else{
                len=1;
            }
        }
        int max_len_dec=1;
        len=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                len++;
                max_len_dec = Math.max(max_len_dec,len);
            }
            else{
                len=1;
            }
        }
        return Math.max(max_len_inc,max_len_dec);
    }
}