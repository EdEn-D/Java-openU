package L10RecursionPractice;

// Prints ALL possible combinations of sums!!!
// important example
public class pg48 {


    public static void isSumOf(int[] s, int n) {
        int[] history = new int[s.length]; // declare array with the same amount of numbers
        isSumOf(s, n, 0, history);
    }

    private static void isSumOf(int[] s, int n, int i, int[] history) {
        if (n < 0 || i == s.length) // false
            return; // if the sum - numbers, is below 0 or out of numbers
        if (n == 0) { // true if the sum is exactly 0
            print(s, history, 0, 1);
            return;
        }
        history[i]++; // add into index i the amount of repetitions of a specific number
        // if it goes through, great, it'll print
        isSumOf(s, n - s[i], i, history); // it'll print if n hits 0, itll keep subtracting s[i] otherwise
        history[i]--; // remove one repetition of the current number (s[i])
        isSumOf(s, n, i + 1, history); // try the next number
    }

    private static void print(int[] s, int[] history, int i, int t) {
        if (i == s.length)
            System.out.println();
        else {
            if (history[i] >= t) {
                System.out.print(s[i] + " ");
                print(s, history, i, t + 1);
            } else
                print(s, history, i + 1, 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 3};
        int n1 = 18;
        int n2 = 13;
        isSumOf(nums, 27);
    }
}
