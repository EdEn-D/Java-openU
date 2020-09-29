package a2012;
// This function prints the elements that make up the sum
// so it has to keep a history
// declares a history array the size of n and then inserts values into it, and prints out the array
// basically it insets into history the numbers its going to print in order.
// history will look like {2,2,5,0,0,0,0,0,0} for example if n is 9 and s is {2,5}

// if n is 0 print and return true
// if went past 0 or index out of bounds or history's index equals the whole sum return false
// --- look at down at history comments---
// return either (subtracting n-current int, then progressing the history's array) OR
//              (if the prev is false, moving the s index up so to try the next value)
public class a2012_2a {

    public static boolean isSumOf(int [] s, int n){
        int [] history = new int[n];
        return isSumOf(s,n,history,0,0);
    }

    private static boolean isSumOf(int[]s,int n, int[]history, int i, int x){ // x is history's index
        if (n==0) {
            printArray(history,0,x);
            return true;
        }
        if (n<0 || i == s.length || x == n)
            return false;

        history[x] = s[i]; // adds an item to the list, recursive call,
        // subtracts from sum, goes to stopping condition, true/false .

        return isSumOf(s,n-s[i],history,i,x+1) || isSumOf(s,n,history,i+1,x);
    }


    private static void printArray(int[]history,int i, int x){
        if (history.length == i)
            return;
        if (i<x)
            System.out.print(history[i] + " ");
        printArray(history,i+1,x);
    }


    public static void main(String[] a)
    {
        int[] nums1 = new int[]{4,5,3}; // true
        //int[] nums2 = new int[]{}; // false
        int n1 = 9;
        int n2 = 5;
        System.out.println(isSumOf(nums1,n2));
    }
}
