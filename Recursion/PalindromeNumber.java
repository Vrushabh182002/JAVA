public class PalindromeNumber {
    static int sum=0;
    public static void main(String[] args) {
        int x=143;
        System.out.println(palin(x)+" "+sum);
    }
    static boolean palin(int n){
        int og=n;
        while(n>0){
        int rem=n%10;
        sum=sum*10+rem;
        n=(n/10);
        }
        return og==sum;
    }
}