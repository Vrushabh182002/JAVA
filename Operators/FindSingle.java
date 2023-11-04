public class FindSingle { 
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,4,3,2,5,1,9,10,10};
        System.out.println(ans(arr));
    }
    static int ans(int a[]){
        int ans=0;
        for(int i : a){
            ans^=i;
        }
        return ans;
    }
}