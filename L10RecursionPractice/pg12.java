package L10RecursionPractice;

public class pg12 {
    // pg 12 and 13
    public static int sum(int a, int b) {
        if (b == 0)
            return a;
        if (b < 0)
            return -sum(-a,-b);
        return sum(a, b-1) + 1;
    }


    public static void main(String[] args) {
        System.out.println(sum(5,8));
        System.out.println(sum(5,-8));
    }
}