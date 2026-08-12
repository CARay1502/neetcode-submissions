/**
Given a string s, return true if palindrome (a string that reads the same backwards or forwards). 

inputs: String s
outputs: boolean 

Two pointer nested for-loop: 
(step 0 -> you could check first and last character to ensure they are the same to avoid unneccesary iteration)
step 0: intialize stringbuilder 
step 1: create new string 
step 1.5: iterate through original string and append to new String
step 2: compare new String.reverse and original new string 
step 3: if equivalent return true
else false
**/
class Solution {
    public boolean isPalindrome(String s) {
        //step 0
        StringBuilder newStr = new StringBuilder();
        //step 1
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                //step 1.5
                newStr.append(Character.toLowerCase(c));
            }
        }
        //step 2 and 3
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
