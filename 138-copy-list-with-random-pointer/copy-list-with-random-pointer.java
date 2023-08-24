/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        HashMap<Node,Node>map= new HashMap<>();

        Node temp=head;

        while(temp!=null){
            Node newNode= new Node(temp.val);
               map.put(temp,newNode);

               temp=temp.next;
        }

        Node t= head;

        while(t!=null){

           Node node=map.get(t);
          node.next = map.get(t.next);
        node.random =  map.get(t.random);


           t=t.next;

        }

        return map.get(head);

    }
}