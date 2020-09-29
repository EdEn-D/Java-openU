package L10RecursionPractice;

public class pg18 {
    // 18 & 19
    public static int mult(int a, int b) {
        if (b == 0)
            return 0;
        if (b < 0)
            return -mult(a,-b);
        return mult(a, b-1) + a;
    }


    public static void main(String[] args) {
        int a = -79;
        int b = 17;
        System.out.println(mult(a,b));
        System.out.println((a*b));
    }
}