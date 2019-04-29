
public class Graph {

    public Vertex[] verArr;
    public int [][] map;
    public int maxVert = 10;
    int size;
    Stack1 stack;
    Queue1 queue;

    public Graph(){
        stack = new Stack1(maxVert);
        queue = new Queue1(maxVert);
        verArr = new Vertex[maxVert];
        map = new int[maxVert][maxVert];
        size = 0;
    }

    public void addEdge(int i, int j){
        map[i][j] = 1;
        map[j][i] = 1;
    }

    public void addVert(char l){
        verArr[size++] = new Vertex(l);
    }

    public void displayVert(int v){
        System.out.println(verArr[v].label);
    }

    private int getUnvisitedVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if (map[ver][i] == 1 && !verArr[i].isVisited)
                return i;
        }
        return -1;
    }

    private int getVisitedVerNeigh(int ver) {
        for (int i = 0; i < size; i++) {
            if (map[ver][i] == 1 && verArr[i].isVisited)
                return i;
        }
        return -1;
    }

    public void dfs(){
        verArr[0].isVisited = true;
        displayVert(0);
        stack.push(0);

        while(!stack.isEmpty()){
            int v = getUnvisitedVertex(stack.peek());
            if (v == -1) stack.pop();
            else {
                verArr[v].isVisited = true;
                displayVert(v);
                stack.push(v);
            }
        }

        for (int i=0; i<size; i++){
            verArr[i].isVisited = false;
        }
    }

    public void bfs() {
        verArr[0].isVisited = true;
        displayVert(0);
        queue.insert(0);
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitedVertex(v)) != -1) {
                verArr[w].isVisited = true;
                displayVert(w);
                queue.insert(w);
            }
        }
        for (int i = 0; i < size; i++) {
            verArr[i].isVisited = false;
        }
    }

    public void findBfs(char l) {  /* TODO */
        int [][] parentArr = new int [maxVert][maxVert];
        int key = 0;
        int col = 0;
        int row = 0;
        verArr[0].isVisited = true;
        queue.insert(0);
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitedVertex(v)) != -1) {
                parentArr[row++][col] = v; // заносим пути в двумерный массив
                verArr[w].isVisited = true;
                queue.insert(w);
            }
            row = 0;
            col++;
            if (verArr[findVer(l)].isVisited){ // если нужная нам вершина уже найдена
                for (int i = 0; i<maxVert; i++){
                    for (int j = 0; j< maxVert; j++){
                        if (parentArr[i][j] == findVer(l)){
                            key = i;   // ищем ее строку в двумерном массиве
                            break;
                        }
                    }
                    if (key == i) break;
                }
                for (int h = 0; h<col; h++){
                    System.out.println(verArr[parentArr[key][h]].label);  //распечатываем путь от
                }                                                 //начальной вершины до нужной
            }
        }
        for (int i = 0; i < size; i++) {
            verArr[i].isVisited = false;
        }
    }


    public int findVer(char l){
        for(int i=0; i<=size; i++){
            if (verArr[i].label == l) return i;
        }
        return size;
    }
}
