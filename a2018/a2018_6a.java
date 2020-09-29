package a2018;

public class a2018_6a {

    public static int howManySorted(int n, int max){
        return howManySorted(n,max,1);
    }

    private static int howManySorted(int n, int max, int i) {
        if (n==0)
            return 1;
        if (i>max)
            return 0;

        return howManySorted(n-1,max,i)+howManySorted(n,max,i+1);
    }

    public static void main(String []args){
        System.out.println(howManySorted(2,3));
    }
}
