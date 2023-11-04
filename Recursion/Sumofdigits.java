public class Sumofdigits {
    public static void main(String[] args) {
        int n=1342;
        System.out.println(fun(n));
    }
    static int fun(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+fun(n/10);
    }
}