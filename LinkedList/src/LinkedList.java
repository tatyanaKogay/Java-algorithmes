public class LinkedList {
    ListOb first;

    public LinkedList(){
        first = null;
    }

    public void insert(String _name, int _age){
        ListOb newlistOb = new ListOb( _name, _age);
        newlistOb.next = first;
        first = newlistOb;
    }

    public ListOb delete(){
        ListOb a = first;
        first = first.next;
        return a;
    }

    public void displayList(){
        ListOb current = first;
        while (current!=null){
            current.displayInfo();
            current = current.next;
        }
    }

    public boolean isEmpty(){
        return (first == null);
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

    public ListOb delete(String name) {
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

    public ListOb getFirst() {
        return first;
    }

    public void setFirst(ListOb first) {
        this.first = first;
    }
}
