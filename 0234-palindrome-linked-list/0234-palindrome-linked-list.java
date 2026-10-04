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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>st=new Stack<>();
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
         
            fast=fast.next.next;
        }
          if (fast != null) {
            slow = slow.next;
        }

        
        while (slow != null) {
            st.push(slow.val);
            slow = slow.next;
        }
        ListNode curr=head;
        while(!st.isEmpty()){
            if(curr.val!=st.pop()){
                return false;

            }
            curr=curr.next;
            
        }
        return true;
        
        
    }
}