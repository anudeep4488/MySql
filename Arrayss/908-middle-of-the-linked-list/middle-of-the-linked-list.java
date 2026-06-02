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
    public ListNode middleNode(ListNode head) {

        // ListNode slow = head;
        // ListNode fast = head;

        // while(fast != null && fast.next != null) {

        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // return slow;

        int count =0;

        ListNode temp = head;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        // now upu need address of that miidle of the index 
        int size = count/2;
        ListNode tem = head;
        while(size!=0){
            size--;
            tem=tem.next;
        }
        return tem;

    }
}