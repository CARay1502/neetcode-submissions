/** hashmap solution
input: two strings (s, t) 
output: boolean (true or false)

Identify whether two strings are anagrams of each other - determine if two strings contain the same letters at the same frequency (regardless of spelling). 

step 0: identify whether strings are equal length - (false == not an anagram)
step 1: create two hashmap objects
step2: iterate through both strings simultaneously (reduce time and space complex) to assign chars from strings to hashmap. 
step3: compare using .equals() between two hashmaps - return true if anagram (false if not). 

**/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { return false; }
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            h1.put(s.charAt(i), h1.getOrDefault(s.charAt(i), 0) + 1);
            h2.put(t.charAt(i), h2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return h1.equals(h2);
    }
}
