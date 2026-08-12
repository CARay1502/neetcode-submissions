class Solution {
    public int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int half = low + (high - low) / 2;

        if (nums[half] == target) {
            return half;
        } else if (nums[half] < target) {
            return binarySearch(nums, half + 1, high, target);
        }  else {
            return binarySearch(nums, low, half - 1, target);
        }
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, (nums.length - 1), target);
    }
}
