public class Sumfact {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
    }
    static int fun(int n){
        if(n<=1){
            return 1;
        }
        return n+fun(n-1);
    }
}
