package a2018;

public class a2018_4a {
     public static int longestSlope(int[][]mat, int num){
         return longestSlope(mat,num,0,0);
     }

    private static int longestSlope(int[][] mat, int num, int r, int c) {
         if(r>mat.length-1){
             r=0;
             c++;
         }
         if (c==mat[0].length)
             return 0;

         int y = calcSlope(mat,num,r,c,0,mat[r][c]-num);
         int x = longestSlope(mat,num,r+1,c);
         return Math.max(x,y);
    }

    private static int calcSlope(int[][] mat, int num, int r, int c, int count, int curr) {
         if(r<0||c<0||r>mat.length-1||c>mat[0].length-1||mat[r][c]!=curr+num)
             return count;

         int a = calcSlope(mat,num,r+1,c,count+1,mat[r][c]);
         int b = calcSlope(mat,num,r-1,c,count+1,mat[r][c]);
         int C = calcSlope(mat,num,r,c+1,count+1,mat[r][c]);
         int d = calcSlope(mat,num,r,c-1,count+1,mat[r][c]);

         return Math.max(Math.max(a,b),Math.max(C,d));
    }

    public static void main(String[]ars){
         int[][]mat = {
                 {3,13,15,33,30},
                 {55,54,53,36,27},
                 {54,12,52,51,50},
                 {50,10,8,53,11},
         };
         System.out.println(longestSlope(mat,3));
    }
}
