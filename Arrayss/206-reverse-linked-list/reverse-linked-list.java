/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public ListNode reverseList(ListNode head) {

    // to underst ll  drw with pen 
    
    // finally prev contain head;
    
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null) {
        // hold the next chain 
        ListNode next = curr.next;
        
          
        curr.next = prev;
       
       //host curent addre bec you hav e t store in this reversed cajin in to next step right
        prev = curr;

        curr = next;
    }

    return prev;
}
}