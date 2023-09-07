public class PalindromeStr {
    public static void main(String[] args) {
        String str= "madam";
        boolean ans=palindrome(str);
        System.out.println(ans);
    }
    static boolean palindrome(String str){
        str= str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char s =str.charAt(i);
            char e=str.charAt(str.length()-1-i);
            if(str.length()==0||str==null){
                return true;
            }
            if(s!=e){
                return false;
            }
        }
        return true;
    }
}