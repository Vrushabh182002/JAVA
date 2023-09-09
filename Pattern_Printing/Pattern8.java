public class Pattern8 {
    public static void main(String[] args) {
        int i,j,s,n=5;
        for(i=n;i>=0;i--){
            for(s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
