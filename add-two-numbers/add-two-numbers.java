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

        int sum=0;
        int c=0;
        ListNode node = new ListNode();

        ListNode temp=node;
       // ListNode head=temp;

        while(l1!=null&&l2!=null){
              int n1=0;
              
                   n1=l1.val;
                   l1=l1.next;
              
              int n2=0;
            
                  n2=l2.val;
                  l2=l2.next;
              

              sum+=n1+n2+c;

              int digit=sum%10;
               ListNode newnode= new ListNode(digit);
               c=sum/10;

              temp.next=newnode;
               temp=newnode;
               sum=0;


            
        }


        while(l1!=null){
            int n1=l1.val;
            sum+=n1+c;
            int digit=sum%10;
            ListNode newnode=new ListNode(digit);
            c=sum/10;
            temp.next=newnode;
            temp=newnode;
            l1=l1.next;
            sum=0;

        }

      




         while(l2!=null){
               int n1=l2.val;
            sum+=n1+c;
            int digit=sum%10;
            ListNode newnode=new ListNode(digit);
            c=sum/10;
            temp.next=newnode;
            temp=newnode;
            l2=l2.next;
            sum=0;
         }

         if(c!=0){
            ListNode newnode= new ListNode(c);
            temp.next=newnode;
            temp=newnode;
         }


       return node.next;


        
    }
}