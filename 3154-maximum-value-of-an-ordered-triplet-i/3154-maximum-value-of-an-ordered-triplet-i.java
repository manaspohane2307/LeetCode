class Solution {
    public long maximumTripletValue(int[] nums) {
        long max_value = 0;
    int n = nums.length;
    
    for(int i = 0; i < n; i++) {
        for(int j = i + 1; j < n; j++) {
            if (nums[i] > nums[j]) {  // Ensure nums[i] > nums[j] to get a positive result
                for(int k = j + 1; k < n; k++) {
                    long value = (long)(nums[i] - nums[j]) * nums[k];  // Cast to long to prevent overflow
                    max_value = Math.max(max_value, value);
                }
            }
        }
    }
    return max_value;
    }
}