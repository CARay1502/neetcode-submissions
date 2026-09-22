/**
Given an integer array (nums), return an array (output) where output[i] is the product of all the elements of nums except nums[i]

Division method: 
-> by determining the number of zeros present in nums[] we can determine how to handle. two or more means the entire output[] will be zeros, only 1 zero means just that position will be zero in outputs[]. 
step 0: initalize int prod = 1, zeroCount = 0;
step 1: iterate through array: 
- multiply all non-zero numbers to get the prod
- count how many zeros appear. 
step 2: if zeroCount > 1: 
- return an array of all zeros
step 3: create int[] output
step 4: loop through nums: 
- if there is one zero: index of zero gets the prod of all non-zero numbers, everything else is 0.
- if there are no zeros: set each result value to prod/ nums[i]
step 5: return outputs

**/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else { zeroCount++; }
        }
        if (zeroCount > 1) {
            return new int[nums.length];
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 1) {
                output[i] = (nums[i] == 0) ? prod : 0;
            } else {
                output[i] = prod / nums[i];
            }
        }
        return output;
    }
}  
