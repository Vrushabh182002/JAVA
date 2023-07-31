// Statically 
// public class Linear{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9,10};
//         System.out.println("Linear Search Result: "+linear(arr, 7));
//     }
//     static int linear(int arr[],int ele){
//             if(arr.length==0)
//                 return -1;
//             for(int i=0;i<arr.length;i++){
//                 if (ele == arr[i])
//                     return arr[i];
//             }
//             return -1;
//         }
// }

// Statically Boolean
public class Linear{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Linear Search Result: "+linear(arr, 7));
    }
    static boolean linear(int arr[],int ele){
            if(arr.length==0)
                return false;
            for(int i=0;i<arr.length;i++){
                if (ele == arr[i])
                    return true;
            }
            return false;
        }
}



// Dynamically
// import java.util.*;
// public class Linear{
//     public static void main(String[] args) {
//         Scanner in  = new Scanner(System.in);
//         int elem,n;
//         System.out.println("Enter the size of array ");
//         n=in.nextInt();
//         int a[]=new int [n];
//         System.out.println("Enter the elements ");
//         for(int i=0 ;i <a.length ;++i ){
//             a[i]=in.nextInt();
//         }
//         System.out.println("Enter the element to be searched ");
//         elem=in.nextInt();
//         search(a,elem);
//         in.close();
//     }
//     static void search(int a[],int target){
//         int x=-1;
//         if(a.length==0){
//             System.out.print("-1");
//         }
//         for (int i = 0; i < a.length; i++) {
//             if(a[i]==target){
//                 x=0;
//                 System.out.println(target+" found at index " +i );
//             }
//         }
//         if(x==-1){
//             System.out.println(target+" not found in the array ");
//         }
//     }
// }
