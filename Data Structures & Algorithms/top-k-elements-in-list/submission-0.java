/**
Solution class is an algorithm that when given an array of integers, should return the elements with most frequency up to elements k. (we return the k most frequent elements i.e. if k == 2 return the top 2 most common frequency elements)

input: int[] nums (array of integers), int k (integer for frequencies)
output: int[] knums (array of integers above frequency k)

hashmap: 
step 0: if nums.length() <= 1 return nums
step 1: create a hash map to store the frequency of each number
step 2: build a list of frequency, number pairs from the map. 
step 3: sort this list in ascending order based on frequency
step 4: create an empty result list
step 5: repeatedly pop from the end of the sorted list (highest frequency) and append the number of the result
step 6: stop when the result list contains k elements. 
step 7: return the result list

**/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            //.getOrDefault determines whether num is a key found in the hashmap and increments if it is found by 1
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        // sort new arr
        arr.sort((a, b) -> b[0] - a[0]);

        // new results lsit at k length
        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            results[i] = arr.get(i)[1];
        }
        return results;
    }
}
