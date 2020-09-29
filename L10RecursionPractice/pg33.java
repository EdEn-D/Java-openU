package L10RecursionPractice;

public class pg33 {
    // str x n

    public static String repeat(String a, int n){ // public static int revDig(String a) { // doesnt work for 0
        if (n==1)
            return a;
        return a + repeat(a, n -1);
    }


    public static void main(String[] args) {
        String str = "Abc";
        int n = 3;
        System.out.println("Input: " + str + " x"+n);
        System.out.println(repeat(str, 3));

    }
}