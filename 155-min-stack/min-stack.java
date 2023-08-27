import java.util.Stack;
class MinStack {

        Stack<Integer> allData;
        Stack<Integer> minData;
    public MinStack() {
        allData= new Stack<>();
        minData= new Stack<>();
       
     }
    
    public void push(int val) {
        allData.push(val);

        if(minData.size()==0||val<=minData.peek()){
            minData.push(val);
        }
        
    }
    
    public void pop() {
        int val=allData.pop();
        if(val==minData.peek()){
            minData.pop();
        }

        
    }
    
    public int top() {
        return allData.peek();
        
    }
    
    public int getMin() {
        if(minData.size()!=0){
        
        return minData.peek();
        }
        else{
            return 0;
        }
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */