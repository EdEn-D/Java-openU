package L10RecursionPractice;

public class pg22 {
    // a^b
    public static double pow (int a, int b) {
        if (b == 0)
            return 1;
        if (b < 0)
            return 1.0/pow(a,-b);
        return a * pow(a,b-1);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = -2;
        System.out.println(pow(a,b));
        System.out.println("Expected = " + Math.pow(a,b));
    }
}