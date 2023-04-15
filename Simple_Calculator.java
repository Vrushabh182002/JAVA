import java.util.Scanner;
public class Simple_Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter the input operation: ");
            char ch = in.next().trim().charAt(0);
            if (ch =='+'||ch =='-'||ch =='*'||ch =='/'||ch =='%') {
                System.out.print("Enter the 1st number: ");
                int n1 = in.nextInt();
                System.out.print("Enter the 2nd number: ");
                int n2 = in.nextInt();
                System.out.println();
                if (ch == '+') {
                    ans = n1 + n2;
                }
                if (ch == '-') {
                    ans = n1 - n2;
                }
                if (ch == '*') {
                    ans = n1 * n2;
                }
                if (ch == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }
                if (ch == '%') {
                    ans = n1 % n2;
                }
            }
            else if(ch=='x'||ch=='X')
            {
                System.out.println("Thank You!!");
                break;
            }
            else{
                System.out.println("Invalid Input");
                break;
            }
            System.out.println(ans);
        }
    }
}