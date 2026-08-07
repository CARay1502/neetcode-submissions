/**
given two arrays of integers identify the indecies of two integers that add up to the desired target number

input: array(nums), target integer
output: indecies of two numbers that equal target (i, j)

wo pointer solution: 
step 0: initialize n variable to nums.length;
step 0.5: intialize int[] arr
step 1: for loop to iterate through nums[] 
step 2: nested inner for loop of i + 1;
steo 3: if nums[i] + nums[i + 1] == target assign to new int[] array
steo 3.5: sort arr to return smallest value first
step 4: return arr

**/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
