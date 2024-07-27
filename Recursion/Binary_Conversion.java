package Recursion;
public class Binary_Conversion {
    public static int findBinary(int n){
        if (n == 0)return 0;
        else return (n % 2) + 10 * findBinary(n / 2);
    }
    public static void main(String[] args) {
        System.out.println(findBinary(45));
        System.out.println(findBinary(31));
    }
}
