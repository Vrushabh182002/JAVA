public class Zerocount {
    public static void main(String[] args) {
        int n=10000;
        System.out.println(count(n));
    }
    static int count(int n){
        return help(n,0);
    }
    static int help(int n, int c){
        if (n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return help(n/10, c+1);
        }
        return help((n/10),c);
    }
}
