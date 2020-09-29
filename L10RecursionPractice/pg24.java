package L10RecursionPractice;

public class pg24 {
    // max int in arr
    public static int max (int[] arr, int n) { // using overload func
        int max = arr[0];
        return max(arr,n,max);
    }
    private static int max (int[] arr, int n, int max) {
        if (max < arr[n-1])
            max = arr[n-1];
        if (n == 1)
            return max;
        return max(arr, n-1, max);
    }

    private static int max2 (int[] arr, int n) { // using variable
        int maxx;
        if (n == 0)
            return arr[0];
        maxx = max2(arr, n-1);
        if (maxx < arr[n-1])
            maxx = arr[n-1];
        return maxx;
    }

//    public int max( int[ ] a , int n ) { // shadi's solution
//        if(n==1)
//            return a[0];
//        return max(a[n-1] , max(a,n-1) );
//    }
//    private int max( int a , int b ) {
//        return a>b ? a:b;
//    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,55,7,8,23,67,2,7,3,7,2436,246,41};
        int[] arr2 = new int[]{2,3,4,55,7,8,23};
        int n = arr.length;
        int n2 = arr2.length;
        //System.out.println(max(arr, n));
        System.out.println(max2(arr2, n2));
    }
}
