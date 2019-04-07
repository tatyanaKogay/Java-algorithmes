public class Main
{
    public static void main(String[] args)
    {
        Array array = new Array(6);

        array.insert(5);
        array.insert(56);
        array.insert(8);
        array.insert(0);
        array.insert(12);
        array.insert(49);

        array.display();

        array.delete(56);

        array.display();

        System.out.println(array.binaryFind(0));

        array.randomInsert(5);

        array.display();
    }
}
