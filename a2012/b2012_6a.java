package a2012;
// 3 Factors here
// 1) the stopping condition, if statement if (n == 1){mat[row][col] = sign;}
// 2) n/2, you divide the array into 4 parts then 2 like an inception
// 3) 4 recursive calls like in most 2D arrays
public class b2012_6a {
    public static void fillHadamard (int mat[][]){
        fillHadamard(mat,mat.length,0,0 ,1);
    }

    private static void fillHadamard(int[][] mat,int n , int row, int col, int sign) {
        if (n == 1)
            mat[row][col] = sign;
        else{
                fillHadamard(mat, n/2,row,col,sign);
                fillHadamard(mat, n/2,row+n/2,col,sign);
                fillHadamard(mat, n/2,row,col+n/2,sign);
                fillHadamard(mat, n/2,row+n/2,col+n/2,(-1)*sign);
            }
    }


    public static void printMat(int[][] m){
        printMat(m,0,0);
    }
    public static void printMat(int[][] m, int i, int j){
        if (i == m.length)
            return;
        else if (j == m.length) {
            System.out.println();
            printMat(m, i + 1, 0);
        }
        else {
            System.out.print(m[i][j] + "\t");
            printMat(m, i, j + 1);
        }
    }
    public static void main(String[]atfs){
        int[][]a= new int[4][4];
        fillHadamard(a);
        printMat(a);
    }
}
