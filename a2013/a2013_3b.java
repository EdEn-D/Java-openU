package a2013;
// first test done on paper with very minimal mistakes!!! good job
// no real tricks here, rather simple.
public class a2013_3b {
    public static boolean match (int [] a, int [] pattern){
        return match(a,pattern,0);
    }

    private static boolean match(int[] a, int[] p, int i) {
        if (i>a.length-(p.length-1))
            return false;
        else
            return isValid(a,p,i,0) || match(a,p,i+1);
    }

    private static boolean isValid(int[] a, int[] p, int i, int j) {
        if (j==p.length)
            return true;
        if (p[j]==0){
            if (digits(a[i])==1 || digits(a[i]) == 2)
                return isValid(a,p,i+1,j+1);
            else return false;
        } else if(p[j]==digits(a[i]))
            return isValid(a,p,i+1,j+1);
        else
            return false;
    }

    private static int digits(int n) {
        return digits(n,0);
    }

    private static int digits(int n, int count) {
        if (n==0)
            return count;
        n=n/10;
        return digits(n,count+1);
    }

    public static void main(String []args){
        int[]a={2,3,54,4,34,353};
        int[]pattern={1,0,0};

        System.out.println(match(a,pattern));
        System.out.println(digits(56));
    }
}
