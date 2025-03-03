class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        long goodpairs=0;
        long n = nums.length;

        // Logic:
        // j-i != nums[j]-nums[i]
        // nums[j]-j != nums[i]-i
        // key[j]!= key[i]
        // Thus if key[i]=key[j] then its a good pair

        for(int i=0;i<n;i++){
            int key = nums[i]-i;
            goodpairs += mpp.getOrDefault(key,0);
            mpp.put(key, mpp.getOrDefault(key,0)+1);
        }
        long totalpairs = (long)n*(n-1)/2;
        return totalpairs-goodpairs;
    }
}