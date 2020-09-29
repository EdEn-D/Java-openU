package L10RecursionPractice;

public class pg21 {
    // a^b
    public static long pow (int a, int b) {
        if (b == 0)
            return 1;
        return a * pow(a,b-1);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(pow(a,b));
    }
}