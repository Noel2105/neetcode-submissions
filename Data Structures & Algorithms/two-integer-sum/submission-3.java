class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0 ; i < len ; i++) {
            int chk = target - nums[i];
            if (lookup.keySet().contains(chk)) {
                return new int[] {lookup.get(chk), i};
            }
            lookup.put(nums[i], i);
        }
        return new int[] {};
    }
}
