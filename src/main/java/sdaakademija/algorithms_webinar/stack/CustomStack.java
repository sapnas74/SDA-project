package algorithms_webinar.stack;

public class CustomStack {
    private int[] array;
    private int size;
    private int top;

    public CustomStack(int size) {
        this.array = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int num) {
        // ar stackas nera pilnas ?
        if (isFull()) {
            System.out.println("Stack is full ! ");
        }
        top ++;
        array[top] = num;
    }

     private boolean isFull() {
         return top == size;
        }

     public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty ! ");
        }
        int element = array[top];
        top--;
        return element;
     }

     public boolean isEmpty() {
        return top < 0 ;
     }

     public int peek() {
         if (isEmpty()) {
             System.out.println("Stack is empty ! ");
         }
        return array[top];
     }
}

