package a2014;
// Major misinterpretation of the question's situation. Here, no matter how i go, there must be a bigger
// number beside me or i am the hill.
// isHill, print are redundant
// Look closer at conditions and think how this can be done easily
// Both return; at the end of every if, or simply changing them to else if work fine because after every
// recursive call it must have a larger neighbor or it's a hill

public class a2014_5a {
    public static void printPath (int[][] mat){
        int[][]path = new int[mat.length][mat[0].length];
        printPath(mat,0,0,path);
    }

    private static void printPath(int[][] mat, int row, int col, int[][] path) {
//        if (isHill(mat,row,col)){     REMOVED
//            path[row][col]=1;
//            print(path);
//            return;
//        }
//        path[row][col]=1;             REMOVED
        System.out.print("("+row+", "+col+")"); // added
        if (row + 1 < mat.length && mat[row+1][col]>mat[row][col]) {
            printPath(mat,row+1,col,path);
            }//return;} // added
        else if(row-1>=0 && mat[row-1][col]>mat[row][col]){
            printPath(mat,row-1,col,path);
            }//return;} // added
        else if (col + 1 < mat[0].length && mat[row][col+1]>mat[row][col]){
            printPath(mat,row,col+1,path);
            }//return;} // added
        else if(col-1>=0 && mat[row][col-1]>mat[row][col]){
            printPath(mat,row,col-1,path);
            }//return;} // added
//        path[row][col]=0; REMOVED
    }

//    All this shit here is redundant
    int xxx;
//    private static boolean isHill(int[][] mat, int r, int c) {
//        if (r+1 < mat.length)
//            if (mat[r][c]<mat[r+1][c])
//                return false;
//        if (r-1 >= 0)
//            if (mat[r][c]<mat[r-1][c])
//                return false;
//        if (c+1 < mat[0].length)
//            if (mat[r][c]<mat[r][c+1])
//                return false;
//        if (c-1>=0)
//            if (mat[r][c]<mat[r][c-1])
//                return false;
//        return true;
//    }
//
//    private static void print(int[][] path) {
//        print(path,0,0);
//    }
//
//    private static void print(int[][] path, int r, int c) {
//        if(path[r][c]==1)
//            System.out.println("("+r+","+c+")");
//
//        if (c+1<path[0].length)
//            print(path,r,c+1);
//        else if (r+1<path.length)
//            print(path,r+1,0);
//    }

    public static void main (String[]args){
        int[][] cunt = new int[][]{
                {3, 8, 7, 1},
                {5, 15, 2, 4},
                {12 ,14 ,-13, 22},
                {13 ,16, 17, 52},
        };
        printPath(cunt);
    }
}

