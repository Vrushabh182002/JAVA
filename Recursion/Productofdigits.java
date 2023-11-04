public class Productofdigits {
    public static void main(String[] args) {
        int n=1342;
        System.out.println(fun(n));
    }
    static int fun(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*fun(n/10);
    }
}
