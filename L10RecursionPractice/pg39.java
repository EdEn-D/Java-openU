package L10RecursionPractice;

public class pg39 {
    // remove doubles

    public static String merge(String str1, String str2){
        if (str1.length() == 0)
            return str2;
        if (str2.length() == 0)
            return str1;
        if (str1.charAt(0) < str2.charAt(0))
            return str1.substring(0,1) + merge(str1.substring(1),str2);
        if (str1.charAt(0) > str2.charAt(0))
            return str2.substring(0,1) + merge(str1,str2.substring(1));
        else return str1.substring(0,1) + str2.substring(0,1) + merge(str1.substring(1),str2.substring(1));
    }



    public static void main(String[] args) {
        String str1 = "abcdegh";
        String str2 = "acfgggi";

        System.out.println("Input 1: " + str1);
        System.out.println("Input 2: " + str2);
        System.out.println("Expected: \naabccdefgggghi");
        System.out.println(merge(str1, str2));
        System.out.println(pg38.removeDup(merge(str1, str2)));
    }
}