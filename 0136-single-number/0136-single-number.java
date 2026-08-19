class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int totalSum = 0;
        int uniqueSum = 0;

        for (int num : nums) {
            if (set.add(num)) {
                uniqueSum += num;
            }
            totalSum += num;
        }

        return 2 * uniqueSum - totalSum;
    }
}