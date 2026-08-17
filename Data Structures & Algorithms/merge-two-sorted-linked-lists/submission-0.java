/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

Given the heads of two sorted linked lists (list1, list2), merge the two lists into one sorted linked list and return the head of the new sorted linked list. 

inputs: LinkedList list1, LinkedList list2
outputs: LinkedList results

recursion (simplest code?):
step 0: handle null lists (best case), if one list is null, return other (this works even if both lists are null)
step 1: using if conditional: 
if list1.val <= list2.val { recursive call passing list1.val, moving list2.val further down list}
return list1
step 2: 
else list2.val <= list1.val { recursive call passing list2.val, moving list1.val further down lsit}
return list2
 **/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //handle null list first (best case)
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }  
    }
}