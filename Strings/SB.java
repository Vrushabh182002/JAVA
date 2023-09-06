// package Strings;
// import java.util.*;
public class SB{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World! ");
        sb.insert(6, "Java "); 
        sb.replace(0, 5, "Hi");
        String result = sb.toString(); 
        System.out.println(result);
    }
}