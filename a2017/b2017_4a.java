package a2017;
// very simple, initial idea was to make an array but that makes it more complicated
// its much simpler to just have 3 variable since its constant numbers
// Math.min was not allowed but that's a simple method.
// if sum is overpassed/negative, return the highest value, so n
// if its 0 return the count
public class b2017_4a {
    public static int oneFiveSever(int n) {
        return oneFiveSever(n,n,0);
    }

    private static int oneFiveSever(int n, int sum,int c) {
        if (sum==0)
            return c;
        if (sum<0)
            return n;
        int seven = oneFiveSever(n,sum-7,c+1);
        int five = oneFiveSever(n,sum-5,c+1);
        int one = oneFiveSever(n,sum-1,c+1);
        return Math.min(Math.min(seven,five),one);
    }

    public static void main(String[]afa){

        System.out.println(oneFiveSever(11));
    }
}
