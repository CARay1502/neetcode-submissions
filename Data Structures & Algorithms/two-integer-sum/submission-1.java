/**
given an array of integers and an interger target, identify the two indicies numbers that equal target. 

input: int[] nums, int target
output: int[] out

hashmap solution: 
step 0: intialize hashmap
step1: iterate through nums
step 2: using nums[i] identify value needed for i + value == target
steo 3: if (hashmap.contains(value))
step 4: return int[] of i, value
**/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        

        for (int i = 0; i < nums.length; i++) {
            
            int num = nums[i];
            int value = target - num;

            if ( h1.containsKey(value)) {
                return new int[] {h1.get(value), i };
            }
            h1.put(num, i);
        }
        return new int[] {};
    }
}
