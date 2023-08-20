/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.HashMap;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA.next==null&&headB.next==null&&headA==headB){
            return headA;
        }

            
        ListNode temp= headA;

        while(temp!=null){

        ListNode dummy=temp;

         ListNode temp1=headB;


         while(temp1!=null){

           if(temp1==dummy){
               return temp1;
           }

           temp1=temp1.next;



  }

temp=temp.next;

 }

 return null;
        
    }
}