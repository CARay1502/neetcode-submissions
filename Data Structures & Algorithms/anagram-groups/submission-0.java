/**
Given an array of strings, find all of the anagrams (words that contain the same letters at same frequencies spelled differently), return this group as a sublist array. 

input: array strs (of strings)
output: List<List<String>> anagrams  (List of strings objects)

hashmap: 
step 0: initialize hashmap Map<String, List<String>> list = new HashMap<>();
step1: iterate through strs
step 2: convert each string in strs to char array 
step 2.5: Arrays.sort(char array)
step 3: convert sorted char array to string 
step 4: if sorted string is not in hashmap (as key) .putIfAbsent(char array, new ArrayList<>())
step 5: if sorted array string is in hashmap (as key) .get(char array).add(string)
step 6: return list (make sure to conver to ArrayList<>)
**/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> list = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            list.putIfAbsent(str, new ArrayList<>());
            list.get(str).add(s);
        }
        return new ArrayList<>(list.values());
    }
}
