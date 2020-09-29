package a2012;
// find if there is a path from index 0 to last
// index by adding/subtracting to index values of a[i].
// Back tracking with marking steps WITHOUT resetting array afterwards cause of temp (keeps it's value
public class b2012_3b {

    public static boolean isWay(int[] a){
        return isWay(a,0);
    }

    public static boolean isWay(int[] a, int i){
        if (i == a.length-1)
            return true;
        if (i < 0 || i > a.length-1)
            return false;
        if (a[i] == -1)
            return false;
        else {
            int temp = a[i];
            a[i] = -1;
            return isWay(a, i + temp) || isWay(a, i - temp);
        }
    }

    public static void main(String []args){
        int [] x= new int[]{2, 4, 1, 6, 4, 2, 4, 3, 5};
        int [] x2= new int[]{1, 4, 3, 1, 2, 4, 3};
        int [] x4= new int[]{1, 4, 8, 1, 2, 1, 3,4,1,4,2,0};
        int [] x3= new int[]{1, 2,4,2,4,1,3,7,9};
        System.out.println(isWay(x3));
    }
}