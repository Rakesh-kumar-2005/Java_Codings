package Recursion;
public class Reverse_a_Number {
    public static int reverseNumber(int n,int sum){
        if (n == 0)return sum;
        sum = sum * 10 + n % 10;
        return reverseNumber(n/10,sum);
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(5647382,0));
    }
}
