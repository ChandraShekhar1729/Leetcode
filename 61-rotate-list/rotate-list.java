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
    public static int Length( ListNode head){

        int len=0;

        ListNode temp=head;
        while(temp!=null){

        len++;
        temp=temp.next;
 }

 return len;

    }
    public ListNode rotateRight(ListNode head, int k) {

    if(head==null||head.next==null||k==0){
        return head;

    }

    k=Length(head)-k%Length(head);

    ListNode temp=head;

    while(temp.next!=null){
        temp=temp.next;

    }

    temp.next=head;
 

    int i=1;
    while(i<k){
        head=head.next;
        i++;
    }


    ListNode ans=head.next;
    head.next=null;


    return ans;





           
 }
}