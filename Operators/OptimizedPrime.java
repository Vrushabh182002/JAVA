public class OptimizedPrime {
    public static void main(String[] args) {
        int n = 37; 
        System.out.println(n + " is prime? "+ Prime(n));
    }

    static boolean Prime(int n) {
        if(n<=1){
            return false;
        }
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
