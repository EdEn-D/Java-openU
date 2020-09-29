package L10RecursionPractice;

public class pg35 {
    // return index of c in str

    public static int find(String str, char c){
        if (str.length() == 0)
            return -1;
        if (str.charAt(0)==c)
            return 0;
        else
            return find(str.substring(1),c) + 1;
    }



    public static void main(String[] args) {
        String str1 = "abccba"; // true
        String str2 = "oyyzzzzzzzcunt"; // true
        char c = 'c';
        int n = 3;
        System.out.println("Input: " + str1 + " Char: " + c);
        System.out.println(find(str1,c));
    }
}