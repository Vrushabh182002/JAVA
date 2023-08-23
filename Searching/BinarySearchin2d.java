import java.util.Arrays;
public class BinarySearchin2d {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3,4},
            {6,7,8,9},
            {10,11,12,13}
        };
        int target=19;
        System.out.println(Arrays.toString(search(a, target)));
    }
    static int[] search(int a[][],int target){
        int s=0,e=a.length-1;
        while(s<a.length && e>=0){
            if(a[s][e]==target){
                return new int[]{s,e};
            }
            if(a[s][e]<target){
                s++;
            }
            else{
                e--;
            }
        }
        return new int[]{-1,-1};
    }
}