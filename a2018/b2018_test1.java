package a2018;
//array full of numbers
// num
// array full of 0s
// find a path the the sum of each number in the path = num
// mark the path on the array with 0s
// first check out of bounds array
// then check if already visited
// then change values ,set new num
// check num, if invalid, reset history and return false
// then check if num = 0 return true
public class b2018_test1 {
    public static boolean sumPath(int[][] arr, int num, int[][] history) {
        return sumPath(arr, num, history, 0, 0);
    }

    private static boolean sumPath(int[][] arr, int num, int[][] history, int r, int c) {
        if (r < 0 || c < 0 || r > arr.length - 1 || c > arr[0].length - 1)
            return false;
        if (history[r][c] == 1) // already visited?
            return false;
        history[r][c] = 1; // set visited
        num = num - arr[r][c]; // set new num

        if (num < 0) { // check if too much sum
            history[r][c] = 0; // set visited
            return false;
        }
        if (num == 0)
            return true;

        boolean x = sumPath(arr, num, history, r + 1, c) ||
                sumPath(arr, num, history, r, c + 1) ||
                sumPath(arr, num, history, r - 1, c) ||
                sumPath(arr, num, history, r, c - 1);
        if (x == false)
            history[r][c] = 0;
        return x;
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] history = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };
        int[][] arr = {
                {2,     3, 5, 98, 23, 1},
                {7,   100, 7, 3,  4,  7},
                {100,  15, 7, 2,  7,  2},
                {8,    88, 4, 6,  1,  7},
        };
        System.out.println(sumPath(arr, 65, history));
        printArray(history);
    }
}
