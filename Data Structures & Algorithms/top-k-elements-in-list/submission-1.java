class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparing(Map.Entry::getValue));
        for (int i = 0 ; i < nums.length ; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        for  (Map.Entry<Integer, Integer> item : freq.entrySet()) {
            minHeap.add(item);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
