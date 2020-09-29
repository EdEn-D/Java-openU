package a2012;
// classic, find if you can split the array to 2 groups so their sums are equal
// add to left group, then back tracking and adding one by one to right group
// then once the index reaches the end return if both sums are equal
public class a2012_1a {

    public static boolean splitEqualSum(int[] a){
        return splitEqualSum(a, 0, 0, 0);
    }

    public static boolean splitEqualSum(int[] a, int i, int sumLeft, int sumRight){
        if (i == a.length)
          return sumLeft == sumRight;
        return splitEqualSum(a,i+1,sumLeft+a[i],sumRight)
                || splitEqualSum(a,i+1,sumLeft,sumRight+a[i]);
    }

        public static void main(String[] a)
    {
        int[] nums1 = new int[]{2,8,3,4,2,5}; // true
        int[] nums2 = new int[]{2,4,6,2,3,4}; // false
        System.out.println(splitEqualSum(nums1));
    }
}
