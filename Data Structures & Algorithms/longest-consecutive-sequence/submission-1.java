class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> lookup = new HashSet<>(
            Arrays.stream(nums).boxed().collect(Collectors.toList())
        );
        int max = 0;
        for (int i : lookup) {
            int cnt = 1;
            if (!lookup.contains(i-1)) {
                int num = i + 1;
                while (lookup.contains(num)) {
                    num++;
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
            }
        }
        return max;
    }
}
