public class Power {

    public static void main(String[] args) {
        System.out.println(power(2, 7));
        System.out.println(power1(3, 3));
    }

    public static int power(int n, int p){
        if (p==1) return n;
        return (n * power(n, p-1));
    }

    public static int power1(int n, int p){
        if (p==1) return n;
        if (p%2 == 1) return (n*power(n*n, (p-1)/2));
        return power(n*n, p/2);
    }
}
