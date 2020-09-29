package L10RecursionPractice;

public class CopyArray {
        private static int[] copyArray(int[] other){
        int[] New = new int[other.length];
        return copyArray(other,other.length,New);
    }

    private static int[] copyArray(int[] other, int length, int[] aNew) {
        if (length>0){
            aNew[length-1] = other[length-1];
            return copyArray(other,length-1,aNew);
        }else
            return aNew;
    }

    public static void main(String[]args){
        int[]x1={5,2,4};
        int[]copy=copyArray(x1);
        System.out.println(copy);
    }
}
