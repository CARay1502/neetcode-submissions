/**
Encode/Decode Problem
Given a List<String> strs, encode the string so that the encoded string is then sent over the network and decoded back to original list of strings. 

input: List<String> strs
output: List<String> decpded_strs

Step 0: if (strs.length <= 0) return strs
=== encoding function ===
step 1: initialize empty stringbuilder res
step 2: iterate through strs 
step 3: computer each strings length and append "length#string" to the builder
step 4: return final encoded string
=== decoding function ===
step 0: initialize an empty list of for decoded strings (decoded_strs) and pointer (int i = 0)
step 1: while i is within the bounds o the encoded string: 
step 2: move pointer forward until "#" (numbers before # represent string length)
step 3: convert substring s[i:] int an integer length
step 4: extract the next length characters - this is the original string. 
step 5: append the extracted string to the results list
step 6: return List<String> decoded_strs
**/
class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        if (strs.size() <= 0) { return res.toString(); }
        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i; 
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            decoded_strs.add(str.substring(i, j));
            i = j;  //make sure to consider moving i forward by length (j) to continue decoding the segament. 
        }
        return decoded_strs;
    }
}
