// import java.util.*;
public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={90,80,70,60,50,40,30,20,10,5,1,0};
        int target=70;
        int ans= agnosticSearch(arr, target);
        System.out.println(ans);
    }
    static int agnosticSearch(int a[],int target){
        int start=0;
        int end =a.length-1;
        boolean isAsc =a[start]<a[end];
        while(start<=end){
            int mid = start + (end+start)/2;
            if(target==a[mid]){
                return mid;
            }
            if(isAsc){                      //For sorted ascending array 
                if(target<a[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{                           //For sorted descending array
                if(target>a[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}

