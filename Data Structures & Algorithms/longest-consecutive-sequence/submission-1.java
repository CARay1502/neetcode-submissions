/**
Given an array of integers nums, return length of the longest consecutive of elements that can be formed. 
- a sequence of elements each element is exactly 1 greater than the previous. 
- the elements do not have to be consecutive in orignail array. 

Hash Map solution: by storing values in a hashmap, we store the value and its upper and lower boundaries with a corresponding sequence length
Inputs: nums array 
Outputs: int length

Edge cases: 
nums array is empty or contains 1 element
contains negative numbered elements (num - 1) 
duplicate numbers

Soltuion: 
step 0: if nums.length <= 1, return nums.length
step 2: create a hashmap mp that stores sequence lengths at boundary positions. 
step 2: for each number num in nums: 
- if num is already in mp, skip it
- compute the new sequence length: (num - 1) + (num + 1) + 1
- store this length at num
- update the boundaries: 
    - left boundary: mp[num - mp[num - 1]] = length
    - right boundary: mp[num + mp[num + 1]] = length
- update length to keep track of the longest sequence 
step 3: return length 
**/
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) { return nums.length; }
        Map<Integer, Integer> mp = new HashMap<>();
        int length = 0;
        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
                mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
                mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
                length = Math.max(length, mp.get(num));
            }
        }
        return length;

    }
}
