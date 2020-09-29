package a2012;
// has to print ALL mirrored arrays of a[]. run program.
//
// (notice similarities between the recursive calls of a2016_6a
// 3 factors
// 1) the stopping condition if (i>a.length/2){ display(a); }
// 2) the 2 recursive calls (backtracking) mirror(a, i + 1);
//      basically it performs a switch and then moves the i up and keeps performing switches
//      and printing
// 3) the switch
public class a2012_5b {

    public static void mirror(int[] a){
        mirror(a,0);
        // max switches are a.length/2
        //
    }
    private static void mirror(int[] a,int i){
        if (i>a.length/2)
            display(a);
        else {
            mirror(a, i + 1);
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
            mirror(a, i + 1);
//            a[a.length - 1 - i] = a[i];// no need to reset
//            a[i] = temp;//
//            mirror(a, i + 1);
        }
    }
    private static void display(int[] a) {
        display(a,0);
    }
    private static void display(int[] a, int i) {
        System.out.print(a[i]);
        if (i<a.length-1)
            display(a,i+1);
        else
            System.out.println();
    }
    private static int[] copyArray(int[] a) {
        int[]b = new int[a.length];
        copyArray(a,b,0);
        return b;
    }
    private static void copyArray(int[] a, int[] b, int i) {
        b[i]=a[i];
        if (i<a.length-1)
            copyArray(a,b,i+1);
    }
    public static void main(String[] ars) {
        int[] a = new int[]{5,3,1,4}; // true
        //int[] nums2 = new int[]{}; // false
        int n1 = 9;
        int n2 = 21;
        mirror(a);
    }
}
