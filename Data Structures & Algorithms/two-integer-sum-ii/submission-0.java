class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int right = n-1, left = 0;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left+1, right+1};
            }
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[0];
    }
}
