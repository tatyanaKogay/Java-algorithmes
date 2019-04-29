public class Stack1 {
    public int maxSize;
    public int top;
    public int [] stack;

    public Stack1(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        this.stack = new int[maxSize];
    }

    public void push(int i){
        stack[++top] = i;
    }

    public int pop(){
        return stack[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int peek(){
        return stack[top];
    }


}
