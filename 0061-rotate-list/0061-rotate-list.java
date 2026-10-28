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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        k=k%length;
        tail.next=head;
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast.next!=head){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode n=slow.next;
        slow.next=null;
        return n;

        
    }
}