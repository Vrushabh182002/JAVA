public class BruteForcePrime {
    public static void main(String[] args) {
        int num = 23;
        prime(num);
    }    
    static void prime(int n){
        for(int i=2;i<n;){
            if(n%i==0){
                System.out.println("Not a Prime Number ");
                break;
            }
            else{
                System.out.println("Prime Number ");
                break;
            }
        }
    }
}