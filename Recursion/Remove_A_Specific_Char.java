package Recursion;
import java.util.Scanner;
public class Remove_A_Specific_Char {
    private static String remove(String st, char c){
        if(st.isEmpty()) return "";
        String small = remove(st.substring(1), c);
        char ch = st.charAt(0);
        if(ch != c) return ch + small;
        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        System.out.println("Enter the Character to remove: ");
        char ch = sc.next().charAt(0);
        System.out.println("After removing the character the String is : " + remove(st,ch));
    }
}
