package a2012;
// moving across a 2D array, printing the sums of all the paths to the end of the array
// 4 commands that switch direction
// back tracking
// marking where i was
/**Important line 32 -  m[x][y] =  temp; - resetting the array for the next path*/
//

public class b2012_3a {
    public static void printPathWeights(int [][] m){
        printPathWeights(m, 0, 0, 0);
    }

    public static void printPathWeights(int [][] m, int x, int y, int cost){

        if (x > m.length-1 || x < 0 || y > m[0].length-1 || y < 0)
            return;
        if (m[x][y]==-1)
            return;

        if (x == m.length-1 && y == m[0].length-1)
            System.out.println(cost + m[x][y]);

        int temp = m[x][y];
        cost = cost + m[x][y];
        m[x][y] = -1;

        printPathWeights(m,x+1,y,cost);
        printPathWeights(m,x,y+1,cost);
        printPathWeights(m,x-1,y,cost);
        printPathWeights(m,x,y-1,cost);
        m[x][y] =  temp;
    }



    public static void main (String[] args){
        int a[][] = new int[][]{
                {8, 4, 2, 4, 3},
                {6, 3, 8, 4, 5},
                //{1, 4, 9, 9, 7},
                //{2, 1, 7, 6, 5},
        };
        printPathWeights(a);
    }
}
