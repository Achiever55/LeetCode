class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int sum = arr[start][0] + arr[end][0];

            if (sum == target) {
                return new int[]{
                    arr[start][1],
                    arr[end][1]
                };
            }
            else if (sum > target) {
                end--;
            }
            else {
                start++;
            }
        }

        return new int[]{-1, -1};
    }
}