class MyQueue {
    int arr1[] = new int[10];
    int arr2[] = new int[10];
    int count;
    int top1,top2;
    public MyQueue() {
        this.count = 0;
        this.top1 = -1;
        this.top2 = -1;
    }

    public void push(int x) {
        if(top1 == arr1.length-1){
            return;
        }
        arr1[++top1] = x;
    }

    public int pop() {
        if(empty()){
            return -1;
        }
        if(top2 == -1){
            while(top1 >= 0){
                arr2[++top2] = arr1[top1--];
            }
        }
        return arr2[top2--];
    }

    public int peek() {
        if(empty()){
            return -1;
        }
        if(top2 == -1){
            while(top1 >= 0){
                arr2[++top2] = arr1[top1--];
            }
        }
        return arr2[top2];

    }

    public boolean empty() {
        return top1 == -1 && top2 == -1;
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        // Test push
        q.push(5);
        q.push(4);
        q.push(3);
        q.push(2);
        q.push(1);
        System.out.println("Front element: " + q.peek());

        System.out.println("Popped: " + q.pop());  // Should print 5
        System.out.println("Popped: " + q.pop());  // Should print 4
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */