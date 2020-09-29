package L10RecursionPractice;

public class pg36 {
    // replace _ with #

    public static String replace_(String str){
            if (str.length() == 0)
                return "";
            if (str.charAt(0)== ' ')
                return "#" + replace_(str.substring(1));
            return str.charAt(0) + replace_(str.substring(1));
    }



    public static void main(String[] args) {
        String str1 = " a b c c b a "; // true

        System.out.println("Input: " + str1);
        System.out.println(replace_(str1));
    }
}