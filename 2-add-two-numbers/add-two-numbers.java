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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmpNode = new ListNode(0);
        ListNode tail = tmpNode;
        
        int carry=0;
        while (l1 != null || l2 != null || carry !=0){
            // System.out.println(l1.val);
            // System.out.println(l2.val);
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;
            
            // if (l1.next!=null){
            //     digit1=l1.val;
            // }
            // else{
            //     digit1=0;
            // }

            // if (l2.next!=null){
            //     digit2=l2.val;
            // }
            // else{
            //     digit2=0;
            // }

            int sum = digit1 + digit2 + carry;
            // System.out.println("sum: " + sum);
            int digit = sum %10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1= (l1 != null) ? l1.next : null;
            l2= (l2 != null) ? l2.next : null;
            

        }
        ListNode finalw = tmpNode.next;
        // System.out.println(tmpNode.val);
        tmpNode.next=null;
        return finalw;
    }
}