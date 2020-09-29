package L10RecursionPractice;

public class pg46BackTrackingHistoryExample {
    public static void options(int n){
        int[] history = new int[n];
        options(n, history, 0);
    }

    private static void options(int n, int[] history, int i){
        if (n == 0) {
            print(history, 0, i);
            System.out.println(); }
        if (n>0) {
            history[i] = 1;
            options(n - 1, history, i + 1);
            history[i] = 2;
            options(n - 2, history, i + 1);
        }
    }

    private static void print(int[] history, int from, int to){
        if(from < to){
            System.out.print(history[from] + " ");
            print(history,from+1,to);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        options(n);
    }
}
