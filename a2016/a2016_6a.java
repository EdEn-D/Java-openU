package a2016;
// imo very elegant. Uses couple of important elements
// 1) Page 46 from L10 - history array that goes through all element combinations.
//  (also look at pg48 & pg46BackTrackingHistoryExample)
//      history[i]==true;,
//      RECURSIVE CALL i+1, (Store value returned)
//      history[i]==false;
//      RECURSIVE CALL i+1, (Store value returned)
//
//      calcDiff simply calculates the sum and changes
//      the sign before adding to numbers which are at true indexes of sign[]
public class a2016_6a {
    public static int minDiff(int[]arr){
        boolean[]sign=new boolean[arr.length];
        return minDiff(arr,sign,0);
    }

    private static int minDiff(int[] arr, boolean[] sign, int i) {
        int x=0,y=0;
        if (i==arr.length)
            return calcDiff(arr,sign,0,0);
        else{
            sign[i]=true;
            x = minDiff(arr,sign,i+1);
            sign[i]=false;
            y = minDiff(arr,sign,i+1);
        }
        return Math.min(x,y);
    }

    private static int calcDiff(int[] arr, boolean[] sign, int i, int sum) {
        if (i==arr.length)
            return Math.abs(sum);
        if (sign[i])
            sum = sum + (arr[i]*(-1));
        else
            sum = sum + arr[i];
        return calcDiff(arr,sign,i+1,sum);
    }

    public static void main(String[]args){
        int[]x1={5,2,4};
        int[]x={1,2,7,17,6};
        System.out.println(minDiff(x));
    }
}
