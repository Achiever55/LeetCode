class Solution {
    public int singleNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        int offset = -min;
        int[] count = new int[max + offset + 1];
        for (int num : nums) {
            count[num + offset]++;
        }

        
        for (int num : nums) {
            if (count[num + offset] == 1) {
                return num;
            }
        }

        return -1;
    }
}