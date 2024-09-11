package Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class Subesecquences {
    private static ArrayList<String> getSubsequences(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if(s.isEmpty()){
            ans.add("");
            return ans;
        }
        char currChar = s.charAt(0);
        ArrayList<String> helper = getSubsequences(s.substring(1));
        for (String temp : helper) {
            ans.add(temp);
            ans.add(currChar + temp);
        }
        return ans;
    }
    private static void printSubsequences(String s,String currAns) {
        if(s.isEmpty()){
            System.out.print(currAns + ",");
            return;
        }
        char currChar = s.charAt(0);
        String remaining = s.substring(1);
        printSubsequences(remaining,currAns+currChar);
        printSubsequences(remaining,currAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        ArrayList<String> ans = new ArrayList<>(getSubsequences(s));
        for (String temp : ans) {
            System.out.print(temp + ",");
        }
        System.out.println();
        printSubsequences(s,"");
    }
}
