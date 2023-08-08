// Searching amoung Strings
import java.util.*;
public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str;
        char ch;
        System.out.println("Enter the String: ");
        str=in.nextLine();
        System.out.println("Enter the Character to Search: ");
        ch=in.next().charAt(0);
        int res=search(str,ch);
        System.out.println("Character is present at "+res);
        in.close();
    }
    static int search(String str,char ch){
        if(str.length()==0){
            return -1;
            //return false for boolean
        }
        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i)){
                return i;
                //return true for boolean
            }
        }
        return -1;
        //return false for boolean
    }
}
// for statically in line 6 provide the string 
// in line 7 provide the character and pass the arguments to the function..