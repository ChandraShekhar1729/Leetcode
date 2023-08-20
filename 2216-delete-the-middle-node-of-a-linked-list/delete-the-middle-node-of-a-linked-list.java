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
    public static ListNode middle( ListNode head){
           
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null&&fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
     
return slow;
 }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){

            return null;

        }
        if(head.next.next==null){
            head.next=null;
            return head;
        }


     

     ListNode mid=middle(head);


      ListNode temp=head;

      ListNode prev=null;

      while(temp!=mid){
          prev=temp;
          temp=temp.next;
      }

      prev.next=mid.next;



return head;
        
    }
}