package Recursion;
public class Palindrome_Check {
    public static boolean isPalindrome(String s, int i, int j){
        if (i >= j)return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        i++; j--;
        return isPalindrome(s,i,j);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam",0,4));
    }
}
