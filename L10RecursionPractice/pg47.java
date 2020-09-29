package L10RecursionPractice;

public class pg47 {
    //

    public static boolean isTrans(String s1,String s2){
        if (s2.length()<s1.length())
            return false;
        if (s1.length()==0)
            return true;
        if (s1.charAt(0) != s2.charAt(0))
            return isTrans(s1.substring(1),s2.substring(2));
        else
            return isTrans(s1.substring(1),s2.substring(1));

    }

    public static void main(String[] args) {
        String s1 = "abbcd";
        String s2 = "aabbd";
        System.out.println(isTrans(s1,s2));
    }
}