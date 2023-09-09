public class Pattern5 {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the number of lines
        for (int i = 1; i <= n * 2 - 1; i++) {
            int starsToPrint = i <= n ? i : n * 2 - i;
            //when i and j both are initially 0 then the below one to be used ...
            // or we can use stars= i > n ? 2 * n - i : i;
            for (int j = 1; j <= starsToPrint; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}