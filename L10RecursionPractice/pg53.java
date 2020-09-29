package L10RecursionPractice;

public class pg53 {
    //
    public static int numPaths (int[][] mat, int x1, int y1, int x2, int y2) {
        if (!borderOk(mat,x1,y1) || !borderOk(mat,x2,y2))
            return 0;
        if(x1==x2 && y1==y2)
            return 1;
        int x=mat[x1][y1];
        mat[x1][y1]=-1;
        int c=0;
        c=numPaths(mat,x1,y1+1,x2,y2) +
                numPaths(mat,x1,y1-1,x2,y2) +
                numPaths(mat,x1+1,y1,x2,y2) +
                numPaths(mat,x1-1,y1,x2,y2);
        mat[x1][y1]=x;
        return c;
    }
    private static boolean borderOk(int[][] mat , int x,int y) {
        if(mat.length!=mat[0].length ||x<0|| x>=mat.length ||y<0|| y>=mat.length ||y<x|| mat[x][y]<0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 3;
        System.out.println(numPaths(nums, x1,y1,x2,y2));
    }
}
