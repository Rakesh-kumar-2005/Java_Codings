package Recursion;
public class Reverse_A_String {
    public static String reverseString(String s){
        if(s.isEmpty())return "";
        return reverseString(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}
