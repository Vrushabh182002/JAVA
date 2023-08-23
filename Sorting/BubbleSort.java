// package Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,9,4,10,77};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int a[]){
        boolean swapped;
        for (int i = 0 ;i<a.length;++i){
            swapped=false;
            for (int j=0;j<a.length-i-1;j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}