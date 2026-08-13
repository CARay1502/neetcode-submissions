/**
given a string s, find the length of the longest substring without duplicate characters (characters in substring).

inputs: string s
outputs: int length (length of longest substring)

brute force method using hashset
step 0: check if string is empty (constraint is that string can be empty, if empty return 0).
step 1: intialize length variable, initialize boolean duplicate (to detect hashset duplicate)
step 2: initialize hashset to add characters too (prevents duplicates)
step 3: iterate through string until duplicate character is detected:
if hashset.contains(character) break;
step 4: otherwise add character to hashset
step 5: iterate through hashset (length++ for each iteration)
step 6: return length
**/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) { return 0; }
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> hash = new HashSet<Character>();
            for (int j = i; j < s.length(); j++) {
                if (hash.contains(s.charAt(j))) {
                    break;
                }
                hash.add(s.charAt(j));
            }
            length = Math.max(length, hash.size());
        }        
        return length;
    }
}
