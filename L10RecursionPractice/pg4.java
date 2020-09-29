package L10RecursionPractice;

public class pg4 {
    public static void print(int n) {
        if (n == 0)
            return;
        if (n == 1)
            System.out.print(n);
        else
            System.out.print(n + " ");
        print(n - 1);
    }


    public static void main(String[] args) {
        print(5);
    }
}