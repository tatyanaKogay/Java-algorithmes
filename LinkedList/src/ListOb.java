public class ListOb {

    public int age;
    public String name;
    public ListOb next;

    public ListOb(String _name, int _age){
        this.age = _age;
        this.name = _name;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name + " age: " + this.age);
    }

}
