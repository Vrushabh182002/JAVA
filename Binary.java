// import java.util.*;
public class Binary {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11};
        int target=10;
        int res = search(a, target);
        System.out.println(res);
    }
    static int search(int a[],int target){
        int start=0,end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<a[mid]){
                end=mid-1;
            }
            else if(target>a[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
