package L10RecursionPractice;

public class pg14 {
    // pg 12 and 13
    public static int an(int n) {
        if (n == 1)
            return 3;
        return an(n-1)+2;
    }


    public static void main(String[] args) {
        System.out.println(an(1));
        System.out.println(an(5));
        System.out.println(an(8));
    }
}