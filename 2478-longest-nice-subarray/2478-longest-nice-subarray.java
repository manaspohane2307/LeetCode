class Solution {
    public int longestNiceSubarray(int[] nums) {
        int len = nums.length;
        int l = 0;
        int r = 0;

        //sliding window - 2 pointer
        int max_win_size = 0;
        int xor_sum = 0;
        int curr_sum = 0;

        while(r<len){
            curr_sum = curr_sum + nums[r];
            xor_sum = xor_sum ^ nums[r];
            while(xor_sum != curr_sum){
                curr_sum -= nums[l];
                xor_sum ^= nums[l];
                l++;
            } 
            max_win_size = Math.max(max_win_size,r-l+1);
            r++;
        }
        return max_win_size;
    }
}