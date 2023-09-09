public class Pattern6 {
    public static void main(String[] args) {
        int i,j,n=5;
        for (i = 0;i < 2*n; i++) {
            int stars = i > n ? 2 * n - i : i; 
            int spaces = n - stars;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(j=0;j<stars;j++){       
                System.out.print("* ");
            }           
            System.out.println();
        }
    }
}