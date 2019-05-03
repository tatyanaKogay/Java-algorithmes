

public class Main {
    public static void main(String[] args) {
        Link link;
        ChainHashTable table = new ChainHashTable(20);
        for (int i=0; i<=100; i++){
            link = new Link(random(0, 100));
            table.insert(link);
        }
        table.displayTable();
        table.delete(65);
        table.delete(87);
        table.displayTable();
    }

    static public int random(int a, int b){
        return (int)(( Math.random() * (b-a) ) + a);
    }
}
