class Solution {
    public long putMarbles(int[] weights, int k) {
        int[] arr = new int[weights.length-1];
        long i=0;
        long j=0;
        for(int z=0;z<arr.length;++z){
            arr[z] = weights[z]+weights[z+1];
        }
        Arrays.sort(arr);
        for(int z=0;z<k-1;++z){
            i += arr[z];
            j += arr[arr.length-1-z];
        }
        return j-i;
    }
}