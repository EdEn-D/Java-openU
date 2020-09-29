package a2017;
// counts the number of different characters in str1 & str2
public class a2017_5a {
        public static int edit(String str1,String str2) {
            if(str1==null||str2==null)return 0;
            return edit(str1,str2,0);
        }
        private static int edit(String str1,String str2,int count) {
            if(str1.length()==0) {
                return count+str2.length();
            }
            if(str2.length()==0) {
                return count+str1.length();
            }
            //recursive part:
            if(str1.charAt(0)==str2.charAt(0)) // if they are the same char, go to next subString
                return edit(str1.substring(1),str2.substring(1),count);

            // add counter if the chars are different, return the minimum to ensure correct calculation
            return Math.min(edit(str1, str2.substring(1), count+1),
                    edit(str1.substring(1), str2, count+1));
        }


    public static void main(String[]args){

    }
}
