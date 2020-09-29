package L10RecursionPractice;

public class pg6 {
    // pg 6 and 7
    public static int sum(int n) {
        if (n == 0)
            return 0;
        if (n<0)
            return -sum(-n);
        return n+ sum(n-1);
    }


    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(-3));
    }
}