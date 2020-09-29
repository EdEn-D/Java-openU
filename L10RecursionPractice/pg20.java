package L10RecursionPractice;

public class pg20 {
    // 2^n
    public static long pow (int n) {
        if (n == 0)
            return 1;
        return 2 * pow(n-1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(pow(n));
    }
}