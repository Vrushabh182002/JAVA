public class OddEven {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(ans(n));
    }
    static boolean ans(int n){
        return (n&1)==1;
    }
}