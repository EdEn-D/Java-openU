package L10RecursionPractice;

public class pg27 {
    public static int[] minMax (int[] arr){
        int[] result ={arr[0],arr[0]};
        return minMax(arr,0,result);
    }

    private static int[] minMax (int[] arr,int i,int[] result){
        if (i == arr.length)
            return result;
        if (arr[i] > result[0]) {
            result[0]=arr[i];
        }
        if (arr[i] < result[1]) {
            result[1]=arr[i];
        }
        return minMax(arr,i+1,result);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{999,2,3,4,55,7,8,23,67,2,7,3,7,2436,246,41};
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int[] arr2 = new int[]{6,5,4,3,2,1};
        System.out.println(minMax(arr)[0] + " " + minMax(arr)[1]);
    }
}
