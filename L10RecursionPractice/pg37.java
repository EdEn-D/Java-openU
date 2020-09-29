package L10RecursionPractice;

public class pg37 {
    // return str reversed

    public static String reverse(String str){
        if (str.length() == 0)
            return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }



    public static void main(String[] args) {
        String str1 = "abcdefg"; // true

        System.out.println("Input: \n" + str1);
        System.out.println(reverse(str1));
    }
}