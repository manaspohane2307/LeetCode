class Solution {
    public void moveZeroes(int[] nums) {
        //2 pointer approach
        int j=-1;
        //find first occurence of 0
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        //base case: no zero element found
        if(j==-1){
            return;
        }
        //move pointer i and j
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                //swap nums[i] and nums[j] and increment j as i gets incremented through loop
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}