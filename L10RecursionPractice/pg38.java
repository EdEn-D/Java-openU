package L10RecursionPractice;

public class pg38 {
    // remove doubles

    public static String removeDup(String str){
        if (str.length() == 1)
            return str.substring(0,1);
        if (str.charAt(0) == str.charAt(1))
            return removeDup(str.substring(1));
        return str.charAt(0) + removeDup(str.substring(1));
    }



    public static void main(String[] args) {
        String str1 = "aaabbcccdddddeeeeeeeeeeeefcaaa"; // true

        System.out.println("Input: " + str1);
        System.out.println("Expected: \nabcdefca");
        System.out.println(removeDup(str1));
    }
}