// package Patterns;
/*
    Printing the below pattern
    *
    **
    ***
    ****
    *****
 */
public class Pattern1{
    public static void main(String[] args) {
        int i,j;
        for (i = 1; i<=5; i++) {
            for (j = 1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}