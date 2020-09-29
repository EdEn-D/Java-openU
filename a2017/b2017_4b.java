package a2017;

public class b2017_4b {
    public static int cntTrueReg(boolean[][]mat){
        return cntTrueReg(mat,0,0,0);
    }

    private static int cntTrueReg(boolean[][] mat, int count, int r, int c) {
        if(r>mat.length-1) {
            c++;
            r=0;
        }
        if (c>mat.length-1)
            return count;

        if (mat[r][c]){
            nukeZone(mat,r,c);
            count++;
        }
 
        return cntTrueReg(mat,count,r+1,c);
    }

    private static void nukeZone(boolean[][] mat, int r, int c) {
        if(r>mat.length-1||r<0||c>mat.length-1||c<0)
            return;
        if (mat[r][c] == false)
            return;
        if (mat[r][c] == true)
            mat[r][c] = false;

        nukeZone(mat,r+1,c);
        nukeZone(mat,r,c+1);
        nukeZone(mat,r-1,c);
        nukeZone(mat,r,c-1);
    }

    public static void main(String[]args){
        boolean[][]mat = {
                {true,false,false,false,true},
                {false,true,true,true,false},
                {false,false,true,true,false},
                {true,false,true,false,false},
                {true,true,false,true,true},
        };

        System.out.println(cntTrueReg(mat));
    }
}
