class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prodPrefix = new int[n];
        int[] prodSuffix = new int[n+1];
        int[] result = new int[n];
        prodSuffix[n] = 1;
        prodSuffix[n-1] = nums[n-1];
        prodPrefix[0] = nums[0];
        for (int i = n-2 ; i >= 1 ; i--) {
            prodSuffix[i] = prodSuffix[i+1]*nums[i];
        }
        result[0] = prodSuffix[1];
        for (int i = 1 ; i < n ; i++) {
            result[i] = prodPrefix[i-1]*prodSuffix[i+1];
            prodPrefix[i] = prodPrefix[i-1]*nums[i];
        }
        return result;
    }
}  
