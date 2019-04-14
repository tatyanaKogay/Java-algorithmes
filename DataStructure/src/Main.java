public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(7);
        stack.push('l');
        stack.push('e');
        stack.push('t');
        stack.push('n');
        stack.push('i');
        stack.push('o');

        stack.pop();

        stack.display();

        System.out.println();

        Queue queue = new Queue(8);
        queue.insert(1);
        queue.insert(54);
        queue.insert(13);
        queue.insert(67);
        queue.insert(3);
        queue.insert(2);
        queue.insert(49);

        queue.remove();

        while(!queue.isEmpty()){
            int n = queue.remove();
            System.out.println(n);
        }


        System.out.println();

        PriorityQueue pQueue = new PriorityQueue(6);
        pQueue.insert(4);
        pQueue.insert(89);
        pQueue.insert(2);
        pQueue.insert(13);
        pQueue.insert(6);

        pQueue.remove();

        while(!pQueue.isEmpty()){
            int n = pQueue.remove();
            System.out.println(n);
        }

        System.out.println();

        Deque deque = new Deque(9);
        deque.insertF(0);
        deque.insertF(-1);
        deque.insertF(-2);
        deque.insertR(1);
        deque.insertR(2);
        deque.insertR(2);
        deque.removeR();

        deque.display();
    }
}
