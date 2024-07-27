package Recursion;
public class Factorial {
    public static int calcFac(int n) {
        if(n==1)return 1;
        return n*calcFac(n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcFac(10));
    }
}
