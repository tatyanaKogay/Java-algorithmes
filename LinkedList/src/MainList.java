public class MainList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Mary", 27);
        list.insert("Jessica", 31);
        list.insert("John", 18);

        list.displayList();
        System.out.println();

        list.delete("Jessica");
        System.out.println(list.find("Mary").age);

        list.displayList();
    }
}
