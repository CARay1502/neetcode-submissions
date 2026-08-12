/**
Given a string consisting of characters "()", "[]", "{}", verify if the string is valid if every bracket is closed by the same type of close bracket, open brackets are closed in teh correct order, every close bracket has a corresponding open bracket of the same type. 

inputs: string s 
outputs: boolean 

brute force: 
step 0: set variable of length to -1
step 1: initialize while loop to iterate through string 
step 2: remove character sets
step 3: return .isEmpty() boolean
**/
class Solution {
    public boolean isValid(String s) {
        int previousLength = -1;

        while (s.length() != previousLength) {
            previousLength = s.length();

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        
        return s.isEmpty();
    }
}
