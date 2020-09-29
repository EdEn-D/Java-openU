package L10RecursionPractice;

public class pg25 {
    // max int in arr
    public static int max (int[] arr) { // using overload func
        return max(arr,0);
    }
    private static int max (int[] arr, int i ){
        if (i == arr.length)
            return 0;
        return max(arr[i], max(arr, i+1));
    }

    private static int max (int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{999,2,3,4,55,7,8,23,67,2,7,3,7,2436,246,41};
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{3,2,1};
        int n = arr.length;
        System.out.println(max(arr));
        System.out.println(max(arr1));
        System.out.println(max(arr2));
    }
}
