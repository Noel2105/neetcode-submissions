class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> item : freq.entrySet()) {
            if (bucket[item.getValue()] == null) {
                bucket[item.getValue()] = new ArrayList<Integer>();
            }
            bucket[item.getValue()].add(item.getKey());
        }
        int[] result = new int[k];
        int index = 0;
        for (int j = bucket.length-1 ; j >= 0 && index < k; j--) {
            if (bucket[j] != null) {
                for (int num : bucket[j]) {
                    result[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
