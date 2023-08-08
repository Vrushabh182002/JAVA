//https://leetcode.com/problems/richest-customer-wealth/
public class Maxwealth {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3,4},
            {3,5,1,2},
            {10,1,2,3}
        };
        System.out.println(maxwealth(a));
    }
    static int maxwealth(int a[][]){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                sum+=a[i][j];   
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
