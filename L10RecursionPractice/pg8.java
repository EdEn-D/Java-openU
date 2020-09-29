package L10RecursionPractice;

public class pg8 {
    public static void print(int[] arr, int size) { // first to last
        if (arr != null && size == 0)
            return;
        print(arr, size-1);
        System.out.print(arr[size-1] + " ");
    }

    public static void print2(int[] arr, int size) { // last to first
        if (arr != null && size == 0)
            return;
        System.out.print(arr[size-1] + " ");
        print2(arr, size-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int size = arr.length;
        print(arr, size);
        System.out.println();
        print2(arr, size);
    }
}