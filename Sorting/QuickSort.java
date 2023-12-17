import java.util.*;
public class QuickSort{
    public static void main(String[] args) {
        int a[]={5,4,3,2,1,9,8,7,6,10};
        sorted(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    static void sorted(int a[],int low, int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int p=a[mid];
        while (s<=e) {
            while(a[s]<p){
                s++; 
            }
            while(a[e]>p){
                e--;
            }
            if(s<=e){
                int temp=a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;
                e--;
            }
        }
        sorted(a, low, e);
        sorted(a, s, high);
    }
}