/**
input: two strings (s, t)
output: boolean value (true or false)

algorithm: need to identify whether two strings contain the same letters regardless of spelling
(anagram). 

Step 0: identify if strings are same length() (if not return false - not an anagram).
Step 1: store both strings in char array 
Step2: sort through both arrays usings array.sort() 
Step 2.5: store sorted char array as string.
Step 3: String.equals comparison to identify if sorted strings match.
Step 3.5: return true if strings are equivalent, false if not. 

**/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { return false; }

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
        /**
        String s1 = new String(c1);
        String s2 = new String(c2);

        if (!s1.equals(s2)) { return false; }
        return true;
        **/
    }
}
