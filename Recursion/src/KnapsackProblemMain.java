public class KnapsackProblemMain {
    static KnapsackObject[] kList = new KnapsackObject[4];
    static int W = 40;

    private static int knapsack(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (kList[i].weight > W) {
            return knapsack(i-1, W);
        } else {
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - kList[i].weight) + kList[i].value);
        }
    }


    public static void main(String[] args) {
        kList[0] = new KnapsackObject("matches", 10, 15);
        kList[1] = new KnapsackObject("rod", 30, 20);
        kList[2] = new KnapsackObject("kettle", 40, 30);
        kList[3] = new KnapsackObject("knife", 10, 20);
        System.out.println(knapsack(kList.length - 1, W));}
}
