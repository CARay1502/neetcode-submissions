/**
stack solution
inputs: String s
outputs: boolean

step 0: intiialize stack and hashmap for our character ref
step 1: for each char c in string s: 

if it is an opening bracket push to stack
if it is closing bracket, check the stack is not empty and its top matches the corresponding opening bracket
if yes pop the stack, or return false

step 3: check stack is emty, return true
**/
class Solution {
    public boolean isValid(String s) {
        //step 0
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> hash = new HashMap<>();
        hash.put(')', '(');
        hash.put('}', '{');
        hash.put(']', '[');

        //step 1
        for (char c : s.toCharArray()) {
            //step 2
            if (hash.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek().equals(hash.get(c))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                
                stack.push(c);
            }
        }
        //step 3
        return stack.isEmpty();
    }
}
