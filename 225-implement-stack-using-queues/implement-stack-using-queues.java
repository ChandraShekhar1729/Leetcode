import java.util.Queue;
class MyStack {
        private  Queue<Integer> q1;
       private Queue<Integer>q2;
       private int size;

    public MyStack() {
      q1=new LinkedList<Integer>();
      q2= new LinkedList<Integer>();
      



    }
    
    public void push(int x) {
        q1.add(x);
        size++;
        
    
        
    }
    
    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }

 while(q1.size()!=1){
            q2.add(q1.remove());
        }

        int top=q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        size--;
        return top;
        
        
    }
    
    public int top() {

        if(q1.isEmpty()){
            return -1;
        }

        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int top=q1.peek();
        q2.add(q1.remove());
        Queue<Integer>q=q1;
        q1=q2;
        q2=q;
        return top;
        
    }
    
    public boolean empty() {
        return size==0;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */