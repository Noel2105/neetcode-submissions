class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0 ; i < len ; i++) {
            int chk = target - nums[i];
            if (lookup.keySet().contains(chk)) {
                result[0] = lookup.get(chk);
                result[1] = i;
                return result;
            }
            lookup.put(nums[i], i);
        }
        return result;
    }
}
