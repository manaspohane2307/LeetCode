class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;//left pointer of sliding window
        int recolor=0;//no of white blocks in current window
        int res=k;//worst case - all blocks colored white
        for(int r=0;r<blocks.length();r++){//r is right pointer
            if(blocks.charAt(r) == 'W'){
                recolor += 1;
            }
            if((r-l+1) == k){//when window size reaches k, update result and slide window
                res = Math.min(res, recolor); //update result
                if(blocks.charAt(l) == 'W'){
                    recolor -= 1;
                }
                l += 1;//slide the window forward
            }
        }
        return res;
    }
}