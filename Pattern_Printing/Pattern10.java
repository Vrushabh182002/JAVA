public class Pattern10 {
    public static void main(String[] args) {
        int i,j,s,n=4;
        for(i=1;i<2*n;i++){
            int space= i>n?2*n-i:i;
            for(s=0;s<n-space;s++){
                System.out.print(" ");
            }
            for(j=space;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=space;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
