package L10RecursionPractice;

public class pg34 {
    // if palindrome -> true

    public static boolean pali(String str){
        return pali(str,0);
    }
    private static boolean pali(String str, int i){
        if (i==str.length()/2)
            return true;

        return str.charAt(i) == str.charAt((str.length()-1)-i) && pali(str, i+1);
    }


    public static void main(String[] args) {
        String str = "abccba"; // true
        String str2 = "abcba"; // true
        String str3 = "abcdba"; // false
        int n = 3;
        System.out.println("Input: " + str3);
        System.out.println(pali(str3));

    }
}