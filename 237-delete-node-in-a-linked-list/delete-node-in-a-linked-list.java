/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       
        
        
        node.val=node.next.val;
            if(node.next!=null&&node.next.next!=null){
        node.next=node.next.next;
            }else{

            node.next=null;
            }
    }
}