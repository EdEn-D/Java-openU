package a2017;

public class b2017_3a {
    public static int ways(int k, int n){
        return ways(k,n,0);
    }

    private static int ways(int k, int n, int pos) {
        if(pos == n && k==0){
            return 1;
        } if(k==0 && pos!=n)
            return 0;

        return ways(k-1,n,pos+1)+ways(k-1,n,pos-1);
    }

    public static void main(String[]afa){

        System.out.println(ways(12,4));
    }
}
