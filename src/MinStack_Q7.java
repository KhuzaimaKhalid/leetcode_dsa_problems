public class MinStack_Q7 {
    private int[] arr;
    private int top;

    public MinStack_Q7() {
        this.arr =  new int[1000];
        this.top = -1;
    }

    public void push(int val) {
        if(top == arr.length-1){
            System.out.println("error in push");
            return;
        }
        this.arr[++this.top] = val;

    }

    public void pop() {
        if(top < 0){
            System.out.println("error in pop");
            return ;
        }
        int pop = this.arr[this.top--];

    }

    public int top() {
        if(this.top < 0){
            System.out.println("Array Empty");
            return -1;
        }
        return this.arr[this.top];
    }

    public int getMin() {
        if(this.top < 0){
            System.out.println("Array Empty");
            return -1;
        }
        int min = this.arr[this.top];
        for (int i = 0; i <= top ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


public static void main(String[] args) {
        MinStack_Q7 s = new MinStack_Q7();

        // test push
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        System.out.println( s.getMin());

    }
}
