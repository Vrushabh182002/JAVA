public class FirsttoN {
    public static void main(String[] args) {
        int n=5;
        fun(n);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.print(n+" ");
    }
}