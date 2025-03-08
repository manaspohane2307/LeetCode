class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;
        int recolor=0;
        int res=k;
        for(int r=0;r<blocks.length();r++){
            if(blocks.charAt(r) == 'W'){
                recolor += 1;
            }
            if((r-l+1) == k){
                res = Math.min(res, recolor);
                if(blocks.charAt(l) == 'W'){
                    recolor -= 1;
                }
                l += 1;
            }
        }
        return res;
    }
}