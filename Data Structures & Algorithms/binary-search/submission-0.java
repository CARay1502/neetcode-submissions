/**
Algorithm: Binary Search -> given an array of distinct integers (nums), sorted in ascending order and integer (target).

inputs: int[] nums, integer target 
outputs: int index, (-1 if false)

step 0: create new recursive function binarySearch()
step 1: if (low > high) return -1; checks if target is not in array
step 2: calculate half variable -> low + (high - low) /2
step 3: if (half == target) { return half }
step 4: else if half < target { search the right side of array - recursively}
step 5: else if half > target { search the left side of teh array - recursively }
step 6: call binarySearch() function in search()
**/
class Solution {
    public int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1; // if target does not exist
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
