import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int[] res=merge(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] merge(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int l[]=merge(Arrays.copyOfRange(arr, 0, mid));
        int r[]=merge(Arrays.copyOfRange(arr, mid, arr.length));
        return joint(l,r);
    }
    private static int[] joint(int f[],int s[]) {
        int mix[]=new int[f.length+s.length];
        int i=0,j=0,k=0;
        while(i<f.length && j<s.length){
            if(f[i]<s[j]){
                mix[k]=f[i];
                i++;
            }
            else{
                mix[k]=s[j];
                j++;
            }
            k++;
        }
        while(i<f.length){
            mix[k]=f[i];
            i++;
            k++;
        }
        while(j<s.length){
            mix[k]=s[j];
            j++;
            k++;
        }
        return mix;
    }
}
