//Finding the minimum number amoung the elements
import java.util.*;
public class Minimum {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n;
        System.out.println("Enter the size: ");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i <n; i++) {
            a[i]=in.nextInt();
        }
        int res=min(a);
        System.out.println("Minimum number in the array is: "+res);
        in.close();
    }
    static int min(int a[]){
        int ans=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]<ans){
                ans=a[i];
            }
        }
        return ans;
    }
}
