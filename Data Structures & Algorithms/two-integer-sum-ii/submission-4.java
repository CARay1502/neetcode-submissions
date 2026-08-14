/**
given an array of integers (numbers), that is sorted in non-decreasing order (ascending?), return the indices of (1-indexed) of two numbers (index1, index2) that equal the target. 

inputs: numbers (integer array), target (integer)
outputs: array of integers (index 1, index2 -> that summed equal target)

two pointer solution: 
step 0: initialize left and right variables
step 1: while left < right
step 2: interate through int[] array and increment left++ and right--
step 3: once left + right == target, return their indices in new int[] array

**/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; 
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
