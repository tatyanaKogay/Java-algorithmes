public class DoubleListMain {
    public static void main(String[] args) {
        DoubleList list = new DoubleList();

        list.insertFirst("George", 24);
        list.insertFirst("Daniel", 6);
        list.insertFirst("Ann", 58);
        list.insertLast("Sarah",30);

        list.display();
        System.out.println();

        list.delete("George");
        System.out.println(list.find("None"));
        list.delete();
        list.insertFirst("Dilan", 15);
        list.display();


    }
}
