//LeetCode Question : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Evendigitscount {
    public static void main(String[] args) {
        int arr[]={10,2,344,1093};
        System.out.println("Number of even number of digits present is: "+counting(arr));
    }
    static int counting(int num[]){
        int count=0;
        for (int  i : num) {
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int ans=digits(num);
        return ans%2==0;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}

