
import java.util.Random;

public class Array {

    int size;
    int[] arr;
    int constSize;

    Array(int _size) {
        this.arr = new int[_size];
        this.size = 0;
        this.constSize = _size;
    }

    public void display(){
        for (int i = 0; i<this.size; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    public boolean binaryFind(int value) {
        boolean res = false;
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low<=high) {
            mid = (low+high)/2;
            if (this.arr[mid] == value) {
                res = true;
                break;
            }
            else {
                if (value < mid) {
                    high = mid-1;
                }
                else {
                    low = mid + 1;
                }
            }
        }
        return res;
    }

    public void delete(int value1){
        int i;
        for (i = 0; i<this.size; i++){
            if (this.arr[i] == value1)
                break;
        }
        for (int j = i; j<this.size-1; j++){
            this.arr[j] = this.arr[j+1];
        }
        size--;
    }

    public void insert(int value2){
        int i;
        for(i=0; i<this.size; i++){
            if (this.arr[i] > value2)
                break;
        }
        for (int j=this.size; j>i; j--){
            this.arr[j] = this.arr[j-1];
        }

        this.arr[i] = value2;
        size++;

    }

    public void randomInsert(int value3){
        this.arr[size] = value3;
        size++;
    }

    public void randomFill(){
        Random ran = new Random();
        for (int i = 0; i<this.constSize; i++){
            this.arr[i] = (int)(Math.random()*constSize);
        }
        this.size = this.constSize;
    }

    public void bubbleSort(){
        int i,j;
        for (i=this.arr.length-1; i>=1; i--){
            for (j = 0; j<i; j++){
                if (this.arr[j] > this.arr[j+1])
                    change(j, j+1);

            }
        }
    }

    public void selectSort() {
        int in, out, mark;
        for (out = 0; out < this.arr.length; out++) {
            mark = out;
            for (in = out + 1; in < this.arr.length; in++) {
                if (this.arr[in] < this.arr[mark]) {
                    mark = in;
                }
            }
            change(out, mark);
        }
    }


    public void insertSort(){
        int in, out;
        for(out = 1;out < this.size; out++){
            int temp = this.arr[out];
            in = out;
            while(in > 0 && this.arr[in-1] >=temp){
                this.arr[in] = this.arr[in-1];
                --in;
            }
            this.arr[in] = temp;
        }
    }



    public void change(int a, int b){
        int t = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = t;
    }

}
