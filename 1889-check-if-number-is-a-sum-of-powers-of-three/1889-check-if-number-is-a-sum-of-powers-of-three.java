class Solution {
    public boolean checkPowersOfThree(int n) {
        //find largest power of 3^i <= n
        int i=0;
        while((int)Math.pow(3,i+1) <= n){
            i += 1;
        }
        //greedy- remove largest powers
        while(i>=0){
            int power = (int)Math.pow(3,i);
            if(power<=n){
                n -= power;
            }
            i -= 1;
        }
        return n==0;
    }
}