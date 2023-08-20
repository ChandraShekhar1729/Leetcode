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
        HashSet<ListNode> set= new HashSet<ListNode>();

		ListNode temp=headA;


		while(temp!=null){

         set.add(temp);
		 temp=temp.next;
	     }

       ListNode dummy=headB;

		 while(dummy!=null){
			 if(set.contains(dummy)){
				 return dummy;
			 }

			 dummy=dummy.next;
		 }


       


return null;

        
    }
}