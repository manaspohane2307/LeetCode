class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int it : nums){
            xor = xor ^ it;
        }
        return xor;
    }
}