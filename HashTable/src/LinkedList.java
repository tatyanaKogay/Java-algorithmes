public class LinkedList {
    Link first;

    public LinkedList(){
        first = null;
    }

    public void insert(Link link){
        int key = link.getiData();
        Link prev = null;
        Link curr = first;
        while (curr!=null && curr.getiData()<key){
            prev = curr;
            curr = curr.next;
        }
        if (prev == null) first = link;
        else {
            prev.next = link;
            link.next = curr;
        }
    }

    public void delete(int key){
        Link prev = null;
        Link curr = first;
        while (curr!=null && curr.getiData()!=key){
            prev = curr;
            curr = curr.next;
        }
        if (prev == first) first = first.next;
        else prev.next = curr.next;
    }

    public Link find(int key){
        Link curr = first;
        while (curr!=null && curr.getiData()<=key){
            if (curr.getiData() == key) return curr;
            curr = curr.next;
        }
        return null;
    }

    public void displayList(){
        System.out.println("First-->Last: ");
        Link curr = first;
        while (curr!=null){
            curr.display();
            curr=curr.next;
        }
        System.out.println();
    }
}
