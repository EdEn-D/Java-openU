package a2016;

public class b2016_1a {
    public static int where (int[]vec){
        return where(vec,0,1,vec.length-1);
    }

    private static int where(int[] vec, int left, int p, int right) {
        if (p>right)
            return -1;
        if (sum(vec,left,p-1)==sum(vec,p,right))
            return p;
        else
            return where(vec,left,p+1,right);
    }

    public static boolean isBalanced(int[]vec, int k){
        return isBalanced(vec,k,0,vec.length-1);
    }

    private static boolean isBalanced(int[] vec, int k, int left, int right) {
        if(k==0) return true;
        int x = where(vec,left,1,right);
        if(k>0 && x==-1) return false;

        return isBalanced(vec,k-1,left,x-1) && isBalanced(vec,k-1,x,right);
    }

    private static int sum(int[] vec, int lo, int hi) {
        int sum = 0;
        for (int i = lo ;i<=hi;i++)
            sum = sum + vec[i];
        return sum;
    }

    public static void main(String[]args){
        int[]arr={5,6,1,2,8};
        int[]arr2={1,2,2,1,3,2,1,3,4,-1,4,2};
        System.out.println(where(arr));
        System.out.println(isBalanced(arr2,2));
    }
}
