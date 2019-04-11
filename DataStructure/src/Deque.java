public class Deque {
    private int size;
    private int[] deque;
    private int items;
    private int front;
    private int rear;
    private int frontPoint;
    private int rearPoint;

    public Deque(int _size){
        this.size = _size;
        this.deque = new int[size];
        this.items = 0;
        this.frontPoint = (size/2)+1;
        this.rearPoint = (size/2);
        this.front = frontPoint;
        this.rear = rearPoint;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == size);
    }

    public void insertR(int i) {//correct
        if (rear == size-1) rear = -1;
        deque[++rear] = i;
        items++;
    }

    public int removeR() {
        int temp = deque[rear--];
        if (rear == -1) rear = size-1;
        items--;
        return temp;
    }

    public void insertF(int i) {
        if (front == 0) front = size-1;
        deque[--front] = i;
        items++;
    }

    public int removeF() {//correct
        int temp = deque[front++];
        if (front == size-1) front = 0;
        items--;
        return temp;
    }




    public void display(){
        for (int i = front; i<=rear; i++){
            System.out.print(deque[i] + " ");
        }
    }
}
