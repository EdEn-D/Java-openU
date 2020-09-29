package L10RecursionPractice;

public class pg15 {
    // 15 & 16
    public static int mod(int a, int b) {
        if (a < 0 && b < 0)
            return -mod(-a,-b);
        if (a < 0)
            return -mod(-a,b);
        if (b < 0)
            return mod(a,-b);
        if (a-b == 0)
            return 0;
        if (a-b  < 0)
            return a;
        return mod(a-b, b);
    }

    public static int modWAbs(int a, int b) {
        if (a<0)
            return -mod(Math.abs(a),Math.abs(b));
        if (a-Math.abs(b) == 0)
            return 0;
        if (a-Math.abs(b)  < 0)
            return a;
        return mod(a-b, Math.abs(b));
    }

//    public int mod (int a , int b) { Shadi's more elegant solution
//        if(b==0)
//            return 0;
//        if(a<b)
//            return a;
//        return mod (a-b , b);
//    }


    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println(mod(a,b));
        System.out.println(modWAbs(a,b));
        System.out.println("Expected: " + a%b);
    }
}