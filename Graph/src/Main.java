public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        char[] labels = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (int i = 0; i < 10; i++){
            graph.addVert(labels[i]);
        }
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(4,5);
        graph.addEdge(5,9);
        graph.addEdge(2,6);
        graph.addEdge(6,7);
        graph.addEdge(7,9);
        graph.addEdge(3,8);
        graph.addEdge(8,9);
        graph.findBfs('J');

    }
}
