package L10RecursionPractice;

public class pg45 {
    //

    public static void combinations(char[] a){
    combinations(a,0, "{");
    }

    private static void combinations(char[] a,int i, String prefix){
        if (i == a.length) {

            return;
        }
        System.out.println(prefix + a[i] + "}");
        combinations(a,i+1,prefix);
        combinations(a, i+1,prefix+a[i]);
    }

    public static void main(String[] args) {
        char[] a = new char[]{'a','b','c'};
        combinations(a);
    }
}