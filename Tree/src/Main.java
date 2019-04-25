public class Main {
    //static public Tree t;

    public static void main(String[] args) {
        Tree t;
        int count = 0;
        for (int i=0; i<=20; i++){
            t = new Tree();
            do{
                t.insert(random(-100, 100));
            } while (t.heightOfBinaryTree(t.root) <= 6);
            if (t.root.rightChild == null || t.root.leftChild == null) count++;
        }
        int unball = count*5; //(count*100)/20 = count*5
        System.out.println(unball);
    }

    static public int random(int l, int h){
        return (int)(( Math.random() * (h-l) ) + l);
    }


}
