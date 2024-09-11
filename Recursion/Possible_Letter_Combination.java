package Recursion;
import java.util.Scanner;
public class Possible_Letter_Combination {
    private static void combination(String digit, String[] arr, String res){
        if(digit.isEmpty()) {
            System.out.println(res);
            return;
        }
        char currNum = (char) (digit.charAt(0) - '0');
        String currChoices = arr[currNum];
        for (int i = 0; i < currChoices.length(); i++){
            combination(digit.substring(1),arr,res + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.println("Enter a number only with the digits from 2 to 9 :");
        String digit = sc.next();
        System.out.println("The possible combinations are :-  ");
        combination(digit, arr, "");
    }
}
