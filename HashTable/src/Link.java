public class Link {
    int iData;
    Link next;

    public int getiData() {
        return iData;
    }

    public Link(int i){
        this.iData = i;
    }

    public void display(){
        System.out.println("Data: " + iData);
    }

}
