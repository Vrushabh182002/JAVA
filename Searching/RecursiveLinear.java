import java.util.*;
public class RecursiveLinear {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n,ele;
        System.out.println("Enter the size: "); 
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0 ;i<n;++i){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the element to search: ");
        ele=in.nextInt();
        int res = linearrecursive(a, n, ele);
        if(res==-1){
            System.out.print("Element is not present");
        }
        else {
            System.out.println("Element present in index at" + " " + res);
        }
        in.close();
    }
    static int linearrecursive(int arr[], int n, int x) {
        if (n == 0) {
            return -1;
        } else if (arr[n - 1] == x) {
            return n - 1;
        } else {
            return linearrecursive(arr, n - 1, x); // recursive call
        }
  }
}