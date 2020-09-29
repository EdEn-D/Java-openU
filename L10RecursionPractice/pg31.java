package L10RecursionPractice;

public class pg31 {
    // reverse numbers 31,32
    public static int revDig2 (int a){
        return revDig(a,0);
    }

    private static int revDig (int a, int num){
        if (a==0)
            return num;
        if(a<0)
            return -revDig(-a, num);
        num = num *10 + (a%10);
        a = a/10;
        return revDig(a, num);
    }

    public static String revDig(int a){ // public static int revDig(String a) { // doesnt work for 0
        if (a/10 == 0)
            return a+"";
        if(a<0)
            return -Integer.parseInt(revDig(-a)) + "";
        return a%10 + "" + revDig(a/10);
    }


    public static void main(String[] args) {
        int n = 105;
        //System.out.println(revDig(n));
        System.out.println(revDig2(n));
        //System.out.println(123%10);
    }
}