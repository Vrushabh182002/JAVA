//Searching the element in a given set of range..
import java.util.*;
public class RangeSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,ele,start,end;
        System.out.println("Enter size of elements:");
        n = in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i <n; i++) {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the Starting index and Ending index: ");
        start =in.nextInt();
        end = in.nextInt();
        System.out.println("Enter the element to search: ");
        ele=in.nextInt();
        int res=search(a,ele,start,end);
        System.out.println("Element is present at: "+res);
        in.close();
    }
    static int search(int a[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        else if(a.length==0){
            return -1;
        }
        for (int i : a) {
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}