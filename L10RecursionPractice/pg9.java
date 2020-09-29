package L10RecursionPractice;

public class pg9 {
    public static void print(int[] arr){ // overload using length of arr
        int size = arr.length;
        print(arr,size);
    }
    private static void print(int[] arr, int size) { // first to last
        if (arr != null && size == 0)
            return;
        print(arr, size-1);
        System.out.print(arr[size-1] + " ");
    }

    public static void print2(int[] arr){ // overload starting from 0
        print2(arr,0);
    }
    private static void print2(int[] arr, int i) { // first to last
        if (arr != null && i == arr.length)
            return;
        System.out.print(arr[i] + " ");
        print2(arr,i+1);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        print(arr);
        System.out.println();
        print2(arr);
    }
}