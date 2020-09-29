package L10RecursionPractice;

public class pg10 {

    public static int print(int[] arr){ // overload starting from 0
        return print(arr,0);
    }
    private static int print(int[] arr, int i) { // first to last
        if (arr != null && i == arr.length)
            return 0;
        return print(arr,i+1) + arr[i];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5, 6};
        System.out.println(print(arr));

    }
}