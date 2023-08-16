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
     public static int length(ListNode head){

int i=0;
while(head!=null){
   i++;
   head=head.next;
}

  return i;


    }
    public ListNode middleNode(ListNode head) {

       ListNode temp=head;
        // Write your code here
         int len=length(head);
         if(len%2!=0){

             int i=0;
             while(i<len/2){
                 i++;
                 temp=temp.next;

             }

          

  }
         else{

        int i=0;
        while(i<len/2){
            i++;
            temp=temp.next;
        }
   return temp;




  }

  return temp;

    }



}