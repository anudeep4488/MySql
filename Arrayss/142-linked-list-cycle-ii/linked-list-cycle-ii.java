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
    public ListNode detectCycle(ListNode head) {

        
       // unefficient you created extra spce alets to o(n) 

       // try to find in constsnt time
        // HashSet<ListNode> list = new HashSet<>();

        // ListNode node = head;
        // while(node != null){
        //     if(list.contains(node)){
        //         return node;
        //     }
        //     list.add(node);
        //     node = node.next;
        // }
        // return null;


        // optimized one
        // fast and alow pointer

        if(head == null || head.next == null){
            return null;
        }
        

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }


        }
        ListNode temp = head;

        while(temp!= null){
            if(temp==slow){
                return temp;
            }
            temp=temp.next;
            if(slow!=null){
                slow=slow.next;
            };
            
        }

        return null;


        
    }
}