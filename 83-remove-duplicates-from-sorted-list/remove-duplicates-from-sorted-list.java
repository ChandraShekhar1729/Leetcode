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
    public ListNode deleteDuplicates(ListNode head) {
    //      if(head==null){
            
    //         return head;
    //     }
    //      ListNode tail1=head;
    //  ListNode tail2=head.next;
    //      while(tail2!=null){
    //          // if(tail1.data==tail2.data){
    //         if(tail1.val==tail2.val){
                 
    //              tail2=tail2.next;
    //          }
    //         else{
    //             tail1.next=tail2;
    //             tail1=tail1.next;
    //             tail2=tail2.next;
                
                
    //         }
             
    //        // return head;  
    
    //      }
    //     tail1.next = null;
    //     return head; 
  if(head==null||head.next==null){
      return head;
  }

  ListNode dummy= new ListNode(-(int)1e8);
  ListNode itr=dummy;
  ListNode curr=head;

  while(curr!=null){
     
         if(itr.val!=curr.val){
             itr.next=curr;
             itr=curr;
             curr=curr.next;


         }else{

            curr=curr.next;



         }
  }

  if(itr.next!=null)
  itr.next=null;

       
return dummy.next;


      
     

  

    
    
        
    }
}