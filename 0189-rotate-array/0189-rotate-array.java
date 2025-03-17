class Solution {
    static void Reverse(int[] arr, int low, int high){
        while(low<=high){
            //swap arr[low] and arr[high]
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0) return;
        k = k%n;
        if(k>n) return;

        //reverse last k elements
        Reverse(nums,n-k,n-1);
        //reverse first n-k elements
        Reverse(nums,0,n-k-1);
        //reverse whole array
        Reverse(nums,0,n-1);
    }
}