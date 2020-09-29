package a2017;
// stopping conditions are obvious
// return with checking this row in mat or the next row in mat
public class a2017_6a {
    public static boolean covers(int[][]mat,int[]arr,int k){
        return covers(mat,arr,k,0);
    }

    private static boolean covers(int[][] mat, int[] arr, int k, int i) {
        if (allZero(arr))
            return true;
        if(k<1 || i > mat.length-1)
            return false;
        
        int[]tmp=new int[arr.length];
        copy(tmp,arr);
        xZero(tmp,mat[i]);
        
        return covers(mat,tmp,k-1,i+1) || covers(mat,arr,k,i+1);
    }

    private static void xZero(int[] tmp, int[] ints) {}

    private static void copy(int[] tmp, int[] arr) {
        
    }

    private static boolean allZero(int[] arr) {
        return true;
    }
}
