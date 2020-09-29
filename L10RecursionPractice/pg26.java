package L10RecursionPractice;

public class pg26 {
    private static int max (int[] arr, int start, int end){
        int tmp;
        if (start==end)
            return arr[end];
        tmp = max(arr,start+1,end);
        if (tmp<arr[start])
            tmp = arr[start];
        return tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{999,2,3,4,55,7,8,23,67,2,7,3,7,2436,246,41};
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int[] arr2 = new int[]{6,5,4,3,2,1};
        int[] arr3 = new int[]{7,2,67,2,5,2,4,1,0,2,4};
        int start = 3;
        int end = 9;
        System.out.println(max(arr3,start,end));
    }
}
