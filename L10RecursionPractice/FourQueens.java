package L10RecursionPractice;//public class FourQueens {
//
//    public static boolean fourQueens(char[][] arr,int queens){
//        return fourQueens(arr, queens, 3, 0) ||
//    }
//
//    public static boolean fourQueens(char[][] arr, int q, int row, int col){
//        if (q==0 && row == 0)
//            printBoard(arr,0, 0);
//        if (col == arr.length)
//            return false;
//        if (row < 0)
//            return false;
//        if (arr[row][col] != 'x') {
//            arr[row][col] = 'Q';
//            arr = fillRange(arr, row, col, 0, 0);
//            q--;
//            row--;
//        }
//        else {
//            fourQueens(arr, q, row,col+1);
//        }
//        return fourQueens(arr, q, row - 1,col) || fourQueens(arr, q - 1, row -1,col);
//
//    }
//
//    private static char[][] fillRange(char[][] arr, int qr, int qc, int r, int c){
//        if (r==arr.length)
//            return arr;
//        if (qc==arr.length-1){
//            qc=-1;
//        }
//        if (c != qc && c < arr.length) // horizontal fill
//            arr[qr][c] = 'x';
//        if (r != qr && r < arr.length) // vertical fill
//            arr[r][qc] = 'x';
//        if (qr+r != qr && qr+r < arr.length && qc+c != qc && qc+c < arr.length) // diagonal right down fill
//            arr[qr+r][qc+c] = 'x';
//        if (qr-r != qr && qr-r >= 0 && qc+c != qc && qc+c < arr.length) // diagonal right up fill
//            arr[qr-r][qc+c] = 'x';
//        if (qr+r != qr && qr+r < arr.length && qc-c != qc && qc-c >= 0) // diagonal left down fill
//            arr[qr+r][qc-c] = 'x';
//        if (qr-r != qr && qr-r >= 0 && qc-c != qc && qc-c >= 0) // diagonal right up fill
//            arr[qr-r][qc-c] = 'x';
//
//
//        return fillRange(arr,qr,qc,r+1,c+1);
//    }
//
//    private static void printBoard(char[][] arr, int r, int c){
//        if (r==arr.length)
//            return;
//
//        System.out.print(arr[r][c] + "  ");
//
//        if (c==arr.length-1) {
//            System.out.println();
//            r++;
//            c=-1;
//        }
//        printBoard(arr,r,c+1);
//    }
//
//    public static void main(String[] args) {
//        int queens = 4;
//        char[][] arr2 = new char[][]
//                { {'o','o','o','o'},
//                        {'o','o','o','o'},
//                        {'o','o','o','o'},
//                        {'o','o','o','o'}
//                };
//        int[][] arr1 = new int[4][4];
//        fourQueens(arr2, queens);
//        //printBoard(arr2,0,0);
//    }
//}
