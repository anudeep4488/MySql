/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
        return false;
    }
        ListNode slow = head;
        ListNode fast = head;
        // handle single node because at 1st step slow and fast poinnt to same node it directly return trur

        // initally check pinter of sngle node 


        while(fast!=null && fast.next !=null){
            
            //you have to put tht here because at first slow and fast becomes same so make themmove 
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }

        }
        return false;
    }
}