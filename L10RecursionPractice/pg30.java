package L10RecursionPractice;

public class pg30 {
    // binary converter
    public static String binary(int n) { // first to last
        if (n == 1)
            return "1";
        return binary(n / 2) + (n % 2);
    }


    public static void main(String[] args) {
        int n = 157;
        System.out.println(binary(n));
    }
}