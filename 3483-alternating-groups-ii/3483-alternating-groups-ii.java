class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int left=0;
        int count=0;
        for(int right=1;right<n+k-1;right++){
            if(colors[right%n]==colors[(right-1)%n]){
                left=right;//shift window
            }
            if((right-left+1)>k){
                left++;
            }
            if((right-left+1) == k){
                count++;
            }
        }
        return count;
    }
}