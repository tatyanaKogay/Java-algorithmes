public class IteratorMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iterator = new LinkIterator(list);
        iterator.insertAfter("Lily", 8);
        iterator.insertAfter("Bob", 24);
        iterator.insertAfter("Houston", 36);
        System.out.println(iterator.deleteCurrent());
        iterator.insertAfter("Kate", 16);
        iterator.insertBefore("James", 54);
        list.displayList();
    }
}
