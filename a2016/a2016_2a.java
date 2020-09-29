package a2016;
// The method  returns the min number needed to get to the last square of the 2D array
// it has to end positive whilst adding the values of the squares it steps on to number.
//
// isPath returns true if there is a path from the first square to the last while number remains positive
// it'll return false until a sufficient enough number is passed, where it will return true, and then
// number will be returned as the final answer.

// simple either or back tracking
public class a2016_2a {
    public static int minPoints(int[][]m){
        return minPoints(m,1);
    }

    private static int minPoints(int[][] m, int number) {
        if(isPath(m,0,0,number))
            return number;
        else
            return minPoints(m,number+1);
    }

    private static boolean isPath(int[][] m, int r, int c, int number) {
        if(r>m.length-1||c>m[0].length-1)
            return false;
        number = number + m [r][c];
        if (number<1) return false;
        if (r==m.length-1 && c==m[0].length-1 && number>0)
            return true;
        return isPath(m,r+1,c,number)||isPath(m,r,c+1,number);
    }

    public static void main(String []args){
        int[][] x = {
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5},
        };
        System.out.println(minPoints(x));
    }
}
