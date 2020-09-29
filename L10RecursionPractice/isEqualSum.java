package L10RecursionPractice;

public class isEqualSum {

    public static boolean isEqualsum (int[] a){
        return isEqualsum(a,0,0,0);
    }

    private static boolean isEqualsum(int []a, int s1, int s2, int i){
        if (i == a.length) {
            if (s1 == s2)
                return true;
            else
                return false;
        }
        if (isEqualsum(a, s1 + a[i], s2, i + 1))
            return true;
        return  (isEqualsum(a, s1, s2 + a[i], i +1));
    }

    public static void main (String[] args){
        int[] arr = new int[]{3,2,7,3,5};
        System.out.println(isEqualsum(arr));
    }
}
