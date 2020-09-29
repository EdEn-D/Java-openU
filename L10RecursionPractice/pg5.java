package L10RecursionPractice;

public class pg5 {
    public static void print(int n) {
        int i = n;
        print(n, i);
    }
    public static void print(int n, int i) {
        if (n == 0)
            return;
        print(n - 1);
            System.out.print(n + " ");

    }


    public static void main(String[] args) {
        print(5);
    }
}