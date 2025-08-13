class MyStack {
    // Stack <Integer> stack = new Stack<>();
    int[] arr = new int[1000];
    int top = -1;
    public void push(int x) {
        arr[++top]=x;
        
    }

    public int pop() {
        // code here
         if(top<0){
            return -1;
        }
        return arr[top--];
    }
    
}
