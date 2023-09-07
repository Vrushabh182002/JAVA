import java.util.Arrays;
public class Methods {
    public static void main(String[] args) {
        String names = "Vrushabh Somani Hello  ";
        System.out.println(names.toLowerCase());
        System.out.println(names.toUpperCase());
        System.out.println(Arrays.toString(names.split(" ")));
        System.out.println(Arrays.toString( names.toCharArray()));
        System.out.println("   VRUSHABH SOMANI   ".strip());
        System.out.println();
        //and many more methods are there..
    }
}