package L10RecursionPractice;

public class pg11 {

    public static int count(int[] arr, int size, int num) { // first to last
        if (arr != null && size == 0)
            return 0;
        if (arr[size-1] == num)
            return 1+ count(arr, size-1, num);
        return count(arr, size-1, num);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,5,5,5,5,4,3,2,1};
        int size = arr.length;
        int n = 5;
        System.out.println(count(arr, size,n));
    }
}