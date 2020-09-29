package a2016;

public class b2016_6a {
    public static int count (int sum){
        return count (sum,1);
    }

    private static int count(int sum, int x) {
        if (sum==0)return 1;
        if (sum - x < 0) return 0;
        return count(sum-x,x+1) + count(sum,x+1);
    }

    public static void main(String []args){
        System.out.println(count(7));
    }
}
