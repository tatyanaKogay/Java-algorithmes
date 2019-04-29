public class Queue1 {
    private int[] queue;
    private int front;
    private int rear;
    private int items;
    private int maxsize;

    public Queue1(int size) {
        this.maxsize = size;
        this.queue = new int[maxsize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxsize);
    }

    public int size() {
        return items;
    }

    public void insert(int i) {
        if (rear == maxsize - 1) rear = -1;
        queue[++rear] = i;
        items++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == maxsize) front = 0;
        items--;
        return temp;
    }

    public int peek() {
        return queue[front];
    }
}
