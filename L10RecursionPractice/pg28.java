package L10RecursionPractice;

public class pg28 {

    public static int maxLine (int [][]arr){
        return maxLine(arr,0,0);
    }
    private static int maxLine (int[][] arr, int i, int row){
        if (i == arr.length-1)
            return row;
        if (sum(arr[row],0) < sum(arr[i+1],0))
            row = i+1;

        return maxLine(arr,i+1,row);
    }

    private static int sum(int[] m, int i){
        if (i==m.length)
            return 0;
        return sum(m,i+1) + m[i];
    }


    public static void main(String[] args) {
        int [][] a = new int [][]{
                { 0,  0,  1,   2,   2,   21,  23,  23,},
                { 1,  5,  7,   7,   7,   21,  23,  23,},
                { 41, 47, 52,  53,  53,  65,  72 , 73,},
                { 41, 51, 56 , 57,  58,  999,  999,  999,},
                { 41 ,52, 60,  61,  70,  100, 112, 178,},
                { 42, 52, 98 , 100, 111, 147, 150, 18099999 ,},
                { 42, 52, 112, 112, 123, 154, 172, 185,},
                { 78, 82, 121, 134, 136, 174, 182, 1999999999,},
        };
        System.out.println(maxLine(a));
    }
}
