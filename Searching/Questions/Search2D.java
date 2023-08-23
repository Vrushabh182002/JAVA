//https://leetcode.com/problems/search-a-2d-matrix/
import java.util.*;
public class Search2D {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6,7},
            {8,9},
            {10}
        };
        int target=7;
        int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int a[][],int target){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}