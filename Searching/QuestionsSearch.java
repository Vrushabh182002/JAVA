import java.util.*;
public class QuestionsSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str;
        char ch;
        System.out.println("Enter the String: ");
        str=in.nextLine();
        System.out.println("Enter the Character to Search: ");
        ch=in.next().charAt(0);
        in.close();
    }
    static int seach(String str,char ch){
        if(str.length()==0){
            return -1;
        }
         
}
