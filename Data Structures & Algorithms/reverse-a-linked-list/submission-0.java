/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 Given a singly linked list (head), reverse the list and return the new beginning of the list. 

 inputs: ListNode head
 outputs: ListNode output

 Step 0: initialize prev = null (we don't want to start with a prev yet)
 step 0.5: initialize current = head (the node we start on)
 step 1: while loop to check that current is not null (an empty linkedList)
 step 2: save the next node temp = current.next
 step 2.5: reverse the pointer to current.next = prev
 step 3: move prev to current and current to temp (this iterates through list)
 step 4: when loop ends, prev is the new head of list
 step 5: return prev (new head)
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
