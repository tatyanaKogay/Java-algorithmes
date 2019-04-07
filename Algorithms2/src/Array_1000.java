public class Array_1000 {
    public static void main(String[] args) {
        long stime1, etime1, stime2, etime2, stime3, etime3;
        Array arr1 = new Array(1000);
        arr1.randomFill();
        arr1.display();
        stime1 = System.currentTimeMillis();
        arr1.insertSort();
        etime1 = System.currentTimeMillis();
        arr1.display();

        Array arr2 = new Array(1000);
        arr2.randomFill();
        arr2.display();
        stime2 = System.currentTimeMillis();
        arr2.selectSort();
        etime2 = System.currentTimeMillis();
        arr2.display();

        Array arr3 = new Array(1000);
        arr3.randomFill();
        arr3.display();
        stime3 = System.currentTimeMillis();
        arr3.bubbleSort();
        etime3 = System.currentTimeMillis();
        arr3.display();

        System.out.println("insert sort takes " + (etime1-stime1) + " millis");
        System.out.println("select sort takes " + (etime2-stime2) + " millis");
        System.out.println("bubble sort takes " + (etime3-stime3) + " millis");

    }


}
