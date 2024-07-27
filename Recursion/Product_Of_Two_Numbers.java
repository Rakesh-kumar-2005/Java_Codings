package Recursion;
// only For Positive Number...
public class Product_Of_Two_Numbers {
    public static int product(int m, int n){
        if (n == 0 || m == 0)return 0;
        if (m == 1)return 1;
        if(n == 1) return m;
        return m + product(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(product(7,8));
        System.out.println(product(8,9));
    }
}
