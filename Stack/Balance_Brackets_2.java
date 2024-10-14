package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Balance_Brackets_2 {
    private static boolean isBalanced(String brackets, Stack<Character> st){
        for (int i = 0; i < brackets.length(); i++){
            char currChar = brackets.charAt(i);
            if(st.isEmpty() || currChar == '(' || currChar == '{' || currChar == '['){
                st.push(currChar);
            }else{
                if (st.isEmpty()) return false;
                else{
                    if((currChar == ')' && st.peek() == '(') || (currChar == '}' && st.peek() == '{') || (currChar == ']' && st.peek() == '[')){
                        st.pop();
                    }else return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with every type of brackets :");
        String brackets = sc.next();

        System.out.println(isBalanced(brackets,st));
    }
}
