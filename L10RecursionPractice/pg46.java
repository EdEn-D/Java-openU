package L10RecursionPractice;

public class pg46 {
    public static void allSubSets(int[] a){
        boolean[] history = new boolean[a.length];
        allSubSets(a, history, 0);
    }

    private static void allSubSets(int[] a, boolean[] history, int i){
        if (i == a.length)
            print(a,history,0);

        else{
            history[i] = true;
            allSubSets(a,history,i+1);
            history[i] = false;
            allSubSets(a,history,i+1);
        }
    }

    private static void print(int[] a, boolean[] history, int i){
        if (i==a.length){
            System.out.println();
        }
        else{
            if (history[i]==true)
                System.out.print(a[i]+ " ");
        print(a,history,i+1);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        allSubSets(a);
    }
}