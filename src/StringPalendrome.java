public class StringPalendrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
    }

        public static void isPalindrome(String s) {
            String str="";
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)!=' ') && (s.charAt(i)!=',') && (s.charAt(i)!=':')){
                    str+=s.charAt(i);
                }
            }
            String str1=str.toLowerCase();
            System.out.println(str1);
            String rev="";
            for(int i=str.length()-1;i>=0;i--){
                rev+=str1.charAt(i);
            }
            System.out.println(rev);
            System.out.println(s);
           // return rev==s;
        }
    }

