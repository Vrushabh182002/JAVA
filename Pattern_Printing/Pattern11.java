public class Pattern11 {
    public static void main(String[] args) {
        int i,j,n=4;
        int k=n;
        n=2*n;
        for ( i = 0; i <= n ; i++) {
            for( j = 0; j <= n; j++){
                int x=k-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                 System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
