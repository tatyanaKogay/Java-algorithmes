public class DoubleList {
    public ListOb first;
    public ListOb last;

    public DoubleList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(String name, int age) {
        ListOb newListOb = new ListOb(name, age);
        if (this.isEmpty())
            last = newListOb;
        else
            newListOb.next = first;
        first = newListOb;
    }

    public void insertLast(String name, int age) {
        ListOb newListOb = new ListOb(name, age);
        if (this.isEmpty()) {
            first = newListOb;
        } else
            last.next = newListOb;
        last = newListOb;
    }

    public ListOb delete() {
        ListOb temp = first;
        if (first.next == null) last = null;
        first = first.next;
        return temp;
    }

    public void display() {
        ListOb current = first;
        while (current != null) {
            current.displayInfo();
            current = current.next;
        }
    }

    public ListOb find(String _name){
        ListOb current = first;
        while (current!=null) {
            if (current.name == _name)
                return current;
            else
                current = current.next;
        }
        return null;
    }

    public ListOb delete(String name){
        ListOb current = first;
        ListOb prev = first;
        while (current.name != name) {
            if (current.name == null)
                return null;
            else {
                prev = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
