package a2014;
// longestWorm acts as a starting point shifter
//      its stopping conditions are when r or c go out of bounds
//      else it stores values for when the starting positions are going right or down
// CalcWorm will calculate the worm length of the current point that longestWorm is on (curr)
//        the first if statement is the stopping condition. It checks if it has any neighbors, if not
//        it will return 1, (single worm) and if it does, it will calculate it's worm's length,
//        by checking and going to all its neighbors. storing the amount of times it recall's itself,
//        until it reaches the stopping condition (no neighbors) and adds 1 to the rest.
//        Then the function returns the max path, which is returned longestWorm and stored and later
//        compared and returns the largest.

// There are 3 factors here to remember:
//  1) look at how longestWorm traverses the array. It has a curr which calculates the worm, then
//       it calls itself(not calcWorm) but with the next position in the array. it cannot fail because
//       of the stopping condition which will catch out of bounds values
//  2) The stopping condition for CalcWorm is annoying but necessary. It stops the calculation
//      when the position it has reached no longer has neighbors
//  3) adding 1 before calling calcWorm again in every if statement is crucial, and it is
//      finalized when it has no more neighbors (stopping condition) and thus stops with a value
//      which is then compared and returned to longestWorm.

public class b2014_4a {
    public static int longestWorm(int[][]mat){
        return longestWorm(mat,0,0);
    }

    private static int longestWorm(int[][] mat, int r, int c) {
        if(r>=mat.length)
            return 0;
        else if (c>=mat[r].length)
            return 0;
        else {
            int curr=calcWorm(mat,r, c);
            int right=longestWorm( mat,r, c+1);
            int down=longestWorm( mat,r+1, c);
            return Math.max(Math.max(curr,right),down);
        }
    }

    private static int calcWorm(int[][] mat, int r, int c) {
        if((r<=0||mat[r-1][c]!=mat[r][c]+1)&&
                (r>=mat.length-1||mat[r+1][c]!=mat[r][c]+1)&&
                (c>=mat[r].length-1||mat[r][c+1]!=mat[r][c]+1)&&
                (c<=0||mat[r][c-1]!=mat[r][c]+1))
            return 1;

        int a=0,b=0,C=0,d=0,max;
        if (r+1<mat.length && mat[r][c]+1 == mat[r+1][c])
            a = 1 + calcWorm(mat,r+1,c);
        if (r-1>=0 && mat[r][c]+1 == mat[r-1][c])
            b = 1 + calcWorm(mat,r-1,c);
        if (c+1<mat[0].length && mat[r][c]+1 == mat[r][c+1])
            C = 1 + calcWorm(mat,r,c+1);
        if (c-1>=0 && mat[r][c]+1 == mat[r][c-1])
            d = 1 + calcWorm(mat,r,c-1);

        max = Math.max(Math.max(a,b),Math.max(C,d));
        return max;
    }
    public static void main(String[]ars) {
        int[][] cunt = new int[][]{
                {3, 13, 15, 28,30},
                {50, 51, 52, 29,30},
                {51, 10, 53, 54,55},
                {53, 12, 14, 53,11},
        };

        System.out.println(longestWorm(cunt));
    }
}
