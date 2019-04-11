public class Stack {
    private char[] stack;
    private int top;
    private int maxsize;

    public Stack(int size) {
        this.maxsize = size;
        this.stack = new char[maxsize];
        this.top = -1;
    }

    public int getTop() {
        return top;
    }

    public char[] getStack() {
        return stack;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public void push(char i) {
        stack[++top] = i;
    }

    public char pop() {
        return stack[top--];
    }

    public char peek() {
        return stack[top];
    }

    public void display(){
        for (int i = top; i>=0; i--){
            System.out.print(stack[i] + " ");
        }
    }

    public void upturnDisplay(){
        for (int i = top; i>=0; i--){
            System.out.print(stack[i]);
        }
    }
}
